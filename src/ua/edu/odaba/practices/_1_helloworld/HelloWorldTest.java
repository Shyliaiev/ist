package ua.edu.odaba.practices._1_helloworld;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloWorldTest {

    @Test
    public void test() {

        final ByteArrayOutputStream sink = new ByteArrayOutputStream();
        PrintStream controlledOut = new PrintStream(sink);
        PrintStream defaultOut = System.out;

        System.setOut(controlledOut);

        try {
            HelloWorld.main(new String[]{});
            controlledOut.flush();
            final String actual = sink.toString().trim();
            assertEquals("Hello, World!", actual, "Your program must print \"Hello, World!\" but printed \"" + actual + "\" instead.");
        } finally {
            System.setOut(defaultOut);
        }
    }
}
