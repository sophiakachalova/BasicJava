package edu.ntu.pzks.lr4.model;

import java.util.List;
import java.util.Objects;

public class University extends StructureUnit {
    private final List<Faculty> faculties;

    public University(String name, Human head, List<Faculty> faculties) {
        super(name, head);
        this.faculties = faculties;
    }

    public String getName() {  // <--- добавили этот метод
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        University that = (University) obj;
        return Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculties);
    }

    @Override
    public String toString() {
        return "University{name='" + name + "', head=" + head + ", faculties=" + faculties + "}";
    }
}





