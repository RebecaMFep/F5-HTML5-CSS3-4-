package dev.rebecamfep;

import dev.rebecamfep.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person rebeca = new Person("Rebeca","Martinez","75958073k",1980);

        rebeca.render();
    }
}
