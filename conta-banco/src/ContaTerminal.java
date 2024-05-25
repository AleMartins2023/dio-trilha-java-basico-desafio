/*TODO:
* Conhecer e importar a classe Scanner
* Exibir as mensagens para o nosso usuário
* Obter pela scanner os valores dogitados no terminal
* Exibir a mensagem conta criada
*/

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //criando o objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta");
        int numero = scanner.nextInt();

        System.out.println("Digite a agência");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo");
        Double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
    
}

