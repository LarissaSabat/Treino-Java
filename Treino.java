import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Fulano Silva";
        String tipoConta = "Corrente";
        double saldo = 3582.20;
        int opcao =0;

        System.out.println("*****************************\n");
        System.out.println("Nome do cliente: "+nome);
        System.out.println("Tipo de conta: "+tipoConta);
        System.out.println("Saldo Atual: "+saldo);
        System.out.println("\n*****************************\n");

        String menu = """
                ** Digite sua opção **
                1 - Consultar Saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao ==1){
                System.out.println( "O Saldo atualizado é de:" + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Transferencia realizada com sucesso!\n Novo saldo:" + saldo);
                }
            } else if (opcao ==3) {
                System.out.println("Valor recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo em conta:" + saldo);
            } else if (opcao !=4) {
                System.out.println("Opção invalida");
            }


        }
    }
}
