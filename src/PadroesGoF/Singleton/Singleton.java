package PadroesGoF.Singleton;

public class Singleton {

    private static Singleton instance;

    public static synchronized Singleton getInstance() {

        //Evita problemas com multiThereds
        synchronized (Singleton.class) {

            //Evita criar a instancia no momento da sua declaração
            if (instance == null) {
                instance = new Singleton();
                System.out.println("Criou uma única instância!");
            }

        }

        return instance;
    }

    public void imprimeAlgo() {

        System.out.println("Imprimiu algo...");

    }

    private Singleton() {}

}
