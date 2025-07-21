package src.main.java.string;

import java.sql.SQLOutput;

public class RemoveLeadingZero {
    public static void main(String[] args) {
        String str = "0000012345";
        str = removeZeroFromStart(str);
        System.out.println("Result string without zero is : " + str);
    }

    private static String removeZeroFromStart(String str) {
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='0'){
                sb.replace(0,i," ");
            }
        }
        return sb.toString();
    }

}
