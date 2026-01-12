pipeline {
    agent any 
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('build jar') {
            steps {
                script {
                    echo "building a jar..."
                    sh 'mvn package'
                }
            }
        }
        stage('build push') {
            steps {
                script {
                    echo "building a image...."
                    withCredentials([usernamePassword(credentialsId: 'docker-credentials', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                        sh 'docker build -t pradeepchouhan115/docker.repo:jma-2.3 .'
                        sh 'echo $PASS | docker login -u $USER --password-stdin'
                        sh 'docker push pradeepchouhan115/docker.repo:jma-2.3'
                    }
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    echo "deploying..."
                }
            }
        }
    }
}
