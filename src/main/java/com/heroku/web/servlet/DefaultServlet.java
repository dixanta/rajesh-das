/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.heroku.web.servlet;
import com.heroku.web.dao.SkillDAO;
import com.heroku.web.dao.impl.SkillDAOImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
/**
 *
 * @author USER
 */

 
public class DefaultServlet extends HttpServlet{
    private SkillDAO skillDAO=new SkillDAOImpl();
    
    @Override
    protected void doGet(HttpServletRequest request,
           HttpServletResponse response) throws ServletException, IOException {
        /*request.setAttribute("skills",skillDAO.getAll());
        request.getRequestDispatcher("/WEB-INF/views/index.jsp")
                .forward(request, response);*/
            PrintWriter out=response.getWriter();
            out.println("<h1>Hello World</h1>");
    }
    
    
    
}
