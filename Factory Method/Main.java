package factorymathod;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Main {
    private static Dialog dialog;
    public static void initialize() throws FileNotFoundException {
        FileReader file = new FileReader("Config.txt");
        String ConfigOS = (String.valueOf(file));
        if(ConfigOS.equals("Windows"))
        {
            dialog = new WindowsDialog() {
                @Override
                public void render() {
                }
                @Override
                public void onClick(Action f) {

                }
            };
        }
        else if(ConfigOS.equals("Web"))
        {
            dialog = new WebDialog() {
                @Override
                public void render() {
                }
                @Override
                public void onClick(Action f) {
                }
            };
        }
        else{
            Exception error = new Exception("Error! Unknown operating system.");
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        initialize();
        dialog.render();
    }
}