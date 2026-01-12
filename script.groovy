def buildjar() {
   echo "building a jar..."
   sh 'mvn package'
}
def buildpush() {
  withCredentials([usernamePassword(credentialsId: 'nexus-id', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                        sh 'docker build -t 172.17.0.1:8083/jm:2.4 .'
                        sh 'echo $PASS | docker login -u $USER --password-stdin 172.17.0.1:8083'
                        sh 'docker push 172.17.0.1:8083/jm:2.4'
                    }
}
def deploy() {
  echo "deploying this project...."
}
return this

