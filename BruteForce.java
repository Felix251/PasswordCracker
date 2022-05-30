package FactoryMethod.PasswordCracker;

import javax.swing.*;
import java.util.Arrays;

public class BruteForce implements Cracker{
  /*  char[] charaters = "abcdefghijklmnopqrstuvwxyz".toCharArray();


    public String BruteForcermdp(int position, String mdp,char[] tentative){
        System.out.println("lenght = " + mdp.length());
        System.out.println("position  = " + position);
       if (position != (mdp.length())){
           for (int i =0; i<26; i++){
               tentative[position] =  charaters[i];
               return charaters[i] + BruteForcermdp(position + 1, mdp, tentative);

           }
       }
       else if (position == (mdp.length())){
           for (int i =0; i<26; i++){
               System.out.println(charaters[i]);

           }
       }


        return mdp;
    }
    @Override
    public String hack(String mdp ) {
        char[] tentative = new char[mdp.length()];
        Arrays.fill(tentative, 'a');
        System.out.println(tentative);
        String result;
        int position = 0;
        //System.out.println(mdp);
        result = BruteForcermdp(position, mdp, tentative);
       // System.out.println(tentative);
        return String.valueOf(result);
    }*/




    @Override
    public void hack(String mdp ) {
        char[] charset = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String tentative = new String();

        outerloop: for (int i = 0; i < charset.length; i++) {
            for (int j = 0; j < charset.length; j++) {
                for (int j2 = 0; j2 < charset.length; j2++) {
                    for (int k = 0; k < charset.length; k++) {
                        for (int k2 = 0; k2 < charset.length; k2++) {
                            tentative = "" + charset[i] + charset[j] + charset[j2] + charset[k] + charset[k2];

                            System.out.println(tentative);
                            if (tentative.equals(mdp)) {
                                System.out.println();
                                JOptionPane.showMessageDialog(null, "mot de passe trouvé : " + tentative);
                                break outerloop;
                            } else {
                                tentative = "";
                            }

                        }
                    }
                }
            }
        }
    }
}
