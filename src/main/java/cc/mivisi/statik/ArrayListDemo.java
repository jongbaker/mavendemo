package cc.mivisi.statik;

import java.util.ArrayList;
import java.util.Arrays;

/**  
 * ClassName:ArrayListDemo <br/>  
 * Function:  <br/>  
 * Date:     2018年10月20日 下午11:30:47 <br/>       
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < 3; i++) {
            list.add(String.valueOf(i));
            
        }
        list.set(2, "hallo world");
        System.out.println("list size :"+list);
    }
}
  
