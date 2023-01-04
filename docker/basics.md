## Docker Introduction

Docker is a tool used to deploy and run applications in containers. It allows developers to package their applications with all necessary dependencies and ship them as a single package, ensuring the same runtime environment on any platform. Docker simplifies the process of developing and deploying applications, especially in microservices and distributed systems.

A Docker container is a lightweight executable package that includes everything needed to run an application. It is a way to package software in a standard format that can run on any infrastructure, whether it is a laptop, a physical server, or a virtual machine in the cloud.

Common Issues which docker resolves:
**1. Dependency conflicts and version issues:** Docker allows applications to run in a container that includes all of the necessary dependencies, which eliminates the risk of conflicts with other software or versions already available on the host machine.

**Portability:** Docker containers can be easily moved between different machines and environments, making it easier to deploy and run applications in different environments.

**Compatibility:** Docker allows applications to run on any machine that has Docker installed, regardless of the underlying operating system or system libraries.

**Resource isolation:** Docker containers provide isolation of resources such as CPU, memory, and storage, which allows multiple applications to run on the same host machine without interference.

**Security:** Docker allows you to run applications in a secure environment by isolating them from the host system and other containers. This can help to prevent malicious attacks and reduce the risk of vulnerabilities in your applications.

#### Docker Image vs Docker Container:

A Docker image is a lightweight, stand-alone, executable package that includes everything needed to run a piece of software, including the application code, libraries, dependencies, and runtime. It is a template for creating Docker containers.

A Docker container is a running instance of a Docker image. When you start a container using the docker run command, the container is created from the image and the application inside the container is executed.

To summarize, a Docker image is a static snapshot of an application, while a Docker container is a running instance of that application. We can create multiple containers from a single image, each with its own separate and isolated environment for running the application.


#### Layers in Docker Images:

In Docker, an image is made up of a series of layers, corresponds to an instruction in the image's Dockerfile. **A Dockerfile is a text file that contains instructions for building a Docker image, and each instruction in the Dockerfile is translated into a separate layer in the image.**

Each layer in a Docker image is a snapshot of the file system at a particular point in time, and each layer is built on top of the previous layer. This allows Docker to create new images quickly and efficiently by reusing common layers and only creating new layers for the changes introduced in the new image.

**For example,** consider a Docker image that is based on the official Ubuntu image and installs the Apache web server. The base Ubuntu image would be the first layer in the new image, and the instructions for installing Apache would be added as a separate layer on top of it. This means that the new image would only include the changes introduced by installing Apache, rather than the entire file system of the base Ubuntu image.

##### Run a docker image:

`docker run -it --name CONTAINER_NAME -e VAR1=VALUE1 -e VAR2=VALUE2 -p HOST_PORT:CONTAINER_PORT -v HOST_PATH:CONTAINER_PATH IMAGE_NAME`

Here is an explanation of each flag:

- -it: This flag allows you to interact with the container in a terminal.
- --name: This flag allows you to specify a name for the container.
- -e: This flag allows you to set environment variables for the container.
- -p: This flag allows you to expose a port from the container and bind it to a port on the host machine.
- -v: This flag allows you to mount a volume from the host machine into the container.
- -d: The -d flag is used to run a Docker container in the background in detached mode.

##### Build a Docker Image

`docker build --no-cache --build-arg ARG_NAME=VALUE --tag IMAGE_NAME:TAG .`

- --no-cache: This flag tells Docker to build the image from scratch, rather than using any cached intermediate images.
- --build-arg: This flag allows you to pass build-time arguments to the Docker build process. These arguments can be used to pass values such as configuration parameters or passwords that should not be stored in the resulting image.
- --tag: This flag allows you to specify a name and optionally a tag for the image in the name:tag format.
- .: This specifies the path to the directory containing the Dockerfile and other files needed to build the image. The . indicates that the current directory should be used.

If Dockerfile is in some other location, then we can use -f flag as well to tell the path of Dockerfile.

`docker build -f /path/to/my_dockerfile_name .`

##### Stop a running Docker image:

`docker stop container-name-or-id`

To stop multiple docker containers, we can use it like:

`docker stop container-name1 container-name2 container-name3`

To remove orphaned Docker containers (containers that are not associated with any running processes), you can use the docker container prune command. This will remove all stopped containers, as well as any associated networks and volumes that are not being used by any remaining containers.

`docker container prune`

###### Docker Image Management Commands:

**docker images**: This command lists all images on the local system, including the image ID, repository name, and tag name. You can use the -a flag to show all images (including intermediate images), and the --format flag to specify the output format.

**docker pull**: This command downloads an image from a registry (e.g., Docker Hub) to the local system. You can specify the repository and tag name of the image you want to download. For example:
`docker pull ubuntu:latest`
This will download the latest version of the ubuntu image from Docker Hub.

**docker push**: This command uploads an image to a registry. You will need to be logged in to the registry and have permission to push to the specified repository. For example:
`docker push my_username/my_image:latest`

##### Other Useful Docker Commands:

**docker ps**: This command lists all running containers on the local system, including the container ID, image name, and command being run. You can use the -a flag to show all containers (running and stopped).

**docker start**: This command starts one or more stopped containers. You can specify the container names or IDs as arguments. For example:
`docker start my_container`

**docker stop**: This command stops one or more running containers. You can specify the container names or IDs as arguments. For example:
`docker stop my_container`

**docker exec**: This command runs a command in an existing container. You can specify the container name or ID, and the command to run as arguments. For example:
`docker exec my_container echo "Hello, World!"`


##### docker stop vs docker kill

**docker stop** and **docker kill** are both commands that are used to stop a running container, but they work in different ways.

**docker stop** sends a **SIGTERM** signal to the main process running inside the container, asking it to terminate gracefully. The process is then given a grace period (typically 10 seconds) to shutdown before the SIGKILL signal is sent, which forcibly terminates the process.

**docker kill**, on the other hand, sends the SIGKILL signal immediately, which terminates the process without giving it a chance to shutdown gracefully.

In general, it is recommended to use docker stop whenever possible, as it allows the process inside the container to clean up any resources or save its state before shutting down. However, docker kill can be useful in cases where the process inside the container is not responding to the SIGTERM signal.


#### Important Docker Interview Questions:

**1. How does Docker differ from a virtual machine?**

A virtual machine (VM) is a software emulation of a physical computer, which runs an operating system and applications in a self-contained environment. In contrast, Docker allows you to package and run applications in containers, which share the host operating system and resources. This makes Docker more lightweight and efficient than VMs, as containers do not require a separate operating system and can be easily transferred between environments.

**2. How do you share and distribute Docker images?**

To share Docker images, you can push them to a registry such as Docker Hub or a private registry. You can use the docker push command to upload an image to a registry, and the docker pull command to download an image from a registry.

**3. How do you scale and orchestrate Docker containers in a production environment?**

To scale Docker containers in a production environment, you can use a container orchestration tool such as Kubernetes, Docker Swarm, or Amazon ECS. These tools allow you to automate the deployment, scaling, and management of containerized applications across a cluster of servers.

**4. How do you troubleshoot and debug issues in Docker containers?**

To troubleshoot and debug issues in Docker containers, you can use commands such as **docker logs** to view the logs of a container, **docker exec** to run a command in a container, and **docker inspect** to view detailed information about a container. You can also use tools such as strace and gdb to trace and debug processes inside a container.

**5. What is a Dockerfile and how do you use it?**

A Dockerfile is a text file that contains instructions for building a Docker image. It specifies the base image, the commands to run to install dependencies and configure the image, and the parameters to set when the container is run. You can use the docker build command to build an image from a Dockerfile.

**6. How do you run multiple containers in Docker?**

You can use the docker-compose tool to run multiple containers in Docker. Docker Compose allows you to define a multi-container application in a single configuration file, and then use a single command to start and stop all the containers. You can also use container orchestration tools such as Kubernetes or Docker Swarm to manage and scale multiple containers in a production environment.

#### Docker Compose File

Docker Compose is a tool for defining and running multi-container Docker applications. A Docker Compose file is a YAML file that defines the services, networks, and volumes for a Docker application. It allows you to configure all the components of an application in a single file, and then start and stop the application with a single command. Docker Compose simplifies the process of setting up and running complex applications with multiple containers, making it easier to develop, test, and deploy containerized applications.


##### Sample Dockerfile to Build & run a spring boot application:
```sh
FROM openjdk:8-jdk-alpine as build

# Set the working directory to /app
WORKDIR /app

# Copy the source code and build the application
COPY . .
RUN ./mvnw clean package

FROM openjdk:8-jre-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the jar file from the build stage
COPY --from=build /app/target/my-app.jar /app/my-app.jar

# Expose the default Spring Boot port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "my-app.jar"]
```

This Dockerfile uses a multi-stage build to separate the build and runtime stages of the Docker image. The first stage uses the openjdk:8-jdk-alpine image to build the Spring Boot application, and the second stage uses the openjdk:8-jre-alpine image to run the application.


##### Sample Dockerfile to Build & run a angular application & deploy with nginx:
```sh
FROM node:18-alpine as build

# Set the working directory to /app
WORKDIR /app

# Copy the source code and install dependencies
COPY . .
RUN npm install

# Build the Angular application
RUN npm run build

FROM nginx:1.19-alpine

# Copy the built application from the build stage
COPY --from=build /app/dist/my-app /usr/share/nginx/html

# Copy the nginx configuration file
COPY nginx.conf /etc/nginx/nginx.conf

# Expose the default nginx port
EXPOSE 80

# Run nginx
CMD ["nginx", "-g", "daemon off;"]

```