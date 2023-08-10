////package CaseStudy.demo;
////
////public class demo {
////    // Import các thư viện và gói cần thiết
////
////import java.util.ArrayList;
////import java.util.List;
////
////    // Lớp dịch vụ
////    class Service {
////        private String serviceName;
////        private double area;
////        private double rentalCost;
////        private int maxOccupancy;
////        private String rentalType;
////
////        public Service(String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType) {
////            this.serviceName = serviceName;
////            this.area = area;
////            this.rentalCost = rentalCost;
////            this.maxOccupancy = maxOccupancy;
////            this.rentalType = rentalType;
////        }
////
////        // Getters và setters
////        // ...
////
////        // Các phương thức khác
////        // ...
////    }
////
////    // Lớp Villa kế thừa từ lớp Service
////    class Villa extends Service {
////        private String roomStandard;
////        private double poolArea;
////        private int numberOfFloors;
////
////        public Villa(String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType,
////                     String roomStandard, double poolArea, int numberOfFloors) {
////            super(serviceName, area, rentalCost, maxOccupancy, rentalType);
////            this.roomStandard = roomStandard;
////            this.poolArea = poolArea;
////            this.numberOfFloors = numberOfFloors;
////        }
////
////        // Getters và setters
////        // ...
////
////        // Các phương thức khác
////        // ...
////    }
////
////    // Lớp House kế thừa từ lớp Service
////    class House extends Service {
////        private String roomStandard;
////        private int numberOfFloors;
////
////        public House(String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType,
////                     String roomStandard, int numberOfFloors) {
////            super(serviceName, area, rentalCost, maxOccupancy, rentalType);
////            this.roomStandard = roomStandard;
////            this.numberOfFloors = numberOfFloors;
////        }
////
////        // Getters và setters
////        // ...
////
////        // Các phương thức khác
////        // ...
////    }
////
////    // Lớp Room kế thừa từ lớp Service
////    class Room extends Service {
////        private String freeServices;
////
////        public Room(String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType,
////                    String freeServices) {
////            super(serviceName, area, rentalCost, maxOccupancy, rentalType);
////            this.freeServices = freeServices;
////        }
////
////        // Getters và setters
////        // ...
////
////        // Các phương thức khác
////        // ...
////    }
////
////    // Lớp Employee
////    class Employee {
////        private String employeeCode;
////        private String fullName;
////        private String dateOfBirth;
////        private String gender;
////        private String idNumber;
////        private String phoneNumber;
////        private String email;
////        private String qualification;
////        private String position;
////        private double salary;
////
////        public Employee(String employeeCode, String fullName, String dateOfBirth, String gender, String idNumber,
////                        String phoneNumber, String email, String qualification, String position, double salary) {
////            this.employeeCode = employeeCode;
////            this.fullName = fullName;
////            this.dateOfBirth = dateOfBirth;
////            this.gender = gender;
////            this.idNumber = idNumber;
////            this.phoneNumber = phoneNumber;
////            this.email = email;
////            this.qualification = qualification;
////            this.position = position;
////            this.salary = salary;
////        }
////
////        // Getters và setters
////        // ...
////
////        // Các phương thức khác
////        // ...
////    }
////
////    // Lớp Customer
////    class Customer {
////        private String customerCode;
////        private String fullName;
////        private String dateOfBirth;
////        private String gender;
////        private String idNumber;
////        private String phoneNumber;
////        private String email;
////        private String customerType;
////        private String address;
////
////        public Customer(String customerCode, String fullName, String dateOfBirth, String gender, String idNumber,
////                        String phoneNumber, String email, String customerType, String address) {
////            this.customerCode = customerCode;
////            this.fullName = fullName;
////            this.dateOfBirth = dateOfBirth;
////            this.gender = gender;
////            this.idNumber = idNumber;
////            this.phoneNumber = phoneNumber;
////            this.email = email;
////            this.customerType = customerType;
////            this.address = address;
////        }
////
////        // Getters và setters
////        // ...
////
////        // Các phương thức khác
////        // ...
////    }
////
////    // Lớp Booking
////    class Booking {
////        private String bookingCode;
////        private String startDate;
////        private String endDate;
////        private String customerCode;
////        private String serviceName;
////        private String rentalType;
////
////        public Booking(String bookingCode, String startDate, String endDate, String customerCode, String serviceName,
////                       String rentalType) {
////            this.bookingCode = bookingCode;
////            this.startDate = startDate;
////            this.endDate = endDate;
////            this.customerCode = customerCode;
////            this.serviceName = serviceName;
////            this.rentalType = rentalType;
////        }
////
////        // Getters và setters
////        // ...
////
////        // Các phương thức khác
////        // ...
////    }
////
////    // Lớp Contract
////    class Contract {
////        private String contractNumber;
////        private String bookingCode;
////        private double depositAmount;
////        private double totalPaymentAmount;
////        private String customerCode;
////
////        public Contract(String contractNumber, String bookingCode, double depositAmount, double totalPaymentAmount,
////                        String customerCode) {
////            this.contractNumber = contractNumber;
////            this.bookingCode = bookingCode;
////            this.depositAmount = depositAmount;
////            this.totalPaymentAmount = totalPaymentAmount;
////            this.customerCode = customerCode;
////        }
////
////        // Getters và setters
////        // ...
////
////        // Các phương thức khác
////        // ...
////    }
////
////    // Main class để chạy hệ thống
////    public class FuramaManagementSystem {
////        public static void main(String[] args) {
////            // Khởi tạo và quản lý danh sách các dịch vụ
////            List<Service> services = new ArrayList<>();
////            services.add(new Villa("Villa01", 200.0, 1000.0, 6, "Yearly", "Luxury", 50.0, 2));
////            services.add(new House("House01", 150.0, 800.0, 4, "Monthly", "Standard", 2));
////            services.add(new Room("Room01", 30.0, 100.0, 2, "Daily", "Wi-Fi"));
////
////            // Khởi tạo và quản lý danh sách nhân viên
////            List<Employee> employees = new ArrayList<>();
////            employees.add(new Employee("E001", "John Doe", "1990-01-01", "Male", "123456789", "1234567890",
////                    "john.doe@example.com", "Bachelor's Degree", "Receptionist", 1000.0));
////            employees.add(new Employee("E002", "Jane Smith", "1995-06-01", "Female", "987654321", "0987654321",
////                    "jane.smith@example.com", "College Degree", "Supervisor", 2000.0));
////
////            // Khởi tạo và quản lý danh sách khách hàng
////            List<Customer> customers = new ArrayList<>();
////            customers.add(new Customer("C001", "David Johnson", "1985-03-15", "Male", "111222333", "0912345678",
////                    "david.johnson@example.com", "Gold", "123 Example Street, City"));
////
////            // Khởi tạo và quản lý danh sách booking
////            List<Booking> bookings = new ArrayList<>();
////            bookings.add(new Booking("B001", "2023-01-01", "2023-01-31", "C001", "Villa01", "Yearly"));
////            bookings.add(new Booking("B002", "2023-02-01", "2023-02-28", "C001", "House01", "Monthly"));
////
////            // Khởi tạo và quản lý danh sách hợp đồng
////            List<Contract> contracts = new ArrayList<>();
////            contracts.add(new Contract("CON001", "B001", 500.0, 1000.0, "C001"));
////            contracts.add(new Contract("CON002", "B002", 200.0, 800.0, "C001"));
////
////            // Các chức năng khác của hệ thống
////            // ...
////        }
////    }
////
////}
//
//package controllers;
//
//import java.util.Scanner;
//
//public class FuramaController {
//    private Scanner scanner = new Scanner(System.in);
//
//    public void displayMainMenu() {
//        int choice;
//        do {
//            System.out.println("-----Furama Resort Management System-----");
//            System.out.println("1. Employee Management");
//            System.out.println("2. Customer Management");
//            System.out.println("3. Facility Management");
//            System.out.println("4. Booking Management");
//            System.out.println("5. Promotion Management");
//            System.out.println("6. Exit");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    employeeManagement();
//                    break;
//                case 2:
//                    customerManagement();
//                    break;
//                case 3:
//                    facilityManagement();
//                    break;
//                case 4:
//                    bookingManagement();
//                    break;
//                case 5:
//                    promotionManagement();
//                    break;
//                case 6:
//                    System.out.println("Exiting the program...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 6);
//    }
//
//    private void employeeManagement() {
//        int choice;
//        do {
//            System.out.println("-----Employee Management-----");
//            System.out.println("1. Display list employees");
//            System.out.println("2. Add new employee");
//            System.out.println("3. Edit employee");
//            System.out.println("4. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    // Display list employees
//                    break;
//                case 2:
//                    // Add new employee
//                    break;
//                case 3:
//                    // Edit employee
//                    break;
//                case 4:
//                    System.out.println("Returning to main menu...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 4);
//    }
//
//    private void customerManagement() {
//        int choice;
//        do {
//            System.out.println("-----Customer Management-----");
//            System.out.println("1. Display list customers");
//            System.out.println("2. Add new customer");
//            System.out.println("3. Edit customer");
//            System.out.println("4. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    // Display list customers
//                    break;
//                case 2:
//                    // Add new customer
//                    break;
//                case 3:
//                    // Edit customer
//                    break;
//                case 4:
//                    System.out.println("Returning to main menu...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 4);
//    }
//
//    private void facilityManagement() {
//        int choice;
//        do {
//            System.out.println("-----Facility Management-----");
//            System.out.println("1. Display list facility");
//            System.out.println("2. Add new facility");
//            System.out.println("3. Display list facility maintenance");
//            System.out.println("4. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    // Display list facility
//                    break;
//                case 2:
//                    // Add new facility
//                    break;
//                case 3:
//                    // Display list facility maintenance
//                    break;
//                case 4:
//                    System.out.println("Returning to main menu...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 4);
//    }
//
//    private void bookingManagement() {
//        int choice;
//        do {
//            System.out.println("-----Booking Management-----");
//            System.out.println("1. Add new booking");
//            System.out.println("2. Display list booking");
//            System.out.println("3. Create new contracts");
//            System.out.println("4. Display list contracts");
//            System.out.println("5. Edit contracts");
//            System.out.println("6. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    // Add new booking
//                    break;
//                case 2:
//                    // Display list booking
//                    break;
//                case 3:
//                    // Create new contracts
//                    break;
//                case 4:
//                    // Display list contracts
//                    break;
//                case 5:
//                    // Edit contracts
//                    break;
//                case 6:
//                    System.out.println("Returning to main menu...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 6);
//    }
//
//    private void promotionManagement() {
//        int choice;
//        do {
//            System.out.println("-----Promotion Management-----");
//            System.out.println("1. Display list customers use service");
//            System.out.println("2. Display list customers get voucher");
//            System.out.println("3. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    // Display list customers use service
//                    break;
//                case 2:
//                    // Display list customers get voucher
//                    break;
//                case 3:
//                    System.out.println("Returning to main menu...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 3);
//    }
//}
//
//package controllers;
//
//        import entities.Employee;
//        import entities.Customer;
//        import entities.Facility;
//        import entities.Booking;
//        import services.EmployeeServiceImpl;
//        import services.CustomerServiceImpl;
//        import services.FacilityServiceImpl;
//        import services.BookingServiceImpl;
//
//        import java.util.Scanner;
//
//public class FuramaController {
//    private Scanner scanner = new Scanner(System.in);
//    private EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
//    private CustomerServiceImpl customerService = new CustomerServiceImpl();
//    private FacilityServiceImpl facilityService = new FacilityServiceImpl();
//    private BookingServiceImpl bookingService = new BookingServiceImpl();
//
//    public void displayMainMenu() {
//        int choice;
//        do {
//            System.out.println("-----Furama Resort Management System-----");
//            System.out.println("1. Employee Management");
//            System.out.println("2. Customer Management");
//            System.out.println("3. Facility Management");
//            System.out.println("4. Booking Management");
//            System.out.println("5. Promotion Management");
//            System.out.println("6. Exit");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    employeeManagement();
//                    break;
//                case 2:
//                    customerManagement();
//                    break;
//                case 3:
//                    facilityManagement();
//                    break;
//                case 4:
//                    bookingManagement();
//                    break;
//                case 5:
//                    promotionManagement();
//                    break;
//                case 6:
//                    System.out.println("Exiting the program...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 6);
//    }
//
//    private void employeeManagement() {
//        int choice;
//        do {
//            System.out.println("-----Employee Management-----");
//            System.out.println("1. Display list employees");
//            System.out.println("2. Add new employee");
//            System.out.println("3. Edit employee");
//            System.out.println("4. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    employeeService.displayEmployees();
//                    break;
//                case 2:
//                    Employee newEmployee = createEmployee();
//                    employeeService.addEmployee(newEmployee);
//                    break;
//                case 3:
//                    System.out.println("Enter the ID of the employee to edit:");
//                    int employeeId = scanner.nextInt();
//                    scanner.nextLine(); // Consume newline character
//                    employeeService.editEmployee(employeeId);
//                    break;
//                case 4:
//                    System.out.println("Returning to main menu...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 4);
//    }
//
//    private Employee createEmployee() {
//        System.out.println("Enter the employee ID:");
//        int id = scanner.nextInt();
//        scanner.nextLine(); // Consume newline character
//        System.out.println("Enter the employee name:");
//        String name = scanner.nextLine();
//        System.out.println("Enter the employee age:");
//        int age = scanner.nextInt();
//        scanner.nextLine(); // Consume newline character
//        System.out.println("Enter the employee address:");
//        String address = scanner.nextLine();
//        System.out.println("Enter the employee position:");
//        String position = scanner.nextLine();
//        System.out.println("Enter the employee salary:");
//        double salary = scanner.nextDouble();
//        scanner.nextLine(); // Consume newline character
//
//        return new Employee(id, name, age, address, position, salary);
//    }
//
//    private void customerManagement() {
//        int choice;
//        do {
//            System.out.println("-----Customer Management-----");
//            System.out.println("1. Display list customers");
//            System.out.println("2. Add new customer");
//            System.out.println("3. Edit customer");
//            System.out.println("4. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    customerService.displayCustomers();
//                    break;
//                case 2:
//                    Customer newCustomer = createCustomer();
//                    customerService.addCustomer(newCustomer);
//                    break;
//                case 3:
//                    System.out.println("Enter the ID of the customer to edit:");
//                    int customerId = scanner.nextInt();
//                    scanner.nextLine(); // Consume newline character
//                    customerService.editCustomer(customerId);
//                    break;
//                case 4:
//                    System.out.println("Returning to main menu...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 4);
//    }
//
//    private Customer createCustomer() {
//        System.out.println("Enter the customer ID:");
//        int id = scanner.nextInt();
//        scanner.nextLine(); // Consume newline character
//        System.out.println("Enter the customer name:");
//        String name = scanner.nextLine();
//        System.out.println("Enter the customer age:");
//        int age = scanner.nextInt();
//        scanner.nextLine(); // Consume newline character
//        System.out.println("Enter the customer address:");
//        String address = scanner.nextLine();
//
//        return new Customer(id, name, age, address);
//    }
//
//    private void facilityManagement() {
//        int choice;
//        do {
//            System.out.println("-----Facility Management-----");
//            System.out.println("1. Display list facilities");
//            System.out.println("2. Add new facility");
//            System.out.println("3. Display list facilities for maintenance");
//            System.out.println("4. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline character
//
//            switch (choice) {
//                case 1:
//                    facilityService.displayFacilities();
//                    break;
//                case 2:
//                    Facility newFacility = createFacility();
//                    facilityService.addFacility(newFacility);
//                    break;
//                case 3:
//                    facilityService.displayFacilitiesForMaintenance();
//                    break;
//                case 4:
//                    System.out.println("Returning to main menu...");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//                    break;
//            }
//        } while (choice != 4);
//    }
//
//    private Facility createFacility() {
//        // Implement facility creation based on facility type (villa, house, room)
//    }
//
//    private void bookingManagement() {
//        int choice;
//        do {
//            System.out.println("-----Booking Management-----");
//            System.out.println("1. Add new booking");
//            System.out.println("2. Display list bookings");
//            System.out.println("3. Create new contracts");
//            System.out.println("4. Display list contracts");
//            System.out.println("5. Edit contracts");
//            System.out.println("6. Return to main menu");
//            System.out.println("Please enter your choice:");
//            choice = scanner
