import java.util.Scanner;

public class App {
    public static void main(String[] args){
       int a, b, c = 0;
       try (Scanner sc = new Scanner(System.in)) {
        System.out.print("Digite o primeiro número: ");
           a = sc.nextInt();
        System.out.println("");
         System.out.print("Digite o segundo número: ");
           b = sc.nextInt();
           System.out.println("");
    }
       c = a + b;
       System.out.print("O resultado da soma é: " + c);
    }
}
