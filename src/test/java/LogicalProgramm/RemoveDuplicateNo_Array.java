package LogicalProgramm;

import java.util.HashMap;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDuplicateNo_Array {
    @Test
    public void remove_dulicate(){

        int [] ar = { 1, 1 ,2 ,3 ,2 ,4 ,5, 4 ,3, 4};

        HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();

        for ( int i=0; i<=ar.length-1; i++){
            int s1 = ar[i];

            if (map.containsKey(s1)){
                map.put(s1, map.get(s1)+1);
            }else{
                map.put(s1, 1);
            }
        }

        System.out.println(map);  // here you will get all no 

        Set<Integer> k = map.keySet();

        for (Integer key : k){
            if(map.get(key)>1){    // here remove duplicate
                System.out.println(key + " : " + map.get(key));
            }
        }




    }

}
