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

import java.util.Objects;
import java.util.Set;

/**
 * The {@code FamilyMember} class encapsulates data relating to a person who is a member of a family unit.
 * <p>
 * The {@code FamilyMember} class stores data relevant to a person who is a member of a larger family unit. In general,
 * a family member is always a person, and has all the usual properties that a person would have (as defined by the
 * {@code Person} class). Additionally, a family member has a specified family (or gentile) name which represents the
 * family to which they belong, a biological mother (the person who birthed them), a biological father (the person who
 * sired them), and may have zero or one spouse and zero or many children.
 * <p>
 * The default constructor leaves the fields of the family member undefined and nullified. If the parameters
 * {@code familyMember}, {@code familyName}, {@code mother}, {@code father}, {@code spouse}, and {@code children} are
 * supplied, then the parameter {@code familyMember} is used to represent and construct the person, and the remaining
 * parameters are assigned to the family member's family (or gentile) name, mother, father, spouse, and children fields,
 * respectively.
 */
public class FamilyMember extends Person {

    /**
     * The family, or gentile, name.
     */
    private String genus = null;
    /**
     * The family member's biological mother.
     */
    private Person maternus = null;
    /**
     * The family member's biological father.
     */
    private Person paternus = null;
    /**
     * The family member's spouse (if any).
     */
    private Person sponsus = null;
    /**
     * The family member's children (if any).
     */
    private Set<Person> natus = null;

    /**
     * Creates a new {@code FamilyMember} object and leaves the fields of the family member undefined and nullified.
     */
    public FamilyMember() {
        super();
    }

    /**
     * Creates a new {@code FamilyMember} object; creates a new {@code Person} object using the supplied parameter
     * {@code familyMember}, and assigns the supplied parameters {@code familyName}, {@code mother}, {@code father},
     * {@code spouse}, and {@code children} to the family member's family (or gentile) name, mother, father, spouse, and
     * children fields, respectively.
     *
     * @param familyMember the person who is the family member.
     * @param familyName   the family member's family, or gentile, name.
     * @param mother       the family member's biological mother.
     * @param father       the family member's biological father.
     * @param spouse       the family member's spouse (if any).
     * @param children     the family member's children (if any).
     * @see familytree.Person
     * @see java.lang.String
     * @see java.util.Set
     */
    public FamilyMember(final Person familyMember, final String familyName, final Person mother, final Person father,
                        final Person spouse, final Set<Person> children) {
        super(familyMember);
        this.genus = familyName;
        this.maternus = mother;
        this.paternus = father;
        this.sponsus = spouse;
        this.natus = children;
    }

    /**
     * Creates a new {@code FamilyMember} object, assigns the name, sex, address, and biography fields of the supplied
     * parameter {@code obj} to the person's name, sex, address, and biography fields, respectively, and assigns the
     * family (or gentile) name, mother, father, spouse, and children fields of the supplied parameter {@code obj} to
     * the family member's family (or gentile) name, mother, father, spouse, and children fields, respectively. The new
     * {@code FamilyMember} object is a "deep copy" of the parameter {@code obj}.
     *
     * @param obj the reference {@code FamilyMember} object to copy.
     */
    public FamilyMember(final FamilyMember obj) {
        super(obj.getName(), obj.getSex(), obj.getAddress(), obj.getBiography());
        this.genus = obj.genus;
        this.maternus = obj.maternus;
        this.paternus = obj.paternus;
        this.sponsus = obj.sponsus;
        this.natus = obj.natus;
    }

    private static Person findChild(final Set<Person> children, final Name childName) {
        for (Person child : children) {
            if (child.getName().equals(childName)) {
                return child;
            }
        }

        return null;
    }

    /**
     * Returns the family member's family, or gentile, name.
     * <p>
     * The {@code getFamilyName} method retrieves the family member's family, or gentile, name according to the <i>tria
     * nomina</i> structural conventions.
     * <p>
     * The return value is a {@code String} object representing the family member's family, or gentile, name.
     *
     * @return The family member's family, or gentile, name.
     * @see java.lang.String
     */
    public final String getFamilyName() {
        return genus;
    }

    /**
     * Sets the family member's family, or gentile, name.
     * <p>
     * The {@code setFamilyName} method assigns the value supplied by the {@code familyName} parameter to the family
     * member's family, or gentile, name according to the <i>tria nomina</i> structural conventions.
     *
     * @param familyName the family member's new family, or gentile, name.
     * @see java.lang.String
     */
    public final void setFamilyName(final String familyName) {
        this.genus = familyName;
    }

    /**
     * Returns the family member's biological mother.
     * <p>
     * The {@code getMother} method retrieves the family member's biological mother (the person who birthed them).
     * <p>
     * The return value is a {@code Person} object representing the family member's biological mother.
     *
     * @return The family member's biological mother.
     * @see familytree.Person
     */
    public final Person getMother() {
        return maternus;
    }

    /**
     * Sets the family member's biological mother.
     * <p>
     * The {@code setMother} method assigns the value supplied by the {@code mother} parameter to the family member's
     * biological mother (the person who birthed them).
     *
     * @param mother the family member's new biological mother.
     * @see familytree.Person
     */
    public final void setMother(final Person mother) {
        this.maternus = mother;
    }

    /**
     * Returns the family member's biological father.
     * <p>
     * The {@code getFather} method retrieves the family member's biological father (the person who sired them).
     * <p>
     * The return value is a {@code Person} object representing the family member's biological father.
     *
     * @return The family member's biological father.
     * @see familytree.Person
     */
    public final Person getFather() {
        return paternus;
    }

    /**
     * Sets the family member's biological father.
     * <p>
     * The {@code setFather} method assigns the value supplied by the {@code father} parameter to the family member's
     * biological father (the person who sired them).
     *
     * @param father the family member's new biological father.
     * @see familytree.Person
     */
    public final void setFather(final Person father) {
        this.paternus = father;
    }

    /**
     * Returns the family member's spouse.
     * <p>
     * The {@code getSpouse} method retrieves the family member's spouse (if any).
     * <p>
     * The return value is a {@code Person} object representing the family member's spouse. If the family member does
     * not have a spouse, the return value is {@code null}.
     *
     * @return The family member's spouse, if any; {@code null} otherwise.
     * @see familytree.Person
     */
    public final Person getSpouse() {
        return sponsus;
    }

    /**
     * Sets the family member's spouse.
     * <p>
     * The {@code setSpouse} method assigns the value supplied by the {@code spouse} parameter to the family member's
     * spouse (if any). If the family member does not have a spouse, the input parameter should be {@code null}.
     *
     * @param spouse the family member's new spouse (if any).
     * @see familytree.Person
     */
    public final void setSpouse(final Person spouse) {
        this.sponsus = spouse;
    }

    /**
     * Returns the family member's children.
     * <p>
     * The {@code getChildren} method retrieves all of the family member's children (if any).
     * <p>
     * The return value is a {@code Set} of {@code Person} objects representing the family member's children. If the
     * family member does not have any children, the return value is {@code null}.
     *
     * @return The set of the family member's children, if any; {@code null} otherwise.
     * @see java.util.Set
     * @see familytree.Person
     */
    public final Set<Person> getChildren() {
        return natus;
    }

    /**
     * Returns one of the family member's children.
     * <p>
     * The {@code getChild} method retrieves one of the family member's children (if any) specified by the child's
     * name.
     * <p>
     * The return value is a {@code Person} object representing the family member's child specified by the value
     * supplied by the {@code childName} parameter. If the family member does not have a child with the specified name,
     * the return value is {@code null}.
     *
     * @param childName the specified child's name.
     * @return The specified child, if found; {@code null} otherwise.
     * @see familytree.Person
     */
    public final Person getChild(final Name childName) {
        return FamilyMember.findChild(natus, childName);
    }

    /**
     * Adds a child to the family member's set of children.
     * <p>
     * The {@code addChild} method adds the specified child to the set of children if it is not already present
     * (optional operation). More formally, adds the specified element {@code e} to the set if the set contains no
     * element {@code e2} such that {@code (e == null ? e2 == null : e.equals(e2))}. If the set already contains the
     * element, the call leaves the set unchanged and returns {@code false}. In combination with the restriction on
     * constructors, this ensures that sets never contain duplicate elements.
     * <p>
     * The stipulation above does not imply that sets must accept all elements; sets may refuse to add any particular
     * element, including {@code null}, and throw an exception, as described in the specification for
     * {@code Collection.add}. Individual set implementations should clearly document any restrictions on the elements
     * that they may contain.
     *
     * @param child the child to be added to the set.
     * @return {@code true} if the set did not already contain the specified element; {@code false} otherwise.
     * @throws UnsupportedOperationException if the add operation is not supported by the set.
     * @throws IllegalArgumentException      if some property of the specified element prevents it from being added to
     *                                       the set.
     * @throws ClassCastException            if the class of the specified element prevents it from being added to the
     *                                       set.
     * @throws NullPointerException          if the specified element is {@code null} and the set does not permit null
     *                                       elements.
     * @see java.util.Set#add(java.lang.Object)
     * @see familytree.Person
     */
    public boolean addChild(final Person child)
    throws UnsupportedOperationException, IllegalArgumentException, ClassCastException, NullPointerException {
        return natus.add(child);
    }

    /**
     * Removes a child from the family member's set of children.
     * <p>
     * The {@code removeChild} method removes the specified child from the set of children if it is present (optional
     * operation). More formally, removes an element {@code e} such that {@code (o == null ? e == null : o.equals(e))},
     * if the set contains such an element. Returns {@code true} if the set contained the element (or equivalently, if
     * this set changed as a result of the call). The set will not contain the element once the call returns.
     *
     * @param childName the name of the child to be removed from the set, if present.
     * @return {@code true} if the set contained the specified element; {@code false} otherwise.
     * @throws UnsupportedOperationException if the remove operation is not supported by the set.
     * @throws ClassCastException            if the type of the specified element is incompatible with the set.
     * @throws NullPointerException          if the specified element is {@code null} and the set does not permit null
     *                                       elements.
     * @see java.util.Set#remove(java.lang.Object)
     * @see familytree.Person
     */
    public boolean removeChild(final Name childName)
    throws UnsupportedOperationException, ClassCastException, NullPointerException {
        return natus.remove(FamilyMember.findChild(natus, childName));
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
     * The {@code equals} method for the {@code FamilyMember} class implements the most discriminating
     * possible equivalence relation on {@code FamilyMember} objects; that is, for any non-null
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

        final FamilyMember other = (FamilyMember) obj;
        return super.equals(obj) && Objects.equals(this.genus, other.genus) && Objects.equals(this.maternus,
                                                                                              other.maternus) &&
               Objects.equals(this.paternus, other.paternus) && Objects.equals(this.sponsus, other.sponsus) &&
               Objects.equals(this.natus, other.natus);
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
     * {@code FamilyMember} class does return distinct integers for distinct objects.
     *
     * @return A hash code value for this object.
     * @see java.lang.Object#equals(java.lang.Object)
     * @see java.lang.System#identityHashCode(java.lang.Object)
     */
    @Override
    public int hashCode() {
        int hash = 0;

        hash = 6 * hash + super.hashCode();
        hash = 6 * hash + Objects.hashCode(this.genus);
        hash = 6 * hash + Objects.hashCode(this.maternus);
        hash = 6 * hash + Objects.hashCode(this.paternus);
        hash = 6 * hash + Objects.hashCode(this.sponsus);
        hash = 6 * hash + Objects.hashCode(this.natus);

        return hash;
    }

    /**
     * Returns a string representation of the object. In general, the {@code toString} method returns a string that
     * "textually represents" this object.
     * <p>
     * The {@code toString} method for the {@code FamilyMember} class returns a string consisting of the name of the
     * class followed by a list of its member variables and their values encapsulated within curly braces. In other
     * words, this method returns a string equal to the value of:
     * <blockquote><pre>
     * "FamilyMember{" + super.toString() + ", genus=" + genus + ", maternus=" + maternus + ", paternus=" + paternus + ", sponsus=" + sponsus + ", natus=" + natus + '}'
     * </pre></blockquote>
     *
     * @return A string representation of the object.
     * @see java.lang.String
     * @see familytree.Person#toString()
     */
    @Override
    public String toString() {
        return "FamilyMember{" + super.toString() + ", genus=" + genus + ", maternus=" + maternus + ", paternus=" +
               paternus + ", sponsus=" + sponsus + ", natus=" + natus + '}';
    }

}
