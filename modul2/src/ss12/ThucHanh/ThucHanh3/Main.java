package ss12.ThucHanh.ThucHanh3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("So sanh theo ten:");
        Student student=new Student("Kien",30,"HT");
        Student student1=new Student("nam",26,"HT");
        Student student2=new Student("Anh",38,"HT");
        Student student3=new Student("tung",38,"HT");


        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeCompatator ageComparator = new AgeCompatator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
