package cc.mivisi.json;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * ClassName:FastjsonDemo <br/>
 * Function: <br/>
 * Date: 2018年8月28日 上午12:53:12 <br/>
 */
public class FastjsonDemo {
    // 对象转json
    @Test
    public void test01() {
        User user = new User("张三", 18, "男");
        JSONObject json = (JSONObject) JSON.toJSON(user);
        System.out.println(json.toJSONString());
    }

    // List转成JSON数组---意义是什么
    @Test
    public void fun02() {
        List<User> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            User user = new User("张" + i, 10 + i, "男");
            list.add(user);
        }

        JSONArray json = (JSONArray) JSONArray.toJSON(list);
        System.out.println(json.toJSONString());

    }

    // JSON格式字 符串转成Java对象
    @Test
    public void fun03() {
        String str = "{'username':'张0','age':10,'sex':'男'}";
        User user = JSONObject.parseObject(str, User.class);
        System.out.println(user.toString());
    }

    // json格式 字符串转list
    @Test
    public void fun04() {
        String str = "[{'username':'张0','age':10,'sex':'男'},{'username':'张1','age':11,'sex':'男'}]";
        List<User> list = JSONArray.parseArray(str, User.class);
        System.out.println(list.toString());
    }

    // jsonobject,jsonarray 转 字符串
    @SuppressWarnings("null")
    @Test
    public void fun05() {
        JSONArray jsonarray = null;
        JSONObject jsonobject = null;
        //转换为json格式的字符串
        String jsonString = jsonarray.toJSONString();
        String jsonString2 = jsonarray.toJSONString();
    }
    
    // JSONObject对象操作
    @SuppressWarnings("null")
    @Test
    public void fun06() {
        JSONObject jsonobject = null;
        JSONObject jsonObject2 = jsonobject.getJSONObject("result");
        JSONArray jsonArray = jsonobject.getJSONArray("intents");
       JSONObject jsonObject3 = jsonArray.getJSONObject(0);
       
       //JSONObject对象获取
       String skillId = jsonobject.getString("skillId");
       Integer integer = jsonobject.getInteger("code");
        
    }

}
