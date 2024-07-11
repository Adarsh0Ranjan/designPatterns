package factory.buttons;

public class AndroidButton implements  Button{
    @Override
    public void changeSize() {
        System.out.println("Changing Size for android buttons");
    }
}
