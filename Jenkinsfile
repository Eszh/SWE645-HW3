pipeline {
    agent any
    environment {
        DOCKERHUB_PASS = credentials('docker-token')
        BUILD_TIMESTAMP = sh(script: 'date -u "+%Y%m%d%H%M%S"', returnStdout: true).trim()
    }
    stages {
        stage("Building the Student Survey Image") {
            steps {
                script {
                    checkout scm
                    sh 'rm -rf *.jar'
                    sh 'mvn clean package'
                }
            }
        }
        stage("Building and Pushing Docker Image") {
            steps {
                script {
                    sh 'echo $DOCKERHUB_PASS_PSW | docker login -u $DOCKERHUB_PASS_USR --password-stdin'
                    sh "docker build -t eeshwar4116/survey:$BUILD_TIMESTAMP ."
                    sh "docker push eeshwar4116/survey:$BUILD_TIMESTAMP"
                }
            }
        }
        stage("Deploying to Rancher") {
            steps {
                script {
                    // Add your deployment steps here
                    // sh 'kubectl set image deployment/survey container-0=krishna1303/survey -n 645clusternamespace'
                    sh 'kubectl rollout restart deploy deploy'
                }
            }
        }
    }
}
