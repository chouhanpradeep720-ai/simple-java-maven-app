pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    satges ("build jar") {
        stage {
            steps {
                script {
                    echo "building this project"
                    sh 'mvn package'
                }
            }
        }
         stage {
            steps {
                script {
                    echo "buil a image"
                    sh 'docker build -t java-maven:0.1 .'
                }
            }
        }
         stage {
            steps {
                script {
                    echo "deploy this project"
                }
            }
        }
    }
}
