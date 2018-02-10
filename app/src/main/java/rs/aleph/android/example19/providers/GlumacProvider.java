package rs.aleph.android.example19.providers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rs.aleph.android.example19.model.Category;
import rs.aleph.android.example19.model.Glumac;

/**
 * Created by androiddevelopment on 10.2.18..
 */

public class GlumacProvider  {

SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
Date d = sdf.parse("01.01.2000");


    public GlumacProvider() throws ParseException {
    }

    public static List<Glumac> getGlumci() {

        Category horor = new Category(0, "Horor");
        Category triler = new Category(1, "Triler");
        Category drama = new Category(2, "Drama");

        List<Glumac> glumci = new ArrayList<>();
        glumci.add(new Glumac(0, "Nebojsa", "Glogovac", "Nemobojsa Glogovac je ...", 5.0f, drama, "12.12.2001", "08.02.2018", "Nebeska udica", "nebojsa.jpg"));
        glumci.add(new Glumac(1, "Nikola", "Kojo", "Nikola Kojo...", 4.0f, triler, "12.12.2002", "ziv", "Lepa Sela Lepo GOre", "kojo.jpg"));
        glumci.add(new Glumac(2, "Sergej" , "Trifunovic", "Sergej Trifunovic.....", 3.0f, drama, "23.08.2008", "ziv", "Kengur", "sergej.jpg" ));
        return glumci;
    }

    public static List<String> getGlumacNames() {

        List<String> names = new ArrayList<>();
        names.add("Nebojsa Glogovac");
        names.add("Nikola Kojo");
        names.add("Sergej Trifunovic");
        return names;
    }

    public static Glumac getGlumacById(int id) {

        Category horor = new Category(0, "Horor");
        Category triler = new Category(1, "Triler");
        Category drama = new Category(2, "Drama");

        switch (id) {
            case 0:
                return new Glumac(0, "Nebojsa", "Glogovac", "Nemobojsa Glogovac je ...", 5.0f, drama, "12.12.2001", "08.02.2018", "Nebeska udica", "nebojsa.jpg");
            case 1:
                return new Glumac(1, "Nikola", "Kojo", "Nikola Kojo...", 4.0f, triler, "12.12.2002", "ziv", "Lepa Sela Lepo GOre", "nikola.jpg");
            case 2:
                return new Glumac(2, "Sergej" , "Trifunovic", "Sergej Trifunovic.....", 3.0f, drama, "23.08.2008", "ziv", "Kengur", "sergej.jpg" );
            default:
                return null;
        }
    }



}

