import java.util.Scanner; //ler o teclado

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // entrada guardar valor

        //opções de calculo
        System.out.println("Calculadora");
        System.out.println("Escolha a operação desejada");
        System.out.println("1 para somar ");
        System.out.println("2 para subitrair ");
        System.out.println("3 para mutiplicar ");
        System.out.println("4 para dividir");

        // Escolha do usuario
        System.out.print(" Você escolheu: ");
        int opcao = entrada.nextInt();

        // Ler os numeros do usuario
        System.out.print(" Digite o primeiro número: ");
        double n1 = entrada.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double n2 = entrada.nextDouble();

        double resultado; // aqui vai guardar o resultado

        // validação da operaçao
        if (opcao == 1) {
            resultado = n1 + n2;
        } else if (opcao == 2) {
            resultado = n1 - n2;
        } else if (opcao == 3) {
            resultado = n1 * n2;
        } else if (opcao == 4) {
            if (n2 != 0) { // evitar divisão por zero
                resultado = n1 / n2;
            } else {
                System.out.println("Erro valor dividido por 0! ");
                return; // sai
            }
        } else {
            System.out.println("Opção invalida, tente novamente");
            return; // sai
        }

        // mostrar o resultado na tela
        System.out.println("O valor é: " + resultado);
    }
}
