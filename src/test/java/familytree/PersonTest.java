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

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    public PersonTest() {
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
        System.out.println("PersonTest.testDefaultConstructor");
        Person instance = new Person();
        Name name = null;
        Sex sex = null;
        Address address = null;
        String biography = null;

        assertEquals(name, instance.getName());
        assertEquals(sex, instance.getSex());
        assertEquals(address, instance.getAddress());
        assertEquals(biography, instance.getBiography());
    }

    @Test
    public void testAlternateConstructor() throws Exception {
        System.out.println("PersonTest.testAlternateConstructor");
        Name name = new Name();
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode());
        String biography = "";
        Person instance = new Person(name, sex, address, biography);

        assertEquals(name, instance.getName());
        assertEquals(sex, instance.getSex());
        assertEquals(address, instance.getAddress());
        assertEquals(biography, instance.getBiography());
    }

    @Test
    public void testCopyConstructor() throws Exception {
        System.out.println("PersonTest.testCopyConstructor");
        Name name = new Name();
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode());
        String biography = "";
        Person instance = new Person(name, sex, address, biography), copy = new Person(instance);

        assertEquals(instance, copy);
    }

    @Test
    public void testGetName() throws Exception {
        System.out.println("PersonTest.testGetName");
        Name name = new Name();
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode());
        String biography = "";
        Person instance = new Person(name, sex, address, biography);

        assertEquals(name, instance.getName());
    }

    @Test
    public void testSetName() {
        System.out.println("PersonTest.testSetName");
        Person instance = new Person();
        Name name = new Name();

        instance.setName(name);

        assertEquals(name, instance.getName());
    }

    @Test
    public void testGetSex() throws Exception {
        System.out.println("PersonTest.testGetSex");
        Name name = new Name();
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode());
        String biography = "";
        Person instance = new Person(name, sex, address, biography);

        assertEquals(sex, instance.getSex());
    }

    @Test
    public void testSetSex() {
        System.out.println("PersonTest.testSetSex");
        Person instance = new Person();
        Sex sex = Sex.Unspecified;

        instance.setSex(sex);

        assertEquals(sex, instance.getSex());
    }

    @Test
    public void testGetAddress() throws Exception {
        System.out.println("PersonTest.testGetAddress");
        Name name = new Name();
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode());
        String biography = "";
        Person instance = new Person(name, sex, address, biography);

        assertEquals(address, instance.getAddress());
    }

    @Test
    public void testSetAddress() throws Exception {
        System.out.println("PersonTest.testSetAddress");
        Person instance = new Person();
        Address address = new Address(1, "", "", new PostalCode());

        instance.setAddress(address);

        assertEquals(address, instance.getAddress());
    }

    @Test
    public void testGetBiography() throws Exception {
        System.out.println("PersonTest.testGetBiography");
        Name name = new Name();
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode());
        String biography = "";
        Person instance = new Person(name, sex, address, biography);

        assertEquals(biography, instance.getBiography());
    }

    @Test
    public void testSetBiography() {
        System.out.println("PersonTest.testSetBiography");
        Person instance = new Person();
        String biography = "";

        instance.setBiography(biography);

        assertEquals(biography, instance.getBiography());
    }

    @Test
    public void testEqualsReflexive() throws Exception {
        System.out.println("PersonTest.testEqualsReflexive");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertEquals(x, x);
    }

    @Test
    public void testEqualsSymmetricTrue() throws Exception {
        System.out.println("PersonTest.testEqualsSymmetricTrue");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertEquals(x, y);
        assertEquals(y, x);
    }

    @Test
    public void testEqualsSymmetricFalse() throws Exception {
        System.out.println("PersonTest.testEqualsSymmetricFalse");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name(" ", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertNotEquals(x, y);
        assertNotEquals(y, x);
    }

    @Test
    public void testEqualsTransitiveTrue() throws Exception {
        System.out.println("PersonTest.testEqualsTransitiveTrue");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                z = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertEquals(x, y);
        assertEquals(y, z);
        assertEquals(x, z);
    }

    @Test
    public void testEqualsTransitiveFalse() throws Exception {
        System.out.println("PersonTest.testEqualsTransitiveFalse");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name(" ", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                z = new Person(new Name(" ", " ", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertNotEquals(x, y);
        assertNotEquals(y, z);
        assertNotEquals(x, z);
    }

    @Test
    public void testEqualsConsistentTrue() throws Exception {
        System.out.println("PersonTest.testEqualsConsistentTrue");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        for (int i = 0; i < 10; i++) {
            assertEquals(x, y);
        }
    }

    @Test
    public void testEqualsConsistentFalse() throws Exception {
        System.out.println("PersonTest.testEqualsConsistentFalse");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name(" ", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x, y);
        }
    }

    @Test
    public void testEqualsNull() throws Exception {
        System.out.println("PersonTest.testEqualsNull");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertNotEquals(x, null);
    }

    @Test
    public void testEqualsNotObject() throws Exception {
        System.out.println("PersonTest.testEqualsNotObject");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertNotEquals(x, new Object());
    }

    @Test
    public void testHashCodeReflexive() throws Exception {
        System.out.println("PersonTest.testHashCodeReflexive");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertEquals(x.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricTrue() throws Exception {
        System.out.println("PersonTest.testHashCodeSymmetricTrue");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricFalse() throws Exception {
        System.out.println("PersonTest.testHashCodeSymmetricFalse");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name(" ", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeTransitiveTrue() throws Exception {
        System.out.println("PersonTest.testHashCodeTransitiveTrue");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                z = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), z.hashCode());
        assertEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeTransitiveFalse() throws Exception {
        System.out.println("PersonTest.testHashCodeTransitiveFalse");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name(" ", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                z = new Person(new Name(" ", " ", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), z.hashCode());
        assertNotEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeConsistentTrue() throws Exception {
        System.out.println("PersonTest.testHashCodeConsistentTrue");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        for (int i = 0; i < 10; i++) {
            assertEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeConsistentFalse() throws Exception {
        System.out.println("PersonTest.testHashCodeConsistentFalse");
        Person x = new Person(new Name("", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), ""),
                y = new Person(new Name(" ", "", ""), Sex.Unspecified, new Address(1, "", "", new PostalCode("")), "");

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeNull() {
        System.out.println("PersonTest.testHashCodeNull");
        Person x = new Person();

        assertEquals(0, x.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("PersonTest.testToString");
        Name name = new Name("", "", "");
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode(""));
        String biography = "";
        Person instance = new Person(name, sex, address, biography);
        String toString = "Person{nomini=Name{praenomen=, nomen=, cognomen=}, sors=Unspecified, " +
                          "accommodatio=Address{streetNumber=1, streetName=, cityName=, " +
                          "postalCode=PostalCode{characterSet=}}, " + "vitaeDescriptio=}";

        assertEquals(toString, instance.toString());
    }

}
