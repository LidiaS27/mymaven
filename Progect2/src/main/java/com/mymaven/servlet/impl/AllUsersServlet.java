
package com.mymaven.servlet.impl;

import com.mymaven.model.impl.CreateUser;
import com.mymaven.servlet.AbstractServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

public class AllUsersServlet extends AbstractServlet {

    private final static Logger LOGGER = Logger.getLogger(AllUsersServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        CreateUser users = new CreateUser();
        req.setAttribute("users", users.allUsers);
        req.getRequestDispatcher("WEB-INF/html/profile/top.jsp").forward(req, res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {





    }
}