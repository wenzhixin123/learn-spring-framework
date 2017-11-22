package com.wangpai.wms.controller;

import com.wangpai.wms.util.CommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/28.
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Logger logger = LoggerFactory.getLogger(HttpServlet.class);
        logger.info("hhhhhhhhhhhhhhhhhhhhhhhh=====================================================");
        logger.info("hhhhhhhhhhhhhhhhhhhhhhhh=====================================================");
        logger.info("hhhhhhhhhhhhhhhhhhhhhhhh=====================================================");
        logger.info("hhhhhhhhhhhhhhhhhhhhhhhh=====================================================");

        CommonUtil commonUtil = (x,y) -> x + y;
        System.out.println(commonUtil.caculateVal(2,3));


        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDate = dateFormat.format(new Date());
        req.setAttribute("currentTime",currentDate);
        req.getRequestDispatcher("/jsp/hello.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
