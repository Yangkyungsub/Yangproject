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
 
    //Bean: 스프링 컨테이너에 의하여 관리되기 위한 객체를 생성하는 메소드를 가리킵니다. 
    @Bean
    public HomeController homeController(){
        return new HomeController();
    }
 
    //컨트롤러에서 리소스를 인식하기 위한 함수
    //addResourceHandlers: 특정한 URL 경로 패턴을 가지는 자원들을 서비스 하기 위한 핸들러를 추가합니다.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // TODO Auto-generated method stub
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
        //즉, /resources/~ 라는 경로를 가진 자원들을 처리하도록 설정 하고 있습니다.
    }
    
    //컨트롤러에서 jsp와 맵핑하기 위한 함수
    //ViewResolver: view들을 이름을 가지고 구별하여 구현하기 위한 인터페이스 입니다.
    @Bean 
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
        
    }
    
    
}