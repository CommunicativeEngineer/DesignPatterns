package tp3ex1designpattern;
public class TP3EX1DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        DrawAPI redCircle = new RedCircle();
        DrawAPI greenCircle = new GreenCircle();
        
       Shape circlered1 = new Circle (3,1,1, redCircle);
       Shape circlegreen2 = new Circle (5,2,2,greenCircle);
        
       circlered1.draw();
       circlegreen2.draw();
     
    }
    
}
