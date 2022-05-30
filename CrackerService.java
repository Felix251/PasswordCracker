package FactoryMethod.PasswordCracker;

import java.util.Scanner;

public class CrackerService {
    public static void main(String[] args) {
        CrackerFactory crackerFactory = new CrackerFactory();
        Scanner sc = new Scanner(System.in);
        String mdp;
        System.out.print("veuillez entrer votre mot de passe : ");
        mdp = sc.nextLine();
        System.out.println(mdp);
        System.out.println("Choisir type d'attaque : ");
        System.out.println("1) Brute Force");
        System.out.println("2) Dictionnaire");
        int type = sc.nextInt();
        Cracker cracker = crackerFactory.createAlgorithm(type);
        double start = System.currentTimeMillis();
        cracker.hack(mdp);
        double end = System.currentTimeMillis();
        System.out.println("temp :" + (end - start) / 1000 + "s");
    }
}
