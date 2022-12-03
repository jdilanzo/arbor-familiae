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
import java.util.zip.DataFormatException;

/**
 * The {@code PostalCode} class encapsulates data relating to a postal code.
 * <p>
 * The {@code PostalCode} class stores data relevant to a postal code, which is intended to be included in a postal
 * address. The postal code is textually represented as a character set. The character sets used in postal codes are:
 * <ul>
 * <li>The Arabic numerals "0" to "9".</li>
 * <li>Letters of the ISO basic Latin alphabet.</li>
 * <li>Spaces, hyphens.</li>
 * </ul>
 * <p>
 * The default constructor leaves the field of the postal code undefined and nullified. If the
 * parameter {@code postalCode} is supplied, then it is assigned to the postal code's character set
 * field.
 */
public class PostalCode implements Serializable {

    /**
     * The character set representing the postal code.
     */
    private String characterSet = null;

    /**
     * Creates a new {@code PostalCode} object and leaves the field of the postal code undefined and nullified.
     */
    public PostalCode() {
    }

    /**
     * Creates a new {@code PostalCode} object and assigns the supplied parameter {@code postalCode} to the postal
     * code's character set field. The method throws a {@code DataFormatException} if the supplied parameter
     * {@code characterSet} does not represent a valid character set. The character sets used in postal codes are:
     * <ul>
     * <li>The Arabic numerals "0" to "9".</li>
     * <li>Letters of the ISO basic Latin alphabet.</li>
     * <li>Spaces, hyphens.</li>
     * </ul>
     *
     * @param characterSet the postal code.
     * @throws DataFormatException if the postal code does not represent a valid character set.
     * @see java.lang.String
     * @see java.util.zip.DataFormatException
     */
    public PostalCode(final String characterSet) throws DataFormatException {
        if (PostalCode.isValidCharacterSet(characterSet)) {
            this.characterSet = characterSet;
        } else {
            throw new DataFormatException();
        }
    }

    /**
     * Creates a new {@code PostalCode} object and assigns the character set field of the supplied parameter {@code obj}
     * to the postal code's character set field. The new {@code PostalCode} object is a "deep copy" of the parameter
     * {@code obj}.
     *
     * @param obj the reference {@code PostalCode} object to copy.
     */
    public PostalCode(final PostalCode obj) {
        this.characterSet = obj.characterSet;
    }

    private static boolean isValidCharacterSet(final String characterSet) {
        final String REGEX = "^[a-zA-Z0-9]*(-\\s)*[a-zA-Z0-9]*$";

        return characterSet.matches(REGEX);
    }

    /**
     * Returns the postal code.
     * <p>
     * The {@code getCharacterSet} method retrieves the character set which represents the postal code.
     * <p>
     * The return value is a {@code String} object textually representing the postal code.
     *
     * @return The postal code.
     * @see java.lang.String
     */
    public final String getCharacterSet() {
        return characterSet;
    }

    /**
     * Sets the postal code.
     * <p>
     * The {@code setCharacterSet} method assigns the value supplied by the {@code postalCode} parameter to the
     * character set which represents the postal code. The method throws a {@code DataFormatException} if the supplied
     * parameter {@code characterSet} does not represent a valid character set. The character sets used in postal codes
     * are:
     * <ul>
     * <li>The Arabic numerals "0" to "9".</li>
     * <li>Letters of the ISO basic Latin alphabet.</li>
     * <li>Spaces, hyphens.</li>
     * </ul>
     *
     * @param characterSet the new postal code.
     * @throws DataFormatException if the postal code does not represent a valid character set.
     * @see java.lang.String
     * @see java.util.zip.DataFormatException
     */
    public final void setCharacterSet(final String characterSet) throws DataFormatException {
        if (PostalCode.isValidCharacterSet(characterSet)) {
            this.characterSet = characterSet;
        } else {
            throw new DataFormatException();
        }
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
     * The {@code equals} method for the {@code PostalCode} class implements the most discriminating
     * possible equivalence relation on {@code PostalCdoe} objects; that is, for any non-null
     * reference values {@code x} and {@code y}, this method returns true if and only if {@code x} and
     * {@code y} refer to the same object ({@code x == y} has the value true).
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

        final PostalCode other = (PostalCode) obj;
        return Objects.equals(this.characterSet, other.characterSet);
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
     * As much as is reasonably practical, the {@code hashCode} method defined by the
     * {@code PostalCode} class does return distinct integers for distinct objects.
     *
     * @return A hash code value for this object.
     * @see java.lang.Object#equals(java.lang.Object)
     * @see java.lang.System#identityHashCode(java.lang.Object)
     */
    @Override
    public int hashCode() {
        int hash = 0;

        hash = 16 * hash + Objects.hashCode(this.characterSet);

        return hash;
    }

    /**
     * Returns a string representation of the object. In general, the {@code toString} method returns a string that
     * "textually represents" this object.
     * <p>
     * The {@code toString} method for the {@code PostalCode} class returns a string consisting of the name of the class
     * followed by a list of its member variables and their values encapsulated within curly braces. In other words,
     * this method returns a string equal to the value of:
     * <blockquote><pre>
     * "PostalCode{" + "characterSet=" + characterSet + '}'
     * </pre></blockquote>
     *
     * @return A string representation of the object.
     * @see java.lang.String
     */
    @Override
    public String toString() {
        return "PostalCode{" + "characterSet=" + characterSet + '}';
    }

}
