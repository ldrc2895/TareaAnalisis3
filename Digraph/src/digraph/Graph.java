/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digraph;

import java.util.ArrayList;

/**
 *
 * @author Calo
 */
public class Graph {
    
    private ArrayList<Node> _nodes;
    
    public Graph(){
        _nodes = new ArrayList();
    }

    public ArrayList<Node> getNodes() {
        return _nodes;
    }

    public void setNodes(ArrayList<Node> pNodes) {
        _nodes = pNodes;
    }
    
    
    
}
