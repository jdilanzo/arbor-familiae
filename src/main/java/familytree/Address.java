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
 * The {@code Address} class encapsulates data relating to a postal address.
 * <p>
 * The {@code Address} class stores data relevant to a postal address. In general, an address contains a street number
 * (which may not be zero or negative), a street name, a city/suburb, and a postal code.
 * <p>
 * The default constructor leaves the fields of the address undefined and nullified. If the parameters
 * {@code streetNumber}, {@code streetName}, {@code cityName}, and {@code postalCode} are supplied, then they are
 * assigned to the address's street number, street name, city/suburb, and postal code fields, respectively.
 */
public class Address implements Serializable {

    /**
     * The street number.
     */
    private Integer streetNumber = null;
    /**
     * The street name.
     */
    private String streetName = null;
    /**
     * The city/suburb name.
     */
    private String cityName = null;
    /**
     * The postal code.
     */
    private PostalCode postalCode = null;

    /**
     * Creates a new {@code Address} object and leaves the fields of the address undefined and nullified.
     */
    public Address() {
    }

    /**
     * Creates a new {@code Address} object and assigns the supplied parameters {@code streetNumber},
     * {@code streetName}, {@code cityName}, and {@code postalCode} to the address's street number, street name,
     * city/suburb, and postal code fields, respectively. The method throws a {@code DataFormatException} if the
     * supplied parameter {@code streetNumber} does not represent a valid street number. The street number may not be
     * zero, and may not be negative.
     *
     * @param streetNumber the street number.
     * @param streetName   the street name.
     * @param cityName     the city/suburb name.
     * @param postalCode   the postal code.
     * @throws DataFormatException if the street number is zero or negative.
     * @see java.lang.Integer
     * @see java.lang.String
     * @see familytree.PostalCode
     * @see java.util.zip.DataFormatException
     */
    public Address(final Integer streetNumber, final String streetName, final String cityName,
                   final PostalCode postalCode) throws DataFormatException {
        if (Address.isValidStreetNumber(streetNumber)) {
            this.streetNumber = streetNumber;
            this.streetName = streetName;
            this.cityName = cityName;
            this.postalCode = new PostalCode(postalCode);
        } else {
            throw new DataFormatException();
        }
    }

    /**
     * Creates a new {@code Address} object and assigns the street number, street name, city/suburb, and postal code
     * fields of the supplied parameter {@code obj} to the address's street number, street name, city/suburb, and postal
     * code fields, respectively. The new {@code Address} object is a "deep copy" of the parameter {@code obj}.
     *
     * @param obj the reference {@code Address} object to copy.
     */
    public Address(final Address obj) {
        this.streetNumber = obj.streetNumber;
        this.streetName = obj.streetName;
        this.cityName = obj.cityName;
        this.postalCode = new PostalCode(obj.postalCode);
    }

    private static boolean isValidStreetNumber(final Integer streetNumber) {
        return streetNumber > 0;
    }

    /**
     * Returns the street number.
     * <p>
     * The {@code getStreetNumber} method retrieves the integer representing the street number part of the address.
     * <p>
     * The return value is an {@code Integer} object numerically representing the street number part of the address.
     *
     * @return The street number.
     * @see java.lang.Integer
     */
    public final Integer getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the street number.
     * <p>
     * The {@code setStreetNumber} method assigns the value supplied by the {@code streetNumber} parameter to the
     * integer representing the street number part of the address. The method throws a {@code DataFormatException} if
     * the supplied parameter {@code streetNumber} does not represent a valid street number. The street number may not
     * be zero, and may not be negative.
     *
     * @param streetNumber the new street number.
     * @throws DataFormatException if the street number is zero or negative.
     * @see java.lang.Integer
     * @see java.util.zip.DataFormatException
     */
    public final void setStreetNumber(final Integer streetNumber) throws DataFormatException {
        if (Address.isValidStreetNumber(streetNumber)) {
            this.streetNumber = streetNumber;
        } else {
            throw new DataFormatException();
        }
    }

    /**
     * Returns the street name.
     * <p>
     * The {@code getStreetName} method retrieves the textual string representing the street name part of the address.
     * <p>
     * The return value is a {@code String} object textually representing the street name part of the address.
     *
     * @return The street name.
     * @see java.lang.String
     */
    public final String getStreetName() {
        return streetName;
    }

    /**
     * Sets the street name.
     * <p>
     * The {@code setStreetName} method assigns the value supplied by the {@code streetName} parameter to the textual
     * string representing the street name part of the address.
     *
     * @param streetName the new street name.
     * @see java.lang.String
     */
    public final void setStreetName(final String streetName) {
        this.streetName = streetName;
    }

    /**
     * Returns the city/suburb name.
     * <p>
     * The {@code getCityName} method retrieves the textual string representing the city/suburb part of the address.
     * <p>
     * The return value is a {@code String} object textually representing the city/suburb part of the address.
     *
     * @return The city/suburb name.
     * @see java.lang.String
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the city/suburb name.
     * <p>
     * The {@code setCityName} method assigns the value supplied by the {@code cityName} parameter to the textual string
     * representing the city/suburb part of the address.
     *
     * @param cityName the new city/suburb name.
     * @see java.lang.String
     */
    public final void setCityName(final String cityName) {
        this.cityName = cityName;
    }

    /**
     * Returns the postal code.
     * <p>
     * The {@code getCharacterSet} method retrieves the postal code part of the address.
     * <p>
     * The return value is a {@code PostalCode} object representing the postal code part of the address.
     *
     * @return The postal code.
     * @see familytree.PostalCode
     */
    public final PostalCode getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code.
     * <p>
     * The {@code setCharacterSet} method assigns the value supplied by the {@code postalCode} parameter to the postal
     * code part of the address.
     *
     * @param postalCode the new postal code.
     * @see familytree.PostalCode
     */
    public final void setPostalCode(final PostalCode postalCode) {
        this.postalCode = new PostalCode(postalCode);
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
     * The {@code equals} method for the {@code Address} class implements the most discriminating
     * possible equivalence relation on {@code Address} objects; that is, for any non-null reference
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

        final Address other = (Address) obj;
        return Objects.equals(this.streetNumber, other.streetNumber) && Objects.equals(this.streetName,
                                                                                       other.streetName) &&
               Objects.equals(this.cityName, other.cityName) && Objects.equals(this.postalCode, other.postalCode);
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
     * As much as is reasonably practical, the {@code hashCode} method defined by the {@code Address}
     * class does return distinct integers for distinct objects.
     *
     * @return A hash code value for this object.
     * @see java.lang.Object#equals(java.lang.Object)
     * @see java.lang.System#identityHashCode(java.lang.Object)
     */
    @Override
    public int hashCode() {
        int hash = 0;

        hash = hash + Objects.hashCode(this.streetNumber);
        hash = hash + Objects.hashCode(this.streetName);
        hash = hash + Objects.hashCode(this.cityName);
        hash = hash + Objects.hashCode(this.postalCode);

        return hash;
    }

    /**
     * Returns a string representation of the object. In general, the {@code toString} method returns a string that
     * "textually represents" this object.
     * <p>
     * The {@code toString} method for the {@code Address} class returns a string consisting of the name of the class
     * followed by a list of its member variables and their values encapsulated within curly braces. In other words,
     * this method returns a string equal to the value of:
     * <blockquote><pre>
     * "Address{" + "streetNumber=" + streetNumber + ", streetName=" + streetName + ", cityName=" + cityName + ", postalCode=" + postalCode + '}'
     * </pre></blockquote>
     *
     * @return A string representation of the object.
     * @see java.lang.String
     * @see familytree.PostalCode#toString()
     */
    @Override
    public String toString() {
        return "Address{" + "streetNumber=" + streetNumber + ", streetName=" + streetName + ", cityName=" + cityName +
               ", postalCode=" + postalCode + '}';
    }

}
