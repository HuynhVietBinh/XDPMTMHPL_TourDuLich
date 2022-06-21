/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Win 10
 */
public class AutoCreateID {
   
//    public static void main(String[] args) {
//	String str = "Hello World";
//        String id = "";
//        AutoID(str, id);
//    }
    public AutoCreateID(){
    
    }
    public static String AutoID(String str, String id){
        id = "";
        str = str.replaceAll("\\s\\s+", " ").trim();
        id = Character.toString(str.charAt(0)).toUpperCase();
        for(int i = 0; i < str.length(); i++){
            if((Character.toString(str.charAt(i))).equals(" ")){
                id = id + Character.toString(str.charAt(i+1)).toUpperCase();
            }
        }
        return id;
    }
}
