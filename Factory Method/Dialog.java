package factorymathod;

import javax.swing.*;

public abstract class Dialog implements Button {
    abstract Button createButton();
    public void render(Action closeDialog) {
        Button okButton = createButton();
        okButton.onClick(closeDialog);
        okButton.render();
    }
}
