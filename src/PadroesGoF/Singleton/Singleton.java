package PadroesGoF.Singleton;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {

        //Evita criar a instancia no momento da sua declaração
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    private Singleton() {}

}
