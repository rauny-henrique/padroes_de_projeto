package PadroesGoF.Facade;

public class ChecarNumeroDaConta {

    private int conta = 123456;

    public int getConta() {
        return conta;
    }

    public boolean checarConta(int conta) {

        if (conta == getConta() ) {
            return true;
        }

        return false;

    }

}
