import java.util.ArrayList;
import java.util.List;

public class SneakerService {

    private static int nextId = 1;  // (1)
    private List<Sneaker> inventory = new ArrayList<>();  // (2)

    public Sneaker create(String name, String brand, String sport, int size, int quantity, float price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        Sneaker correctSneaker;
        for (Sneaker sneaker : inventory) {
             if(sneaker.getId() == id){
                 return sneaker;
             }

        }return null;
    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        return inventory.toArray(new Sneaker[0]);
    }

    //delete
    public boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
            return inventory.remove(findSneaker(id));
    }
}