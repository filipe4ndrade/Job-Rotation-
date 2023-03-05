/* 5 - Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser 
previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse; */

public class InverteString {
    public static void main(String[] args) {
        String original = "exemplo de string";
        String invertida = "";

        for(int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}
