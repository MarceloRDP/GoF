package abstract_factory;

//Produto abstrato tipo 3
public interface Window {
    public void paint();
}

// Produto concreto tipo 3 da família 1
class WindowsWindow implements Window {
    public void paint() {
        System.out.println("Eu sou uma janela do Windows");
    }
}

// Produto concreto tipo 3 da família 2
class LinuxWindow implements Window {
    public void paint() {
        System.out.println("Eu sou uma janela do Linux");
    }
}

