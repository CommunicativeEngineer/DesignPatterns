package tp3ex2designpattern;
public class TP3EX2DesignPattern {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Création du cercle dans le main()");
        final Circle c = new Circle(2,3, 4);
        System.out.println("instanciation de la texture geometrique dans le main()");
        final GeometricTexture gt = new GeometricTexture(c);
        System.out.println("instanciation de la texture métallique dans le main()");
        final MetallicTexture mt = new MetallicTexture(gt);
        System.out.println("appel de la méthode draw dans le main()");
        mt.draw();
    }   
}
