package tp3ex2designpattern;
public class GeometricTexture extends Texture {
 
     public GeometricTexture(final Shape shape) {
        super(shape);
    }
   public void setTexture(){
       System.out.println("Ajout de la texture dynamique, dans GeometricTexture dans setTexture()");
     
   } 
     @Override
   public void draw(){
        System.out.println("dans GeometricTexture dans la methode draw()");
       shape.draw();
       this.setTexture();
   }
}
