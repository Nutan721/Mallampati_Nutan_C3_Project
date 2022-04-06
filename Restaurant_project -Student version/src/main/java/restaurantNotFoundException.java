public class restaurantNotFoundException extends Exception {
    public restaurantNotFoundException(String restaurantName) {
        super(restaurantName);
    }
}
