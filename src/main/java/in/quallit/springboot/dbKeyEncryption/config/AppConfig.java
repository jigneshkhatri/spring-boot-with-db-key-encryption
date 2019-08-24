/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import in.quallit.springboot.dbKeyEncryption.config.interceptors.RequestInterceptor;

// TODO: Auto-generated Javadoc
/**
 * The Class AppConfig.
 *
 * @author JIGS
 */
@Configuration
public class AppConfig implements WebMvcConfigurer {

	/** The request interceptor. */
	@Autowired
	RequestInterceptor requestInterceptor;

	/**
	 * Adds the interceptors.
	 *
	 * @param registry the registry
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestInterceptor);
	}
}
