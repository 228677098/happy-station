package com.cl.happy.zuul.filiter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ChenYu
 * @create 2020-09-15
 * @tag I love java better than girl
 * 实现动态路由功能的过滤器
 */
@Component
public class RoutingFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return FilterConstants.RIBBON_ROUTING_FILTER_ORDER-1;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {

        //获取request对象
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();

        String redisKey = request.getParameter("redisKey");

        if (!StringUtils.isEmpty(redisKey)){
            //http://localhost:8202/test/test/2
            if (redisKey.equalsIgnoreCase("haha")){
                requestContext.put(FilterConstants.SERVICE_ID_KEY,"happy_station_common");
                requestContext.put(FilterConstants.REQUEST_URI_KEY, "/test/test/2");
            }
        }
        return null;
    }
}
