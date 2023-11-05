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
public class UserDAO {//class khai báo dữ liệu
    List<User> ls = new ArrayList<>(); 
    public UserDAO(){
        ls.add(new User("admin", "12345", true));
        ls.add(new User("minh", "123", true));
        ls.add(new User("hop1", "12345", true));
        ls.add(new User("admin1", "12345", true));
        ls.add(new User("admin2", "12345", true));
    }
    public boolean checkLogin(String username, String pass){
        /* kiểm tra xem đối tượng hiện tại có giống với đối tượng được truyền vào không
          true nếu giống, ngược lại false nếu khác */
        for (User u : ls) {// gọi tấc cả danh sách
            if(u.getUsername().equals(username)&& u.getPassword().equals(pass)){
                return true;// giống danh sách đã khai báo
            }
        }
        return false;// khác danh sách đã khai báo
                
    }
}

