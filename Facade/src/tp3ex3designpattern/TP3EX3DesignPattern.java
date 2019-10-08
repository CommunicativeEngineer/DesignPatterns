package tp3ex3designpattern;
import java.sql.Connection;
public class TP3EX3DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("debut main");
        FacadeClass fc = new FacadeClass();
        String tableName="Employee";
        String DbType = "ORACLE";
        System.out.println("appel de genererRapport dans le main");
	fc.generateReport(DbType, tableName);
    }  
}
