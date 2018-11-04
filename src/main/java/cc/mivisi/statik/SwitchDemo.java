package cc.mivisi.statik;  
/**  
 * ClassName:SwitchDemo <br/>  
 * Function:  <br/>  
 * Date:     2018年10月29日 下午11:06:55 <br/>       
 */
public class SwitchDemo {
    String a="a";
    String b="b";
    String c="c";
    String d="d";

    public static void main(String[] args) {
       String arg="a";
    String back=get(arg);
    }

    private static String get(String arg) {
          switch (arg) {
            case "a" :case "b":
                break;

            default:
                break;
        }
        
        return null;
    }
}
  
