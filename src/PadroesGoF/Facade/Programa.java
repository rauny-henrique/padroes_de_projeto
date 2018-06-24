package PadroesGoF.Facade;

public class Programa {

    public static void main(String[] args) {

        ContaBancariaFacade contaBancariaFacade = new ContaBancariaFacade(123456, 123);

        //Saldo inicial = 500
        contaBancariaFacade.sacar(200);
        contaBancariaFacade.depositar(100);

        contaBancariaFacade.sacar(1000);

    }

}
