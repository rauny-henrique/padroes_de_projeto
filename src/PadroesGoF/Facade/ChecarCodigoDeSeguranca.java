package PadroesGoF.Facade;

public class ChecarCodigoDeSeguranca {

    private int codigo = 123;

    public int getCodigo() {
        return codigo;
    }

    public boolean checarCodigo(int codigo) {

        if (codigo == getCodigo()) {
            return true;
        }

        return false;

    }

}
