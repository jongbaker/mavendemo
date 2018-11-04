package cc.mivisi;

import java.io.Console;
import java.util.Scanner;

/**  
 * ClassName:ConsoleInputDemo <br/>  
 * Function:  <br/>  
 * Date:     2018年10月10日 上午1:16:43 <br/>       
 */
public class ConsoleInputDemo {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name");
        String name =scanner.nextLine();
        System.out.println("my name is "+name);
        
    }

}
  
