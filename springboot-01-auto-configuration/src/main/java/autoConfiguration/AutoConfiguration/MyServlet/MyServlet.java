package autoConfiguration.AutoConfiguration.MyServlet;

import autoConfiguration.AutoConfiguration.properties.MyProperties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class MyServlet extends HttpServlet {
    private MyProperties myProperties;

    public MyServlet(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("这个myServlet的service()方法被执行了");
        System.out.println(myProperties.getName());
        System.out.println(myProperties.getPath());
        System.out.println(myProperties.getClass());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
