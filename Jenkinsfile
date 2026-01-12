pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    satges  {
        stage ("build jar") {
            steps {
                script {
                    echo "building this project"
                    sh 'mvn package'
                }
            }
        }
         stage ("build image") {
            steps {
                script {
                    echo "buil a image"
                    sh 'docker build -t java-maven:0.1 .'
                }
            }
        }
         stage ("deploy") {
            steps {
                script {
                    echo "deploy this project"
                }
            }
        }
    }
}
