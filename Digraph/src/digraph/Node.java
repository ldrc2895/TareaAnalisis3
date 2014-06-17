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
public class Node implements Comparable<Node> {
    private int _id;
    boolean _visited = false;
   
    public Node(int pNodeId) {
        _id = pNodeId;
    }

    public int getId() {
        return _id;
    }

    public boolean isVisited() {
        return _visited;
    }

    public void setId(int pId) {
        _id = pId;
    }

    public void setVisited(boolean pVisited) {
        _visited = pVisited;
    }
   
    @Override
    public int compareTo(Node pNode) {
        return pNode == this ? 0 : -1;
    }
}
