package fr.dampierre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialisation des variables
        int salaire = 400;
        int primes = 250;
        int quota = 10;

        // Récupérer le nombres de ventes
        System.out.print("Combien de ventes avez-vous conclus cette semaine ?");
        Scanner clavier = new Scanner(System.in);
        int nbventes = clavier.nextInt();
        clavier.close();

        // Test prime ou pas ?
        if (nbventes >= quota) {
            salaire = salaire + primes;

        }
        // Affichage
        System.out.println("Votre salaire est de :" + salaire + "€");
    }
}
