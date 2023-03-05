/* 2 -Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a 
soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um 
programa na linguagem que desejar onde, informado um número, ele calcule a sequência de 
Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = sc.nextInt();
        int a = 0, b = 1, c;
        boolean pertence = false;
        while (b <= num) {
            if (b == num) {
                pertence = true;
                break;
            }
            c = a + b;
            a = b;
            b = c;
        }
        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }
    }
}
