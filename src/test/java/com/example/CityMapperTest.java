package com.example;

import com.mapper.CityMapper;
import com.pojo.City;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class CityMapperTest {
    @Test
    public void testListCityByFather() throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream;
        inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        CityMapper mapper = sqlSession.getMapper(CityMapper.class);
        List<City> city = mapper.listCitiesByFather(Integer.parseInt("130000"));
        for (int i = 0; i < city.size(); i++) {
            City c = city.get(i);
            System.out.println(c.getCity());
        }
    }
}
