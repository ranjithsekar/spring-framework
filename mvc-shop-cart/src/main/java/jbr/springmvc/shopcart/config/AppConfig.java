package jbr.springmvc.shopcart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.ResourceBundleViewResolver;
import org.springframework.web.servlet.view.XmlViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "jbr.springmvc.shopcart" })
public class AppConfig extends WebMvcConfigurationSupport {

  @Autowired
  private ResourceLoader resourceLoader;

  /*
   * public void setResourceLoader(ResourceLoader resourceLoader) {
   * this.resourceLoader = resourceLoader; }
   */
  @Bean
  public ResourceBundleViewResolver viewResolver() {
    ResourceBundleViewResolver viewResolver = new ResourceBundleViewResolver();
    viewResolver.setOrder(0);
    viewResolver.setBasename("views");

    return viewResolver;
  }

  @Bean
  public InternalResourceViewResolver internalResourceViewResolver() {
    InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    viewResolver.setOrder(1);
    viewResolver.setViewClass(JstlView.class); // optional since it is default
    viewResolver.setPrefix("/WEB-INF/views/");
    viewResolver.setSuffix(".jsp");

    return viewResolver;
  }

  @Bean
  public ViewResolver xmlViewResolver() {
    XmlViewResolver viewResolver = new XmlViewResolver();
    viewResolver.setOrder(2);
    if (null == resourceLoader) {
      System.out.println("resourceLoader null");
    } else {
      System.out.println("resourceLoader null not");
    }
    viewResolver.setLocation(resourceLoader.getResource("/WEB-INF/views.xml"));

    return viewResolver;
  }

  @Bean
  public MessageSource messageSource() {
    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
    messageSource.setBasename("messages");

    return messageSource;
  }

}
