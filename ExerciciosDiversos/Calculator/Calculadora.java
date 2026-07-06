package ExerciciosDiversos.Calculator;

import java.util.Scanner;

/* TODO
1 - Escreva um código que cria uma calculadora para as operações de soma e 
subtração, o usuário deve informar todos os números que serão usados 
na conta de uma só vez utilizando virgulas para separa-los.
*/

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nInsira o valor1 e valor2 separados por virgula (siga este padrao: num1,num2  ; ex: 23,12)\n:");
        String input = sc.next();

        String[] inputValues = input.split(",");

        var num1 = Integer.parseInt(inputValues[0]);
        var num2 = Integer.parseInt(inputValues[1]);

        String op = "";
        int result = 0;

        while (true) {
            try {
                System.out.print("\nInsira o simbolo da operacao desejada (+, -, x ou /)\n:");
                op = sc.next();
                result = calculate(num1, num2, op);
                break;
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        };


        System.out.printf("\n%d%s%d=%d\n",
            num1,
            op,
            num2,
            result
        );

    }

    private static int calculate(int num1, int num2, String op) {
        return switch (op) {
            case "+" -> {
                yield num1 + num2;
            }
            case "-" -> {
                yield num1 - num2;
            }
            case "x" -> {
                yield num1 * num2;
            }
            case "/" -> {
                yield num1 / num2;
            }
            default -> throw new RuntimeException("Operacao invalida");
        };
    }
}
