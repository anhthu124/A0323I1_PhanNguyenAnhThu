package dienThoai.docghifile;

import dienThoai.model.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public List<DanhBa> ReadFile(){
        List<DanhBa>danhBas=new ArrayList<>();
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader("D:\\Skill\\codegym\\model\\modul2\\modul2\\src\\dienThoai\\data\\contacts.csv"))){
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                if(line.trim().equals(" ")){
                    continue;
                }
                String []result=line.split(",");
                String name=result[0];
                int phonnumber=Integer.parseInt(result[1]);
                String address=result[2];
                String email=result[3];
                String facbook=result[4];
                DanhBa danhBa=new DanhBa(name,phonnumber,address,email,facbook);
                danhBas.add(danhBa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return danhBas;
    }


    public void WriteFile(List<DanhBa>danhBas,boolean b){
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("src\\data\\contacts.csv"))){
            for (DanhBa e:danhBas) {
                bufferedWriter.write(e.toString());
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
