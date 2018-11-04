package cc.mivisi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import com.alibaba.fastjson.support.spring.PropertyPreFilters;

/**
 * ClassName:TransientDemo <br/>
 * Function: 屏蔽字段序列化的四种方式 Date: transient，@JSONType，@JSONField，SimplePropertyPreFilter(指定序列化的字段，无则全部序列化
 * )
 */
public class TransientJsonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        SimplePropertyPreFilter sm =
                new SimplePropertyPreFilter(Person.class, new String[] {"hobby"});
        String jsonString = JSON.toJSONString(person, sm);
        System.out.println("-----" + jsonString);
    }

}

@JSONType(ignores = {"sex", "grade"})
class Person {
    // transient 关键词
    private transient int age = 10;

    // 字段
    @JSONField(serialize = false)
    private String name = "lisi";

    private String grade = "middle";

    private String sex = "men";

    private String hobby = "football";

    private String married = "yes";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

}
