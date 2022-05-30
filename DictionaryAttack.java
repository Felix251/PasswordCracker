package FactoryMethod.PasswordCracker;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryAttack implements Cracker  {
    Boolean foundpwd = false;
    int count = 0;
    @Override
    public void hack(String mdp) {
        try {
            FileInputStream file = new FileInputStream("C:/Users/Fallou/Documents/DIC1/java/FactoryMethod/PasswordCracker/file.txt"   );
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                String password = myReader.nextLine();
                count++;
                if(mdp.equals(password)) {
                    System.out.println("mot de passe trouve : " + mdp + "\nnombre de tentative " + count );
                    foundpwd = true;
                }
            }
            if(!foundpwd) {
                System.out.println("Password not found");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    }

