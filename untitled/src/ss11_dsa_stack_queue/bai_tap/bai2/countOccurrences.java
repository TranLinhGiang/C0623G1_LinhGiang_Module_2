package ss11_dsa_stack_queue.bai_tap.bai2;

import java.util.Map;
import java.util.TreeMap;

public class countOccurrences {
    public static void main(String[] args) {
        String st1= "chÚng tA cỦa hiỆn tạI có TấT cẢ NhưNG khÔNg có ChÚNG ta.";
        String[] arrST= st1.split(" ");
        System.out.println("when not converted: "+ st1);
        System.out.println("after converting to uppercase: "+st1.toUpperCase());

        Map<String,Integer> map = new TreeMap<String,Integer>();

        for (String s:arrST) {
            if(map.containsKey(s)){
                Integer value = map.get(s);
                value++;
                map.replace(s,value);
            }else {
                map.put(s,1);
            }
        }
        System.out.println("Count the number of occurrences: "+map.toString().toUpperCase());
    }

}
