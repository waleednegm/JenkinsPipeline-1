pipeline {
  agent any
  tools {
        maven 'Maven'
    }
  stages{
    stage("build_jar"){
          steps{
            echo "Build Jar file ...."
            sh 'cd ./hello_world || mvn package'
          }      
    }
    stage("build_DockerImage"){
          steps{
            echo "Build Docker Image ...."
            sh 'docker build -t walednegm/hello_world_java:1.0 .'
          }      
    }
    stage("Push_To_DockerHub"){
          steps{
            echo "Push Docker Image ...."
            withCredentials([usernamePassword(credentialsId : 'dockerhub' , usernameVariable: 'USER' , passwordVariable: 'PWD')]){
              sh "echo ${PWD} || docker login -u ${USER} -password-std-in"
              sh 'sudo docker push walednegm/hello_world_java:1.0'
            }
          }      
    }
    stage("deploy"){
          steps{
            echo "Deployment"
          }      
    }
  
  }

}
