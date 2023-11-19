pipeline{
	agent any
	environment {
		DOCKERHUB_PASS = 'Yamini@1234'
	}
	stages{
		stage("Building the Student Survey Image"){
			steps{
				script{
					checkout scm
					sh 'rm -rf *.jar'
					sh 'mvn clean package'
					sh 'echo ${BUILD_TIMESTAMP}'
					sh 'docker login -u eeshwar6114 -p ${DOCKERHUB_PASS}'
					sh 'docker build -t eeshwar4116/surveyjar .'
					sh  'docker tag surveyjar eeshwar4116/survey'
				}
			}
		}
		stage("Pushing image to docker"){
			steps{
				script{
					sh 'docker push eeshwar4116/survey'
				}
			}
		}
		stage("Deploying to rancher"){
			steps{
				script{
					// sh 'kubectl set image deployment/survey container-0=krishna1303/survey -n 645clusternamespace'
					sh 'kubectl rollout restart deploy deploy'
				}
			}
		}
	}
}
