package main.com.Test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class testSelectAll {
    static String resource = "mybatis.xml";
    static InputStream inputStream;

    static {

        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    static SqlSession sqlSession = sqlSessionFactory.openSession();



    public static void main(String[] args) throws IOException {
        SelectAllArea();
        sqlSession.close();
    }
    public static void SelectAllProvince() throws IOException {
        List<Object> list = sqlSession.selectList("a.b.selectAll");
        for (int i = 0; i <list.size()-1; i++) {
            Province province = (Province) list.get(i);
            System.out.println(province.getID()+" "+province.getProvinceID()+" "+province.getProvince());
        }
        sqlSession.close();
    }
    public static void SelectAllCity() throws IOException {
        List<Object> list = sqlSession.selectList("a.b.selectAllCity");
        for (int i = 0; i <list.size()-1; i++) {
            City city = (City) list.get(i);
            System.out.println(city.getID()+" "+city.getCityID()+" "+city.getCity());
        }
        sqlSession.close();
    }
    public static void SelectAllArea() throws IOException {
        List<Object> list = sqlSession.selectList("a.b.selectAllArea");
        for (int i = 0; i <list.size()-1; i++) {
            Area area = (Area) list.get(i);

            System.out.println(area.getID()+" "+area.getAreaID()+" "+area.getArea());
        }
        sqlSession.close();
    }


}
