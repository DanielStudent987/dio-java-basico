import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nome_cliente;
        double saldo;

        Scanner t = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema bancario.\nPor favor Informe o numero da Conta:");
        numero = t.nextInt();
        
        //O USO DO 't.nextLine()' ISOLADO EH DEVIDO UMA EXCEÇÃO QUE FAZ O CÓDIGO IGNORAR A ATRIBUIÇÃO DA VARIAVEL AGENCIA
        System.out.println("Informe o numero da Agencia:");
        t.nextLine();
        agencia = t.nextLine();
        
        System.out.println("Inferme o seu nome completo:");
        nome_cliente = t.nextLine();

        System.out.println("Informe o saldo que voce possui:");
        saldo = t.nextDouble();

        System.out.println("\nOla "+nome_cliente+", obrigado por criar uma conta em nosso banco, sua agencia eh "+agencia+", conta "+numero+" e seu saldo "+saldo+" ja esta disponivel para saque.");


    }
}