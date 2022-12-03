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

import java.io.Serializable;
import java.util.Objects;

/**
 * The {@code Person} class encapsulates data relating to a person.
 * <p>
 * The {@code Person} class stores data relevant to a person. In general, a person has a name, a biological sex, a
 * postal address, and a biography which provides a brief explanation of themselves. It is assumed that a person's name
 * is formed according to the <i>tria nomina</i> structural conventions, with some variation. As such, a name has a
 * <i>praenomen</i> (personal name), a <i>nomen</i> (additional personal name(s)), and a <i>cognomen</i> (family, or
 * gentile, name). It is assumed that a person's biological sex is binary; that is, male or female. It is assumed that a
 * person's address contains a street number, a street name, a city/suburb, and a postal code.
 * <p>
 * The default constructor leaves the fields of the person undefined and nullified. If the parameters {@code name},
 * {@code sex}, {@code address}, and {@code biography} are supplied, then they are assigned to the person's name, sex,
 * address, and biography fields, respectively.
 */
public class Person implements Serializable {

    /**
     * The person's name.
     */
    private Name nomini = null;
    /**
     * The person's biological sex.
     */
    private Sex sors = null;
    /**
     * The person's postal address.
     */
    private Address accommodatio = null;
    /**
     * The person's biographical life description.
     */
    private String vitaeDescriptio = null;

    /**
     * Creates a new {@code Person} object and leaves the fields of the person undefined and nullified.
     */
    public Person() {
    }

    /**
     * Creates a new {@code Person} object and assigns the supplied parameters {@code name}, {@code sex},
     * {@code address}, and {@code biography} to the person's name, sex, address, and biography fields, respectively.
     *
     * @param name      the person's name.
     * @param sex       the person's sex.
     * @param address   the person's postal address.
     * @param biography the person's biographical life description.
     * @see familytree.Name
     * @see familytree.Sex
     * @see familytree.Address
     * @see java.lang.String
     */
    public Person(final Name name, final Sex sex, final Address address, final String biography) {
        this.nomini = new Name(name);
        this.sors = sex;
        this.accommodatio = new Address(address);
        this.vitaeDescriptio = biography;
    }

    /**
     * Creates a new {@code Person} object and assigns the name, sex, address, and biography fields of the supplied
     * parameter {@code obj} to the person's name, sex, address, and biography fields, respectively. The new
     * {@code Person} object is a "deep copy" of the parameter {@code obj}.
     *
     * @param obj the reference {@code Person} object to copy.
     */
    public Person(final Person obj) {
        this.nomini = obj.nomini;
        this.sors = obj.sors;
        this.accommodatio = obj.accommodatio;
        this.vitaeDescriptio = obj.vitaeDescriptio;
    }

    /**
     * Returns the person's name.
     * <p>
     * The {@code getName} method retrieves the person's name according to the <i>tria nomina</i> structural
     * conventions.
     * <p>
     * The return value is a {@code Name} object representing the person's entire name.
     *
     * @return The person's name.
     * @see familytree.Name
     */
    public final Name getName() {
        return nomini;
    }

    /**
     * Sets the person's name.
     * <p>
     * The {@code setName} method assigns the value supplied by the {@code name} parameter to the person's name
     * according to the <i>tria nomina</i> structural conventions.
     *
     * @param name the person's new name.
     * @see familytree.Name
     */
    public final void setName(final Name name) {
        this.nomini = name;
    }

    /**
     * Returns the person's biological sex.
     * <p>
     * The {@code getSex} method retrieves the person's biological sex. It is assumed that a person's biological sex is
     * binary; that is, male or female.
     * <p>
     * The return value is a {@code Sex} enumeration item representing the person's biological sex.
     *
     * @return The person's biological sex.
     * @see familytree.Sex
     */
    public final Sex getSex() {
        return sors;
    }

    /**
     * Sets the person's biological sex.
     * <p>
     * The {@code setSex} method assigns the value supplied by the {@code sex} parameter to the person's biological sex.
     * It is assumed that a person's biological sex is binary; that is, male or female.
     *
     * @param sex the person's new biological sex.
     * @see familytree.Sex
     */
    public final void setSex(final Sex sex) {
        this.sors = sex;
    }

    /**
     * Returns the person's postal address.
     * <p>
     * The {@code getAddress} method retrieves the person's postal address. It is assumed that a person's address
     * contains a street number, a street name, a city/suburb, and a postal code.
     * <p>
     * The return value is an {@code Address} object representing the person's entire postal address.
     *
     * @return The person's postal address.
     * @see familytree.Address
     */
    public final Address getAddress() {
        return accommodatio;
    }

    /**
     * Sets the person's postal address.
     * <p>
     * The {@code setAddress} method assigns the value supplied by the {@code address} parameter to the person's postal
     * address. It is assumed that a person's address contains a street number, a street name, a city/suburb, and a
     * postal code.
     *
     * @param address the person's new postal address.
     * @see familytree.Address
     */
    public final void setAddress(final Address address) {
        this.accommodatio = address;
    }

    /**
     * Returns the person's biography.
     * <p>
     * The {@code getBiography} method retrieves the person's biographical life description.
     * <p>
     * The return value is a {@code String} object representing the person's biographical life description.
     *
     * @return The person's biographical life description.
     * @see java.lang.String
     */
    public final String getBiography() {
        return vitaeDescriptio;
    }

    /**
     * Sets the person's biography.
     * <p>
     * The {@code setBiography} method assigns the value supplied by the {@code biography} parameter to the person's
     * biographical life description.
     *
     * @param biography the person's new biographical life description.
     * @see java.lang.String
     */
    public final void setBiography(final String biography) {
        this.vitaeDescriptio = biography;
    }

    /**
     * Indicates whether some other object is "equal to" this one.
     * <p>
     * The {@code equals} method implements an equivalence relation on non-null object references:
     * <ul>
     * <li>It is reflexive: for any non-null reference value {@code x}, {@code x.equals(x)} should
     * return true.</li>
     * <li>It is symmetric: for any non-null reference values {@code x} and {@code y},
     * {@code x.equals(y)} should return true if and only if {@code y.equals(x)} returns true.</li>
     * <li>It is transitive: for any non-null reference values {@code x}, {@code y}, and {@code z}, if
     * {@code x.equals(y)} returns true and {@code y.equals(z)} returns true, then {@code x.equals(z)}
     * should return true.</li>
     * <li>It is consistent: for any non-null reference values {@code x} and {@code y}, multiple
     * invocations of {@code x.equals(y)} consistently return true or consistently return false,
     * provided no information used in equals comparisons on the objects is modified.</li>
     * <li>For any non-null reference value {@code x}, {@code x.equals(null)} should return
     * false.</li>
     * </ul>
     * <p>
     * The {@code equals} method for the {@code Person} class implements the most discriminating
     * possible equivalence relation on {@code Person} objects; that is, for any non-null reference
     * values {@code x} and {@code y}, this method returns true if and only if {@code x} and {@code y}
     * refer to the same object ({@code x == y} has the value true).
     *
     * @param obj the reference object with which to compare.
     * @return {@code true} if this object is the same as the {@code obj} argument; {@code false} otherwise.
     * @see #hashCode()
     * @see java.util.HashMap
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        final Person other = (Person) obj;
        return Objects.equals(this.nomini, other.nomini) && Objects.equals(this.sors, other.sors) && Objects.equals(
                this.accommodatio, other.accommodatio) && Objects.equals(this.vitaeDescriptio, other.vitaeDescriptio);
    }

    /**
     * Returns a hash code value for the object. This method is supported for the benefit of hash tables such as those
     * provided by java.util.HashMap.
     * <p>
     * The general contract of the {@code hashCode} method is:
     * <ul>
     * <li>Whenever it is invoked on the same object more than once during an execution of a Java
     * application, the {@code hashCode} method must consistently return the same integer, provided no
     * information used in equals comparisons on the object is modified. This integer need not remain
     * consistent from one execution of an application to another execution of the same
     * application.</li>
     * <li>If two objects are equal according to the {@code equals} method, then calling the
     * {@code hashCode} method on each of the two objects must produce the same integer result.</li>
     * <li>It is not required that if two objects are unequal according to the {@code equals} method
     * then calling the {@code hashCode} method on each of the two objects must produce distinct
     * integer results.</li>
     * </ul>
     * <p>
     * As much as is reasonably practical, the {@code hashCode} method defined by the {@code Person}
     * class does return distinct integers for distinct objects.
     *
     * @return A hash code value for this object.
     * @see java.lang.Object#equals(java.lang.Object)
     * @see java.lang.System#identityHashCode(java.lang.Object)
     */
    @Override
    public int hashCode() {
        int hash = 0;

        hash = 16 * hash + Objects.hashCode(this.nomini);
        hash = 16 * hash + Objects.hashCode(this.sors);
        hash = 16 * hash + Objects.hashCode(this.accommodatio);
        hash = 16 * hash + Objects.hashCode(this.vitaeDescriptio);

        return hash;
    }

    /**
     * Returns a string representation of the object. In general, the {@code toString} method returns a string that
     * "textually represents" this object.
     * <p>
     * The {@code toString} method for the {@code Person} class returns a string consisting of the name of the class
     * followed by a list of its member variables and their values encapsulated within curly braces. In other words,
     * this method returns a string equal to the value of:
     * <blockquote><pre>
     * "Person{" + "nomini=" + nomini + ", sors=" + sors + ", accommodatio=" + accommodatio + ", vitaeDescriptio=" + vitaeDescriptio + '}'
     * </pre></blockquote>
     *
     * @return A string representation of the object.
     * @see java.lang.String
     * @see familytree.Name#toString()
     * @see familytree.Address#toString()
     */
    @Override
    public String toString() {
        return "Person{" + "nomini=" + nomini + ", sors=" + sors + ", accommodatio=" + accommodatio +
               ", vitaeDescriptio=" + vitaeDescriptio + '}';
    }

}
