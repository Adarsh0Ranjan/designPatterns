package factory;

import factory.buttons.AndroidButton;
import factory.buttons.Button;

public class AndroidUiFactory implements UIFactory {
    @Override
    public Button craeteButton() {
        return new AndroidButton();
    }
}
