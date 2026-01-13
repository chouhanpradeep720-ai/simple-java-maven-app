@Library('jenkins-shared-library')
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
