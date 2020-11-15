package mediatheque;

public class ItemPrinter implements ItemVisitor{
    @Override
    public void visit(Book m) {
        System.out.println("Visiting Book : " + m);
    }

    @Override
    public void visit(CD m) {
        System.out.println("Visiting CD : " + m);
    }
}
