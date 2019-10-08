package tp3ex2designpattern;
public class MetallicTexture extends Texture{

    public MetallicTexture(final Shape shape) {
        super(shape);
    }
   public void setTexture(){
       System.out.println("Ajout de la tecture metallic, dans la methode setTexture()");
      
   }  
    @Override
   public void draw(){
       System.out.println("dans MetallicTexture dans la methode draw()");
       shape.draw();
       this.setTexture();
   }
}
