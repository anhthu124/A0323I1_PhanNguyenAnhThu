package a.model;

import java.util.Scanner;


public class DanhBa {
    private String name;
    private int phonenumber;
    private String address;
    private String email;
    private String facbook;



    public DanhBa(){}

    public DanhBa(String name, int phonenumber, String address, String email, String facbook) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
        this.email = email;
        this.facbook = facbook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacbook() {
        return facbook;
    }

    public void setFacbook(String facbook) {
        this.facbook = facbook;
    }


    @Override
    public String toString() {
        return "" +  name  +
                "," + phonenumber +
                "," + address  +
                "," + email +
                "," + facbook  ;
    }

    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao ten:");
        this.name=scanner.nextLine();

        boolean isFlag;
        String a = "";
//        do {
            System.out.print("Nhap vao dien thoai :");
//            a =scanner.nextLine();
//            isFlag = a.matches("^[0-9]{10}$");
//        } while (!isFlag);

        this.phonenumber=Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vao dia chi:");
        this.address=scanner.nextLine();
        System.out.print("Nhap vao email:");
        this.email=scanner.nextLine();
        System.out.print("Nhap vao facbook:");
        this.facbook=scanner.nextLine();
    }
}
