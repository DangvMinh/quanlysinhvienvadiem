/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dangv
 */
public class GradeDAO {
    List<Grade> ls= new ArrayList<>();
    public int add(Grade d){
        ls.add(d);
        return 1;
    }
    public List<Grade> getAllGrade(){
        return ls;
    }
    public Grade getOneGradeByMaSV(String masv){
        for (Grade d : ls) {
            if(d.getSv().getMaSV().equalsIgnoreCase(masv)){
                return d;
            }
        }
        return null;
    }
    public int updateGrade(Grade dnew){
        for (Grade d : ls) {
            if(d.getSv().getMaSV().equalsIgnoreCase(dnew.getSv().getMaSV())){
                d.setAnhVan(dnew.getAnhVan());
                d.setGdtc(dnew.getGdtc());
                d.setTinHoc(dnew.getTinHoc());
                return 1;
            }
        }
        return -1;
    }
    public int delGrade(String mavs){
        Grade d = getOneGradeByMaSV(mavs);
        if(d!=null){
            ls.remove(d);
            return 1;
        }
        return -1;
    }
}
