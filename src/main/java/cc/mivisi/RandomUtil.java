package cc.mivisi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * add description
 * @author myvisi  
 * date: 2018年8月14日 上午1:27:36
 */
public class RandomUtil {
    
    //对于集合有二个方式加载，第一种，使用InitializingBean接口在方法中初始化
    //对于第二种，就是直接写死
    String[] strs ={
      "我是一号",      
      "我是2号",      
      "我是3号",      
      "我是4号",      
      "我是5号",      
      "我是6号",      
    };
    
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        int random = getRandom(list);
        System.out.println("random---------"+random);
    }
    
    
    
    
    /**
     * 
     * 获取一个集合类型的坐标随机数 
     * @param str 传入的集合 
     * @return 返回随机数
     */
    public static int getRandom(List<Object> str ){
        double random = Math.random();
        double floor = Math.floor(random*str.size());
        return (int) floor;
    }
    
    /**
     * 
     * 获取一个集合类型的坐标随机数 
     *  此方法会创建对象，不合适
     * @param str 出入集合
     * @return
     */
    public static int getRandomWorse(List<Object> str ){
        Random random = new Random();
        int nextInt = random.nextInt(str.size());
        return nextInt;
    }

}
  
