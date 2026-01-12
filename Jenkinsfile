pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('build_project') {
            steps {
                script {
                    echo "Building Maven Project..."
                    sh "mvn clean package"
                }
            }
        }

        stage('build_and_push_image') {
            steps {
                script {
                    echo "Building Docker Image..."

                    withCredentials([
                        usernamePassword(
                            credentialsId: 'docker-credentials',   // <-- yaha tumhara credential ID
                            usernameVariable: 'USER',
                            passwordVariable: 'PASS'
                        )
                    ]) {

                        sh "docker build -t pradeepchouhan115/docker-repo:java-maven-0.1 ."

                        sh "echo \$PASS | docker login -u \$USER --password-stdin"

                        sh "docker push pradeepchouhan115/docker-repo:java-maven-0.1"
                    }
                }
            }
        }

        stage('deploy') {
            steps {
                script {
                    echo "Deploy this project"
                }
            }
        }
    }
}
