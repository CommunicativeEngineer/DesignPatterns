package tp3ex2designpattern;

public abstract class Texture extends Shape {
    
   protected Shape shape;

    public Texture(final Shape shape) {
        this.shape = shape;
    }   
}