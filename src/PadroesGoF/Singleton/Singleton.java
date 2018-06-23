package PadroesGoF.Singleton;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {

        //Evita criar a instancia no momento da sua declaração
        if (instance == null) {
            System.out.println("Criou uma única instância!");
            instance = new Singleton();
        }

        return instance;
    }

    public void imprimeAlgo() {

        System.out.println("Imprimiu algo...");

    }

    private Singleton() {}

}
