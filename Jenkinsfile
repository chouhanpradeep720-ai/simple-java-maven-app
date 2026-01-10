pipeline {
    agent any
    parameters {
     choice(name: 'VERSION', choices: ['1.1.0', '1.1.2', '1.2.0'], description: '' )
     booleanParam(name: 'excuteTests', defultValue: true, description: '')
        
    }

    stages {
        stage('build') {
            steps {
                echo 'build this project'
            }
        }
          stage('test') {
            when {
                expression {
                    params.excuteTests
                }
            }
            }
              stage('deploy') {
            steps {
                echo 'deploying this project'
                echo "deploying version ${prams.VERSION}"
            }
          }
          }

    }
    


