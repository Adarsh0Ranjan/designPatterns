package factory;

public class Flutter {
    private SupportedPlatforms supportedPlatforms;

    public  Flutter(SupportedPlatforms supportedPlatforms) {
        this.supportedPlatforms = supportedPlatforms;
    }

    public  void setRefreshRate() {
        System.out.println("Setting Refresh Rate");
    }

    public  UIFactory createUIFactory() {
        if (supportedPlatforms == SupportedPlatforms.ANDROID) {
            return new AndroidUiFactory();
        } else if (supportedPlatforms == SupportedPlatforms.IOS) {
            return new IOSUiFactory();
        }
        return null;
    }
}
