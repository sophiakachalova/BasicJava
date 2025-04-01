package edu.ntu.pzks.lr4.model;

import java.util.Objects;

public class StructureUnit {
    protected String name;
    protected Human head;

    public StructureUnit(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StructureUnit that = (StructureUnit) obj;
        return Objects.equals(name, that.name) && Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head);
    }
}

