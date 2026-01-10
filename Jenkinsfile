pipeline {
    agent any
    parameters {
     choice (name: 'Version', choices:['1.1.0', '1.1.2', '1.2.0'], discription: '' )
     booleanparm (name: 'excuteTests', defultValue: 'true', discription: '')
        
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
                    parms.excuteTests
                }
            }
            }
          }
      stage('deploy') {
            steps {
                echo 'deploying this project'
                echo "deploying version ${prams.Version}"
            }
          }
    }  
    
}

