package Task2.MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Movie {
    private String name;
    private String actor;

    public Movie(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", actor=" + actor + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, actor);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Movie)) {
            return false;
        }
        Movie other = (Movie) obj;
        return Objects.equals(actor, other.actor) && Objects.equals(name, other.name);
    }


}

public class MapClassDemo {

    public static void main(String[] args) {

        Map<Integer, Movie> MovieMap = new HashMap();

        MovieMap.put(111, new Movie("PB", "Billa"));
        MovieMap.put(222, new Movie("AA", "Pushpa"));
        MovieMap.put(333, new Movie("PK", "Bheemla"));
        MovieMap.put(444, new Movie("RC", "Gav"));
        MovieMap.put(555, new Movie("Mb", "Pokiri"));

        for (Map.Entry<Integer, Movie> e : MovieMap.entrySet()) {
            System.out.println("Key: " + e.getKey() + "\t Value: " + e.getValue());
        }


    }

}
