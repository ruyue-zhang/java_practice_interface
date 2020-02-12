public interface Vehicle {
    public abstract double getPrice();

    public default String getType() {
        return getClass().getSimpleName();
    }
}
