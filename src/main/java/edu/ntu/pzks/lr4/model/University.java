package edu.ntu.pzks.lr4.model;

import java.util.List;
import java.util.Objects;

public class University extends StructureUnit {
    private List<Faculty> faculties;

    public University(String name, Human head, List<Faculty> faculties) {
        super(name, head);
        this.faculties = faculties;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        University that = (University) obj;
        return Objects.equals(name, that.name) &&
                Objects.equals(head, that.head) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head, faculties);
    }
}



