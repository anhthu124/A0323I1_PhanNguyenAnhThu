package CaseStudy.demo;

public class Room extends Service {
            private String freeServices;

        public Room(String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType,
                    String freeServices) {
            super(serviceName, area, rentalCost, maxOccupancy, rentalType);
            this.freeServices = freeServices;
        }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }
    // Các phương thức khác
}
