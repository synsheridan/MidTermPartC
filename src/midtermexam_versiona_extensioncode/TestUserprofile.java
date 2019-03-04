/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author Enan
 */
public class TestUserprofile {
    
    public static void main(String[] args)
    { 
        UserProfile a = new UserProfile();
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String nameid = in.nextLine();
        System.out.print("Please enter your favourite Genre : 1.Comedy 2.Drama 3.Action 4.Mystery: ");
        String choosegenre = in.nextLine();
        a.setUserID(nameid);
        a.setGenre(choosegenre);
        System.out.println("your name: " + a.getUserID());
        System.out.println("your favourite Genre : " + a.getGenre());
        
    }
}
