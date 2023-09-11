package abstract_factory;

// Fábrica concreta da família 2
public class LinuxFactory implements GUIFactory {

    public LinuxButton createButton() {
        return new LinuxButton();
    }

        public LinuxMenu createMenu() {
        return new LinuxMenu();
    }

        public LinuxJanela createJanela() {
        return new LinuxJanela();
    }

}
