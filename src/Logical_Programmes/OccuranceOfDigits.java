package Logical_Programmes;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfDigits
{
    public static void main(String[] args) {
        int list[] = {1,1,2,1,3,2,9,5,4,5,6,5,};

        Map<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<list.length;i++)
        {
            if (!map.containsKey(list[i]))
            {
                map.put(list[i],1);
            }
            else
            {
                map.put(list[i],map.get(list[i])+1);
            }
        }

        for (Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            //occcuances of char
            System.out.println(entry.getKey()+"--->>>"+entry.getValue());

            if (entry.getValue()==1)
            {
                System.out.println("Unique char is "+entry.getKey()+"--->>"+entry.getValue());

            }

        }













    }

}
