# Jenkins Pipeline Using to Build Java Project And Push To DockerHub

## Using Jenkins To Build java project using maven , create Docker Image And Push the Docker Image To DockerHub 

## First i create Ec2 instance in AWS to deploy Jenkins on a server
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/1.png)
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/2.png)
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/3.png)
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/4.png)
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/5.png)
```
docker run -p 8080:8080 -p 50000:50000 -d \
-v jenkine_home_v2:/var/jenkins_home \
-v /var/run/docker.sock:/var/run/docker.sock \
-v $(which docker):/usr/bin/docker jenkins/jenkins:lts
```

## Open The required Ports to access it with web browser
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/6.png)
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/7.png)

## Then login to server and install Jenkins and its dependencies
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/8.png)

## Add your credentials For Github and DockerHub
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/9.png)

## Create Pipeline And connect it to Your Repo in Githu
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/10.png)

## Build the pipeline
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/11.png)

## And Everything is Ok
![alt text](https://raw.githubusercontent.com/waleednegm/Jenkins_Pipeline_Build_And_Push_To_DockerHub/main/assets/12.png)


