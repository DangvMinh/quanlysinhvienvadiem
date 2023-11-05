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
public class SinhVienDAO {
    public static List<SinhVien> ls = new ArrayList<>();
 
    public int add(SinhVien sv){
        ls.add(sv);
        return 1;
    }
    public List<SinhVien> getAllSinhVien(){
        return ls;
    }
    public int delSinhVienByID(String ma){
        for (SinhVien sv : ls) {
            if(sv.getMaSV().equalsIgnoreCase(ma)){
                ls.remove(sv);
                return 1;
            }
        }
        return -1;
    }
    public SinhVien getSinhVienByID(String id){
        for (SinhVien sv : ls) {
            if(sv.getMaSV().equalsIgnoreCase(id)){
                return sv;
            }
        }
        return null;
    }
    public int updateSinhVienByID(SinhVien svNew){
        for (SinhVien sv : ls) {
            if(sv.getMaSV().equalsIgnoreCase(svNew.getMaSV())){
                sv.setDiaChi(svNew.getDiaChi());
                sv.setGioiTinh(sv.isGioiTinh());
                sv.setAnh(svNew.getAnh());
                sv.setNgaySinh(svNew.getNgaySinh());
                sv.setTenSV(svNew.getTenSV());
                return 1;
            }
        }
        return -1;
    }
}
