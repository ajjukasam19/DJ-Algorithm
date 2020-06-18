import java.util.*;


public class Node implements Comparable<Node>{
	
	
	public String node_name;
	public Node parent_node=null;
	public int cost = Integer.MAX_VALUE;
	public ArrayList<Links> adj_nodes = new ArrayList<Links>();
	
	
	public Node(String name){ 
		node_name = name;
	}
	public String getName(){
		return node_name;
	}
	
	public void addAdjacentNode(Node node_link, int cost_offset){
		Links link = new Links(node_link,cost_offset);
		adj_nodes.add(link);
	}
	public int compareTo(Node arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	public String toString(){
		return node_name;
		
	}
}

