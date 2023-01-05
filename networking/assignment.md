### Problem statement: 

Consider that you are working as a Network Engineer at a Well-known MNC. A client comes to you with the following requirement:

His organization requires implementation of a LAN along with access to Internet. Following details are given:
1. Organization has three departments Marketing, Manufacturing and Accounts located at three different buildings which are 200 m apart.
2. Marketing, Manufacturing and Accounts departments require 100, 500 and 50 computers respectively.
3. They also need secured connection to Internet.
4. It can be assumed that all the computers will connect to internet at the same time.
5. Use 48-port switch to connect computers.
6. Clearly tell how all these switches will connect with router to access internet and how many routers will be required?


**Design a network that would satisfy the above requirements. You can suitably assume the other details required for designing a network.**

Provide the Bill of Material (List, quantity and cost) of all the passive and active components required to set up the network. This is a table showing required active and passive components with quantities, cost of each and total cost.
1. Cost of setting up the entire network including the leased line from ISP
2. IP addresses, Masks, Subnetting, CIDR/Classful addresses
3. Provision of NAT, DHCP and so on..
4. Typical Network diagram (Use standard networking icons and legends to draw a network diagram while preparing the solution)




### Solution:

Here is a possible network design that is satisfying the given requirements:

1. **LAN type:** As previously mentioned, it would be practical to implement a wired LAN using Ethernet cables to connect the computers in the Marketing, Manufacturing, and Accounts departments. The Ethernet cables could be run between the buildings using conduit or other suitable methods to protect the cables and ensure compliance with any local building codes.

2. **Network devices:** Based on the number of computers and departments, we will need the following network devices:

*Marketing Department:* 2 * 48-port switches and 1 * 24-port switch
These switches will be used to connect the 100 computers in the Marketing department.

*Manufacturing Department:* 23 * 48-port switches.
22 Switches will be connected with 500 computers in the Manufacturing department. All 22 switches will connect with a master switch and that single switch will connect with Router.

*Accounts Department:* 3 * 24-port switches
3 * 24-port switches: These switches will be used to connect the 50 computers in the Accounts department. Each switch can support up to 23 computers, since one port will be used to connect to the router.

*Routers:* We will need at least one router for each department to provide Internet access. The routers will be connected to the Internet via a leased line from an ISP (Internet Service Provider). We will also need to consider the type of router to be used, based on the number of devices and the required performance and features.


3. **IP addressing scheme:** We will use the 10.0.0.0/23 address range for the LAN, with subnet masks of 255.255.254.0. This will allow us to create up to 510 unique IP addresses for each department. We will assign unique private IP addresses to each device on the LAN, such as 10.0.0.1 for the first device in the Marketing department, 10.0.1.1 for the first device in the Manufacturing department, and 10.0.2.1 for the first device in the Accounts department.

We will use NAT to allow the devices on the LAN to access the Internet using a single public IP address. The NAT router will have a public IP address assigned by the ISP, and it will translate the private IP addresses of the devices on the LAN to the public IP address when communicating with the Internet. This will allow multiple devices to share a single public IP address and access the Internet simultaneously.


4. **Networking protocols and services:** We will use the TCP/IP protocol for communication on the LAN and DHCP to automatically assign IP addresses to devices as they join the network. The DHCP server will be configured to assign IP addresses from the 10.0.0.0/23 address range, with a subnet mask of 255.255.254.0. This will allow the DHCP server to assign unique IP addresses to each device on the LAN.

5. **Bill of Materials:**

*Marketing Department:*

- 2 * 48-port switches: $200 each = $400
- 1 * 24-port switch: $100
- 200 meters of Ethernet cable: $50
- Connectors and cable management materials: $50
- 1 * router: $200
- **Total cost: $900**

*Manufacturing Department:*

- 23 * 48-port switches: $200 each = $4600
- 1100 meters of Ethernet cable: $275
- Connectors and cable management materials: $100
- 1 * router: $200
- **Total cost: $5075**

*Accounts Department:*

- 3 * 24-port switches: $100 each = $300
- 150 meters of Ethernet cable: $37.50
- Connectors and cable management materials: $30
- 1 * router: $200
- **Total cost: $767.50**



**Total cost for all departments:** $6442.50

**Leased line from ISP:** $500/month

**Total cost for entire network: $7142.50**


#### Network Diagram:

**High Level Network Diagram:**

```
[Internet] <---> [ISP Router] <---> [NAT Router (Marketing)] <---> [Switch 1] <---> [Switch 2]
| |
| |--> [Computer 1]
| |--> [Computer 2]
| |--> ...
| |--> [Computer 100]
|
| <---> [NAT Router (Manufacturing)] <---> [Switch 1] <---> [Switch 2] <---> ... <---> [Switch 22]
| |
| |--> [Computer 1]
| |--> [Computer 2]
| |--> ...
| |--> [Computer 500]
|
| <---> [NAT Router (Accounts)] <---> [Switch 1] <---> [Switch 2] <---> [Switch 3]
| |
| |--> [Computer 1]
| |--> [Computer 2]
| |--> ...
| |--> [Computer 50]
```

#### Enhanced Network Diagrams:

##### Marketing Department:

```
                               Internet
                                  |
                                  |
                                  |
                                  |
                              Router 1
                              /       \
                             /         \
                        Switch 1      Switch 2
                       /  |  \      /  |  \
                     /    |    \  /    |    \
                    /     |     \/     |     \
                Computer Computer Computer Computer
                (Marketing)  (Marketing)  (Marketing)  (Marketing)

```

##### Manufactoring Department:

```
                                         Internet
                                             |
                                             | Leased line from ISP
                                             |
                                             |
                                             |
                                             V
                                        Router (Manufacturing)
                                             |
                                             |
                                             |
                                             |
                                             |
                                             |
                                             V
                                    +-------------------+
                                    | Switch 1          |
                                    |                   |
                                    +-------------------+
                                             |
                                             |
                                             |
                                             |
                                             |
                                             |
                                             V
                                    +-------------------+
                                    | Switch 2          |
                                    |                   |
                                    +-------------------+
                                             .
                                             .
                                             .
                                             .
                                    +-------------------+
                                    | Switch 22         |
                                    |                   |
                                    +-------------------+
                                             |
                                             |
                                             |
                                             |
                                             |
                                             |
                                             V
                                        +-------------------+
                                        | Master Switch     |
                                        |                   |
                                        +-------------------+
                                             |
                                             |
                                             |
                                             |
                                             |
                                             |
                                             V
                                        Router (Manufacturing)
```

In this diagram, there are 22 48-port switches used to connect 500 computers in the Manufacturing department. All 22 switches are connected to a single "Master Switch", which is then connected to the Router for the Manufacturing department. The Router is connected to the Internet via a leased line from an ISP.

##### Accounts Department:

```
+-------------------------------------------+
|                                           |
|   +--------+                              |
|   |        |                              |
|   | Router |                              |
|   |        |                              |
|   +--------+                              |
|   |                                       |
|   |                                       |
|   |                                       |
|   +---------------------------------------+
|                                           |
|                                           |
|                                           |
|   +--------+   +--------+   +--------+    |
|   | Switch |   | Switch |   | Switch |    |
|   |   1    |   |   2    |   |   3    |    |
|   +--------+   +--------+   +--------+    |
|   |                                       |
|   |                                       |
|   |                                       |
|   +---------------------------------------+
|                                           |
+-------------------------------------------+

```

Each switch is connected to 23 computers, and all three switches are connected to the router. The router provides Internet access to the computers in the Accounts department.
