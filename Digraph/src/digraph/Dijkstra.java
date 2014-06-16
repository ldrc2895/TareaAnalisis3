/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digraph;

import java.util.PriorityQueue;

/**
 *
 * @author LuisDiego
 */
public class Dijkstra {
    public static void computePaths(Node pSource){
        pSource.setMinDistance(0);
        PriorityQueue<Node> vertexQueue = new PriorityQueue<Node>();
      	vertexQueue.add(pSource);

	while (!vertexQueue.isEmpty()) {
	    Node startNode = vertexQueue.poll();

            // Visit each edge exiting u
            for (Arc arc : startNode.getArcs())
            {
                Node destination = arc.getNode();
                double weight = arc.getWeight();
                double distanceThroughStartNode = startNode.getMinDistance() + weight;
		if (distanceThroughStartNode < destination.getMinDistance()) {
		    vertexQueue.remove(destination);
		    destination.setMinDistance(distanceThroughStartNode);
                    destination.setPreviousNode(startNode);
		    vertexQueue.add(destination);
		}
            }
        }
    }
    
}
