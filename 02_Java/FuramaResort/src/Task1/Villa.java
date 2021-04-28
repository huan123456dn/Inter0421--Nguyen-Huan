package Task1;


public class Villa extends Service {
    private  String StandardRoom;
    private  String convenient;
    private  String area;
    private int floors;

    public Villa(String id, String nameService,
                 float cost,
                 String maxNumberOfPeople,
                 String rentType,
                 String standardRoom,
                 String convenient,
                 String area,
                 int floors) {
        super(id, nameService, cost, maxNumberOfPeople, rentType);
        StandardRoom = standardRoom;
        this.convenient = convenient;
        this.area = area;
        this.floors = floors;
    }

    @Override
    public String toString() {
        return  super.toString()+"Villa{" +
                "StandardRoom='" + StandardRoom + '\'' +
                ", convenient='" + convenient + '\'' +
                ", area='" + area + '\'' +
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
