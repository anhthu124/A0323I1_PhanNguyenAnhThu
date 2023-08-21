package CaseStudy.demo;

public class House extends  Service{
    private String roomStandard;
        private int numberOfFloors;

        public House(String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType,
                     String roomStandard, int numberOfFloors) {
            super(serviceName, area, rentalCost, maxOccupancy, rentalType);
            this.roomStandard = roomStandard;
            this.numberOfFloors = numberOfFloors;
        }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
//các phương thức khác
}
