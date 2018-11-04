package cc.mivisi;

import java.util.Arrays;
import java.util.Random;

/**  
 * ClassName:SortDemo <br/>  
 * Function:  <br/>  
 * Date:     2018年10月18日 上午1:26:07 <br/>       
 */
public class SortDemo {
    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i <10; i++) {
            int random = (int) (Math.random()*10);
            a[i]=random;
        }
        System.out.println("before"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("before"+Arrays.toString(a));
    }
}
  
