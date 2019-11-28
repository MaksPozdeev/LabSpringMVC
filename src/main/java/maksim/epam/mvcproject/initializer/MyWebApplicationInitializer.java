//package maksim.epam.mvcproject.initializer;
//
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.GenericWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//public class MyWebApplicationInitializer implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext sc) throws ServletException {
//        AnnotationConfigWebApplicationContext root =
//                new AnnotationConfigWebApplicationContext();
//
//        root.scan("maksim.epam.mvcproject");
//        sc.addListener(new ContextLoaderListener(root));
//
//        ServletRegistration.Dynamic appServlet =
//                sc.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
//        appServlet.setLoadOnStartup(1);
//        appServlet.addMapping("/");
//    }
//}
