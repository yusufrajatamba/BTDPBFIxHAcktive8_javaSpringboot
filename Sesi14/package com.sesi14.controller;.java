package com.sesi14.controller;


import com.sesi14.model.Member;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import 


    public class LoginControl extends HttpServlet{
        protected void doPost(HttpServletRequest request,HttpServletResponse response) 
            throws ServletException, IOException
            {
                String username= request.getParameter("username");
                String password= request.getParameter("password");
            }
            
        
    }