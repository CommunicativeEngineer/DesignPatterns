package tp2ex2designpattern;

public class Meal {

    public Meal() {
        System.out.println(" constructeur Meal __ Meal "); 
    }
    
   private Hamburger h;
   private Boisson b ;

    public Hamburger getH() {
        return h;
    }

    public void setH(Hamburger h) {
        this.h = h;
    }

    public Boisson getB() {
        return b;
    }

    public void setB(Boisson b) {
        this.b = b;
    }    
}
