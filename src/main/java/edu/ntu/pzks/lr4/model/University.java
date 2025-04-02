package edu.ntu.pzks.lr4.model;

import java.util.List;
import java.util.Objects;

public class University extends StructureUnit {
    private final List<Faculty> faculties;

    public University(String name, Human head, List<Faculty> faculties) {
        super(name, head);
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(head, that.head) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, faculties);
    }


    @Override
    public String toString() {
        return "University{name='" + name + "', head=" + head + ", faculties=" + faculties + "}";
    }
}




