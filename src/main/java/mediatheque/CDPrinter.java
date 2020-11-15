package mediatheque;

public class CDPrinter implements ItemVisitor {
    @Override
    public void visit(Book m) {
    }

    @Override
    public void visit(CD m) {
        System.out.println("Visiting CD : " + m);
    }
}
