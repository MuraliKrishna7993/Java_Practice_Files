package Task2.SetPractice;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Items {
    private String name;
    private String category;


    public Items(String name, String category) {

        this.name = name;
        this.category = category;
    }


    public String getName() {
        return name;
    }


    public String getCategory() {
        return category;
    }


    @Override
    public String toString() {
        return "Items [name=" + name + ", category=" + category + "]";
    }


    @Override
    public int hashCode() {
        return Objects.hash(category, name);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Items)) {
            return false;
        }
        Items other = (Items) obj;
        return Objects.equals(category, other.category) && Objects.equals(name, other.name);
    }


}

public class TreesetComparatorClass {

    public static void main(String[] args) {

        Comparator<Items> ItemComparator = new Comparator<Items>() {

            @Override
            public int compare(Items o1, Items o2) {
                int compareName = o1.getName().compareTo(o2.getName());

                if (compareName != 0) {
                    return compareName;
                }
                return o1.getCategory().compareTo(o2.getCategory());
            }
        };

        SortedSet<Items> productSet = new TreeSet<>(ItemComparator);

        productSet.add(new Items("Iphone", "Mobiles"));
        productSet.add(new Items("Samsung", "Electronics"));
        productSet.add(new Items("Levis", "Wear"));
        productSet.add(new Items("WoodLand", "FootWear"));
        productSet.add(new Items("Rolex", "Watch"));


        for (Items p : productSet) {
            System.out.println(p);
        }

        System.out.println();


    }
}
