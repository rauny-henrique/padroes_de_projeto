package PadroesGoF.Facade.Exemplo;

import PadroesGoF.Facade.Exemplo.Subsistemas.ChecarCodigoDeSeguranca;
import PadroesGoF.Facade.Exemplo.Subsistemas.ChecarNumeroDaConta;
import PadroesGoF.Facade.Exemplo.Subsistemas.ChecarSaldo;

public class ContaBancariaFacade {

    private int numeroDaConta;
    private int codigoDeSeguranca;

    //Subsistemas
    private ChecarNumeroDaConta checarNumeroDaConta;
    private ChecarCodigoDeSeguranca checarCodigoDeSeguranca;
    private ChecarSaldo checarSaldo;

    public ContaBancariaFacade(int numeroDaConta, int codigoDeSeguranca) {

        this.numeroDaConta = numeroDaConta;
        this.codigoDeSeguranca = codigoDeSeguranca;

        checarNumeroDaConta = new ChecarNumeroDaConta();
        checarCodigoDeSeguranca = new ChecarCodigoDeSeguranca();
        checarSaldo = new ChecarSaldo();

    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public int getCodigoDeSeguranca() {
        return codigoDeSeguranca;
    }

    public void sacar(double valor) {

        if (checarNumeroDaConta.checarConta(getNumeroDaConta()) && checarCodigoDeSeguranca.checarCodigo(getCodigoDeSeguranca()) &&
                checarSaldo.tentarRealizarSaque(valor)) {

            System.out.println("Operação realizada com sucesso!\n");

        } else {

            System.out.println("Ops, operação falhou :(");

        }

    }

    public void depositar(double valor) {

        if (checarNumeroDaConta.checarConta(getNumeroDaConta()) && checarCodigoDeSeguranca.checarCodigo(getCodigoDeSeguranca())) {

            checarSaldo.tentarRealizerDeposito(valor);
            System.out.println("Operação realizada com sucesso!\n");

        } else {

            System.out.println("Ops, operação falhou :(");

        }

    }

}
