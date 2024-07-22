import java.util.ArrayList;


/**
 * Description of class Mailer here.
 * 
 * Show the principe syncron from all propriete class 
 *
 * @author (Fernando LOZANO)
 * @version (Standard)
 */
 abstract class Mailer
{
    
    ArrayList<Response> _list;
    
    // Default concept. 
    String _interruption; 
    String _transformation; 
    String _acces; 


    
     Mailer()
    {
        _list = new  ArrayList(); 
    }

   
    void _add(Response t){
        
                _list.add(t); 
    }
    
    
    void _notify(){
    
            for(Response item : _list){
                
                    item._update(this); 
            }   
            
    }
    
    
     String _getInterrupetion(){return this._interruption;}
     String _getRansformation(){return this._transformation;}
     String _getAcces(){return this._acces;}
    
    
    
    
    
}
