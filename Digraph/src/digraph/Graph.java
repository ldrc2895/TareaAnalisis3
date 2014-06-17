/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digraph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Calo
 */
public class Graph {
    
    private Map<Node, ArrayList<Edge>> _adjacencies = new HashMap<Node, ArrayList<Edge>>();

    public void addEdge(Node pSourceNode, Node pDestinationNode, int pWeight) {
        ArrayList<Edge> list;
        if (!_adjacencies.containsKey(pSourceNode)) {
            list = new ArrayList<Edge>();
            _adjacencies.put(pSourceNode, list);
        } else {
            list = _adjacencies.get(pSourceNode);
        }
        list.add(new Edge(pSourceNode, pDestinationNode, pWeight));
    }

    public ArrayList<Edge> getAdjacent(Node pSourceNode) {
        return _adjacencies.get(pSourceNode);
    }

    public void reverseEdge(Edge pEdge) {
        _adjacencies.get(pEdge.getSource()).remove(pEdge);
        addEdge(pEdge.getDestination(), pEdge.getSource(), pEdge.getWeight());
    }

    public void reverseGraph() {
        _adjacencies = getReversedList()._adjacencies;
    }

    public Graph getReversedList() {
        Graph newlist = new Graph();
        for (ArrayList<Edge> edges : _adjacencies.values()) {
            for(Edge edge : edges){
                newlist.addEdge(edge.getDestination(), edge.getSource(), edge.getWeight());
            }
        }
        return newlist;
    }

    public Set<Node> getSourceNodeSet() {
        return _adjacencies.keySet();
    }

    public Collection<Edge> getAllEdges() {
        ArrayList<Edge> edges = new ArrayList<>();
        for (List<Edge> edge : _adjacencies.values()) {
            edges.addAll(edge);
        }
        return edges;
    }
    
}
