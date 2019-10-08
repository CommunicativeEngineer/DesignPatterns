package tp3ex3designpattern;

import java.sql.Connection;

public class MySQLClass {
 
    public static Connection seConnecter(){
        System.out.println("dans MySQLClass: seConnecter()");
        return null;
    }
    public void genererRapport(String nomTable,Connection con){
        System.out.println("Rapport d'une table MySQL de nom:" + nomTable+ 
                "dans MySQLClass:genererRapport()");
    }
}
