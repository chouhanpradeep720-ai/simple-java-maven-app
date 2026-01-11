pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage("build JAR") {
            steps {
                echo 'building this project'
                sh 'mvn package'
            }
        }
        stage("build image") {
            steps {
                echo 'building this images'
                withcredentials([usernamepassword(credentialsID: 'docker-credentials', usernameVariable: 'USER', passwordVariable: 'PASSWORD')]) {
                    sh 'docker build -t pradeepchouhan115/docker.repo:java-maven-o.1 .'
                    sh 'echo "$PASSWORD" | docker login -u $USER --password-stdin'
                    sh 'docker push pradeepchouhan115/docker.repo:java-maven-o.1'
                }
            }
        }
              
        stage('deploy') {
        
            steps {
                echo 'deploying this project'
                echo "deploying version ${params.VERSION}"
           }
          }
          }

    }
