package cc.mivisi;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:StaticCodeDemo <br/>
 * Function: <br/>
 * Date: 2018年9月28日 上午1:14:01 <br/>
 */
public class StaticCodeDemo {
    public static void main(String[] args) {
        Myson myson = new Myson();
    }

}

class Myson {


    public Myson() {
        super();
        System.out.println("third--->constructor");
    }
    public Mynephew map = new Mynephew();
    static {
        System.out.println("first--->static");
    }
}

class Mynephew {

    public Mynephew() {
        System.out.println("second--->Mynephew");
    }

}
