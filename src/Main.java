// Password Validator
// Write a function taking a as password
// and returning `boolean` if: `String`

import java.util.Scanner;

public class Main {
    public static boolean checkPswd(String p){
        String password = "money" ;
        return ( password.equals(p) ) ;

    }
    public static void main(String[] args){
        System.out.println (checkPswd("money"));

    }


}
