package gov.iti.jets.creationaldesignpattern.Prototype;

import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Ahmed Yassin
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emps = new Employee();
        emps.loadData(); //ahmed yassin mahmoud aya

        //Use the clone method to get the Employee object
        Employee empsNew = (Employee) emps.clone(); //ahmed yassin mahmoud aya
        Employee empsNew1 = (Employee) emps.clone(); //ahmed yassin mahmoud aya
        List<String> list = empsNew.getEmpList();  //ahmed yassin mahmouud aya
        list.add("eman");// ahmed yassin mahmoud aya eman
        List<String> list1 = empsNew1.getEmpList();//ahmed yassin mahmoud aya
        list1.remove("aya");//ahmed yassin mahmoud

        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("empsNew List: " + list);
        System.out.println("empsNew1 List: " + list1);

    }

}
