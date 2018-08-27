package cc.mivisi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
/**
 * log4j,使用指南
 * 1.去仓库导入依赖log4j
 * 2.添加log4j.properties到resource中
 * 3.在类中添加private static Logger logger = Logger.getLogger(Log4jDemo.class);
 * 注意：
 *  1.Logger.getLogger()是使用log4j的方式记录日志；
 *  2.LogFactory.getLog()则来自apache的common-logging包。

 * 
 *  基于log4j的运行方式
 * @author myvisi  
 * @version   
 * @since JDK 1.6
 */
public class Log4jDemo {
    private static Logger logger = Logger.getLogger(Log4jDemo.class);

   public static void main(String[] args) {
    logger.info("使用log4j打印日志");
}
}
