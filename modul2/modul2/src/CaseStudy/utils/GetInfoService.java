//package casestudy.utils;
//
//import java.util.Scanner;
//
//public class GetInfoService {
//    private static Scanner scanner = new Scanner(System.in);
//    public static String getIdService() {
//        String regex = "^(SVVL|SVHO|SVRO)-[0-9]{4}$";
//        String idService;
//        do {
//            idService = scanner.nextLine();
//            if (!idService.matches(regex)) {
//                System.out.println("Please re-enter: SVVL-XXXX or SVHO-XXXX or SVRO-XXXX");
//            }
//        } while (!idService.matches(regex));
//        return idService;
//    }
//    public static String getIdService(String code) {
//        String regex = "^SV" + code + "-\\d{4}";
//        String id;
//        do {
//            id = scanner.nextLine();
//            if (!id.matches(regex)) {
//                System.out.println("Wrong format, re-enter: SV" + code + "-XXXX");
//            }
//        } while (!id.matches(regex));
//        return id;
//    }
//    public static String getText() {
//        String regex = "^[A-Z][a-z]*(\\s+[a-z]*)*";
//        String text;
//        do {
//            text = scanner.nextLine();
//            if (!text.matches(regex)) {
//                System.out.println("You must capitalize the first letters!!!");
//            }
//        } while (!text.matches(regex));
//        return text;
//    }
//
//    public static double getAcreage() {
//        boolean correct = false;
//        double acreage = 0;
//        do {
//            try {
//                acreage = Double.parseDouble(scanner.nextLine());
//                if (acreage > 30) {
//                    correct = true;
//                } else {
//                    correct = false;
//                    System.out.println("The acreage must be greater than 30m2");
//                }
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//                correct = false;
//                System.out.println("Error!!! Please re-enter ");
//            }
//        } while (!correct);
//        return acreage;
//    }
//
//    public static double getExpense() {
//        boolean correct = false;
//        double expense = 0;
//        do {
//            try {
//                expense = Double.parseDouble(scanner.nextLine());
//                if (expense > 0) {
//                    correct = true;
//                } else {
//                    correct = false;
//                    System.out.println("The acreage must be greater than 0");
//                }
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//                correct = false;
//                System.out.println("Error!!! Please re-enter ");
//            }
//        } while (!correct);
//        return expense;
//    }
//
//    public static int getNumber() {
//        int number = 0;
//        boolean correct = false;
//        do {
//            try {
//                number = Integer.parseInt(scanner.nextLine());
//                if (number > 0) {
//                    correct = true;
//                } else {
//                    correct = false;
//                    System.out.println("You must enter a number greater than 0!!!");
//                }
//            } catch (NumberFormatException e) {
//                correct = false;
//                System.out.println("You must enter a number greater than 0!!!");
//            }
//        } while (!correct);
//        return number;
//    }
//
//    public static int getNumberPerson() {
//        int number = 0;
//        boolean correct = false;
//        do {
//            try {
//                number = Integer.parseInt(scanner.nextLine());
//                if (number > 0 && number < 20) {
//                    correct = true;
//                } else {
//                    correct = false;
//                    System.out.println("You must enter a number greater than 0 and less than 20!!!");
//                }
//            } catch (NumberFormatException e) {
//                correct = false;
//                System.out.println("You must enter a number greater than 0 and less than 20!!!");
//            }
//        } while (!correct);
//        return number;
//    }
//}
