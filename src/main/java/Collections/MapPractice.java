package Collections;

import java.util.Map;
import java.util.*;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        ArrayList<Object> retArray=new ArrayList<Object>();
        
        for(Map.Entry<Object,Object> entry: map.entrySet() )
        {
        	if(entry.getValue()==value)
        	{
        		retArray.add(entry.getKey());
        	}
        }
        
        return retArray.toArray();
        
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer,Integer> hash_map=new HashMap<Integer,Integer>();
        for(int i=0;i<=size;++i)
        {
        	if(i==0)
        	{
        		hash_map.put(0,1);
        		continue;
        	}
        	
        	if(i==1)
        	{
        		hash_map.put(1,1);
        		continue;
        	}
        	
        	else
        	{
        		hash_map.put(i,hash_map.get(i-1)+hash_map.get(i-2));
        	}
        }
        
        return hash_map;
        
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer,Integer> hash_map=new HashMap<Integer,Integer>();
        
        for(int i=1;i<=size;++i)
        {
        	if(i==1)
        	{
        		hash_map.put(1,first);
        		continue;
         	}
        	
        	if(i==2)
        	{
        		hash_map.put(2,second);
        		continue;
        	}
        	
        	else
        	{
        		hash_map.put(i,hash_map.get(i-1)+hash_map.get(i-2));
        	}
        }
        
        return hash_map;
    }
}
