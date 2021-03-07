package factorymathod;

public abstract class WebDialog extends Dialog{
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
