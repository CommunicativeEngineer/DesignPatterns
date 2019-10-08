package tp3ex2designpattern;
public class Circle extends Shape{ 
   
    private int x, y, radius; 

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
   @Override
    public void draw(){
         System.out.println("dans Circle dans la méthode draw()");
    }   
}
