package edu.ntu.pzks.lr4.model;

public abstract class StructureUnit {
    protected String name;
    protected Human head;

    public StructureUnit(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }
}
