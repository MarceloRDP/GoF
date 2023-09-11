package abstract_factory;

//Produto abstrato tipo 3
public interface Janela {
    public void paint();
}

// Produto concreto tipo 3 da família 1
class WindowsJanela implements Janela {
    public void paint() {
        System.out.println("Eu sou uma janela do Windows");
    }
}

// Produto concreto tipo 3 da família 2
class LinuxJanela implements Janela {
    public void paint() {
        System.out.println("Eu sou uma janela do Linux");
    }
}

