package writer;

public class NiceWriter implements IWriter {

    IDecorator decorator;

    public void writer(String s) {
        System.out.println("The string is: " + s);
        System.out.println(" Thank you for your attention");
        System.out.println(decorator.decorator("Goodbye") + s);
    }

    public void setDecorator(IDecorator decorator) {
        this.decorator = decorator;
    }
}