package classwork.regexPractice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class regexSampleTest {

    @Test
    void testForValidPhoneNumber() {
        String phoneNumber = "+234-8123456789";
        assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithMoreDigitsIsNotValid() {
        String phoneNumber = "+234-812345678390";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithLessDigitsIsNotValid() {
        String phoneNumber = "+234-812345679";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithDifferentCountryPrefixIsNotValid() {
        String phoneNumber = "+233-8123456789";
        assertFalse(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberIsValidWithZeroAfterTheDash() {
        String phoneNumber = "+234-08123456789";
        assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testPhoneNumberWithoutPrefixStaringWithZeroIsValid() {
        String phoneNumber = "08123456789";
        assertTrue(RegexSample.isValidPhoneNumber(phoneNumber));
    }

    @Test
    void testEmailIsValid() {
        String email = "straightlace@yahoo.com";
        assertTrue(RegexSample.isValidEmail(email));

        String email2 = "str8tlace@yahoo.com";
        assertTrue(RegexSample.isValidEmail(email));
    }

    @Test
    void testEmailIsNotValidWithoutExtension() {
        String email = "straightlace@yahoo";
        assertFalse(RegexSample.isValidEmail(email));
    }

    @Test
    void testEmailIsNotValidWithoutAt() {
        String email = "straightlacyahoo.com";
        assertFalse(RegexSample.isValidEmail(email));
    }

    @Test
    void testEmailIsValidWithNumberInUsername() {
        String email = "straight2lace@yahoo.com";
        assertTrue(RegexSample.isValidEmail(email));
    }

    @Test
    void testEmailIsValidWithDotInUsername() {
        String email = "straight.lace@yahoo.com";
        assertTrue(RegexSample.isValidEmail(email));
    }

    @Test
    void testEmailIsNotValidWithDotAtTheEnd() {
        String email = "straight.@yahoo.com";
        assertFalse(RegexSample.isValidEmail(email));
    }

    @Test
    void testThatPasswordIsValid() {
        String password = "$Hafspec2";
        assertTrue(RegexSample.isValidPassword(password));
    }
}