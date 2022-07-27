
import FactoryMethod.PasswordCracker.Cracker;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class CrackerService {
    public static void main(String[] args) throws IOException, InterruptedException {
        CrackerFactory crackerFactory = new CrackerFactory();
        Scanner sc = new Scanner(System.in);
        String login;
        login = JOptionPane.showInputDialog("Veuillez entrer votre login : ");
        String url ;
        url = "http://localhost:8081/api/users";
        int type =Integer.parseInt(JOptionPane.showInputDialog("Choisir type d'attaque : \n1) Brute Force\n2) Dictionnaire"));
        Cracker cracker = crackerFactory.createAlgorithm(type);
        double start = System.currentTimeMillis();
        cracker.hack(login, url);
        double end = System.currentTimeMillis();
        System.out.println();
        JOptionPane.showMessageDialog(null, "temp :" + (end - start) / 1000 + "s");
    }
}
