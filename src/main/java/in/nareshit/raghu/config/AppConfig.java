package in.nareshit.raghu.config;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan("in.nareshit.raghu")
public class AppConfig implements WebMvcConfigurer {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		return new InternalResourceViewResolver(
				"/WEB-INF/pages/", 
				".jsp");
	}
	
	//load properties files on change of language code
	@Bean
	public ReloadableResourceBundleMessageSource messageSource() {
		ReloadableResourceBundleMessageSource rm = new ReloadableResourceBundleMessageSource();
		rm.setBasename("classpath:messages");
		rm.setDefaultEncoding("UTF-8");
		return rm;
	}
	
	//to store language code of enduser
	@Bean
	public CookieLocaleResolver localeResolver() {
		CookieLocaleResolver cr = new CookieLocaleResolver();
		cr.setCookieName("mycke");
		cr.setDefaultLocale(Locale.ENGLISH);
		return cr;
	}
	
	//on click enduser language link
	@Bean
	public LocaleChangeInterceptor interceptor() {
		LocaleChangeInterceptor lc = new LocaleChangeInterceptor();
		lc.setParamName("lang");
		return lc;
	}
	
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor());
	}
	
	
}
