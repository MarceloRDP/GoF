import abstract_factory.Button;
import abstract_factory.GUIFactory;
import abstract_factory.Janela;
import abstract_factory.LinuxFactory;
import abstract_factory.Menu;
import abstract_factory.WindowsFactory;

// Cliente que vai instanciar a família correta
class Application {
    public Application(GUIFactory factory) {

        Button button = factory.createButton();
        Menu menu = factory.createMenu();
        Janela janela = factory.createJanela();
        
        button.paint();
        menu.paint();
        janela.paint();

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
