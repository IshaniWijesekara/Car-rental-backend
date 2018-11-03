package lk.zeon.carrental.main;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Ze on 10/31/2018.
 */
public class WebAppIntializer extends AbstractAnnotationConfigDispatcherServletInitializer{
    @Override
    protected Class<?>[] getRootConfigClasses() {return new Class[]{WebRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {return new Class[]{WebAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {return new String[]{"/"};
    }

}
