package factorymathod;
import java.awt.*;
public abstract class WindowsDialog extends Dialog
{
    @Override
    Button createButton() {
        return new WindowsButton();
    }

}
