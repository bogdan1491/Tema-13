package ro.sci.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyAgeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String birthday = req.getParameter("birthday");
        MyAge myAge = new MyAge();
        resp.getWriter().println("Your age in days is: " + myAge.computeBirthday(birthday));

//        http://localhost:8080/test/my-age?birthday=1991-02-14
    }
}
