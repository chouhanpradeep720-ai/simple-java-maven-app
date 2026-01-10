pipeline {
    agent any
    parameters {
     choice(name: 'VERSION', choices: ['1.1.0', '1.1.2', '1.2.0'], description: '' )
     booleanParam(name: 'executeTests', defaultValue: true, description: '')
        
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
                    params.executeTests
                }
            }
            steps {
                echo 'testing this project'
            }
            }
        stage('deploy') {
            input(
                messages 'Select the ENV',
                ok 'done',
                parameters[
                    choice(name: 'ENV', choices: ['DEV', 'PROD', 'TEST'], description: '' )
                ]                
            )
            steps {
                echo 'deploying this project'
                echo "deploying version ${params.VERSION}"
                echo "deploying ${ENV}"
                
                
            }
          }
          }

    }
    


