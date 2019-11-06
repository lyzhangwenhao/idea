package com.tom.spider;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Locale;

/**
 * ClassName: SpiderTest
 * Description:
 *
 * @date 2019/10/22 9:40
 * @author: Mi_dad
 */
public class SpiderTest {
    public static void main(String[] args) throws IOException {
        //1、打开浏览器，获取HttpClient对象
        HttpClient client = HttpClients.createDefault();
        //2、输入网址，发起get请求创建HttpGet对象
//        HttpGet httpGet = new HttpGet("https://study.163.com/course/introduction/1006149015.htm");
        HttpGet httpGet = new HttpGet("https://pvp.qq.com/web201605/herolist.shtml");

        //3、按回车，发起请求，返回响应，使用HttpClient对象发起请求
        HttpResponse response = client.execute(httpGet);
        //4、解析相应，获取数据
        //判断状态码是否是200
        if(response.getStatusLine().getStatusCode() == 200){
            HttpEntity entity = response.getEntity();
            System.out.println("contextType:"+entity.getContentType());
            System.out.println("-------------------------------------------------------------------------");
            String html = EntityUtils.toString(entity, "gb2312");
            System.out.println(html);

        }

    }
}
