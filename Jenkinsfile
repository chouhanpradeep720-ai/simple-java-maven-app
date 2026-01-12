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
        stage('build jar') {
            steps {
                script {
                   gv.buildjar()
                }
            }
        }
        stage('build push') {
            steps {
                script {
                    gv.buildpush()
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                  gv.deploy()
                }
            }
        }
    }
}
