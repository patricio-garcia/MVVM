package cl.desafiolatam.mvvm.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratorTest {

    public Generator generator;

    @Before
    public void setUp() throws Exception {
        generator = new Generator();
    }

    @Test
    public void passwordGenerator() {
        String password = generator.passwordGenerator();
        assertEquals(password.length(), 10);
        System.out.println(password);
    }


}