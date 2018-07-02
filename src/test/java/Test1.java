import future.zwp.Application;
import future.zwp.dao.UserDao;
import future.zwp.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class Test1 {
    @Autowired
    private UserDao userDao;

    @Test
    public  void m1(){
        List<User> users = userDao.selectAll();
        for (User user : users) {
            System.out.println(user);
             System.out.println("bbb");
        }
    }


}
