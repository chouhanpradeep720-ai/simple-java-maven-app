pipeline {
    agent any

    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.1.2', '1.2.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }

    stages {

        stage("build") {
            steps {
                echo 'building this project'
            }
        }

        stage("test") {
            when {
                expression { params.executeTests }
            }
            steps {
                echo 'testing this project'
            }
        }

        stage("deploy") {
           
            steps {
                script {
                   env.ONE input message: "Select the environment to deploy to", ok "DONE", parameters: [choice(name: 'ONE', choices: ['staging', 'dev', 'prod'], description: '')]
                    echo "Deploying this project"
                    echo "Deploying version ${params.VERSION}"
                    echo "Deploying to ${ONE}"
                    }
                }
                
                
                
            }
        }
    }
}
