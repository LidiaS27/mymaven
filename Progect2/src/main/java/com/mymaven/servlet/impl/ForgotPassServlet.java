package com.mymaven.servlet.impl;

import com.mymaven.servlet.AbstractServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Smik_li30 on 11.09.2017.
 */
public class ForgotPassServlet extends AbstractServlet{
    private final static String TEMPLATE_PATH = "WEB-INF/html/profile/";
    private final static Logger LOGGER = Logger.getLogger(ForgotPassServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        LOGGER.log(Level.INFO, "get ForgotPassServlet");
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        LOGGER.log(Level.INFO, req.getServletPath());
        req.getRequestDispatcher("WEB-INF/html/profile/forgot_pass.jsp").forward(req, res);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        LOGGER.log(Level.INFO, "post ForgotPassServlet");
        if (isFilledUser(req)){

            req.getRequestDispatcher(TEMPLATE_PATH + "profile.jsp").forward(req, res);

        } else {
            req.getRequestDispatcher(TEMPLATE_PATH + "fault.jsp").forward(req, res);
        }

    }

    private boolean isFilledUser(HttpServletRequest req) {
        String mail = req.getParameter("mail");

        if ( (mail != null && !"".equals(mail)) ) {
            LOGGER.log(Level.INFO, "isFilledUser true");
            return true;
        }
        LOGGER.log(Level.INFO, "isFilledUser false");
        return false;
    }
}
