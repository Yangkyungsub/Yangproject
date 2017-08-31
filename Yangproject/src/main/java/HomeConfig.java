import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.yks.yangproject.controller.HomeController;

@Configuration
@EnableWebMvc
public class HomeConfig extends WebMvcConfigurerAdapter{
 
    //Bean: ������ �����̳ʿ� ���Ͽ� �����Ǳ� ���� ��ü�� �����ϴ� �޼ҵ带 ����ŵ�ϴ�. 
    @Bean
    public HomeController homeController(){
        return new HomeController();
    }
 
    //��Ʈ�ѷ����� ���ҽ��� �ν��ϱ� ���� �Լ�
    //addResourceHandlers: Ư���� URL ��� ������ ������ �ڿ����� ���� �ϱ� ���� �ڵ鷯�� �߰��մϴ�.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // TODO Auto-generated method stub
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        //��, /resources/~ ��� ��θ� ���� �ڿ����� ó���ϵ��� ���� �ϰ� �ֽ��ϴ�.
    }
    
    //��Ʈ�ѷ����� jsp�� �����ϱ� ���� �Լ�
    //ViewResolver: view���� �̸��� ������ �����Ͽ� �����ϱ� ���� �������̽� �Դϴ�.
    @Bean 
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
        
    }
    
    
}