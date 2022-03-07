package ua.edu.odaba.practices._22_validations_odaba_email;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static ua.edu.odaba.practices._22_validations_odaba_email.OdabaEmailValidation.validateOdabaEmail;

class OdabaEmailValidationTest {

    @ParameterizedTest(name = "{index} \"{0}\" is not a valid ODABA email")
    @NullAndEmptySource
    @ValueSource(strings = {
            " ",
            "william@odaba.edu.ua",
            "william.shakespeare@odaba.edu.ua",
            "william...shakespeare@odaba.edu.ua",
            "william-shakespeare@odaba.edu.ua",
            "shakespeare123@odaba.edu.ua",
            "william_$hakespeare@odaba.edu.ua",
            "william_shakespeare@odaba.org",
            "_shakespeare@odaba.edu.ua",
            "shakespeare_@odaba.edu.ua",
            "william.shakespeare@odaba@com",
            "william.shakespeare@odabaorgua",
    })
    void validateOdabaEmailInvalidCases(String input) {
        assertFalse(validateOdabaEmail(input));
    }

    @ParameterizedTest(name = "{index} \"{0}\" is not a valid ODABA email")
    @ValueSource(strings = {
            "william_shakespeare@odaba.edu.ua",
            "lu_e@odaba.edu.ua",
            "william_shakespeare1@odaba.edu.ua",
            "william_shakespeare2@odaba.edu.ua"
    })
    void validateOdabaEmailValidCases(String input) {
        assertTrue(validateOdabaEmail(input));
    }
}