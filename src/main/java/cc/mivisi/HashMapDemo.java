package cc.mivisi;

import java.util.HashMap;

/**
 * ClassName:HashMapDemo <br/>
 * Function: <br/>
 * Date: 2018年9月24日 下午12:10:40 <br/>
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        
        HashMap<Object, Object> maps = new HashMap<>(1000);
       /* for (int i = 0; i < 1000; i++) {
            maps.put(i, i);
        }*/
        int size = maps.size();
       
        System.out.println("size------->" + size);
    }
}
