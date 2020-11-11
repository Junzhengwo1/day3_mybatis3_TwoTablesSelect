package com.kou.test;

import com.kou.dao.IRoleDao;
import com.kou.domain.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @author JIAJUN KOU
 */
public class RoleTest {
    private InputStream in;
    private SqlSession sqlSession;
    private IRoleDao roleDao;
    //执行初始化的操作
    @Before
    public void init() throws Exception{
        //1.读取配置文件，是为了加载信息。
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSessionFactory工厂
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        //SqlSessionFactory factory=builder.build(in);
        //3.使用工厂生产SqlSession对象
        sqlSession=factory.openSession();
        //4.使用SqlSession创建Dao接口的代理对象
        roleDao = sqlSession.getMapper(IRoleDao.class);
    }
    @After
    public void destroy() throws Exception{
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }

    @Test
    public void testFindAllRole(){
        List<Role> roles = roleDao.findAllRole();
        for (Role role : roles) {
            System.out.println(role);
            System.out.println(role.getUsers());
        }
    }


}
