package PadroesGoF.MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraController {

    private CalculadoraView view;
    private CalculadoraModel model;

    public CalculadoraController(CalculadoraView view, CalculadoraModel model) {

        this.view = view;
        this.model = model;

        this.view.addCalculadoraListener(new CalculadoraListener());

    }

    class CalculadoraListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int primeiroNumero;
            int segundoNumero;

            try {

                primeiroNumero = view.getPrimeiroNumero();
                segundoNumero = view.getSegundoNumero();

                model.soma(primeiroNumero, segundoNumero);
                view.setResultado(model.getResultado());

            } catch (Exception error) {
                view.errorDisplay(error.getLocalizedMessage());
            }

        }

    }

}
