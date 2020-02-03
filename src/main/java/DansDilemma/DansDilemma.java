package DansDilemma;

import java.util.*;

public class DansDilemma {
	
	public void addTwo(Double input1, Double input2,Set<Double> set)
	{
		set.add((double)(input1/input2));
        set.add((double)(input2/input1));
        set.add((double)(input1+input2));
        set.add((double)(input1*input2));
        set.add((double)(input1-input2));
        set.add((double)(input2-input1));
        
	}

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> set=new HashSet<Double>();
        set.add((double)(input1/input2));
        set.add((double)(input2/input1));
        set.add((double)(input1+input2));
        set.add((double)(input1*input2));
        set.add((double)(input1-input2));
        set.add((double)(input2-input1));
        
        return set.size();
        
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        Double[] input_array= {input1,input2,input3};
        Set<Double> set=new HashSet<Double>();
        
        for(int i=0;i<3;++i)
        {
        	for(int j=i+1;j<3;++j)
        	addTwo(input_array[i],input_array[j],set);
        }
        
        
        return set.size();
    }

    public Integer dilemmaOfN(Double... args){
        
           Set<Double> set=new HashSet<Double>();
           
           for(int i=0;i<args.length;++i)
        	   for(int j=i+1;j<args.length;++j)
        	   {
        		   addTwo(args[i],args[j],set);
        	   }
           
           return set;
    }
}
