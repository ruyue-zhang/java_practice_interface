
public class Demo {

    public static void main(String[] args) {
        SelfDriving selfDriving = new SelfDriving();
        if(300 >= selfDriving.getPrice()) {
            System.out.println(selfDriving.getType());
        }
    }
}
