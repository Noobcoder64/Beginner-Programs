package packages.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	Map<Vertex, List<Vertex>> adjVertices;
	
	public Graph() {
		this.adjVertices = new HashMap<Vertex, List<Vertex>>();
	}
	
	public void addVertex(String label) {
		adjVertices.putIfAbsent(new Vertex(label), new ArrayList<Vertex>());
	}
	
	public void removeVertex(String label) {
		Vertex vertexToBeRemoved = new Vertex(label);
		adjVertices.remove(vertexToBeRemoved);
		adjVertices.values().stream().forEach(verticesList -> verticesList.remove(vertexToBeRemoved));
	}
	
	public void addEdge(String label1, String label2) {
		Vertex vertex1 = new Vertex(label1);
		Vertex vertex2 = new Vertex(label2);
		
		adjVertices.get(vertex1).add(vertex2);
		adjVertices.get(vertex2).add(vertex1);
	}
	
	public void removeEdge(String label1, String label2) {
		Vertex vertex1 = new Vertex(label1);
		Vertex vertex2 = new Vertex(label2);
		
		adjVertices.get(vertex1).remove(vertex2);
		adjVertices.get(vertex2).remove(vertex1);
	}
	
}
