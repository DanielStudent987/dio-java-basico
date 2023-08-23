import java.util.Scanner;

public class principal {

   
    /**
     * @param args
     */
    public static void main(String[] args) {
        String control;
        Scanner t = new Scanner(System.in);
        SmartTV funcao = new SmartTV();
        int number;
        
        funcao.setLigada(true);
        while(true) {
            funcao.menu();
            control = t.nextLine();

            if (control.equalsIgnoreCase("a")) {
                funcao.ligar();
            } else if (control.equalsIgnoreCase("b")) {
                System.out.println("Informe quantos canais aumentar ou decrementar(negativos e positivos):");
                number = t.nextInt();
                funcao.mudarCanal(number);
            } else if (control.equalsIgnoreCase("c")) {
                System.out.println("informe se quer aumentar(1) ou diminuir(0):");
                number = t.nextInt();
                funcao.mudarVolume(number);
            } else {
                System.out.println("Informe um valor válido.");
            }

            if (funcao.isLigada()==false) {
                System.out.println("Finalizando Programa.");
                break;
            } 
        }
    }
}
