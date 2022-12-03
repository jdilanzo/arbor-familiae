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

public class AddressTest {

    public AddressTest() {
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
        System.out.println("AddressTest.testDefaultConstructor");
        Address instance = new Address();
        Integer streetNumber = null;
        String streetName = null, cityName = null;
        PostalCode postalCode = null;

        assertEquals(streetNumber, instance.getStreetNumber());
        assertEquals(streetName, instance.getStreetName());
        assertEquals(cityName, instance.getCityName());
        assertEquals(postalCode, instance.getPostalCode());
    }

    @Test
    public void testAlternateConstructorValid() throws Exception {
        System.out.println("AddressTest.testAlternateConstructorValid");
        Integer streetNumber = 1;
        String streetName = "", cityName = "";
        PostalCode postalCode = new PostalCode("");
        Address instance = new Address(streetNumber, streetName, cityName, postalCode);

        assertEquals(streetNumber, instance.getStreetNumber());
        assertEquals(streetName, instance.getStreetName());
        assertEquals(cityName, instance.getCityName());
        assertEquals(postalCode, instance.getPostalCode());
    }

    @Test
    public void testAlternateConstructorInvalid() {
        System.out.println("AddressTest.testAlternateConstructorInvalid");
        assertThrows(DataFormatException.class, () -> new Address(0, "", "", new PostalCode("")));
    }

    @Test
    public void testCopyConstructor() throws Exception {
        System.out.println("AddressTest.testACopyConstructor");
        Integer streetNumber = 1;
        String streetName = "", cityName = "";
        PostalCode postalCode = new PostalCode("");
        Address instance = new Address(streetNumber, streetName, cityName, postalCode), copy = new Address(instance);

        assertEquals(instance, copy);
    }

    @Test
    public void testGetStreetNumber() throws Exception {
        System.out.println("AddressTest.testGetStreetNumber");
        Integer streetNumber = 1;
        String streetName = "", cityName = "";
        PostalCode postalCode = new PostalCode("");
        Address instance = new Address(streetNumber, streetName, cityName, postalCode);

        assertEquals(streetNumber, instance.getStreetNumber());
    }

    @Test
    public void testSetStreetNumberValid() throws Exception {
        System.out.println("AddressTest.testSetStreetNumberValid");
        Address instance = new Address();
        Integer streetNumber = 1;

        instance.setStreetNumber(streetNumber);

        assertEquals(streetNumber, instance.getStreetNumber());
    }

    @Test
    public void testSetStreetNumberInvalid() {
        System.out.println("AddressTest.testSetStreetNumberValid");
        Address instance = new Address();
        Integer streetNumber = 0;

        DataFormatException thrown = assertThrows(DataFormatException.class, () -> {
            instance.setStreetNumber(streetNumber);
        });
    }

    @Test
    public void testGetStreetName() throws Exception {
        System.out.println("AddressTest.testGetStreetName");
        Integer streetNumber = 1;
        String streetName = "", cityName = "";
        PostalCode postalCode = new PostalCode("");
        Address instance = new Address(streetNumber, streetName, cityName, postalCode);

        assertEquals(streetName, instance.getStreetName());
    }

    @Test
    public void testSetStreetName() {
        System.out.println("AddressTest.testSetStreetName");
        Address instance = new Address();
        String streetName = "";

        instance.setStreetName(streetName);

        assertEquals(streetName, instance.getStreetName());
    }

    @Test
    public void testGetCityName() throws Exception {
        System.out.println("AddressTest.testGetCityName");
        Integer streetNumber = 1;
        String streetName = "", cityName = "";
        PostalCode postalCode = new PostalCode("");
        Address instance = new Address(streetNumber, streetName, cityName, postalCode);

        assertEquals(cityName, instance.getCityName());
    }

    @Test
    public void testSetCityName() {
        System.out.println("AddressTest.testSetCityName");
        Address instance = new Address();
        String cityName = "";

        instance.setCityName(cityName);

        assertEquals(cityName, instance.getCityName());
    }

    @Test
    public void testGetPostalCode() throws Exception {
        System.out.println("AddressTest.testGetPostalCode");
        Integer streetNumber = 1;
        String streetName = "", cityName = "";
        PostalCode postalCode = new PostalCode("");
        Address instance = new Address(streetNumber, streetName, cityName, postalCode);

        assertEquals(postalCode, instance.getPostalCode());
    }

    @Test
    public void testSetPostalCode() throws Exception {
        System.out.println("AddressTest.testSetPostalCode");
        Address instance = new Address();
        PostalCode postalCode = new PostalCode("");

        instance.setPostalCode(postalCode);

        assertEquals(postalCode, instance.getPostalCode());
    }

    @Test
    public void testEqualsReflexive() throws Exception {
        System.out.println("AddressTest.testEqualsReflexive");
        Address x = new Address(1, "", "", new PostalCode(""));

        assertEquals(x, x);
    }

    @Test
    public void testEqualsSymmetricTrue() throws Exception {
        System.out.println("AddressTest.testEqualsSymmetricTrue");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(1, "", "", new PostalCode(""));

        assertEquals(x, y);
        assertEquals(y, x);
    }

    @Test
    public void testEqualsSymmetricFalse() throws Exception {
        System.out.println("AddressTest.testEqualsSymmetricFalse");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(2, "", "", new PostalCode(""));

        assertNotEquals(x, y);
        assertNotEquals(y, x);
    }

    @Test
    public void testEqualsTransitiveTrue() throws Exception {
        System.out.println("AddressTest.testEqualsTransitiveTrue");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(1, "", "", new PostalCode("")), z =
                new Address(1, "", "", new PostalCode(""));

        assertEquals(x, y);
        assertEquals(y, z);
        assertEquals(x, z);
    }

    @Test
    public void testEqualsTransitiveFalse() throws Exception {
        System.out.println("AddressTest.testEqualsTransitiveFalse");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(2, "", "", new PostalCode("")), z =
                new Address(3, "", "", new PostalCode(""));

        assertNotEquals(x, y);
        assertNotEquals(y, z);
        assertNotEquals(x, z);
    }

    @Test
    public void testEqualsConsistentTrue() throws Exception {
        System.out.println("AddressTest.testEqualsConsistentTrue");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(1, "", "", new PostalCode(""));

        for (int i = 0; i < 10; i++) {
            assertEquals(x, y);
        }
    }

    @Test
    public void testEqualsConsistentFalse() throws Exception {
        System.out.println("AddressTest.testEqualsConsistentFalse");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(2, "", "", new PostalCode(""));

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x, y);
        }
    }

    @Test
    public void testEqualsNull() throws Exception {
        System.out.println("AddressTest.testEqualsNull");
        Address x = new Address(1, "", "", new PostalCode(""));

        assertNotEquals(x, null);
    }

    @Test
    public void testEqualsNotObject() throws Exception {
        System.out.println("AddressTest.testEqualsNotObject");
        Address x = new Address(1, "", "", new PostalCode(""));

        assertNotEquals(x, new Object());
    }

    @Test
    public void testHashCodeReflexive() throws Exception {
        System.out.println("AddressTest.testHashCodeReflexive");
        Address x = new Address(1, "", "", new PostalCode(""));

        assertEquals(x.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricTrue() throws Exception {
        System.out.println("AddressTest.testHashCodeSymmetricTrue");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(1, "", "", new PostalCode(""));

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricFalse() throws Exception {
        System.out.println("AddressTest.testHashCodeSymmetricFalse");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(2, "", "", new PostalCode(""));

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeTransitiveTrue() throws Exception {
        System.out.println("AddressTest.testHashCodeTransitiveTrue");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(1, "", "", new PostalCode("")), z =
                new Address(1, "", "", new PostalCode(""));

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), z.hashCode());
        assertEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeTransitiveFalse() throws Exception {
        System.out.println("AddressTest.testHashCodeTransitiveFalse");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(2, "", "", new PostalCode("")), z =
                new Address(3, "", "", new PostalCode(""));

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), z.hashCode());
        assertNotEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeConsistentTrue() throws Exception {
        System.out.println("AddressTest.testHashCodeConsistentTrue");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(1, "", "", new PostalCode(""));

        for (int i = 0; i < 10; i++) {
            assertEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeConsistentFalse() throws Exception {
        System.out.println("AddressTest.testHashCodeConsistentFalse");
        Address x = new Address(1, "", "", new PostalCode("")), y = new Address(2, "", "", new PostalCode(""));

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeNull() {
        System.out.println("AddressTest.testHashCodeNull");
        Address x = new Address();

        assertEquals(0, x.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("AddressTest.testToString");
        Address instance = new Address(1, "", "", new PostalCode(""));
        String toString = "Address{streetNumber=1, streetName=, cityName=, postalCode=PostalCode{characterSet=}}";

        assertEquals(toString, instance.toString());
    }

}
