package tp3ex3designpattern;

import java.sql.Connection;
public class OracleClass {
    
    public static Connection seConnecter(){
        System.out.println("dans OracleClass: seConnecter()");
        return null; 
    }
     public void genererRapport(String nomTable,Connection con){
        System.out.println("Rapport d'une table Oracle de nom:" + nomTable+ 
                "dans MySQLClass:genererRapport()");
    }
}
