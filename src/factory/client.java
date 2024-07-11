package factory;

import factory.buttons.Button;

public class client {
    public  static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.IOS);
        UIFactory uifactory = flutter.createUIFactory();
        Button button = uifactory.craeteButton();
        button.changeSize();
    }
}
