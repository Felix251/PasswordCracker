package FactoryMethod.PasswordCracker;

import javax.swing.*;
import java.util.Scanner;

public class CrackerService {
    public static void main(String[] args) {
        CrackerFactory crackerFactory = new CrackerFactory();
        Scanner sc = new Scanner(System.in);
        String mdp;
        mdp = JOptionPane.showInputDialog("Veuillez entrer votre mot de passe : ");
        int type =Integer.parseInt(JOptionPane.showInputDialog("Choisir type d'attaque : \n1) Brute Force\n2) Dictionnaire"));
        Cracker cracker = crackerFactory.createAlgorithm(type);
        double start = System.currentTimeMillis();
        cracker.hack(mdp);
        double end = System.currentTimeMillis();
        System.out.println();
        JOptionPane.showMessageDialog(null, "temp :" + (end - start) / 1000 + "s");
    }
}
