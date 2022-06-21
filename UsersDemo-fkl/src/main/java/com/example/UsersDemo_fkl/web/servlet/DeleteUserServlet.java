package com.example.UsersDemo_fkl.web.servlet;

import com.example.UsersDemo_fkl.seivice.UserService;
import com.example.UsersDemo_fkl.seivice.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteUserServlet", value = "/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ªÒ»°id
        String id = request.getParameter("id");
        UserService service = new UserServiceImpl();
        service.deleteUser(id);
        response.sendRedirect(request.getContextPath()+"/UserListServlet");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
