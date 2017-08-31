import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HomeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    //root application context 에서 제공된 환경설정, 구성요소 등을 명세하는 메소드
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }
 
    //dispatcher servlet application context 에서 제공된 환경설정, 구성요소 등을 명세하는 메소드
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO Auto-generated method stub
        return new Class<?>[] {HomeConfig.class};
    }
    
    //요청을 위한 문자 인코딩을 명세하는 메소드
    @Override
    protected Filter[] getServletFilters() {
        // TODO Auto-generated method stub
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        
        return new Filter[] {characterEncodingFilter};
    }
 
    //DispatcherServlet을 위한 맵핑을 명세하는 메소드
    @Override
    protected String[] getServletMappings() {
        // TODO Auto-generated method stub
        return new String[] {"/"};
    }
    
    //spring MVC 의 흐름
    /*
     * 1. 어떤 요청이 들어오면 DispatcherServelt(Front Controller)이 해당 요청을 받는다.
     * 2. HandlerMapping을 통해 해당 Request에 맞는 Controller를 찾아 맵핑 시킨다.
     * 3. 맵핑된 Handler의 메소드를 호출한다.
     * 4. Request를 처리 후 타입에 맞는 결과를 리턴하거나 종료된다.
     */
}