package edu.ntu.pzks.lr4.model;

import java.util.Objects;

public class Faculty extends StructureUnit {
    public Faculty(String name, Human head) {
        super(name, head);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(name, faculty.name) &&
                Objects.equals(head, faculty.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head);
    }
}


