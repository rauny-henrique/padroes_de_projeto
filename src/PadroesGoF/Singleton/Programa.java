package PadroesGoF.Singleton;

public class Programa {

    public static void main(String[] args) {

        Singleton singletonInstance = null;

        for (int i = 0; i < 100; i++) {
            singletonInstance = Singleton.getInstance();
        }

        singletonInstance.imprimeAlgo();

    }

}
