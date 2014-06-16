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
class Arc {

    private Node _node;
    private int _weight;
    
    public Arc(Node pNode, int pWeight){
    
        _node = pNode;
        _weight = pWeight;
    }

    public Node getNode(){
        return _node;
    }
    
    public int getWeight() {
        return _weight;
    }
    
    public void setNode(Node pNode){
        _node = pNode;
    }
    
    public void setWeight(int pWeight){
        _weight = pWeight;
    }
    
    
    
}
