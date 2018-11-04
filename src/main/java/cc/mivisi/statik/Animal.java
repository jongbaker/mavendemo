package cc.mivisi.statik;  
/**  
 * ClassName:Animal <br/>  
 * Function:  <br/>  
 * Date:     2018年10月19日 下午8:34:55 <br/>       
 */
public class Animal {
    private String name;
    private static int height;
    
    
    static{
        System.out.println("static block");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + ", getName()=" + getName() + ", getHeight()=" + getHeight()
                + "]";
    }
    
    
}
  
