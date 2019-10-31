package cn.itcast.test;

import cn.itcast.domain.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPATest {

    /**
     * 测试JPA的保存。
     *      保存一个客户到数据库中。
     *
     * jpa操作的步骤：
     *      1、加载配置文件创建 实体管理工厂类对象
     *      2、通过实体类管理工厂对象创建 实体管理类对象
     *      3、获取事务对象，开启事务
     *      4、完成增删改查操作
     *      5、提交事务（回滚事务）
     *      6、释放资源
     */
    @Test
    public void testSave(){
        //1、加载配置文件创建 实体管理工厂对象
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        //2、通过实体类管理工厂对象创建 实体管理类对象
        EntityManager em = factory.createEntityManager();
        //3、获取事务对象，并开启事务
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //4、完成增删改查操作。保存一个客户到数据库中。
        Customer customer = new Customer();
        customer.setCustName("黑马2");
        customer.setCustIndustry("教育机构2");
        //4.2、保存操作
        em.persist(customer);
        //5、提交事务（回滚事务）
        tx.commit();
        //6、释放资源
        em.close();
        factory.close();
    }
}
