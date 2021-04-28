package Task1;

public class House extends Service {
    private  String StandardRoom;
    private  String convenient;
    private int floors;

    public House(String id, String nameService,
                 float cost,
                 String maxNumberOfPeople,
                 String rentType,
                 String standardRoom,
                 String convenient,
                 int floors) {
        super(id, nameService, cost, maxNumberOfPeople, rentType);
        StandardRoom = standardRoom;
        this.convenient = convenient;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "StandardRoom='" + StandardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", floors=" + floors +
                '}';
    }

    public String getStandardRoom() {
        return StandardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        StandardRoom = standardRoom;
    }

    public String getConvenient() {
        return convenient;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
