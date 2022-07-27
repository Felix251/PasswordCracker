

import FactoryMethod.PasswordCracker.BruteForce;
import FactoryMethod.PasswordCracker.Cracker;
import FactoryMethod.PasswordCracker.DictionaryAttack;

import java.util.Dictionary;

public class CrackerFactory {
    public Cracker createAlgorithm(int type) {
        switch (type) {
            case 1:
                return new BruteForce();
            case 2:
                return new DictionaryAttack();
            default:
                return new BruteForce();
        }
    }
}
