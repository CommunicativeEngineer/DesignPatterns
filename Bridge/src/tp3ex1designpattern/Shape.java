package tp3ex1designpattern; 

public abstract class Shape {
    
    protected DrawAPI drawAPI ;
   
    protected  Shape (DrawAPI drawAPI){
        System.out.println(" Dans Shape au niveau du constructeur");
        this.drawAPI = drawAPI;
    }
    public abstract void draw();  
}
