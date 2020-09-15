package com.cl.happy.zuul.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 */
@Component
public class ZuulFallback implements FallbackProvider {

    /**
     * 配置哪些服务走降级方法
     * @return
     */
    @Override
    public String getRoute() {
        return "*";  //代表所有出现问题的服务都会走这个降级方法
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        System.out.println("降级的服务"+route);
        cause.printStackTrace();//打印异常信息
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.INTERNAL_SERVER_ERROR;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.INTERNAL_SERVER_ERROR.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();//错误信息
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                //给用户响应的信息
                String response=route+"服务出现问题啦！！！";
                return new ByteArrayInputStream(response.getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                //指定响应头信息
                HttpHeaders headers=new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
    }
}
