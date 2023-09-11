package abstract_factory;

// Produto abstrato tipo 2
public interface Menu {
    public void paint();
}

// Produto concreto tipo 2 da família 1
class WindowsMenu implements Menu {
    public void paint() {
        System.out.println("Eu sou um menu do Windows");
    }
}

// Produto concreto tipo 2 da família 1
class LinuxMenu implements Menu {
    public void paint() {
        System.out.println("Eu sou um menu do Linux");
    }
}

