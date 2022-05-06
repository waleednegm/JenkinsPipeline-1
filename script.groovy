def build_jar(){
    echo "Build Jar file ...."
    sh 'cd ./hello_world || mvn package'
}

def build_image(){
    echo "Build Docker Image ...."
    sh 'docker build -t walednegm/hello_world_java:1.0 .'
}

def push_image(){
    echo "Push Docker Image ...."
    withCredentials([usernamePassword(credentialsId : 'my_docker_hub' , usernameVariable: 'USER' , passwordVariable: 'PWD')]){
        sh "echo ${PWD} || docker login -u ${USER} -password-std-in"
        sh 'docker push walednegm/hello_world_java:1.0'
    }
}

def deploy(){
    echo "Deployment"
}

return this