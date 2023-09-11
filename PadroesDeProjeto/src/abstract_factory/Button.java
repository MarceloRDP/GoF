package abstract_factory;

// Produto abstrato tipo 1
public interface Button {
    public void paint();
}

// Produto concreto tipo 1 da família 1
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Eu sou um botão do Windows");
    }
}

// Produto concreto tipo 1 da família 1
class LinuxButton implements Button {
    public void paint() {
        System.out.println("Eu sou um botão do Linux");
    }
}
