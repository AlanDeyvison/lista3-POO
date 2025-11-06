public class App {
    public static void main(String[] args) {

        Carro carro = new Carro("Ford", 2022, 4);

        Caminhao caminhao = new Caminhao("Volvo", 2023, 15.5);

        SUV suv = new SUV("Jeep", 2024, 5, true);

        SedanEletrico sedanEletrico = new SedanEletrico("Tesla", 2024, 4, 600);

        System.out.println("teste do carro");
        carro.turnOn();
        carro.displayInfo();
        carro.displayInfo(true);
        carro.openDoor();
        carro.openDoor(2);
        carro.changeGear();

        System.out.println("\nteste do caminhão");
        caminhao.turnOn();
        caminhao.displayInfo();
        caminhao.chargeBatery();
        caminhao.chargeBatery(120);
        caminhao.autoPilot();
        caminhao.calibrateSensor();
        caminhao.carryThing();

        System.out.println("\nteste do SUV");
        suv.turnOn();
        suv.displayInfo();
        suv.openDoor();
        suv.activateTraction();
        suv.changeGear();

        System.out.println("\nteste do carro eletrico");
        sedanEletrico.turnOn();
        sedanEletrico.displayInfo();
        sedanEletrico.chargeBatery();
        sedanEletrico.chargeBatery(90);
        sedanEletrico.changeGear();
        sedanEletrico.checkAutonomy();

        System.out.println("\ncom sobreposição");
        carro.displayInfo();
        caminhao.displayInfo();
        suv.displayInfo();
        sedanEletrico.displayInfo();

        System.out.println("\ncom sobrecarga");
        // métodos com mesmo nome e parâmetros diferentes

        carro.displayInfo(false); // sobrecarga em veiculo
        carro.openDoor(); // sobrecarga em carro
        carro.openDoor(3); // sobrecarga em carro
        caminhao.chargeBatery(); // sobrecarga em caminhao (interface)
        caminhao.chargeBatery(30); // sobrecarga em caminhao (interface)
    }
}