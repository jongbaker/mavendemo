+ 调用API,把java对象转成JSON对象

  ```
  JSON.toJSON(java对象); 转成JSON对象
  JSONArray.toJSON(list); 转成JsonArray数组
  ```

+ 调用API,把JSON转成Java对象

  ```
  JSONObject.parseObject(jsonStr,Class); json对象转成Java对象
  JSONArray.parseArray(jsonStr, Class); JSON数组转成List
  ```

