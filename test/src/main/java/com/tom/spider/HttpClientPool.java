package com.tom.spider;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.io.IOException;

/**
 * ClassName: HttpClientPoll
 * Description:
 *
 * @date 2019/10/22 17:05
 * @author: Mi_dad
 */
public class HttpClientPool {
    public static void main(String[] args) {
        PoolingHttpClientConnectionManager cm =
                new PoolingHttpClientConnectionManager();

        //设置最大连接数
        cm.setMaxTotal(100);
        //设置主机最大连接数
        cm.setDefaultMaxPerRoute(10);
        doGet(cm);
    }

    private static void doGet(PoolingHttpClientConnectionManager cm) {
        CloseableHttpClient client = HttpClients.custom().setConnectionManager(cm).build();
        HttpGet get = new HttpGet("http://www.nxkg.org.cn/index.php?m=content&c=index&a=lists&catid=29");
        RequestConfig config = RequestConfig.custom().setConnectTimeout(1000)          //设置创建连接最长时间
                .setConnectionRequestTimeout(500)   //设置获取连接的最长时间
                .setSocketTimeout(10 * 1000).build();//设置数据阐述最长时间

        get.setConfig(config);


        CloseableHttpResponse response = null;
        try {
            response = client.execute(get);
            HttpEntity entity = response.getEntity();
            String html = EntityUtils.toString(entity,"gbk");
            System.out.println(html);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (response!=null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
