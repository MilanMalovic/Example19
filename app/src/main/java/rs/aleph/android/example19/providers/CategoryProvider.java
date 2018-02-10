package rs.aleph.android.example19.providers;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example19.model.Category;

public class CategoryProvider {

    public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Horor"));
        categories.add(new Category(1, "Triler"));
        categories.add(new Category(2, "Drama"));
        return categories;
    }

    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Horor");
        names.add("Triler");
        names.add("Drama");
        return names;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Horor");
            case 1:
                return new Category(1, "Triler");
            case 2:
                return new Category(2, "Drama");
            default:
                return null;
        }
    }
}
