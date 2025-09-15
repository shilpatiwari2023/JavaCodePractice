package src.main.java.Practice;

import java.util.HashMap;
import java.util.Map;

public class RemoveNumberAndCountFrequency {
    public static void main(String[] args) {
        String str = "w8gqojeqb79kczoukcem5piz5y852wjnkc0tj5stb6cb1ty3yz";
        str = str.replaceAll("[^(a-z)(A-Z)]","");
        System.out.println(str);
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>=1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
