pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage("build JAR") {
            steps {
                script{
                      echo "building this project"
                      sh 'mvn package'
                }
              
            }
        }
        stage("build image") {
            steps {
                script {
                    echo "building this images"
                    withCredentials([usernamePassword(credentialsid: 'docker-credentials', usernameVariable: 'USER', passwordVariable: 'PASSWORD')]) {
                    sh 'docker build -t pradeepchouhan115/docker.repo:java-maven-0.1 .'
                    sh 'echo $PASSWORD | docker login -u $USER --password-stdin'
                    sh 'docker push pradeepchouhan115/docker.repo:java-maven-0.1'
                }
                }
            }
        }
              
        stage("deploy") {
            steps {
                script {
                    echo "deploying this project"
                }
            }
        
           
          }
          }

    }
    
