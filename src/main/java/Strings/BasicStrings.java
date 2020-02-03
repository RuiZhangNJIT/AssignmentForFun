package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        
    	return string1+string2;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String ret="";
        for(int i=0;i<string.length();++i)
        	ret+=" ";
        
        return ret;
    }

    public String loudAndClear(String string) {
        String str="";
        for(int i=0;i<string.length();++i)
        {
        	if(Character.isUpperCase(string.charAt(i)))
        	{
        		str+=string.charAt(i);
        	}
        	else
        	{
        		str+=Character.toUpperCase(string.charAt(i));
        	}
        }
        
        return str;
    }

    public String reverseCase(String string) {
          String ret="";
          for(int i=0;i<string.length();++i)
          {
        	  if(Character.isUpperCase(string.charAt(i)))
        	  {
        		  ret+=Character.toLowerCase(string.charAt(i));
        	  }
        	  else
        	  {
        		  ret+=Character.toUpperCase(string.charAt(i));
        		  
        	  }
          }
          
          return ret;
    }

    public String oneAtATime(String string1, String string2) {
        String ret="";
        int ptr_str1=0;
        int ptr_str2=0;
        
        
        while(ptr_str1<string1.length() && ptr_str2<string2.length())
        {
        	if(ptr_str1<=ptr_str2)
        	{
        		ret+=string1.charAt(ptr_str1);
        		ptr_str1++;
        	}
        	else
        	{
        		ret+=string2.charAt(ptr_str2);
        		ptr_str2++;
        	}
        }
        
        return ret;
    }
}
