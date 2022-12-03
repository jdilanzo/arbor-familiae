/*
 * The MIT License
 *
 * Copyright 2021 Jaiden di Lanzo <jaiden.dilanzo@bigpond.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package familytree;

import java.util.zip.DataFormatException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PostalCodeTest {

    public PostalCodeTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testDefaultConstructor() {
        System.out.println("PostalCodeTest.testDefaultConstructor");
        PostalCode instance = new PostalCode();
        String characterSet = null;

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testAlternateConstructorValidNumerical() throws Exception {
        System.out.println("PostalCodeTest.testAlternateConstructorValidNumerical");
        String characterSet = "0123456789";
        PostalCode instance = new PostalCode(characterSet);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testAlternateConstructorValidAlphabetical() throws Exception {
        System.out.println("PostalCodeTest.testAlternateConstructorValidAlphabetical");
        String characterSet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        PostalCode instance = new PostalCode(characterSet);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testAlternateConstructorValidSymbolic() throws Exception {
        System.out.println("PostalCodeTest.testAlternateConstructorValidSymbolic");
        String characterSet = "0- 0";
        PostalCode instance = new PostalCode(characterSet);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testAlternateConstructorValidMixed() throws Exception {
        System.out.println("PostalCodeTest.testAlternateConstructorValidMixed");
        String characterSet = "0123456789- AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        PostalCode instance = new PostalCode(characterSet);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testAlternateConstructorInvalidNumerical() {
        System.out.println("PostalCodeTest.testAlternateConstructorInvalidNumerical");
        assertThrows(DataFormatException.class, () -> new PostalCode("-10123456789"));
    }

    @Test
    public void testAlternateConstructorInvalidAlphabetical() {
        System.out.println("PostalCodeTest.testAlternateConstructorInvalidAlphabetical");
        assertThrows(DataFormatException.class,
                     () -> new PostalCode("àAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"));
    }

    @Test
    public void testAlternateConstructorInvalidSymbolic() {
        System.out.println("PostalCodeTest.testAlternateConstructorInvalidSymbolic");
        assertThrows(DataFormatException.class, () -> new PostalCode("0!0"));
    }

    @Test
    public void testAlternateConstructorInvalidMixed() {
        System.out.println("PostalCodeTest.testAlternateConstructorInvalidMixed");
        assertThrows(DataFormatException.class,
                     () -> new PostalCode("-10123456789!- àAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"));
    }

    @Test
    public void testCopyConstructor() throws Exception {
        System.out.println("PostalCodeTest.testCopyConstructor");
        String characterSet = "";
        PostalCode instance = new PostalCode(characterSet), copy = new PostalCode(instance);

        assertEquals(instance, copy);
    }

    @Test
    public void testGetCharacterSet() throws Exception {
        System.out.println("PostalCodeTest.testGetCharacterSet");
        String characterSet = "";
        PostalCode instance = new PostalCode(characterSet);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testSetCharacterSetValidNumerical() throws Exception {
        System.out.println("PostalCodeTest.testSetCharacterSetValidNumerical");
        PostalCode instance = new PostalCode();
        String postalCode = "0123456789", characterSet = "0123456789";

        instance.setCharacterSet(postalCode);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testSetCharacterSetValidAlphabetical() throws Exception {
        System.out.println("PostalCodeTest.testSetCharacterSetValidAlphabetical");
        PostalCode instance = new PostalCode();
        String postalCode = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz", characterSet =
                "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";

        instance.setCharacterSet(postalCode);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testSetCharacterSetValidSymbolic() throws Exception {
        System.out.println("PostalCodeTest.testSetCharacterSetValidSymbolic");
        PostalCode instance = new PostalCode();
        String postalCode = "- ", characterSet = "- ";

        instance.setCharacterSet(postalCode);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testSetCharacterSetValidMixed() throws Exception {
        System.out.println("PostalCodeTest.testSetCharacterSetValidMixed");
        PostalCode instance = new PostalCode();
        String postalCode = "0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz- ", characterSet =
                "0123456789AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz- ";

        instance.setCharacterSet(postalCode);

        assertEquals(characterSet, instance.getCharacterSet());
    }

    @Test
    public void testSetCharacterSetInvalidNumerical() {
        System.out.println("PostalCodeTest.testSetCharacterSetInvalidNumerical");
        assertThrows(DataFormatException.class, () -> new PostalCode("-10123456789"));
    }

    @Test
    public void testSetCharacterSetInvalidAlphabetical() {
        System.out.println("PostalCodeTest.testSetCharacterSetInvalidAlphabetical");
        assertThrows(DataFormatException.class,
                     () -> new PostalCode("àAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"));
    }

    @Test
    public void testSetCharacterSetInvalidSymbolic() {
        System.out.println("PostalCodeTest.testSetCharacterSetInvalidSymbolic");
        assertThrows(DataFormatException.class, () -> new PostalCode("0!0"));
    }

    @Test
    public void testSetCharacterSetInvalidMixed() {
        System.out.println("PostalCodeTest.testSetCharacterSetInvalidMixed");
        assertThrows(DataFormatException.class,
                     () -> new PostalCode("-10123456789!- àAaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz"));
    }

    @Test
    public void testEqualsReflexive() throws Exception {
        System.out.println("PostalCodeTest.testEqualsReflexive");
        PostalCode x = new PostalCode("");

        assertEquals(x, x);
    }

    @Test
    public void testEqualsSymmetricTrue() throws Exception {
        System.out.println("PostalCodeTest.testEqualsSymmetricTrue");
        PostalCode x = new PostalCode(""), y = new PostalCode("");

        assertEquals(x, y);
        assertEquals(y, x);
    }

    @Test
    public void testEqualsSymmetricFalse() throws Exception {
        System.out.println("PostalCodeTest.testEqualsSymmetricFalse");
        PostalCode x = new PostalCode(""), y = new PostalCode("0");

        assertNotEquals(x, y);
        assertNotEquals(y, x);
    }

    @Test
    public void testEqualsTransitiveTrue() throws Exception {
        System.out.println("PostalCodeTest.testEqualsTransitiveTrue");
        PostalCode x = new PostalCode(""), y = new PostalCode(""), z = new PostalCode("");

        assertEquals(x, y);
        assertEquals(y, z);
        assertEquals(x, z);
    }

    @Test
    public void testEqualsTransitiveFalse() throws Exception {
        System.out.println("PostalCodeTest.testEqualsTransitiveFalse");
        PostalCode x = new PostalCode(""), y = new PostalCode("0"), z = new PostalCode("A");

        assertNotEquals(x, y);
        assertNotEquals(y, z);
        assertNotEquals(x, z);
    }

    @Test
    public void testEqualsConsistentTrue() throws Exception {
        System.out.println("PostalCodeTest.testEqualsConsistentTrue");
        PostalCode x = new PostalCode(""), y = new PostalCode("");

        for (int i = 0; i < 10; i++) {
            assertEquals(x, y);
        }
    }

    @Test
    public void testEqualsConsistentFalse() throws Exception {
        System.out.println("PostalCodeTest.testEqualsConsistentFalse");
        PostalCode x = new PostalCode(""), y = new PostalCode("0");

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x, y);
        }
    }

    @Test
    public void testEqualsNull() throws Exception {
        System.out.println("PostalCodeTest.testEqualsNull");
        PostalCode x = new PostalCode("");

        assertNotEquals(x, null);
    }

    @Test
    public void testEqualsNotObject() throws Exception {
        System.out.println("PostalCodeTest.testEqualsNotObject");
        PostalCode x = new PostalCode("");

        assertNotEquals(x, new Object());
    }

    @Test
    public void testHashCodeReflexive() throws Exception {
        System.out.println("PostalCodeTest.testHashCodeReflexive");
        PostalCode x = new PostalCode("");

        assertEquals(x.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricTrue() throws Exception {
        System.out.println("PostalCodeTest.testHashCodeSymmetricTrue");
        PostalCode x = new PostalCode(""), y = new PostalCode("");

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricFalse() throws Exception {
        System.out.println("PostalCodeTest.testHashCodeSymmetricFalse");
        PostalCode x = new PostalCode(""), y = new PostalCode("0");

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeTransitiveTrue() throws Exception {
        System.out.println("PostalCodeTest.testHashCodeTransitiveTrue");
        PostalCode x = new PostalCode(""), y = new PostalCode(""), z = new PostalCode("");

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), z.hashCode());
        assertEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeTransitiveFalse() throws Exception {
        System.out.println("PostalCodeTest.testHashCodeTransitiveFalse");
        PostalCode x = new PostalCode(""), y = new PostalCode("0"), z = new PostalCode("A");

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), z.hashCode());
        assertNotEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeConsistentTrue() throws Exception {
        System.out.println("PostalCodeTest.testHashCodeConsistentTrue");
        PostalCode x = new PostalCode(""), y = new PostalCode("");

        for (int i = 0; i < 10; i++) {
            assertEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeConsistentFalse() throws Exception {
        System.out.println("PostalCodeTest.testHashCodeConsistentFalse");
        PostalCode x = new PostalCode(""), y = new PostalCode("0");

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeNull() {
        System.out.println("PostalCodeTest.testHashCodeNull");
        PostalCode x = new PostalCode();

        assertEquals(0, x.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("PostalCodeTest.testToString");
        PostalCode instance = new PostalCode("");
        String toString = "PostalCode{characterSet=}";

        assertEquals(toString, instance.toString());
    }

}
