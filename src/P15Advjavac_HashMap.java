import java.util.HashMap;

public class P15Advjavac_HashMap {

    public static void main(String[] args) {
        int a[] ={1,2,3,4,2,5,6,3,4,5,1};
        HashMap<Integer,Integer> m= new HashMap<>();
    int i=0;

    // putting the string 'p' in the map;
        while(i<a.length)
        {
            if(m.containsKey(a[i]))
            {
                int of=m.get(a[i]);
                int nf= of+1;
                m.put(a[i],nf);
                i++;
            }

            else
            {
                 m.put(a[i],1);
                i++;
            }
        }

      int count= m.size();

        // sliding
        int k=0;
        while(k<a.length)
        {

        }



    }
}
