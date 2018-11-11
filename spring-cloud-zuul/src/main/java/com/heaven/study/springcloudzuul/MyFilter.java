package com.heaven.study.springcloudzuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * Zuul过滤器
 * @author li.xiaoxi
 * @description
 */
@Component
public class MyFilter extends ZuulFilter {

	private Logger log = LoggerFactory.getLogger(getClass());

	/**
	 * 过滤器类型
	 * @return pre-路由之前 routing-路由之时 post-路由之后 error-发送错误调用
	 */
	@Override
	public String filterType() {
		return "pre";
	}

	/**
	 * 顺位
	 * @return
	 */
	@Override
	public int filterOrder() {
		return 0;
	}


	/**
	 * 是否进行过滤
	 * @return
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}

	/**
	 * 过滤逻辑
	 * @return
	 * @throws ZuulException
	 */
	@Override
	public Object run() throws ZuulException {

		RequestContext currentContext = RequestContext.getCurrentContext();
		HttpServletRequest request = currentContext.getRequest();
		StringBuffer requestURL = request.getRequestURL();

		log.info("进入过滤器。url=[{}]", requestURL.toString());

		boolean b = RandomUtils.nextBoolean();
		if(!b) {
			currentContext.setSendZuulResponse(false);
			currentContext.setResponseStatusCode(401);
			try {
				HttpServletResponse response = currentContext.getResponse();
				response.setCharacterEncoding("UTF-8");
				response.getOutputStream().write("啊， 运气真不好，不想让你访问了".getBytes("UTF-8"));
			} catch (IOException e) {
				e.printStackTrace();
				log.error("过滤器异常",e);
			}
			return null;
		}

		return null;
	}
}
