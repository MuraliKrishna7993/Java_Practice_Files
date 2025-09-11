package Task2.SetPractice;


import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

class Item implements Comparable<Item> {

    private String name;
    private String category;


    public Item(String name, String category) {

        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format(" name=%s  and  category=%s", name, category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        return Objects.equals(name, other.name) && Objects.equals(category, other.category);
    }

    @Override
    public int compareTo(Item o) {
        int compareName = this.name.compareTo(o.name);

        if (compareName != 0) {
            return compareName;
        }
        return this.category.compareTo(o.category);
    }
}

public class TreesetComparableClass {
    public static void main(String[] args) {

        SortedSet<Item> productSet = new TreeSet<>();

        productSet.add(new Item("Iphone", "Mobiles"));
        productSet.add(new Item("Samsung", "Electronics"));
        productSet.add(new Item("Levis", "Wear"));
        productSet.add(new Item("WoodLand", "FootWear"));
        productSet.add(new Item("Rolex", "Watch"));


        for (Item p : productSet) {
            System.out.println(p);
        }

        System.out.println();
    }
}

