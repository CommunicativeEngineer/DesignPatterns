package tp3ex3designpattern;
import java.sql.Connection;
public class FacadeClass {
    
    private OracleClass oc = new OracleClass();
    private MySQLClass msc = new MySQLClass();
   
    public static void generateReport(String dbType, String tableNom){
		Connection con = null;
		switch (dbType){
		case "MYSQL": 
			con = MySQLClass.seConnecter(); 
			MySQLClass mySqlInstance = new MySQLClass();
                        System.out.println("generation rapport dans la façade");
			mySqlInstance.genererRapport(tableNom , con );
			break;
		case "ORACLE": 
			con = OracleClass.seConnecter(); 
			OracleClass OracleInstance = new OracleClass();
                        System.out.println("generation rapport dans la façade");
			OracleInstance.genererRapport(tableNom , con );
			break;
		}
		
	}
    
}
