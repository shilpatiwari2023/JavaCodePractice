package src.main.java.string;

import java.sql.SQLOutput;

public class RemoveLeadingZero {
    public static void main(String[] args) {
        String str = "0000012345";
        //StringBuffer sb1 = new StringBuffer(str);
        //System.out.println(sb1.replace(0,5,""));
        str = removeZeroFromStart(str);
        System.out.println("Result string without zero is : " + str);
    }

    private static String removeZeroFromStart(String str) {
        StringBuffer sb = new StringBuffer(str);
        int endIndex = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='0'){
                endIndex = i;
            } else {
                break;
            }
        }
        sb.replace(0, endIndex+1,"");
        return sb.toString();
    }

}
