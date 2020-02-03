package Collections;

import java.util.ArrayList;
import java.util.*;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        
    	for(int i=0;i<list2.size();++i)
    	{
    		Integer tmp_val=list2.get(i);
    		list1.add(tmp_val);
    	}
    	return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
          
    	Integer sum=0;
           
           for(int i=0;i<list1.size();++i)
           {
        	  sum+=list1.get(i);
           }
           
           for(int i=0;i<list2.size();++i)
           {
        	   sum+=list2.get(i);
           }
           
           return sum;
           
           
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        
    	ArrayList<Integer> retArray=new ArrayList<Integer>();
    	
    	for(int i=0;i<original.size();++i)
    	{
    		if(original.get(i)==toRemove)
    		{
    			retArray.add(original.get(i));
    		}
    	}
    	
    	return retArray;
        
        
    }

    public boolean happyList(ArrayList<String> original) {
        return false;
    }
}
