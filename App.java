import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, n4, n5, n6, n7, n8;
        double b1, b2, b3, b4;   // médias bimestrais
        double s1, s2;           // médias semestrais
        double mf;               // média final

        // Entrada das notas
        System.out.print("Digite a 1ª nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a 2ª nota: ");
        n2 = sc.nextDouble();
        System.out.print("Digite a 3ª nota: ");
        n3 = sc.nextDouble();
        System.out.print("Digite a 4ª nota: ");
        n4 = sc.nextDouble();
        System.out.print("Digite a 5ª nota: ");
        n5 = sc.nextDouble();
        System.out.print("Digite a 6ª nota: ");
        n6 = sc.nextDouble();
        System.out.print("Digite a 7ª nota: ");
        n7 = sc.nextDouble();
        System.out.print("Digite a 8ª nota: ");
        n8 = sc.nextDouble();

        // Cálculo das médias bimestrais
        b1 = (n1 + n2) / 2.0;
        b2 = (n3 + n4) / 2.0;
        b3 = (n5 + n6) / 2.0;
        b4 = (n7 + n8) / 2.0;

        // Cálculo das médias semestrais
        s1 = (b1 + b2) / 2.0;
        s2 = (b3 + b4) / 2.0;

        // Cálculo da média final
        mf = (s1 + s2) / 2.0;

        // Saída
        System.out.println("\n==== RESULTADOS ====");
        System.out.printf("Média 1º Bimestre: %.2f%n", b1);
        System.out.printf("Média 2º Bimestre: %.2f%n", b2);
         System.out.printf("Média 1º Semestre: %.2f%n", s1);
        System.out.printf("Média 3º Bimestre: %.2f%n", b3);
        System.out.printf("Média 4º Bimestre: %.2f%n", b4);
        System.out.printf("Média 2º Semestre: %.2f%n", s2);
        System.out.printf("Média Final: %.2f%n", mf);

        sc.close();
    }
}