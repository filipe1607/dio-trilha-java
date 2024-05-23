import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /*
        TODO: Conhecer e importar a classe Scanner
              Exibir as mensagens para o nosso usuário
              Obter pela classe Scanner os valores digitados no terminal
        */
        int numeroConta;
        String agenciaConta;
        String nomeCliente;
        float saldoConta;
        int bancoVar;
        String[] banco = {"Santander", "Itau", "Banco do Brasil", "Caixa", "Bradesco"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo, por favor escolha o Banco.");
        System.out.println("Os bancos disponíveis são: Santander, Itaú, BB, Caixa e Bradesco");
        do {
            System.out.println("Por Favor digite o número do banco:");
            System.out.println("Santander: 1, Itaú: 2, BB: 3, Caixa: 4 e Bradesco: 5");
            System.out.print("Numero: ");
            bancoVar = sc.nextInt();

            if (bancoVar >= 1 && bancoVar <= 5) {
                System.out.println("Banco Selecionado: " + banco[bancoVar - 1]);
                break;
            } else {
                System.out.println("Erro ao selecionar banco, opção inválida");
                System.out.println();
            }
        } while (true);

        System.out.println("Insira o nome do cliente: ");
        nomeCliente = sc.next();
        System.out.println("Insira o número da sua conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Insira a sua agência: ");
        agenciaConta = sc.next();
        System.out.println("Insira o seu saldo: ");
        saldoConta = sc.nextFloat();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta no banco " + banco[bancoVar - 1] + ", sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldoConta + " já está disponível para saque");
    }
}
