import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        float saldo;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        numero = entrada.nextInt();
        System.out.print("Por favor, digite o código da conta: ");
        agencia = entrada.next();
        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = entrada.next();
        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = entrada.nextFloat();

        System.out.println("=========================================");
        System.out.println("==============PROCESSANDO================");
        System.out.println("=========================================");

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque!");
    }
}
