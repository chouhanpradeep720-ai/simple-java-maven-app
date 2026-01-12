 pipeline {
    agent any
    
    }
    stages {
        stage("test") {
            steps {
                script {
                    echo "testing this project"
                    
                }
            }
        }
         stage("build image") {
          when {
           expression {
            BRANCH_NAME == 'jenkins-jobs'
           }
          }
            steps {
                script {
                     
                    echo "buil a image"
                          
                }
            }
        }
         stage("deploy") {
            steps {
                script {
                    echo "deploy this project"
                }
            }
        }
    }

