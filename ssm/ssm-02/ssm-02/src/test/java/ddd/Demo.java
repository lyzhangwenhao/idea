package ddd;

import org.junit.Test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ClassName: Demo
 * Description:
 *
 * @date 2019/10/31 1:23
 * @author: Mi_dad
 */
public class Demo {

    @Test
    public  void ddd() {
        User1 user = new User1();
        user.setName("zhangsan");
        get(user);
        System.out.println(user);
    }

    public void get(User1 user){
        User1 user1 = new User1();
        user = user1;
        user.setName("lisi");
        System.out.println(user);
    }


    public User1 test(){
        User1 user = new User1();
        user.setName("zhangsan");
        try{

            return user;

        }catch (Exception e){

        }finally {

            user.setName("lisi");

        }
        return user;
    }

    @Test
    public void sss(){
        AtomicInteger integer = new AtomicInteger(111);
        ConcurrentHashMap<Object, Object> c = new ConcurrentHashMap<>();
        
    }


}
