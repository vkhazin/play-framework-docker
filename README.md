# Scala-Play-Restful in a Docker Container #

# [Detailed Instructions](https://www.linkedin.com/pulse/scala-play-restful-docker-container-vlad-khazin) #

# Objectives #
* Create new restful service using Scala and Play Framework.
* Deploy newly created service into a Docker container.
* Connect to service deployed into a Docker container

# What you gonna need before we start #
(These steps are for Mac OS)

* Install [Brew](http://brew.sh/) to streamline installation of other components from command window:
```
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```
* Install [Play Framework](https://www.playframework.com/) from terminal window using brew:
```
brew install typesafe-activator
````
* Install [Docker](https://www.docker.com/) locally from terminal window using brew:
```
brew install docker
```
* Launch activator to confirm everything in order with Play Framework, from terminal window run:
```
activator
```
and wait until web browser ui for activator is launched
* Launch docker virtual machine to confirm our docker installation, from terminal window run:
```
docker-machine create --driver virtualbox dev
when previous command finished:
docker-machine ls
```
should produce following output in terminal window:
```
NAME ACTIVE DRIVER STATE URL SWARM DOCKER ERRORS
dev    *        virtualbox   Running   tcp://192.168.99.100:2376           v1.9.1
```

# Let's build Play Framework Restful Service #
* Clone repository from command window using git:
```
git clone https://github.com/vkhazin/play-framework-docker.git
```
Back into the browser ui for activator (if you have stopped it, re-run 'activator' from terminal window
* Using activator browser ui 'Open existing app' in the right top corner 
* Locate the folder where you have cloned the git repository into and 'choose' it
* The 'choose' button is barely visible in the ui :-):
* Using activator browser ui 'run' it to confirm the project compiles and runs
* After the project run you should be able to access using http://localhost:9000
* Let's prepare for production: from terminal window in the project folder run: 
```
activator universal:packageZipTarball
```
* Assuming there are no errors - the project is ready for packaging and deployment (yes, with all of its rich functionality)
* Connect to docker domain from terminal window:
```
docker-machine env dev
Expected output:
export DOCKER_TLS_VERIFY="1"
export DOCKER_HOST="tcp://192.168.99.100:2376"
export DOCKER_CERT_PATH="/Users/vkhazin/.docker/machine/machines/dev"
export DOCKER_MACHINE_NAME="dev"
# Run this command to configure your shell:
# eval "$(docker-machine env dev)"
```
* Connect to docker daemon from terminal window:
```
eval "$(docker-machine env dev)"
```
* There is Dockerfile in the root of the project it defines how the docker image is to be built. 
* The docker file re-uses isuper/java-oracle image which in order re-uses ubuntu:latest image - the layering concept in docker world.
* To create Docker image - from the project folder using the same terminal window run where we have connected to docker daemon run:
```
docker build -t play-framework-docker .
```
* A docker image with result of previous packaging process will be created. Type 'docker images' in terminal window and result should list:
```
REPOSITORY TAG IMAGE ID CREATED VIRTUAL SIZE
play-framework-docker latest dbdc5516a94d 3 seconds ago 390.2 MB
isuper/java-oracle latest 3fa392c76f1c 45 hours ago 362.7 MB
```
* Now let's create a container out of this image in terminal window:
```
docker run -t -p 80:9000 play-framework-docker
```
* Point your browser to http://192.168.99.100:80
```
ip address is from 'docker-machine ls' command
and port is from the 'docker run -t -p:80:9000 play-framework-docker' command
````

Voila!
You have got your play framework service running in a docker container and hopefully ready to deploy 
to anywhere where docker container hosting is offered.