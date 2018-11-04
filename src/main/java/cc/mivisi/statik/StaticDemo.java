package cc.mivisi.statik;  
/**  
 * ClassName:StaticDemo <br/>  
 * Function:  <br/>  
 * Date:     2018年10月19日 下午8:34:34 <br/>       
 */
public class StaticDemo {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setHeight(110);
        animal.setName("sz");
        System.out.println(animal);
        Animal animal2 = new Animal();
        System.out.println("animai2"+ animal2);
    }
}
  
