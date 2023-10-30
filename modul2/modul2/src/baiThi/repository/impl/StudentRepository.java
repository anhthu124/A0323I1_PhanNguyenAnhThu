//package baiThi.repository.impl;
//
//import baiThi.model.Student;
//import baiThi.repository.IStudentRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class StudentRepository implements IStudentRepository {
//
//    private static final String PATH_STUDENT = "D:\Skill\codegym\model\modul2\modul2\src\baiThi\data\student.csv";
//
//    @Override
//    public List<ss8_mvc.model.Student> getListStudent() {
//        List<ss8_mvc.model.Student> studentList = new ArrayList<>();
//        // đọc  file ở đây hoặc kết nối DB
//        List<String> stringList = ReadAndWrite.readCSVFile(PATH_STUDENT);
//        // chuyển thành list student
//        String[] array = null;
//        for (String string: stringList) {
//            array = string.split(",");
//            ss8_mvc.model.Student student = new ss8_mvc.model.Student(Integer.parseInt(array[0]),array[1],array[2]);
//            studentList.add(student);
//        }
////        studentList = ReadAndWrite.readObjecListStudent(PATH_STUDENT_DAT);
//        return studentList;
//    }
//
//    @Override
//    public List<baiThi.model.Student> searchByName(String searchName) {
//        List<ss8_mvc.model.Student> studentList = getListStudent();
//        List<ss8_mvc.model.Student> searchList = new ArrayList<>();
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getName().contains(searchName)){
//                searchList.add(studentList.get(i));
//            }
//        }
//        return searchList;
//    }
//    @Override
//    public void remove(int e) {
//
//    }
//
//    @Override
//    public List<Student> getAll() {
//        return null;
//    }
//
//    @Override
//    public void add(Student student) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add(student.getInfoToCSV());
//        ReadAndWrite.writeToCSV(PATH_STUDENT,stringList,true);
//    }
//}
