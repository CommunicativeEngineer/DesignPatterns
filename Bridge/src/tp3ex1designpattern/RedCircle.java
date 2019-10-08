package tp3ex1designpattern;

public class RedCircle implements DrawAPI {
    @Override
    public void  drawCircle(int x, int y, int radius){
        System.out.println("Dessin d'un cercle rouge de rayon " + radius +
                " centre de coordonnées x:" + x +" y :" + y ) ;    
    }
}
