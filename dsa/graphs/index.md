# Graphs

A graph data structure is a way to represent a set of objects where some pairs of the objects are connected by links. These objects are called vertices or nodes, and the links that connect them are called edges. A graph is the collection of vertices(V) and edges(E).

A graph can be used to represent many different kinds of relationships, such as social networks, computer networks, transportation networks, and more.

There are two main types of graphs: directed and undirected. In a directed graph, the edges have a direction, while in an undirected graph, they do not.

Graphs can be represented in various ways, including adjacency matrix, adjacency list, and edge list.

Graphs are used in many algorithms and data structures, such as shortest path algorithms, network flow algorithms, and minimum spanning tree algorithms. They are also a fundamental concept in computer science and mathematics.

## Important Terms Related to Graph:

1. **Vertex or Node:** A vertex or node is a point in a graph that represents an entity or object.

2. **Edge or Arc:** An edge or arc is a line segment that connects two vertices in a graph and represents a relationship or connection between the two vertices.

3. **Directed Graph:** A directed graph is a graph in which each edge has a direction or orientation. In other words, each edge is a one-way connection between two vertices.

4. **Undirected Graph:** An undirected graph is a graph in which the edges do not have a direction. Each edge is a connection between two vertices, and the connection is bidirectional.

5. **Weighted Graph:** A weighted graph is a graph in which each edge has a weight or cost associated with it. The weight represents the cost or distance between the two vertices connected by the edge.

6. **Walk:**  A walk is a sequence of vertices that we get by following edges on the graph. In a walk edges can be traversed any number of times.

7. **Path:** A path in a graph is a sequence of edges that connects a sequence of vertices. The length of a path is the number of edges in the path. Its a special type of walk, with no repetation of edges.

8. **Cycle:** A cycle in a graph is a path that starts and ends at the same vertex.

9. **Degree of a Vertex:** The degree of a vertex is the number of edges connected to that vertex.

10. **Connected Graph:** A connected graph is a graph in which there is a path between any two vertices in the graph.

11. **Complete Graph:** A complete graph is a graph in which there is an edge between every pair of vertices.

12. **Subgraph:** A subgraph of a graph is a graph that is formed by selecting a subset of the vertices and edges from the original graph.

13. **Spanning Tree:** A spanning tree of a graph is a subgraph that is a tree and includes all the vertices of the original graph.

14. **Graph Coloring:** Graph coloring is the assignment of colors to the vertices of a graph in such a way that no two adjacent vertices have the same color.

15. **Cut Vertex or Articulation Point:** A cut vertex or articulation point is a vertex that, if removed along with its incident edges, would disconnect the graph.

16. **Bridge:** A bridge is an edge that, if removed, would disconnect the graph.



## Types of Graph:

### 1. Undirected Graph:

An undirected graph is a graph in which the edges do not have a direction. This means that each edge is a connection between two vertices, and the connection is bidirectional. In other words, if there is an edge between vertices A and B, there is also an edge between vertices B and A.

Here are some important formulas related to undirected graphs:

1. **Number of Edges:** In an undirected graph with n vertices, the maximum number of edges is n*(n-1)/2. This is known as the complete graph.

2. **Degree of a Vertex:** The degree of a vertex is the number of edges connected to that vertex. In an undirected graph, the sum of the degrees of all vertices is equal to twice the number of edges in the graph. This is known as the Handshake Lemma.

3. **Connectedness:** An undirected graph is connected if there is a path between any two vertices in the graph. A connected component is a subgraph of a graph in which every pair of vertices is connected by a path.

4. **Euler's Formula:** In a connected, planar, undirected graph with n vertices, m edges, and r regions, the following formula holds: n - m + r = 2.

5. **Graph Coloring:** A graph is said to be k-colorable if it can be colored using k or fewer colors in such a way that no two adjacent vertices have the same color. The chromatic number of a graph is the smallest number of colors needed to k-color the graph.


### 2. Directed Graph:

A directed graph is a graph in which the edges have a direction or orientation. In other words, each edge is a one-way connection between two vertices. If there is an edge from vertex A to vertex B, there is no guarantee that there is also an edge from B to A.

Here are some important formulas related to directed graphs:

1. **Number of Edges:** In a directed graph with n vertices, the maximum number of edges is n*(n-1). This is known as the complete directed graph.

2. **Indegree and Outdegree:** The indegree of a vertex is the number of edges that are directed towards the vertex, while the outdegree of a vertex is the number of edges that are directed away from the vertex. In a directed graph, the sum of the indegrees of all vertices is equal to the sum of the outdegrees of all vertices and to the total number of edges in the graph.

3. **Strongly Connected Components:** A strongly connected component (SCC) of a directed graph is a subgraph in which there is a path from any vertex to any other vertex. The number of SCCs in a directed graph can be found using algorithms such as Tarjan's algorithm or Kosaraju's algorithm.

4. **Eulerian Path and Eulerian Circuit:** An Eulerian path is a path that visits every edge of a directed graph exactly once, while an Eulerian circuit is an Eulerian path that starts and ends at the same vertex. In a directed graph, an Eulerian circuit exists if and only if the graph is strongly connected and every vertex has the same indegree and outdegree. An Eulerian path exists if and only if the graph is strongly connected and at most two vertices have a difference between their indegree and outdegree of 1.

5. **Transitive Closure:** The transitive closure of a directed graph is a new graph in which there is an edge from vertex A to vertex B if and only if there is a path from A to B in the original graph. The transitive closure can be computed using algorithms such as the Floyd-Warshall algorithm or the Warshall's algorithm.
