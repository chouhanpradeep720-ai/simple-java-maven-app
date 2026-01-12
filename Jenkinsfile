pipeline {
    agent any 
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('build jar') {
            script {
                echo "building a jar...."
                sh 'mvn package'
            }
        }
        stage('build push') {
            script {
                echo "building a image...."
                sh 'docker build -t java-maven:0.3 .'
            }
        }
        stage('deploy') {
            script {
                echo "deploying...."
            }
        }
    }
}
