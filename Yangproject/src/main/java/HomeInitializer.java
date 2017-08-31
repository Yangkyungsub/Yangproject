import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class HomeInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    //root application context ���� ������ ȯ�漳��, ������� ���� ���ϴ� �޼ҵ�
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }
 
    //dispatcher servlet application context ���� ������ ȯ�漳��, ������� ���� ���ϴ� �޼ҵ�
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO Auto-generated method stub
        return new Class<?>[] {HomeConfig.class};
    }
    
    //��û�� ���� ���� ���ڵ��� ���ϴ� �޼ҵ�
    @Override
    protected Filter[] getServletFilters() {
        // TODO Auto-generated method stub
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        
        return new Filter[] {characterEncodingFilter};
    }
 
    //DispatcherServlet�� ���� ������ ���ϴ� �޼ҵ�
    @Override
    protected String[] getServletMappings() {
        // TODO Auto-generated method stub
        return new String[] {"/"};
    }
    
    //spring MVC �� �帧
    /*
     * 1. � ��û�� ������ DispatcherServelt(Front Controller)�� �ش� ��û�� �޴´�.
     * 2. HandlerMapping�� ���� �ش� Request�� �´� Controller�� ã�� ���� ��Ų��.
     * 3. ���ε� Handler�� �޼ҵ带 ȣ���Ѵ�.
     * 4. Request�� ó�� �� Ÿ�Կ� �´� ����� �����ϰų� ����ȴ�.
     */
}