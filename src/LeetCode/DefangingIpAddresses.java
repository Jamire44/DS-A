package LeetCode;/* Created by: Jamie
 * Created on:{03/02/2024}
 * This is a program is:
 */

public class DefangingIpAddresses {

    public static String defangIPaddr(String address) {
        for(int i = 0; i < address.length(); i++){
            if(address.indexOf(i) == '.'){
                System.out.print("[.]");
            }
        }
        return address;
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

}//class
