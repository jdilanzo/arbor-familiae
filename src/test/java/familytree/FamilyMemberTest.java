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

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyMemberTest {

    public FamilyMemberTest() {
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
        System.out.println("FamilyMemberTest.testDefaultConstructor");
        FamilyMember instance = new FamilyMember();
        Name name = null;
        Sex sex = null;
        Address address = null;
        String biography = null;
        String familyName = null;
        Person mother = null, father = null, spouse = null;
        Set<Person> children = null;

        assertEquals(name, instance.getName());
        assertEquals(sex, instance.getSex());
        assertEquals(address, instance.getAddress());
        assertEquals(biography, instance.getBiography());
        assertEquals(familyName, instance.getFamilyName());
        assertEquals(mother, instance.getMother());
        assertEquals(father, instance.getFather());
        assertEquals(spouse, instance.getSpouse());
        assertEquals(children, instance.getChildren());
    }

    @Test
    public void testAlternateConstructor() throws Exception {
        System.out.println("FamilyMemberTest.testAlternateConstructor");
        Name name = new Name("", "", "");
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode(""));
        String biography = "";
        String familyName = "";
        Person mother = new Person(name, sex, address, biography), father = new Person(name, sex, address, biography),
                spouse = new Person(name, sex, address, biography);
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(name, sex, address, biography), familyName, mother, father,
                                                 spouse, children);

        assertEquals(name, instance.getName());
        assertEquals(sex, instance.getSex());
        assertEquals(address, instance.getAddress());
        assertEquals(biography, instance.getBiography());
        assertEquals(familyName, instance.getFamilyName());
        assertEquals(mother, instance.getMother());
        assertEquals(father, instance.getFather());
        assertEquals(spouse, instance.getSpouse());
        assertEquals(children, instance.getChildren());
    }

    @Test
    public void testCopyConstructor() throws Exception {
        System.out.println("FamilyMemberTest.testCopyConstructor");
        Name name = new Name("", "", "");
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode(""));
        String biography = "";
        String familyName = "";
        Person mother = new Person(name, sex, address, biography), father = new Person(name, sex, address, biography),
                spouse = new Person(name, sex, address, biography);
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(name, sex, address, biography), familyName, mother, father,
                                                 spouse, children), copy = new FamilyMember(instance);

        assertEquals(instance, copy);
    }

    @Test
    public void testGetFamilyName() {
        System.out.println("FamilyMemberTest.testGetFamilyName");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(familyName, instance.getFamilyName());
    }

    @Test
    public void testSetFamilyName() {
        System.out.println("FamilyMemberTest.testSetFamilyName");
        FamilyMember instance = new FamilyMember();
        String familyName = "";

        instance.setFamilyName(familyName);

        assertEquals(familyName, instance.getFamilyName());
    }

    @Test
    public void testGetMother() {
        System.out.println("FamilyMemberTest.testGetMother");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(mother, instance.getMother());
    }

    @Test
    public void testSetMother() throws Exception {
        System.out.println("FamilyMemberTest.testSetMother");
        FamilyMember instance = new FamilyMember();
        Person mother = new Person(new Name(), Sex.Unspecified, new Address(1, "", "", new PostalCode()), "");

        instance.setMother(mother);

        assertEquals(mother, instance.getMother());
    }

    @Test
    public void testGetFather() {
        System.out.println("FamilyMemberTest.testGetFather");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(father, instance.getFather());
    }

    @Test
    public void testSetFather() throws Exception {
        System.out.println("FamilyMemberTest.testSetFather");
        FamilyMember instance = new FamilyMember();
        Person father = new Person(new Name(), Sex.Unspecified, new Address(1, "", "", new PostalCode()), "");

        instance.setFather(father);

        assertEquals(father, instance.getFather());
    }

    @Test
    public void testGetSpouse() {
        System.out.println("FamilyMemberTest.testGetSpouse");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(spouse, instance.getSpouse());
    }

    @Test
    public void testSetSpouse() throws Exception {
        System.out.println("FamilyMemberTest.testSetSpouse");
        FamilyMember instance = new FamilyMember();
        Person spouse = new Person(new Name(), Sex.Unspecified, new Address(1, "", "", new PostalCode()), "");

        instance.setSpouse(spouse);

        assertEquals(spouse, instance.getSpouse());
    }

    @Test
    public void testGetChildren() {
        System.out.println("FamilyMemberTest.testGetChildren");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(children, instance.getChildren());
    }

    @Test
    public void testGetChildExists() throws Exception {
        System.out.println("FamilyMemberTest.testGetChildExists");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);
        Person child = new Person(new Name(), Sex.Unspecified, new Address(1, "", "", new PostalCode()), "");
        instance.addChild(child);

        assertEquals(child, instance.getChild(new Name()));
    }

    @Test
    public void testGetChildDoesNotExist() throws Exception {
        System.out.println("FamilyMemberTest.testGetChildDoesNotExist");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertNull(instance.getChild(new Name("", "", "")));
    }

    @Test
    public void testAddChildSuccessful() throws Exception {
        System.out.println("FamilyMemberTest.testAddChildSuccessful");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);
        Person child = new Person(new Name(), Sex.Unspecified, new Address(1, "", "", new PostalCode()), "");

        assertTrue(instance.addChild(child));
    }

    @Test
    public void testAddChildUnsuccessful() throws Exception {
        System.out.println("FamilyMemberTest.testAddChildUnsuccessful");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);
        Person child = new Person(new Name(), Sex.Unspecified, new Address(1, "", "", new PostalCode()), "");
        instance.addChild(child);

        assertFalse(instance.addChild(child));
    }

    @Test
    public void testRemoveChildSuccessful() throws Exception {
        System.out.println("FamilyMemberTest.testRemoveChildSuccessful");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);
        Person child = new Person(new Name(), Sex.Unspecified, new Address(1, "", "", new PostalCode()), "");
        instance.addChild(child);

        assertTrue(instance.removeChild(new Name()));
    }

    @Test
    public void testRemoveChildUnsuccessful() throws Exception {
        System.out.println("FamilyMemberTest.testRemoveChildUnsuccessful");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertFalse(instance.removeChild(new Name()));
    }

    @Test
    public void testEqualsReflexive() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsReflexive");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(x, x);
    }

    @Test
    public void testEqualsSymmetricTrue() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsSymmetricTrue");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(x, y);
        assertEquals(y, x);
    }

    @Test
    public void testEqualsSymmetricFalse() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsSymmetricFalse");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), " ", mother, father, spouse, children);

        assertNotEquals(x, y);
        assertNotEquals(y, x);
    }

    @Test
    public void testEqualsTransitiveTrue() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsTransitiveTrue");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), familyName, mother, father, spouse, children), z = new FamilyMember(
                new Person(), familyName, mother, father, spouse, children);

        assertEquals(x, y);
        assertEquals(y, z);
        assertEquals(x, z);
    }

    @Test
    public void testEqualsTransitiveFalse() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsTransitiveFalse");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), " ", mother, father, spouse, children), z = new FamilyMember(
                new Person(), "  ", mother, father, spouse, children);

        assertNotEquals(x, y);
        assertNotEquals(y, z);
        assertNotEquals(x, z);
    }

    @Test
    public void testEqualsConsistentTrue() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsConsistentTrue");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        for (int i = 0; i < 10; i++) {
            assertEquals(x, y);
        }
    }

    @Test
    public void testEqualsConsistentFalse() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsConsistentFalse");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), " ", mother, father, spouse, children);

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x, y);
        }
    }

    @Test
    public void testEqualsNull() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsNull");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertNotEquals(x, null);
    }

    @Test
    public void testEqualsNotObject() throws Exception {
        System.out.println("FamilyMemberTest.testEqualsNotObject");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertNotEquals(x, new Object());
    }

    @Test
    public void testHashCodeReflexive() throws Exception {
        System.out.println("FamilyMemberTest.testHashCodeReflexive");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(x.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricTrue() throws Exception {
        System.out.println("FamilyMemberTest.testHashCodeSymmetricTrue");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeSymmetricFalse() throws Exception {
        System.out.println("FamilyMemberTest.testHashCodeSymmetricFalse");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), " ", mother, father, spouse, children);

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), x.hashCode());
    }

    @Test
    public void testHashCodeTransitiveTrue() throws Exception {
        System.out.println("FamilyMemberTest.testHashCodeTransitiveTrue");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), familyName, mother, father, spouse, children), z = new FamilyMember(
                new Person(), familyName, mother, father, spouse, children);

        assertEquals(x.hashCode(), y.hashCode());
        assertEquals(y.hashCode(), z.hashCode());
        assertEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeTransitiveFalse() throws Exception {
        System.out.println("FamilyMemberTest.testHashCodeTransitiveFalse");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), " ", mother, father, spouse, children), z = new FamilyMember(
                new Person(), "  ", mother, father, spouse, children);

        assertNotEquals(x.hashCode(), y.hashCode());
        assertNotEquals(y.hashCode(), z.hashCode());
        assertNotEquals(x.hashCode(), z.hashCode());
    }

    @Test
    public void testHashCodeConsistentTrue() throws Exception {
        System.out.println("FamilyMemberTest.testHashCodeConsistentTrue");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), familyName, mother, father, spouse, children);

        for (int i = 0; i < 10; i++) {
            assertEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeConsistentFalse() throws Exception {
        System.out.println("FamilyMemberTest.testHashCodeConsistentFalse");
        String familyName = "";
        Person mother = new Person(), father = new Person(), spouse = new Person();
        Set<Person> children = new HashSet<>();
        FamilyMember x = new FamilyMember(new Person(), familyName, mother, father, spouse, children), y =
                new FamilyMember(new Person(), " ", mother, father, spouse, children);

        for (int i = 0; i < 10; i++) {
            assertNotEquals(x.hashCode(), y.hashCode());
        }
    }

    @Test
    public void testHashCodeNull() {
        System.out.println("FamilyMemberTest.testHashCodeNull");
        FamilyMember x = new FamilyMember();

        assertEquals(0, x.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        System.out.println("FamilyMemberTest.testToString");
        Name name = new Name("", "", "");
        Sex sex = Sex.Unspecified;
        Address address = new Address(1, "", "", new PostalCode(""));
        String biography = "";
        String familyName = "";
        Person mother = new Person(name, sex, address, biography), father = new Person(name, sex, address, biography),
                spouse = new Person(name, sex, address, biography);
        Set<Person> children = new HashSet<>();
        FamilyMember instance = new FamilyMember(new Person(name, sex, address, biography), familyName, mother, father,
                                                 spouse, children);
        String toString =
                "FamilyMember{Person{nomini=Name{praenomen=, nomen=, cognomen=}, sors=Unspecified, " +
                "accommodatio=Address{streetNumber=1, streetName=, cityName=, postalCode=PostalCode{characterSet=}}, " +
                "vitaeDescriptio=}, genus=, maternus=Person{nomini=Name{praenomen=, nomen=, cognomen=}, " +
                "sors=Unspecified, accommodatio=Address{streetNumber=1, streetName=, cityName=, " +
                "postalCode=PostalCode{characterSet=}}, vitaeDescriptio=}, paternus=Person{nomini=Name{praenomen=, " +
                "nomen=, cognomen=}, sors=Unspecified, accommodatio=Address{streetNumber=1, streetName=, cityName=, " +
                "postalCode=PostalCode{characterSet=}}, vitaeDescriptio=}, sponsus=Person{nomini=Name{praenomen=, " +
                "nomen=, cognomen=}, sors=Unspecified, accommodatio=Address{streetNumber=1, streetName=, cityName=, " +
                "postalCode=PostalCode{characterSet=}}, vitaeDescriptio=}, natus=[]}";

        assertEquals(toString, instance.toString());
    }

}
