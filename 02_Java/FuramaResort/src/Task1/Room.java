package Task1;

public class Room extends  Service {
    private  String AccompaniedService;

    public Room(String id,
                String nameService,
                float cost,
                String maxNumberOfPeople,
                String rentType,
                String accompaniedService) {
        super(id, nameService, cost, maxNumberOfPeople, rentType);
        AccompaniedService = accompaniedService;
    }

    public String getAccompaniedService() {
        return AccompaniedService;
    }

    public void setAccompaniedService(String accompaniedService) {
        AccompaniedService = accompaniedService;
    }

    @Override
    public String toString() {
        return super.toString()+"Room{" +
                "AccompaniedService='" + AccompaniedService + '\'' +
                '}';
    }
}
