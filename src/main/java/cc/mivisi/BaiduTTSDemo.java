package cc.mivisi;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**  
 * ClassName:BaiduTTSDemo <br/>  
 * Function:  <br/>  
 * Date:     2018年8月20日 上午12:41:29 <br/>       
 */
public class BaiduTTSDemo {

    /**
     * 语音合成HTTP方法
     * @param requestUrl 请求的接口地址 拼接access_token后的
     * @param params 语音合成的参数,传递给服务器的参数，由开发者一系列拼接
     * @throws Exception
     */
    public static String postVoice(String requestUrl,String params) throws Exception {
        String workspace = System.getProperty("user.home");
        String path = workspace+"/text2audio/";
        try {
            if (!(new File(path).isDirectory())) {
                new File(path).mkdir();
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        String filePath = path+"VOICE"+new Date().getTime()/1000+".mp3";
        String generalUrl = requestUrl;
        URL url = new URL(generalUrl);
        System.out.println(generalUrl);
        // 打开和URL之间的连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        System.out.println("打开链接，开始发送请求"+new Date().getTime()/1000);
        connection.setRequestMethod("POST");
        // 设置通用的请求属性
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);

        // 得到请求的输出流对象
        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
        out.writeBytes(params);
        out.flush();
        out.close();

        // 建立实际的连接
        connection.connect();
        // 获取所有响应头字段
        Map<String, List<String>> headers = connection.getHeaderFields();
        // 遍历所有的响应头字段
        for (String key : headers.keySet()) {
                System.out.println(key + "--->" + headers.get(key));
        }
        // 定义 BufferedReader输入流来读取URL的响应
        InputStream inputStream = connection.getInputStream();
        FileOutputStream outputStream = new FileOutputStream(filePath);
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len=inputStream.read(buffer))!=-1) {
            outputStream.write(buffer,0,len);
        }
        outputStream.close();
        System.out.println("请求结束"+new Date().getTime()/1000);
        System.out.println("MP3文件保存目录:" + filePath);
        return filePath;
    }
}
  
