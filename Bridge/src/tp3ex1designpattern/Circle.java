package tp3ex1designpattern;

public class Circle extends Shape{
    
    int x, y, radius; 
    
    public  Circle (int x, int y, int radius, DrawAPI drawcircle){
      
        super(drawcircle);
         this.x = x;
        this.y = y;
        this.radius = radius;
        System.out.println("constructeur Circle fin");
    }
    
   @Override
    public void draw(){
        System.out.println( " methode draw() dans circle et appel de draw de drawAPI");
        drawAPI.drawCircle(x,y,radius);
    }

 
   
}
