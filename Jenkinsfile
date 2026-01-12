pipeline {
    agent any 
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('build jar') {
            steps {
                script {
                   echo "building......"
                }
            }
        }
        stage('build push') {
            steps {
                script {
                  echo "building a image..."
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                  echo "deploying......"
                }
            }
        }
    }
}
