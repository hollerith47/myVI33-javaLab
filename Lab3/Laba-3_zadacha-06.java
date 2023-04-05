package dz10;
 
public class Main {
    public static void main(String[] args)
    {
    
        String t = "Activity";
        String d = "abcde";
        String l = "AbcyrZ";
        
int c;
        for(int i=0;i<t.length() ; i++)
        {
            if(t.codePointAt(i)<t.codePointAt(i+1))
            {
                c = t.codePointAt(i);
                if(c<t.length())
                {
                    break;
                }
                if(c==t.length())
                {
                    System.out.println(t);
                }
            }
        }
 
        
int k;  
for(int i=0;i<d.length() ; i++)
{
    if(d.codePointAt(i)<d.codePointAt(i+1))
    {
        k = d.codePointAt(i);
        if(k<d.length())
        {
            break;
        }
        if(k==d.length())
        {
            System.out.println(d);
        }
    }
}
        
        
        
int v;  
for(int i=0;i<l.length() ; i++)
{
    if(l.codePointAt(i)<l.codePointAt(i+1))
    {
        v = l.codePointAt(i);
        if(v<l.length())
        {
            break;
        }
        if(v==l.length())
        {
            System.out.println(l);
        }
    }
}
    
}
}