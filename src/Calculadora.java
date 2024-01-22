import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var continuar = false;
        do {
            var invalido = false;
            var primeiroValor = 0.0;
            do {
                try {
                    System.out.print("Informe um valor: ");
                    String valorLido = sc.nextLine();
                    primeiroValor = Double.parseDouble(valorLido);
                    invalido = false;
                } catch (NumberFormatException ex) {
                    System.out.println("ATENÇÃO> Valor informado é inválido!");
                    invalido = true;
                }
            } while (invalido);

            var segundoValor = 0.0;
            do {
                try {
                    System.out.print("Informe outro valor: ");
                    String valorLido = sc.nextLine();
                    segundoValor = Double.parseDouble(valorLido);
                    invalido = false;
                } catch (NumberFormatException ex) {
                    System.out.println("ATENÇÃO> Valor informado é inválido!");
                    invalido = true;
                }
            } while (invalido);

            var resultado = 0.0;
            do {
                System.out.println("Informe uma operação: ");
                System.out.println("[+] Somar");
                System.out.println("[-] Subtrair");
                System.out.println("[*] Multiplicar");
                System.out.println("[/] Dividir");
                var operacao = sc.nextLine();

                switch (operacao) {
                    case "+":
                        resultado = primeiroValor + segundoValor;
                        System.out.println("O resultado da soma é: " + resultado);
                        break;
                    case "-":
                        resultado = primeiroValor - segundoValor;
                        System.out.println("O resultado da subtração é: " + resultado);
                        break;
                    case "*":
                        resultado = primeiroValor * segundoValor;
                        System.out.println("O resultado da multiplicação é " + resultado);
                        break;
                    case "/":
                        resultado = primeiroValor / segundoValor;
                        System.out.println("O resultado da divisão é: " + resultado);
                    default:
                        System.out.println("ATENÇÃO> Operação informada é inválida!");
                        invalido = true;
                }
            } while (invalido);

            do {
                System.out.print("Deseja continuar calculando? [(S)im/(N)ão]: ");
                String valorLido = sc.nextLine();
                invalido = !valorLido.equalsIgnoreCase("N") && !valorLido.equalsIgnoreCase("S");
                if (invalido) {
                    System.out.println("ATENÇÃO> Valor informado é inválido!");
                } else {
                    continuar = valorLido.equalsIgnoreCase("S");
                    if (!continuar) {
                        System.out.println("Até logo e obrigado pelos peixes!");
                    }
                }
            } while (invalido);
        } while (continuar);
    }
}