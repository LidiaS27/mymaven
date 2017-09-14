package com.mymaven.servlet.impl;


import com.mymaven.servlet.AbstractServlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProfileServlet extends AbstractServlet {
    private final static Logger LOGGER = Logger.getLogger(ProfileServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        LOGGER.log(Level.INFO, "HTTP/1.1 Method Get path: /profile");

        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession(true);

        Cookie sessionid = new Cookie("SESSIONID", session.getId());
        sessionid.setPath("\\");
        sessionid.setMaxAge(60*60);
        res.addCookie(sessionid);
        req.getRequestDispatcher("WEB-INF/html/profile/profile.jsp").forward(req, res);

            }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {



    }


}
