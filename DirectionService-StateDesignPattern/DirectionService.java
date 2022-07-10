package.com.katsup.state

public class DirectionService {
    private TravelMethod travelMethod;

    public Object getETA() {
       return travelMethod.getETA();
    }

    public Object getDirection() {
       return travelMethod.getDirection();
    }

    public TravelMethod getTravelMethod() {
        return travelMethod;
    }

    public void setTravelMethod(TravelMethod travelMethod) {
        this.travelMethod = travelMethod;
    }
}
