package PadroesGoF.FactoryMethod;

public class Programa {

    public static void main(String[] args) {

        EspacoNaveFactory espacoNaveFactory = new EspacoNaveFactory();

        EspacoNave milleniumFalcon = espacoNaveFactory.criarEspacoNave(TipoDeNaveEspacial.MILLENIUM_FALCON);

        System.out.println("O poder de fogo da " + milleniumFalcon.getNome() + " é: " + milleniumFalcon.getPoder_de_fogo());
        System.out.println("A velocidade da " + milleniumFalcon.getNome() + " é: " + milleniumFalcon.getVelocidade());

        EspacoNave enterprise = espacoNaveFactory.criarEspacoNave(TipoDeNaveEspacial.ENTERPRISE);

        System.out.println("\nO poder de fogo da " + enterprise.getNome() + " é: " + enterprise.getPoder_de_fogo());
        System.out.println("A velocidade da " + enterprise.getNome() + " é: " + enterprise.getVelocidade());

    }

}
