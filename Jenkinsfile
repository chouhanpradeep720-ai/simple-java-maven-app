pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'build this project'
            }
        }
          stage('test') {
            steps {
                echo 'testing this project'
            }
          }
      stage('deploy') {
            steps {
                echo 'deploying this project'
            }
          }
    }  
    post {
        always {
            echo "run in ALL CONDITION!!!
        }
        success {
            echon "this job is SUCCESS!!"
 }
        failure {
            echo "this job is FAIL!!!"
        }
 }
}

