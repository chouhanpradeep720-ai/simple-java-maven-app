library identifier: 'jenkins-shared-library@main', retriever: modernSCM (
    [$class: 'GitSCMSource',
     remote: 'https://github.com/chouhanpradeep720-ai/jenkins-shared-library.git' ,
     credentialsId: 'github-credential'
])
def gv
pipeline {
    agent any 
    tools {
        maven 'maven-3.9'
    }
    stages {
        stage('init') {
            steps {
                script {
                   gv = load "script.groovy"
                   echo "build"
                }
            }
        }
        stage('build Jar') {
            steps {
                script {
                   buildJar()
                }
            }
        }
        stage('build Image') {
            steps {
                script {
                  buildImage 'pradeepchouhan115/docker.repo:jma-2.4'
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                gv.deployapp()
                }
            }
        }
    }
}
