pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage("build jar") {
            steps {
                script {
                    echo "building this project"
                    sh 'mvn package'
                }
            }
        }
         stage("build image") {
            steps {
                script {
                        
                    echo "buil a image"
                    withCredentials([usernamePassword(credentialsid: 'docker-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
                      sh 'docker build -t pradeepchouhan115/docker.repo:java-amven-0.1 .'
                      sh 'echo $PASS | docker login -u $USER --password-stdin'
                      sh 'docker push pradeepchouhan115/docker.repo:java-amven-0.1'
                    }
                
                }
            }
        }
         stage("deploy") {
            steps {
                script {
                    echo "deploy this project"
                }
            }
        }
    }
}
