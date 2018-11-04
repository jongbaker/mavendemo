package cc.mivisi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import javax.imageio.stream.FileImageInputStream;

import cc.mivisi.entity.Persons;

/**
 * java.io.ObjectInputStream用于读取一组字节，然后转换为对应的对象。
 * 将字节转换为数据结构的过程称为:反序列化;这里就是进行对象的反序列化
 * 读写对象的目的一般有两个:
 * 1:保存对象
 * 2:传输对象
 */


public class ObjectInputStreamDemo {
    private static final String Persons = null;

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("person.obj");
        FileInputStream fis = new FileInputStream(file);
        //ObjectInputStream objectInputStream = new ObjectInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Persons readObject = (Persons)ois.readObject();
        System.out.println("persons"+readObject);
        
        System.out.println("list control");
        //读取list
        FileInputStream fislist = new FileInputStream("personList.obj");
        ObjectInputStream oslist = new ObjectInputStream(fislist);
        List<Persons> persons = (List<Persons>) oslist.readObject();
        System.out.println("personsList"+persons);
    }

}
  
