public class Networks {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===============================================================");
		System.out.println("*******network:1 shortest path Dijskstra algorithm**********");

		ShortestPathForDijskstra N1 = new ShortestPathForDijskstra();
		System.out.println("===============================================================");
		
		N1.addNode("S"); //s
		N1.addNode("A"); //a
		N1.addNode("B"); //b
		N1.addNode("C"); //c
		N1.addNode("E"); //d
		N1.addNode("T"); //t
		
		
		N1.addAdjacentNode(0, 1, 4);
		N1.addAdjacentNode(0, 2, 6);
		N1.addAdjacentNode(1, 2, 2);
		N1.addAdjacentNode(1,3,2);
		N1.addAdjacentNode(1,4,1);
		N1.addAdjacentNode(2,1,2);
		N1.addAdjacentNode(2,4,2);
		N1.addAdjacentNode(3,1,2);
		N1.addAdjacentNode(3,4,1);
		N1.addAdjacentNode(3,5,3);
		N1.addAdjacentNode(4,1,1);
		N1.addAdjacentNode(4,2,2);
		N1.addAdjacentNode(4,3,1);
		N1.addAdjacentNode(4,5,7);
		N1.addAdjacentNode(5,3,3);
		N1.addAdjacentNode(5,4,7);
	
				
		System.out.println("root node: S");
		
		N1.caculateShortestPathForDijskstra(0);
		
	
		System.out.println("path for A");
		N1.printPaths(1);
		System.out.println("path for B");
		N1.printPaths(2);
		System.out.println("path for C");
		N1.printPaths(3);
		System.out.println("path for D");
		N1.printPaths(4);
		System.out.println("path for T");
		N1.printPaths(5); 
			
		System.out.println("===================================================================");
		System.out.println("*******network:2 shortest path for Dijskstra algorithm**********");
		ShortestPathForDijskstra N2 = new ShortestPathForDijskstra();
		
		System.out.println("===================================================================");
		
		
		N2.addNode("A"); //a
		N2.addNode("B"); //b
		N2.addNode("C"); //c
		N2.addNode("D"); //d
		N2.addNode("E"); //e
		
		N2.addAdjacentNode(0,1,10);
		N2.addAdjacentNode(0,4,5);
		N2.addAdjacentNode(1,2,1);
		N2.addAdjacentNode(1,4,2);
		N2.addAdjacentNode(2,3,4);
		N2.addAdjacentNode(3,2,6);
		N2.addAdjacentNode(3,0,7);
		N2.addAdjacentNode(4,1,3);
		N2.addAdjacentNode(4,3,2);
		N2.addAdjacentNode(4,2,9);
		
		
		System.out.println("root node: A");
		
		N2.caculateShortestPathForDijskstra(0);
		
	
		System.out.println("path for B");
		N2.printPaths(1);
		System.out.println("path for C");
		N2.printPaths(2);
		System.out.println("path for D");
		N2.printPaths(3);
		System.out.println("path for E");
		N2.printPaths(4);	
	
		
		
		System.out.println("===============================================================");
		System.out.println("*******network:3 shortest path Dijskstra algorithm**********");
		ShortestPathForDijskstra N3 = new ShortestPathForDijskstra();
		
		System.out.println("===============================================================");
		
		
		N3.addNode("A"); //a
		N3.addNode("B"); //b
		N3.addNode("C"); //c
		N3.addNode("D"); //d
		N3.addNode("E"); //e
		N3.addNode("F"); //f
		N3.addNode("G"); //g
		N3.addNode("H"); //h
		N3.addNode("J"); //j
		N3.addNode("K"); //k
		
		N3.addAdjacentNode(0,1,1);
		N3.addAdjacentNode(0,4,1);
		N3.addAdjacentNode(1,0,1);
		N3.addAdjacentNode(1,2,1);
		N3.addAdjacentNode(2,1,1);
		N3.addAdjacentNode(2,5,3);
		N3.addAdjacentNode(2,8,4);
		N3.addAdjacentNode(2,6,1);
		N3.addAdjacentNode(3,4,5);
		N3.addAdjacentNode(3,8,2);
		N3.addAdjacentNode(3,9,1);
		N3.addAdjacentNode(3,7,1);
		N3.addAdjacentNode(4,0,1);
		N3.addAdjacentNode(4,6,1);
		N3.addAdjacentNode(4,3,5);
		N3.addAdjacentNode(5,2,3);
		N3.addAdjacentNode(5,9,1);
		N3.addAdjacentNode(6,2,1);
		N3.addAdjacentNode(6,4,1);
		N3.addAdjacentNode(6,7,1);
		N3.addAdjacentNode(7,6,1);
		N3.addAdjacentNode(7,3,1);
		N3.addAdjacentNode(8,2,4);
		N3.addAdjacentNode(8,3,2);
		N3.addAdjacentNode(9,3,1);
		N3.addAdjacentNode(9,5,1);
		
		
		
		System.out.println("root node: A");
		
		N3.caculateShortestPathForDijskstra(0);
		
	
		System.out.println("path for B");
		N3.printPaths(1);
		System.out.println("path for C");
		N3.printPaths(2);
		System.out.println("path for D");
		N3.printPaths(3);
		System.out.println("path for E");
		N3.printPaths(4);
		System.out.println("path for F");
		N3.printPaths(5);
		System.out.println("path for G");
		N3.printPaths(6);
		System.out.println("path for H");
		N3.printPaths(7);
		System.out.println("path for J");
		N3.printPaths(8);
		System.out.println("path for K");
		N3.printPaths(9);	
	
		
	}
}

