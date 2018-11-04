package cc.mivisi;

/**
 * ClassName:EnumDemo <br/>
 * Function: <br/>
 * Date: 2018年10月21日 下午12:40:37 <br/>
 */
enum EnumDemos {
    SMALL, MIDDLE, LARGE

}

public class EnumDemo {
    private int age;
    
    public EnumDemo(int age) {
        super();
        this.age = age;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        System.out.println("---->"+EnumDemos.SMALL.toString().toLowerCase());
        
        EnumDemo enumDemo = new EnumDemo(2);
        System.out.println("class--->"+enumDemo.getClass());
        System.out.println("class--->"+enumDemo.getClass().getName());
        //调用的是无参构造
        EnumDemo newInstance = enumDemo.getClass().newInstance();
        System.out.println("-->"+enumDemo);
        System.out.println("-->"+newInstance);
    }
}
