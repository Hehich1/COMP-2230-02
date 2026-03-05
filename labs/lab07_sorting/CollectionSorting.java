import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSorting {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("Ball");
        numbers.add("Root Beer");
        numbers.add("Arby\'s");

        Collections.sort(numbers);
        System.out.println(numbers);


        // TO DO Create a list of custom objects (e.g., Student) 
        // and sort them based on a specific attribute (e.g., name or grade)

        // TO DO PRINT THE SORTED LIST OF CUSTOM OBJECTS
}
}