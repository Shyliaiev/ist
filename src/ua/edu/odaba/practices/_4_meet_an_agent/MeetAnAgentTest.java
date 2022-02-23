package ua.edu.odaba.practices._4_meet_an_agent;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetAnAgentTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void test(int input, String expected) {

        String inputText = Integer.toString(input);

        final ByteArrayInputStream controlledIn = new ByteArrayInputStream(inputText.getBytes(StandardCharsets.UTF_8));
        InputStream defaultIn = System.in;

        final ByteArrayOutputStream sink = new ByteArrayOutputStream();
        PrintStream controlledOut = new PrintStream(sink);
        PrintStream defaultOut = System.out;

        try {
            System.setIn(controlledIn);
            System.setOut(controlledOut);

            MeetAnAgent.main(new String[]{});

            controlledOut.flush();
            assertEquals(expected, sink.toString().trim(), "Error on input value: " + input);
        } finally {
            System.setIn(defaultIn);
            System.setOut(defaultOut);
        }
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(133976, "Hello, Agent"),
                Arguments.of(133000 + 976, "Hello, Agent"),
                Arguments.of(86229, "Access denied"),
                Arguments.of(23 + 3434, "Access denied"),
                Arguments.of(89999, "Access denied"),
                Arguments.of(86460, "Access denied"),
                Arguments.of(1, "Access denied"),
                Arguments.of(10, "Access denied"),
                Arguments.of(11, "Access denied"),
                Arguments.of(70, "Access denied"),
                Arguments.of(71, "Access denied"),
                Arguments.of(3601, "Access denied")
        );
    }

}
