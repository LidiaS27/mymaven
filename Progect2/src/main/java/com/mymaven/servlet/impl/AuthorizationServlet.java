package com.mymaven.servlet.impl;

import com.mymaven.servlet.AbstractServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AuthorizationServlet extends AbstractServlet {

    private final static String TEMPLATE_PATH = "WEB-INF/html/profile/";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        req.getRequestDispatcher("WEB-INF/html/profile/autorization.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        if (isFilledUser(req)){

            req.getRequestDispatcher(TEMPLATE_PATH + "profile.jsp").forward(req, res);

        } else {
            req.getRequestDispatcher(TEMPLATE_PATH + "fault.jsp").forward(req, res);
        }

    }

    private boolean isFilledUser(HttpServletRequest req) {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if ( (login != null && !"".equals(login)) && (password != null && !"".equals(password)) ) {
            return true;
        }
        return false;
    }
}
