package tp4ex2designpattern;
public class ConcreteVisitor implements IVisitor{
 @Override
 public void visit(TacheElementaire te){
  System.out.println("<tacheElementaire>");
     System.out.println("   <nom>");
     System.out.println("   "+te.getNom());
     System.out.println("   </nom>");
     System.out.println("   <cout>");
     System.out.println("   "+te.getCout());
     System.out.println("   </cout>");
     System.out.println("</tacheElementaire>");     
 }
 @Override
    public void visit(TacheComplexe tc){
     System.out.println("<tacheComplexe>");
     System.out.println("   <nom>");
     System.out.println("   "+tc.getNom());
     System.out.println("   </nom>");
     System.out.println("   <cout>");
     System.out.println("   "+tc.getCout());
     System.out.println("   </cout>");
     if(!tc.getSousTaches().isEmpty()){
         System.out.println("    <sous-Tache>");
         for (Tache t:tc.getSousTaches()){
            t.acceptVisit(this);
        }
        System.out.println("   </sous-Tache>");
     }
     System.out.println("</tacheComplexe>");     
    }  
}
