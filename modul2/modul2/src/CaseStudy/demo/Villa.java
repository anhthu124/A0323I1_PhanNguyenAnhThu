package CaseStudy.demo;

public class Villa extends Service {
    private String roomStandard;
        private double poolArea;
        private int numberOfFloors;

        public Villa(String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType,
                     String roomStandard, double poolArea, int numberOfFloors) {
            super(serviceName, area, rentalCost, maxOccupancy, rentalType);
            this.roomStandard = roomStandard;
            this.poolArea = poolArea;
            this.numberOfFloors = numberOfFloors;
        }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    // Các phương thức khác
////        // ...
}
