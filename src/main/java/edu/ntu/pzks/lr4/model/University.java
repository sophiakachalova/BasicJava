package edu.ntu.pzks.lr4.model;

import java.util.List;
import java.util.Objects;

public class University {
    private String name;
    private Human rector;
    private List<Faculty> faculties;

    public University(String name, Human rector, List<Faculty> faculties) {
        this.name = name;
        this.rector = rector;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(rector, that.rector) &&
                Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rector, faculties);
    }
}




