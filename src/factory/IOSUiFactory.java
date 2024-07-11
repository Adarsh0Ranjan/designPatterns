package factory;

import factory.buttons.AndroidButton;
import factory.buttons.Button;
import factory.buttons.IOSButtons;

public class IOSUiFactory implements UIFactory {
    @Override
    public Button craeteButton() {
        return new IOSButtons();
    }
}
