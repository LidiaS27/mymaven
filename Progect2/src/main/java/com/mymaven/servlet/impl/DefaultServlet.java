package com.mymaven.servlet.impl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
@WebServlet(urlPatterns = "/")
public class DefaultServlet extends HttpServlet {

    private final static Logger LOGGER = Logger.getLogger(DefaultServlet.class.getName());


    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        LOGGER.log(Level.INFO, "HTTP/1.1 Method Get path: /*");

        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");
        res.setStatus(200);

        HttpSession session = req.getSession(true);

        Cookie sessionid = new Cookie("SESSIONID", session.getId());
        sessionid.setPath("\\");
        sessionid.setMaxAge(60*60);
        res.addCookie(sessionid);

        req.getRequestDispatcher("WEB-INF/html/index.jsp").forward(req, res);
    }

    protected void doPost (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {




    }



}
