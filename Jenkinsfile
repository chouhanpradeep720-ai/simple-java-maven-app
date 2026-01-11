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
            input {
                message "Select the environment to deploy to"
                ok "Done"
                parameters {
                    choice(name: 'ENV', choices: ['staging', 'dev', 'prod'], description: '')
                }
            }
            steps {
                echo "Deploying this project"
                echo "Deploying version ${params.VERSION}"
                echo "Deploying to ${ENV}"
            }
        }
    }
}
