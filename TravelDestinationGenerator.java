import java.util.Random;

public class RandomTravelDestinationGenerator {
    public static void main(String[] args) {
        String[] destinations = {
            "Bali", "Paris", "Tokyo", "New York", "Sydney", "Rome",
            "London", "Barcelona", "Dubai", "Istanbul", "Singapore",
            "Los Angeles", "Berlin", "Bangkok", "Rio de Janeiro", "Toronto",
            "Amsterdam", "Copenhagen", "Mexico City", "Marrakech", "Hong Kong",
            "Lisbon", "Prague", "Budapest", "Athens", "Cape Town"
        };
        
        Random random = new Random();
        int index = random.nextInt(destinations.length);
        
        System.out.println("Random Travel Destination: " + destinations[index]);
    }
}
