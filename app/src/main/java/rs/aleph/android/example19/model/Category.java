package rs.aleph.android.example19.model;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private int id;
    private String name;
    private List<Glumac> glumci;

    public Category() {

        glumci = new ArrayList<>();
    }

    public Category(int id, String name) {

        this.id = id;
        this.name = name;

        glumci = new ArrayList<>();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void addGlumac(Glumac glumac) {

        glumci.add(glumac);
    }

    public void removeGlumac(Glumac glumac) {

        glumci.remove(glumac);
    }

    public Glumac getGlumac(int position) {

        return glumci.get(position);
    }

    public List<Glumac> getGlumci() {

        return glumci;
    }

    public void setGlumci(List<Glumac> glumci) {

        this.glumci = glumci;
    }
}
