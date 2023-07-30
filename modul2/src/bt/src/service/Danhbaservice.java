package service;


import docghifile.ReadAndWrite;
import model.DanhBa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Danhbaservice {
    List<DanhBa>danhBas=new ArrayList<>();
    Scanner nhap=new Scanner(System.in);
    ReadAndWrite readAndWrite=new ReadAndWrite();

    public void addNew(){
        DanhBa danhBa=new DanhBa();
        danhBa.input();
        danhBas.add(danhBa);
    }

    public void disPlay(){
        for (DanhBa e:danhBas) {
            System.out.println(e.toString());
        }
    }

    public void Edit(){
        System.out.print("Nhap vao so danh ba can edit:");
        int search=Integer.parseInt(nhap.nextLine());
        int dem=0;
        for (int i = 0; i <danhBas.size() ; i++) {
            if(danhBas.get(i).getPhonenumber()==search){
                System.out.println("Nhap sua lai ten:");
                danhBas.get(i).setName(nhap.nextLine());
                System.out.println("Nhap sua lai dia chi:");
                danhBas.get(i).setAddress(nhap.nextLine());
                System.out.println("Nhap sua lai email:");
                danhBas.get(i).setEmail(nhap.nextLine());
                System.out.println("Nhap sua lai facbook:");
                danhBas.get(i).setFacbook(nhap.nextLine());
                dem++;
            }
        }
        if(dem!=0){
            System.out.println("Edit successfull");
        }else {
            System.out.println("Not found!!!");
        }
    }


    public void Remove(){
        System.out.print("Nhap vao so danh ba can xoa:");
        int search=Integer.parseInt(nhap.nextLine());
        int dem=0;
        for (int i = 0; i <danhBas.size() ; i++) {
            if (danhBas.get(i).getPhonenumber()==search){
                danhBas.remove(i);
                dem++;
            }
        }
        if(dem!=0){
            System.out.println("Remove successfull!!");
        }else {
            System.out.println("Not found!!!");
        }
    }


    public void Find(){
        System.out.print("Nhap vao  ten can tim:");
        String search=nhap.nextLine();
        int dem=0;
        for (int i = 0; i <danhBas.size() ; i++) {
            if (danhBas.get(i).getName().equals(search)){
                search= String.valueOf(danhBas.get(i));
                dem++;
            }
        }
        if(dem!=0){
            System.out.println("Find successfull!!");
            System.out.println(search);
        }else {
            System.out.println("Not found!!!");
        }
    }


    public void WritetoFile(){
        readAndWrite.WriteFile(danhBas,true);
        System.out.println("Write successfull");
    }

    public void ReadFromFile(){
        danhBas=readAndWrite.ReadFile();
        for (DanhBa e:danhBas) {
            danhBas.contains(e);
            System.out.println(e.toString());
        }
        System.out.println(" successfull");
    }
}
