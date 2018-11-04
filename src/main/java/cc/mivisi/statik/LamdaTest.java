package cc.mivisi.statik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import javax.swing.Timer;

/**  
 * ClassName:LamdaTest <br/>  
 * Function:  <br/>  
 * Date:     2018年11月4日 上午12:46:37 <br/>       
 */
public class LamdaTest {
    public static void main(String[] args) {
        String[] strings=new String[]{"ccc","aaaa","dddd","bb"};
        Arrays.sort(strings);
        System.out.println("strings----->"+Arrays.toString(strings));
        Arrays.sort(strings, (first,second)->first.length()-second.length());
        System.out.println("strings----->"+Arrays.toString(strings));
        
       /* Timer timer = new Timer(1000, a->{});
        Timer timers = new Timer(1000, new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
                // TODO Auto-generated method stub  
                
            }
        });*/
        
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        arrayList.add("9");
        arrayList.forEach(System.out::println);
        
        
    }

}
  
