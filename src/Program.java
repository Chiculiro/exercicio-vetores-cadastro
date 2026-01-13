import entities.Cadastro;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nmenores;
        double alturaTotal, alturaMedia, percentualMenores;

        System.out.println("Quantas pessoas serão cadastradas?");
        n = sc.nextInt();

        Cadastro[] vect = new Cadastro[n];


        for(int i=0; i<n; i++){
            sc.nextLine();
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite a idade: ");
            double idade = sc.nextDouble();
            System.out.println("Digite a altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Cadastro(nome, idade, altura);
        }

        nmenores = 0;
        alturaTotal = 0;

        for (int i=0; i<n; i++){
            if (vect[i].getIdade() < 16){
                nmenores++;
            }
            alturaTotal += vect[i].getAltura();
        }

        alturaMedia = alturaTotal / n;
        percentualMenores = ((double)nmenores / n) * 100.0;


        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i=0; i<n; i++){
            if (vect[i].getIdade()<16){
                System.out.println(vect[i].getNome());
            }
        }

        sc.close();
    }
}
