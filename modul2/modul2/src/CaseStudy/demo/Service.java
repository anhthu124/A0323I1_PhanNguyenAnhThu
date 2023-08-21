package CaseStudy.demo;

public class Service {
    private String serviceName;
    private double area;
    private double rentalCost;
    private int maxOccupancy;
    private String rentalType;

    public Service(String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType) {
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxOccupancy = maxOccupancy;
        this.rentalType = rentalType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
// Các phương thức khác
////        // ...
}
