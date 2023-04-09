package org.example.Company.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Reference {
    protected static ArrayList<Reference> list;
    protected String name;
    static {
        list = new ArrayList<>();
    }

    public Reference(List<String> list) {
        for (String name: list) {
            this.add(name);
        }
    }

    public Reference(String name) {
        add(name);
    }

    private void add(String name) {
        this.name = name;
        if (list.indexOf(this) == -1) {
            list.add(this);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        return name == obj.toString();
    }
}
