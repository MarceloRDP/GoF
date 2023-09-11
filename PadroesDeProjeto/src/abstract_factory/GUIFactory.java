package abstract_factory;

// Fábrica abstrata
public interface GUIFactory {
    public Button createButton();
    public Menu createMenu();
    public Janela createJanela();
}
