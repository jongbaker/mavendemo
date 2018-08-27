package cc.mivisi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**  
 * ClassName:TxtToList <br/>  
 * Function:  <br/>  
 * Date:     2018年8月17日 上午12:27:58 <br/>       
 */
public class TxtToList {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("F:\\a.txt")));
        ArrayList<Object> list = new ArrayList<>();
        String ss ="";
        while((ss=bufferedReader.readLine())!=null){
            list.add(ss);
        }
        for (Object object : list) {
            System.out.println(object);
            
        }
    }
}
  
