package FactoryMethod.PasswordCracker;

import java.io.IOException;

public interface Cracker {

    void hack(String login, String url) throws IOException, InterruptedException;
}
