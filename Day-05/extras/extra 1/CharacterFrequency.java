import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking the sentence as Input
        System.out.println("Enter The String");
        String s = sc.nextLine();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else map.put(s.charAt(i),1);
        }

        char ans = s.charAt(0);

        for(Character key : map.keySet()){
            if(map.get(ans)<map.get(key)){
                ans = key;
            }
        }

        System.out.println("Most Frequent Character " + ans);
    }
}
