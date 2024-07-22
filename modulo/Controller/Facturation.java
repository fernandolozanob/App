
/**
 * Write a description of class Facturation here.
 *
 * @author (Fernando LOZANO)
 * @version (standard)
 */
public class Facturation extends Mailer
{
    // instance variables - replace the example below with your own
    private int somme;

    /**
     * Constructor for objects of class m
     */
    public Facturation()throws Exception
    {
        // initialise instance variables
        somme = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    all proprietes from Mailer class. 
     */
    public void _depot(int d)throws Exception
    {
        somme+= d; 
        _notify();
        
    }
    
    
    
    public static void main(String ...arg)throws Exception{
            
                Facturation m  = new Facturation(); 
                
                Response r1 = new Client();
                Response r2 = new Client();
                Response r3 = new Client();
                
                
                m._add(r1);
                m._add(r2);
                m._add(r3);
                
                
                //Un mouvement/action
                m._depot(4); 
                
                
                /***
                 * Un listener/ecouter en detail
                 */
            
        
    }
    
    
}
