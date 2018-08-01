import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demoTest {

    private ClassPathXmlApplicationContext ctx ;
    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("spring-configs.xml");
    }
    @Test
    public void testSqlSessionFactory(){
        SqlSessionFactory sqlSessionFactory = ctx.getBean("sqlSessionFactory",SqlSessionFactory.class);
        Assert.assertNotEquals(sqlSessionFactory,null);
    }


    @After
    public void destory(){
        ctx.close();
    }

}
