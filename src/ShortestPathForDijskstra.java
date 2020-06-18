import java.util.*;

public class ShortestPathForDijskstra{

	public ArrayList<Node> node_list = new ArrayList<Node>();
	
	void addNode(String node_name){
		Node n1 = new Node(node_name);
		node_list.add(n1);
	}
	void addAdjacentNode(int parent, int child, int cost){
		node_list.get(parent).addAdjacentNode(node_list.get(child),cost);
	}
	
	void printPaths(int parent){
		
		System.out.print("cost : ");
		
		Node n = node_list.get(parent);
		String reverse_path = " ";
		reverse_path += n.getName();
		for(int j=0;n.parent_node!=null;n = n.parent_node,j++){
	//		System.out.println(" "+node_list.get(parent).getName()+" - adj "+ node_list.get(parent).adj_nodes.get(j).node_link.getName()+
		//			" : cost "+node_list.get(parent).adj_nodes.get(j).node_cost);
			if(j==0)
				System.out.println(n.cost);
			//System.out.print(n.parent_node+" - ");
			reverse_path +=" "+n.parent_node;
		
		}
		
		String path = new StringBuffer(reverse_path).reverse().toString();
		System.out.println(path);
	}
	
	
	
	void caculateShortestPathForDijskstra(int rootnode){
		
		Node root_node = node_list.get(rootnode);
		root_node.cost = 0;
		
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		queue.add(root_node);
		
		
		while(!queue.isEmpty()){
			int count=0;
	
			Node parent = queue.poll();   // stopped here.
			int size = parent.adj_nodes.size();
			//System.out.println("count "+count+" size:"+size);
			Node smallest_distance_node = null;
			int smallest_distance = Integer.MAX_VALUE;
			while(count<size){
				
				Node child = parent.adj_nodes.get(count).node_link;
				//int offset_cost = parent.adj_nodes.get(count).node_cost;
				int temp_cost = parent.cost+parent.adj_nodes.get(count).node_cost;
				//System.out.println("temp_cost:"+temp_cost);
				//System.out.println("child_cost:"+child.cost);
				if(temp_cost<child.cost)
				{
					
					//queue.remove(child);
					child.cost = temp_cost;
					child.parent_node = parent;
					if(child.cost<smallest_distance)
					{
						smallest_distance = child.cost;
						smallest_distance_node = child;
					}
						
					//queue.add(child);
				}	
				count++;
			}
			queue.remove(smallest_distance_node);
			if(smallest_distance_node != null)
			queue.add(smallest_distance_node);
			queue.remove(parent);
		}
	}
}
