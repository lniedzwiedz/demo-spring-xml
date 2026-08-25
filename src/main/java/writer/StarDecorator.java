package writer;

public class StarDecorator implements IDecorator {

    @Override
    public String decorator(String co) {
        return "**** " + co + " ****";
    }
}