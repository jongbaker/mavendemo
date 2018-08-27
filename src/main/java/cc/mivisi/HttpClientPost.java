package cc.mivisi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;

//测试通过
public class HttpClientPost {
    public static void main(String[] args) throws Exception {
        doPost("打开成语接龙");
    }

    public static String doPost(String q) throws Exception {

        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost("http://api.ruyi.ai/v1/message");// 创建httpPost
        httpPost.setHeader("Accept", "application/json");
        httpPost.setHeader("Content-Type", "application/json");
        String charSet = "UTF-8";
       //设置请求参数
        //List<BasicNameValuePair> paramters = new ArrayList<>();
        //只是添加一个了参数
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("app_key", "118f2f68-2789-4c6c-86d0-003dbab6d49c");
        hashMap.put("user_id", UUID.randomUUID().toString());
        hashMap.put("q", q);
        System.out.println(JSON.toJSONString(hashMap));
        httpPost.setEntity(new StringEntity(JSON.toJSONString(hashMap), charSet));
        
        
        //StringEntity entity = new StringEntity(params, charSet);
        CloseableHttpResponse response = null;

        try {

            response = httpclient.execute(httpPost);
            StatusLine status = response.getStatusLine();
            int state = status.getStatusCode();
            if (state == HttpStatus.SC_OK) {
                HttpEntity responseEntity = response.getEntity();
                String jsonString = EntityUtils.toString(responseEntity);
                System.out.println("---------->"+jsonString);
                return jsonString;
            } else {
                System.out.println("请求返回:" + state );
            }
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
