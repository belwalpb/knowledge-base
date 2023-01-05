## Kubernetes

Kubernetes is an open-source container orchestration system for automating the deployment, scaling, and management of containerized applications.

Docker is a containerization platform that packages your application and its dependencies together in the form of a container, which contains libraries and runtime, so they can run anywhere, regardless of the environment.
Kubernetes, on the other hand, is a container orchestration platform that is used to manage a cluster of containers, including Docker containers. Kubernetes provides features such as self-healing, horizontal scaling, service discovery, and more. It enables you to deploy and manage containerized applications at scale in a production environment.

**Self Healing:** In Kubernetes, self-healing refers to the ability of the system to automatically detect and replace failed containers or nodes. This helps to ensure that the application is always running and available, even in the face of failures or node outages.

**Service Discovery:** In Kubernetes, service discovery refers to the ability of pods (i.e., containers) to locate and communicate with other pods in the cluster. This is important because pods are dynamic and ephemeral, meaning that they can be created, destroyed, and moved around within the cluster.
To facilitate communication between pods, Kubernetes provides a **DNS server** that is built into the cluster. Each pod is assigned a DNS name that is unique within the cluster, and this DNS name can be used by other pods to communicate with it.

### Terminologies Related to K8S:

**Node:** A node is a worker machine in a Kubernetes cluster, and it is responsible for running the pods that host the applications.

**Pod:** A pod is the smallest deployable unit in Kubernetes, and it represents a single instance of a running container. Pods are ephemeral, meaning that they can be created and destroyed as needed.

**Deployment:** A deployment is a declarative way to manage a set of replicas of a pod. It ensures that a specified number of replicas of a pod are running at any given time, and it provides rolling update and rollback capabilities.

**Service:** A service is a logical abstraction that represents a set of pods that are running the same application. It acts as a load balancer and exposes the pods to the outside world, allowing them to be accessed using a stable DNS name.

**Cluster:** In Kubernetes, a cluster is the set of nodes (i.e., machines) that are used to run containerized applications.

**Namespace:** A namespace is a virtual partition within a cluster that is used to group together a set of resources.

To summarize, a Kubernetes cluster is a set of nodes that are used to run containerized applications, while a namespace is a virtual partition within a cluster that is used to group and isolate resources.



### Questions

**1. Difference Between Service & Deployment?**

A service is used to expose a group of pods and route traffic to them, while a deployment is used to manage and update the replicas of a pod.

**2. What is a replica set in K8S?**

In Kubernetes, a ReplicaSet is a controller that is used to ensure that a specified number of replicas of a pod are running at any given time. ReplicaSets are similar to deployments in Kubernetes, but they are more low-level and provide more fine-grained control over the replicas.

**3. What is an ingress?**

An ingress is a collection of rules that allow inbound connections to reach the cluster. It exposes services to the outside world and enables external traffic to reach the services.

**4. Why Envoy Proxy is used in K8S?**

Envoy is a high-performance proxy, which is designed to handle large numbers of requests and to route traffic efficiently and dynamically.
Envoy is used in Kubernetes environments to handle and route traffic efficiently and dynamically. Its high-performance and flexibility make it a popular choice for use in Kubernetes environments.


**5. What is istio?**

Istio is an open-source service mesh that provides traffic management, policy enforcement. Istio is built on top of Envoy. Istio is often used in Kubernetes environments to provide a consistent way to manage and secure the communication between microservices. 

**6. What is helm?**

Helm is a package manager for Kubernetes that makes it easy to install and manage applications on a Kubernetes cluster. Helm uses **charts** to define, install and upgrade Kubernetes applications.

A chart is a collection of files that describe a related set of Kubernetes resources. It includes all of the resources needed to run an application, as well as information about how to deploy and manage the application.

To use a Helm chart, we simply install it on your Kubernetes cluster using the Helm CLI, and it will automatically install and manage the resources defined in the chart. This makes it easy to deploy and manage applications on Kubernetes, and it helps to reduce the complexity of managing distributed applications.

### Common KubeCtl Commands:

**kubectl get pods** This command will list all the pods in the cluster. We can also use kubectl to list pods in a specific namespace, for example:

`kubectl get pods -n=ns-**-system`

**kubectl logs** To view the logs of a container in a pod, you can use the kubectl logs command.

`kubectl logs my-pod -n=ns-**-system`

We can also use the -f flag to follow the logs in real-time.

`kubectl logs -f my-pod -n=ns-**-system`