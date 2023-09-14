package palindromo;

/* Programa que verifica se um inteiro de n dígitos é um palíndromo. Alterar 
    linhas 21, 25, 34 e 35 para o valor de n desejado.

Autor: Fellipe Freire de Oliveira
Baseado em exercício 4.30 de Java - Como Programar, 10ªed. 

*/

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um inteiro de 5 dígitos: "); 
        
        int n = input.nextInt();
        
        int qtd_digitos = 5;
        
        // Verifica se o número tem 5 dígitos
        
        while (n <= 9999 || n > 99999)
        {
            if (n == 0)
            {
                System.out.println("Insira diferente de Zero: ");
                n = input.nextInt(); 
            }
            else
            {
                System.out.println("Erro! Insira valor com 5 dígitos!");
                System.out.print("Digite um inteiro de 5 dígitos: ");
                n = input.nextInt(); 
            }
            
        }
        
        // Fim de alteração
        
        int i = qtd_digitos - 1, palindromo = 0, j = 0; 
        
       // Compara o primeiro com último dígito.
        
        String numero_convertido = Integer.toString(n);
        
        while(i > -1 && j < qtd_digitos)   //leva em consideração que 0 é a posição do primeiro caractere
        {
            
            if (numero_convertido.charAt(i) == numero_convertido.charAt(j))
                palindromo++;

            i--;
            j++;
        }
        
        if (palindromo == qtd_digitos)
        {
            System.out.println("É palíndromo!");
        }
        else
        {
            System.out.println("Não é palíndromo!");
        }
        
    }
}
