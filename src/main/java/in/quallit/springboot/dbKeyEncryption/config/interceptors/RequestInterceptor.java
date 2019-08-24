/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.config.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

// TODO: Auto-generated Javadoc
/**
 * The Class RequestInterceptor.
 *
 * @author JIGS
 */
@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {

	/**
	 * Pre handle.
	 *
	 * @param request  the request
	 * @param response the response
	 * @param object   the object
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		System.out.println("In preHandle we are Intercepting the Request");
		System.out.println("____________________________________________");
		String requestURI = request.getRequestURI();
		System.out.println("RequestURI::" + requestURI);
		System.out.println("____________________________________________");
		return true;
	}

	/**
	 * Post handle.
	 *
	 * @param request  the request
	 * @param response the response
	 * @param object   the object
	 * @param model    the model
	 * @throws Exception the exception
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView model)
			throws Exception {
		System.out.println("_________________________________________");
		System.out.println("In postHandle request processing " + "completed by @RestController");
		System.out.println("_________________________________________");
	}

	/**
	 * After completion.
	 *
	 * @param request  the request
	 * @param response the response
	 * @param object   the object
	 * @param arg3     the arg 3
	 * @throws Exception the exception
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception arg3)
			throws Exception {
		System.out.println("________________________________________");
		System.out.println("In afterCompletion Request Completed");
		System.out.println("________________________________________");
	}
}
