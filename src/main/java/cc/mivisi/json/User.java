package cc.mivisi.json;  
/**  
 * ClassName:User <br/>  
 * Function:  <br/>  
 * Date:     2018年8月28日 上午1:37:09 <br/>       
 */
public class User {
    int age;
    String sex;
    String name;
    
    public User(String sex,int age,  String name) {
        super();
        this.age = age;
        this.sex = sex;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
  
