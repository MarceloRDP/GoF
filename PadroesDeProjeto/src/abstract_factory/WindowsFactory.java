package abstract_factory;

// Fábrica concreta da família 1
public class WindowsFactory implements GUIFactory{

    public WindowsButton createButton() {
        return new WindowsButton();
    } 
    
    public WindowsMenu createMenu() {
        return new WindowsMenu();
    }  

    public WindowsJanela createJanela() {
        return new WindowsJanela();
    } 

}