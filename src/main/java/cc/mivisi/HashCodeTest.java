package cc.mivisi;  
/**  
 * ClassName:HashCodeTest <br/>  
 * Function:  <br/>  
 * Date:     2018年9月24日 下午1:50:31 <br/>       
 */
public class HashCodeTest {

     public static void main(String[] args) {
        int a = 25860399;
        int length = 16;
        myhash(a, length);
        
    }
     
     private static int myhash(int a,int lenght){
         System.out.println(a&(lenght-1));
         System.out.println(a%lenght);
        return lenght;
         
     }
}
  
