/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pidevv;
import Entities.Personne;
import Services.Crudpersonne;

/**
 *
 * @author Raid
 */
public class PIDEVV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Personne p1 = new Personne(12,"aaa","aaaa");
        Personne p2 = new Personne(13,"BB","BB");
        Personne p3 = new Personne(14,"CC","CC");
        
        Crudpersonne serv = new Crudpersonne();
        
        
        serv.ajouterpersonne(p1);
        serv.ajouterpersonne(p2);
        serv.ajouterpersonne(p3);
        
        serv.afficherpersonne();
        
       //serv.Supprimerpersonne(p1.getId());
        
       serv.afficherpersonne();
        
        


        
    }
    
}
