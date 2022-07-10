package.katsup.com.state

public class Car implements TravelMethod{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (Car)");
        return 1;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Car)");
        return "a";
    }
}
