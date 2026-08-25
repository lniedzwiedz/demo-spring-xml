package writer;

public class DashDecorator implements IDecorator {

    @Override
    public String decorator(String co) {
        return "****" + co + "****";
    }
}