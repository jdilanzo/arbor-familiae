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

public class NameTest {

    public NameTest() {
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
        System.out.println("NameTest.testDefaultConstructor");
        Name instance = new Name();
        String praenomen = null, nomen = null, cognomen = null;

        assertEquals(praenomen, instance.getForename());
        assertEquals(nomen, instance.getMidname());
        assertEquals(cognomen, instance.getSurname());
    }

    @Test
    public void testAlternateConstructor() {
        System.out.println("NameTest.testAlternateConstructor");
        String praenomen = "", nomen = "", cognomen = "";
        Name instance = new Name(praenomen, nomen, cognomen);

        assertEquals(praenomen, instance.getForename());
        assertEquals(nomen, instance.getMidname());
        assertEquals(cognomen, instance.getSurname());
    }

    @Test
    public void testCopyConstructor() {
        System.out.println("NameTest.testCopyConstructor");
        String praenomen = "", nomen = "", cognomen = "";
        Name instance = new Name(praenomen, nomen, cognomen), copy = new Name(instance);

        assertEquals(instance, copy);
    }

    @Test
    public void testGetForename() {
        System.out.println("NameTest.testGetForename");
        String praenomen = "", nomen = "", cognomen = "";
        Name instance = new Name(praenomen, nomen, cognomen);

        assertEquals(praenomen, instance.getForename());
    }

    @Test
    public void testSetForename() {
        System.out.println("NameTest.testSetForename");
        Name instance = new Name();
        String forename = "", praenomen = "";

        instance.setForename(forename);

        assertEquals(praenomen, instance.getForename());
    }

    @Test
    public void testGetMidname() {
        System.out.println("NameTest.testGetMidname");
        String praenomen = "", nomen = "", cognomen = "";
        Name instance = new Name(praenomen, nomen, cognomen);

        assertEquals(nomen, instance.getMidname());
    }

    @Test
    public void testSetMidname() {
        System.out.println("NameTest.testSetMidname");
        Name instance = new Name();
        String midname = "", nomen = "";

        instance.setMidname(midname);

        assertEquals(nomen, instance.getMidname());
    }

    @Test
    public void testGetSurname() {
        System.out.println("NameTest.testGetSurname");
        String praenomen = "", nomen = "", cognomen = "";
        Name instance = new Name(praenomen, nomen, cognomen);

        assertEquals(cognomen, instance.getSurname());
    }

    @Test
    public void testSetSurname() {
        System.out.println("NameTest.testSetSurname");
        Name instance = new Name();
        String surname = "", cognomen = "";

        instance.setSurname(surname);

        assertEquals(cognomen, instance.getSurname());
    }

    @Test
    public void testEqualsReflexive() {
        System.out.println("NameTest.testEqualsReflexive");
        Name x = new Name("", "", "");

        assertEquals(x, x);
    }

    @Test
    public void testEqualsSymmetricTrue() {
        System.out.println("NameTest.testEqualsSymmetricTrue");
        Name x = new Name("", "", ""), y = new Name("", "", "");

        assertEquals(x, y);
        assertEquals(y, x);
    }

    @Test
    public void testEqualsSymmetricFalse() {
        System.out.println("NameTest.testEqualsSymmetricFalse");
        Name x = new Name("", "", ""), y = new Name(" ", " ", " ");

        assertNotEquals(x, y);
        assertNotEquals(y, x);
    }

    @Test
    public void testEqualsTransitiveTrue() {
        System.out.println("NameTest.testEqualsTransitiveTrue");
        Name x = new Name("", "", ""), y = new Name("", "", ""), z = new Name("", "", "");

        assertEquals(x, y);
        assertEquals(y, z);
        assertEquals(x, z);
    }

    @Test
    public void testEqualsTransitiveFalse() {
        System.out.println("NameTest.testEqualsTransitiveFalse");
        Name x = new Name("", "", ""), y = new Name(" ", " ", " "), z = new Name("  ", "  ", "  ");

        assertNotEquals(x, y);
        assertNotEquals(y, z);
        assertNotEquals(x, z);
    }

    @Test
    public void testEqualsConsistentTrue() {
        System.out.println("NameTest.testEqualsConsistentTrue");
        Name x = new Name("", "", ""), y = new Name("", "", "");

        for (int i = 0; i < 10; i++) {
            assertEquals(x, y);
        }
    }

    @Test
    public void testEqualsConsistentFalse() {
        System.out.println("NameTest.testEqualsConsistentFalse");
        Name x = new Name("", "", ""), y = new Name(" ", " ", " ");

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x, y);
        }
    }

    @Test
    public void testEqualsNull() {
        System.out.println("NameTest.testEqualsNull");
        Name x = new Name("", "", "");

        assertNotEquals(x, null);
    }

    @Test
    public void testEqualsNotObject() {
        System.out.println("NameTest.testEqualsNotObject");
        Name x = new Name("", "", "");

        assertNotEquals(x, new Object());
    }

    @Test
    public void testHashCodeReflexive() {
        System.out.println("NameTest.testHashCodeReflexive");
        Name x = new Name("", "", "");

        assertEquals(x.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricTrue() {
        System.out.println("NameTest.testHashCodeSymmetricTrue");
        Name x = new Name("", "", ""), y = new Name("", "", "");

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricFalse() {
        System.out.println("NameTest.testHashCodeSymmetricFalse");
        Name x = new Name("", "", ""), y = new Name(" ", " ", " ");

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeTransitiveTrue() {
        System.out.println("NameTest.testHashCodeTransitiveTrue");
        Name x = new Name("", "", ""), y = new Name("", "", ""), z = new Name("", "", "");

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), z.hashCode());
        assertEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeTransitiveFalse() {
        System.out.println("NameTest.testHashCodeTransitiveFalse");
        Name x = new Name("", "", ""), y = new Name(" ", " ", " "), z = new Name("  ", "  ", "  ");

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), z.hashCode());
        assertNotEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeConsistentTrue() {
        System.out.println("NameTest.testHashCodeConsistentTrue");
        Name x = new Name("", "", ""), y = new Name("", "", "");

        for (int i = 0; i < 10; i++) {
            assertEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeConsistentFalse() {
        System.out.println("NameTest.testHashCodeConsistentFalse");
        Name x = new Name("", "", ""), y = new Name(" ", " ", " ");

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeNull() {
        System.out.println("NameTest.testHashCodeNull");
        Name x = new Name();

        assertEquals(0, x.hashCode());
    }

    @Test
    public void testToString() {
        System.out.println("NameTest.testToString");
        Name instance = new Name("", "", "");
        String toString = "Name{praenomen=, nomen=, cognomen=}";

        assertEquals(toString, instance.toString());
    }

}
