package PadroesGoF.Singleton.Exemplo;

public class Programa {

    public static void main(String[] args) {

        Singleton singletonInstance = Singleton.getInstance();
        System.out.println("ID da instância 1 é: " + System.identityHashCode(singletonInstance));

        Singleton newSingletonInstance = Singleton.getInstance();
        System.out.println("ID da instância 2 é: " + System.identityHashCode(newSingletonInstance));

        //Metodo qualquer do Singleton
        singletonInstance.imprimeAlgo();

    }

}
