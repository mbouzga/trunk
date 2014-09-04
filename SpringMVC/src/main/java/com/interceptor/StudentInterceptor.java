/*
 * TODO Short description of the file
 * 
 * @Copyright
 */
package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO Short description of the class
 * 
 * <P>
 * TODO Detailed description of the use of the class.
 * </p>
 * 
 * @author $Author$
 * @version $Revision$
 */
public class StudentInterceptor implements HandlerInterceptor {

    @Override
    public void afterCompletion(final HttpServletRequest request, final HttpServletResponse response,
            final Object object, final Exception exception) throws Exception {
        System.out.println("-----------------    Method : afterCompletion   ---------------------");
        System.out.println("URI : " + response.getContentType());
        System.out.println("---------------------------------------------------------------------");
    }

    @Override
    public void postHandle(final HttpServletRequest arg0, final HttpServletResponse arg1, final Object arg2,
            final ModelAndView model) throws Exception {
        System.out.println("-----------------    Method : postHandle   ---------------------");
        System.out.println("Nom : " + model.getModelMap().get("name") + "\t Age : " + model.getModelMap().get("age")
                + "\t ID : " + model.getModelMap().get("id"));
        System.out.println("----------------------------------------------------------------");
    }

    @Override
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object object)
            throws Exception {
        System.out.println("-----------------    Method : preHandle   ---------------------");
        System.out.println("URI : " + request.getRequestURI());
        System.out.println("---------------------------------------------------------------------");
        return true;
    }

}
