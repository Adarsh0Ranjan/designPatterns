package factory.buttons;

public class IOSButtons implements Button {

    @Override
    public void changeSize() {
        System.out.println("Changing Size for ios buttons");
    }
}
