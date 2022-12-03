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
 * The {@code Name} class encapsulates data relating to a person's name.
 * <p>
 * The {@code Name} class stores data relevant to a name, which is intended to be given to a person. The parts of the
 * name are stored according to the <i>tria nomina</i> structural conventions, with some variation. As such, a name has
 * a <i>praenomen</i> (personal name), a <i>nomen</i> (additional personal name(s)), and a <i>cognomen</i> (family, or
 * gentile, name).
 * <p>
 * The default constructor leaves the fields of the name undefined and nullified. If the parameters {@code forename},
 * {@code midname}, and {@code surname} are supplied, then they are assigned to the name's <i>praenomen</i>,
 * <i>nomen</i>, and <i>cognomen</i> fields, respectively.
 */
public class Name implements Serializable {

    /**
     * The forename, or personal name.
     */
    private String praenomen = null;
    /**
     * The middle name(s), or additional personal name(s).
     */
    private String nomen = null;
    /**
     * The surname, or family/gentile name.
     */
    private String cognomen = null;

    /**
     * Creates a new {@code Name} object and leaves the fields of the name undefined and nullified.
     */
    public Name() {
    }

    /**
     * Creates a new {@code Name} object and assigns the supplied parameters {@code forename}, {@code midname}, and
     * {@code surname} to the name's <i>praenomen</i>, <i>nomen</i>, and
     * <i>cognomen</i> fields, respectively.
     *
     * @param forename the forename, or personal name.
     * @param midname  the middle name(s), or additional personal name(s).
     * @param surname  the surname, or family/gentile name.
     * @see java.lang.String
     */
    public Name(final String forename, final String midname, final String surname) {
        this.praenomen = forename;
        this.nomen = midname;
        this.cognomen = surname;
    }

    /**
     * Creates a new {@code Name} object and assigns the <i>praenomen</i>, <i>nomen</i>, and
     * <i>cognomen</i> fields of the supplied parameter {@code obj} to the name's <i>praenomen</i>,
     * <i>nomen</i>, and <i>cognomen</i> fields, respectively. The new {@code Name} object is a "deep
     * copy" of the parameter {@code obj}.
     *
     * @param obj the reference {@code Name} object to copy.
     */
    public Name(final Name obj) {
        this.praenomen = obj.praenomen;
        this.nomen = obj.nomen;
        this.cognomen = obj.cognomen;
    }

    /**
     * Returns the forename, or personal name.
     * <p>
     * The {@code getForename} method retrieves the <i>praenomen</i> part of the name according to the
     * <i>tria nomina</i> structural convention. This is generally the given personal name, or the
     * forename.
     * <p>
     * The return value is a {@code String} object textually representing the <i>praenomen</i>.
     *
     * @return The <i>praenomen</i>; the given personal name, or forename.
     * @see java.lang.String
     */
    public final String getForename() {
        return praenomen;
    }

    /**
     * Sets the forename, or personal name.
     * <p>
     * The {@code setForename} method assigns the value supplied by the {@code forename} parameter to the
     * <i>praenomen</i> part of the name according to the <i>tria nomina</i> structural convention. This is generally
     * the given personal name, or the forename.
     *
     * @param forename the new forename, or personal name.
     * @see java.lang.String
     */
    public final void setForename(final String forename) {
        this.praenomen = forename;
    }

    /**
     * Returns the middle name(s), or additional personal name(s).
     * <p>
     * The {@code getMidname} method retrieves the <i>nomen</i> part of the name according to the
     * <i>tria nomina</i> structural convention. This is generally the additional personal name(s), or
     * the middle name(s).
     * <p>
     * The return value is a {@code String} object textually representing the <i>nomen</i>.
     *
     * @return The <i>nomen</i>; the additional personal name(s), or middle name(s).
     * @see java.lang.String
     */
    public final String getMidname() {
        return nomen;
    }

    /**
     * Sets the middle name(s), or additional personal name(s).
     * <p>
     * The {@code setMidname} method assigns the value supplied by the {@code midname} parameter to the <i>nomen</i>
     * part of the name according to the <i>tria nomina</i> structural convention. This is generally the additional
     * personal name(s), or the middle name(s).
     *
     * @param midname the new additional personal name(s), or middle name(s).
     * @see java.lang.String
     */
    public final void setMidname(final String midname) {
        this.nomen = midname;
    }

    /**
     * Returns the surname, or family/gentile name.
     * <p>
     * The {@code getSurname} method retrieves the <i>cognomen</i> part of the name according to the
     * <i>tria nomina</i> structural convention. This is generally the family, or gentile, name.
     * <p>
     * The return value is a {@code String} object textually representing the <i>cognomen</i>.
     *
     * @return The <i>cognomen</i>; the family, or gentile, name.
     * @see java.lang.String
     */
    public final String getSurname() {
        return cognomen;
    }

    /**
     * Sets the surname, or family/gentile name.
     * <p>
     * The {@code setSurname} method assigns the value supplied by the {@code surname} parameter to the <i>cognomen</i>
     * part of the name according to the <i>tria nomina</i> structural convention. This is generally the family, or
     * gentile, name.
     *
     * @param surname the new family, or gentile, name.
     * @see java.lang.String
     */
    public final void setSurname(final String surname) {
        this.cognomen = surname;
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
     * The {@code equals} method for the {@code Name} class implements the most discriminating
     * possible equivalence relation on {@code Name} objects; that is, for any non-null reference
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

        final Name other = (Name) obj;
        return Objects.equals(this.praenomen, other.praenomen) && Objects.equals(this.nomen, other.nomen) &&
               Objects.equals(this.cognomen, other.cognomen);
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
     * As much as is reasonably practical, the {@code hashCode} method defined by the {@code Name}
     * class does return distinct integers for distinct objects.
     *
     * @return A hash code value for this object.
     * @see java.lang.Object#equals(java.lang.Object)
     * @see java.lang.System#identityHashCode(java.lang.Object)
     */
    @Override
    public int hashCode() {
        int hash = 0;

        hash = 14 * hash + Objects.hashCode(this.praenomen);
        hash = 14 * hash + Objects.hashCode(this.nomen);
        hash = 14 * hash + Objects.hashCode(this.cognomen);

        return hash;
    }

    /**
     * Returns a string representation of the object. In general, the {@code toString} method returns a string that
     * "textually represents" this object.
     * <p>
     * The {@code toString} method for the {@code Name} class returns a string consisting of the name of the class
     * followed by a list of its member variables and their values encapsulated within curly braces. In other words,
     * this method returns a string equal to the value of:
     * <blockquote><pre>
     * "Name{" + "praenomen=" + praenomen + ", nomen=" + nomen + ", cognomen=" + cognomen + '}'
     * </pre></blockquote>
     *
     * @return A string representation of the object.
     * @see java.lang.String
     */
    @Override
    public String toString() {
        return "Name{" + "praenomen=" + praenomen + ", nomen=" + nomen + ", cognomen=" + cognomen + '}';
    }

}
