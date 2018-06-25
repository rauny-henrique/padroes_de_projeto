package PadroesGoF.Facade.Exemplo.Subsistemas;

public class ChecarSaldo {

    private double saldo = 500;

    public double getSaldo() {
        return saldo;
    }

    public void realizarSaque(double valor_do_saque) {
        this.saldo -= valor_do_saque;
    }

    public void realizarDeposito(double valor_do_deposito) {
        this.saldo += valor_do_deposito;
    }

    public boolean tentarRealizarSaque(double valor_do_saque) {

        if (valor_do_saque <= getSaldo()) {

            realizarSaque(valor_do_saque);
            System.out.println("Saldo atual: " + getSaldo());

            return true;

        }

        System.out.println("Você não possui saldo suficiente para essa operação. Saldo atual: " + getSaldo());

        return false;

    }

    public void tentarRealizerDeposito(double valor_do_deposito) {

        realizarDeposito(valor_do_deposito);
        System.out.println("Deposito realizado com sucesso. Saldo atual: " + getSaldo());

    }

}
