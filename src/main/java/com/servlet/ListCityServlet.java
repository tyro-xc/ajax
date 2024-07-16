package com.servlet;

import com.alibaba.fastjson.JSON;
import com.mapper.CityMapper;
import com.pojo.Area;
import com.pojo.City;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/listCity")
public class ListCityServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String resource = "mybatis.xml";
        int code = Integer.parseInt(req.getParameter("code"));
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        InputStream inputStream;
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityMapper mapper = sqlSession.getMapper(CityMapper.class);
        List<City> city = mapper.listCitiesByFather(code);
        out.println(JSON.toJSONString(city));
        sqlSession.close();
    }
}
