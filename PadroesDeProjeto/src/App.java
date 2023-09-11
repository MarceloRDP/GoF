import abstract_factory.Button;
import abstract_factory.GUIFactory;
import abstract_factory.Window;
import abstract_factory.LinuxFactory;
import abstract_factory.Menu;
import abstract_factory.WindowsFactory;

// Cliente que vai instanciar a família correta
class Application {
    public Application(GUIFactory factory) {

        Button button = factory.createButton();
        Menu menu = factory.createMenu();
        Window window = factory.createWindow();
        
        button.paint();
        menu.paint();
        window.paint();

    }
}

public class App {
    public static void main(String[] args) throws Exception {
        new Application(createOsSpecificFactory());
    }

    // Método que a partir de um parâmetro recebido em tempo de execução retornará a fábrica da família correta.
    public static GUIFactory createOsSpecificFactory() {
        double sys = Math.random();
        if (sys > 0.5) {
            return new WindowsFactory();
        } else {
            return new LinuxFactory();
        }
    }
}
