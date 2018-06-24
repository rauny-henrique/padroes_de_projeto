package PadroesGoF.MVC;

public class Programa {

    public static void main(String[] args) {

        CalculadoraView view = new CalculadoraView();
        CalculadoraModel model = new CalculadoraModel();

        CalculadoraController controller = new CalculadoraController(view, model);

    }

}
