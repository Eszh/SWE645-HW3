pipeline{
	agent any
	environment {
		DOCKERHUB_PASS = credentials('docker-token')
	}
	stages{
		stage("Building the Student Survey Image"){
			steps{
				script{
					checkout scm
					sh 'rm -rf *.jar'
					sh 'mvn clean package'
					sh 'echo ${BUILD_TIMESTAMP}'
					sh 'echo $DOCKERHUB_PASS_PSW | docker login -u $DOCKERHUB_PASS_USR --password-stdin'
					sh 'echo docker tag surveyjar eeshwar4116/survey'
				}
			}
		}
		stage("Pushing image to docker"){
			steps{
				script{
					sh 'docker push eeshwar4116/survey:$BUILD_TIMESTAMP'
				}
			}
		}
		stage("Deploying to rancher"){
			steps{
				script{
					 sh 'kubectl set image  deployment/swedeployment-assign3 container-0=eeshwar4116/survey:$BUILD_TIMESTAMP'
                                  //   sh 'kubectl rollout restart deploy swedeployment'

				}
			}
		}
	}
}
