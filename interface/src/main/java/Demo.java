
public class Demo {

    public static void main(String[] args) {
        SelfDriving selfDriving = new SelfDriving();
        Bus bus = new Bus();
        Plain plain = new Plain();

        if(300 >= selfDriving.getPrice()) {
            System.out.println(selfDriving.getType());
        }

        if(300 >= bus.getPrice()) {
            System.out.println(bus.getType());
        }

        if(300 >= plain.getPrice()) {
            System.out.println(plain.getType());
        }
    }
}
