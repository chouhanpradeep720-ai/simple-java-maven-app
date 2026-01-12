def buildjar() {
   echo "building a jar..."
   sh 'mvn package'
}
def buildpush() {
  withCredentials([usernamePassword(credentialsId: 'nexus-id', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                        sh 'docker build -t pradeepchouhan115/docker.repo:jma-2.4 .'
                        sh 'echo $PASS | docker login -u $USER --password-stdin'
                        sh 'docker push pradeepchouhan115/docker.repo:jma-2.4'
                    }
}
def deploy() {
  echo "deploying this project...."
}
return this

