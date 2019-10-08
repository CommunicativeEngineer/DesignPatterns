package tp4ex2designpattern;
public interface IVisitor {
 
    public void visit(TacheElementaire te);
    public void visit(TacheComplexe tc);
}
