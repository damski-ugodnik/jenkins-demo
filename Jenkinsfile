pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'sudo -S scp -v -o StrictHostKeyChecking=no -i ~/backoffice-bastion-key-pair-personal.pem target/demo-ci-cd-0.0.1-SNAPSHOT.jar docker-compose.yml ' +
                        'DockerFile_app ubuntu@ec2-3-76-221-48.eu-central-1.compute.amazonaws.com:~'
                sh 'sudo -S ssh -i ~/backoffice-bastion-key-pair-personal.pem ubuntu@ec2-3-76-221-48.eu-central-1.compute.amazonaws.com \'bash -s\' < update-server.sh'
            }
        }
    }
}