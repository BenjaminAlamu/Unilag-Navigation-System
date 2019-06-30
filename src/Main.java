public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("A", "Gate");
        Node nodeB = new Node("B", "Education");
        Node nodeC = new Node("C", "DLI");
        Node nodeD = new Node("D", "Sport");
        Node nodeE = new Node("E", "Environmental Science");
        Node nodeF = new Node("F", "Chapel and Mosque");
        Node nodeG = new Node("G", "New Hall");
        Node nodeH = new Node("H", "CITS/Bus Park");
        Node nodeI = new Node("I", "Ozoluwa");
        Node nodeJ = new Node("J", "Science");
        Node nodeK = new Node("K", "Moremi");
        Node nodeL = new Node("L", "Law" );
        Node nodeM = new Node("M", "Engineering");
        Node nodeN = new Node("N", "Main Aud");
        Node nodeO = new Node("O", "Bus Admin");
        Node nodeP = new Node("P", "Archi");
        Node nodeQ = new Node("Q", "Lagoon Front");
        Node nodeR = new Node("R", "FSS");


        nodeA.addDestination(nodeB, 2);
        nodeA.addDestination(nodeE, 3);
        nodeB.addDestination(nodeC, 4);
        nodeB.addDestination(nodeD, 2);
        nodeE.addDestination(nodeF, 2);
        nodeE.addDestination(nodeD, 2);
        nodeF.addDestination(nodeG, 2);
        nodeF.addDestination(nodeD, 2);
        nodeC.addDestination(nodeI, 15);
        nodeD.addDestination(nodeH, 4);
        nodeG.addDestination(nodeH, 1);
        nodeG.addDestination(nodeR, 4);
        nodeG.addDestination(nodeH, 5);
        nodeG.addDestination(nodeL, 7);
        nodeL.addDestination(nodeO, 2);
        nodeN.addDestination(nodeM, 1);
        nodeC.addDestination(nodeJ, 10);
        nodeK.addDestination(nodeJ, 5);
        nodeJ.addDestination(nodeM, 5);
        nodeO.addDestination(nodeN, 7);
        nodeO.addDestination(nodeP, 8);
        nodeP.addDestination(nodeQ, 1);
        nodeM.addDestination(nodeN, 1);
        nodeM.addDestination(nodeP, 2);
        nodeM.addDestination(nodeQ, 2);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        graph.addNode(nodeG);
        graph.addNode(nodeH);
        graph.addNode(nodeI);
        graph.addNode(nodeJ);
        graph.addNode(nodeK);
        graph.addNode(nodeL);
        graph.addNode(nodeM);
        graph.addNode(nodeN);
        graph.addNode(nodeO);
        graph.addNode(nodeP);
        graph.addNode(nodeQ);
        graph.addNode(nodeR);


        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

        for (Node node : graph.getNodes()) {
            System.out.println("Destination Node: " + node.getAlias() + " Path:");
            for (int i = 0; i < node.getShortestPath().size(); i++) {
                System.out.print(" => " + node.getShortestPath().get(i).getAlias());
            }
            System.out.println(" => " + node.getAlias() );
            System.out.println();

        }
    }
}
