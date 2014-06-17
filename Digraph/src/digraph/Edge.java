/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digraph;

/**
 *
 * @author LuisDiego
 */
public class Edge implements Comparable<Edge> {
    private Node _source;
    private Node _destination;
    private int _weight;
   
    public Edge(Node pSourceNode, Node pDestinationNode, int pWeight) {
        _source = pSourceNode;
        _destination = pDestinationNode;
        _weight = pWeight;
    }

    public Node getSource() {
        return _source;
    }

    public Node getDestination() {
        return _destination;
    }

    public int getWeight() {
        return _weight;
    }

    public void setSource(Node pSource) {
        _source = pSource;
    }

    public void setDestination(Node pDestination) {
        _destination = pDestination;
    }

    public void setWeight(int pWeight) {
        _weight = pWeight;
    } 
   
    public int compareTo(Edge pEdge) {
        return _weight - pEdge.getWeight();
    }
}
