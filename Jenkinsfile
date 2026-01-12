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
                    withCredentials([usernamePassword(credentialsId: 'nexus-id', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                        sh 'docker build -t 172.17.0.1:8083/jma:2.3 .'
                        sh 'echo $PASS | docker login -u $USER --password-stdin' 172.17.0.1:8083
                        sh 'docker push 172.17.0.1:8083/jma:2.3'
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
