// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] c = new int[n];
       int[] v = new int[n];
       for (int i = 0;i<n;i++)
       {
        c[i] = in.nextInt();
        v[i] = 0; //not visited
       }
    int count=0;
  
    
    while(true)
    {
        //everytime find the unvisited city with largest count
    
        int k = maxCountCity(c,v);
        if(k!=-1)
        {
            c[k]--;
            v[k]=1;
            count++;
            for(int j=0;j<n;j++)
            {
                if(j!=k)
                    v[j]=0;//for other cities set its visited to 0
                //System.out.print(v[j]);
            }
            //System.out.println();
        }
        else
            break;
    }
    System.out.println(count);
    }
    public static int maxCountCity(int[] c, int[] v)
    {
        int max = -99;
        int k=0;
        for(int i=0;i<c.length;i++)
        {
            if(v[i]==0 && c[i]>max)
            {
                max=c[i];
                k=i;
            }
             //System.out.print("it: "+c[i]);
        }
        //System.out.println();
        if (max==0)
            return -1;
        else
            return k;
    }
}
