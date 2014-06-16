/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digraph;

import java.util.ArrayList;

/**
 *
 * @author LuisDiego
 */
public class Node {
    private  int _id ;
    private ArrayList <Arc> _arcs;
    private boolean _visited;

    public Node(int pId) {
        this._id = pId;
        _visited = false;
        _arcs = new ArrayList();
    }
    public void addArc(Arc pArc){
       try{
            if(searchArc(pArc)==null){
                _arcs.add(pArc);
            }
        }catch(Exception e){
            e.printStackTrace();
               
        }
    }

    public Arc searchArc(Arc pArc) {
        try{
            for(Arc arc: _arcs){
                if(arc.getNode().getId()==pArc.getNode().getId()){
                    return arc;
                }
            }
            return null;
        }catch(Exception e){
            return null;
        }
    }
    public int getId(){
        return _id;
    }
    
    
    
    
    
    
}
