package Task1;
public abstract class Service {
        private String id;
        private  String nameService;
        private  float cost;
        private  String MaxNumberOfPeople;
        private  String RentType;

        public Service(String id, String nameService, float cost, String maxNumberOfPeople, String rentType) {
                this.id = id;
                this.nameService = nameService;
                this.cost = cost;
                MaxNumberOfPeople = maxNumberOfPeople;
                RentType = rentType;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getNameService() {
                return nameService;
        }

        public void setNameService(String nameService) {
                this.nameService = nameService;
        }

        public float getCost() {
                return cost;
        }

        public void setCost(float cost) {
                this.cost = cost;
        }

        public String getMaxNumberOfPeople() {
                return MaxNumberOfPeople;
        }

        public void setMaxNumberOfPeople(String maxNumberOfPeople) {
                MaxNumberOfPeople = maxNumberOfPeople;
        }

        public String getRentType() {
                return RentType;
        }

        public void setRentType(String rentType) {
                RentType = rentType;
        }

        @Override
        public String toString() {
                return
                        "id='" + id + '\'' +
                        ", nameService='" + nameService + '\'' +
                        ", cost=" + cost +
                        ", MaxNumberOfPeople='" + MaxNumberOfPeople + '\'' +
                        ", RentType='" + RentType + '\''
                        ;
        }
}