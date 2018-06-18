package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;



@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "controller")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean 
	public ViewResolver getViewResolver(){
		FreeMarkerViewResolver fmViewResolver = new FreeMarkerViewResolver();
		fmViewResolver.setOrder(1);
		fmViewResolver.setSuffix(".ftl");
		fmViewResolver.setPrefix("");
		return fmViewResolver;
	}
	
	@Bean
	public FreeMarkerConfigurer getFreeMarkerConfigurer(){
		FreeMarkerConfigurer fmc = new FreeMarkerConfigurer();
		fmc.setTemplateLoaderPaths("/", "WEB-INF/views/");
		return fmc;
	}
	
	
}
