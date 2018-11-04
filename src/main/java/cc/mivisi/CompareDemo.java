package cc.mivisi;

import java.util.Arrays;

/**  
 * ClassName:CompareDemo <br/>  
 * Function:  <br/>  
 * Date:     2018年10月18日 上午12:47:24 <br/>       
 */
public class CompareDemo {
    public static void main(String[] args) {
        Integer a = 8;
        Integer b = 9;
        int compareTo = a.compareTo(b);
        System.out.println(compareTo);
        
        System.out.println("args"+Arrays.toString(args));
        System.out.println(System.getProperty("testvm"));//有固定写法，java命令参数
    }
}
  
