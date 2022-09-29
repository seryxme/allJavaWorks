package classwork.urlShortenerApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLConverterTest {
    URLConverter converter;

    @BeforeEach
    void setUp() {
        converter = new URLConverter();
    }

    @Test
    void testThatURLCanBeReceivedAndSaved() {
        converter.addURL(0,"https://www.codecademy.com/articles/language/html-css");
        assertEquals(1, converter.dataSize());
    }

//    @Test
//    void testThatSavedURLCanBeRetrieved() {
//        converter.addURL(0, "https://www.codecademy.com/articles/language/html-css");
//
//        assertEquals("https://www.codecademy.com/articles/language/html-css", converter.getURL(0));
//    }

//    @Test
//    void testThatMultipleURLsCanBeSaved() {
//        converter.addURL(0,"https://www.codecademy.com/articles/language/html-css");
//        converter.addURL(1,"https://www.codecademy.com/articles/subject/code-foundations");
//
//        assertEquals(2, converter.dataSize());
//    }
//
//    @Test
//    void testThatMultipleSavedURLsCanBeRetrievedByKey() {
//        converter.addURL(0, "https://www.codecademy.com/articles/language/html-css");
//        converter.addURL(1, "https://www.codecademy.com/articles/subject/code-foundations");
//
//        assertEquals("https://www.codecademy.com/articles/language/html-css", converter.getURL(0));
//        assertEquals("https://www.codecademy.com/articles/subject/code-foundations", converter.getURL(1));
//    }

    @Test
    void testThatShortURLCanBeGenerated() {
        converter.addURL(0, "https://www.codecademy.com/articles/language/html-css");

        assertEquals("https://myurl.me/abc", converter.getShortURL("abc"));
    }

    @Test
    void testThatMultipleShortURLsCanBeGenerated() {
        converter.addURL(0, "https://www.codecademy.com/articles/language/html-css");
        converter.addURL(1, "https://www.codecademy.com/articles/subject/code-foundations");

        assertEquals("https://myurl.me/abc", converter.getShortURL("abc"));
        assertEquals("https://myurl.me/def", converter.getShortURL("def"));

    }

    @Test
    void testThatKeysCanBeConverted() {
        converter.addURL(125, "https://www.codecademy.com/articles/language/html-css");
        converter.addURL(268, "https://www.codecademy.com/articles/subject/code-foundations");
        converter.addURL(36, "https://www.codecademy.com/articles/subject/code-foundations");

        assertEquals("cb", converter.getConvertedKey(125));
        assertEquals("eu", converter.getConvertedKey(268));
        assertEquals("K", converter.getConvertedKey(36));
    }

    @Test
    void testThatConvertedKeysCanBeUsedToGenerateShortLinks() {
        converter.addURL(125, "https://www.codecademy.com/articles/language/html-css");
        converter.addURL(268, "https://www.codecademy.com/articles/subject/code-foundations");
        converter.addURL(36, "https://www.codecademy.com/articles/subject/code-foundations");

        String convertedKey1 = converter.getConvertedKey(125);
        String convertedKey2 = converter.getConvertedKey(268);
        String convertedKey3 = converter.getConvertedKey(36);

        assertEquals("https://myurl.me/cb", converter.getShortURL(convertedKey1));
        assertEquals("https://myurl.me/eu", converter.getShortURL(convertedKey2));
        assertEquals("https://myurl.me/K", converter.getShortURL(convertedKey3));
    }

    @Test
    void testThatKeysCanBeRetrievedFromConvertedKeys() {
        converter.addURL(125, "https://www.codecademy.com/articles/language/html-css");
        converter.addURL(268, "https://www.codecademy.com/articles/subject/code-foundations");
        converter.addURL(36, "https://www.codecademy.com/articles/subject/code-foundations");

        String convertedKey1 = converter.getConvertedKey(125);
        String convertedKey2 = converter.getConvertedKey(268);
        String convertedKey3 = converter.getConvertedKey(36);

        assertEquals(125, converter.getKey(convertedKey1));
        assertEquals(268, converter.getKey(convertedKey2));
        assertEquals(36, converter.getKey(convertedKey3));
    }

    @Test
    void testThatURL_isValid() {

        assertTrue(converter.isValidURL("https://www.codecademy.com/articles/language/html-css"));

        assertTrue(converter.isValidURL("http://www.codecademy.com/articles/language/html-css"));
    }

    @Test
    void testThatURL_isNotValidWithoutHTTP_orHTTPS() {

        assertFalse(converter.isValidURL("www.codecademy.com/articles/language/html-css"));
    }
}