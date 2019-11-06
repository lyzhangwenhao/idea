import com.tom.ssm.entity.BookEntity;
import com.tom.ssm.entity.CategoryEntity;
import com.tom.ssm.service.admin.AdminService;
import com.tom.ssm.service.admin.BookService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.UUID;

/**
 * ClassName: Test
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/12 17:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
    @org.junit.Test
    public void test(){
        BookEntity bookEntity = new BookEntity();
        System.out.println(bookEntity);
    }

    @Autowired
    private BookService bookService;
    @org.junit.Test
    public void Test1(){
        List<BookEntity> allBook = bookService.findAllBook();
        System.out.println(allBook.get(1).getBookName());
    }

    @org.junit.Test
    public void test01(){
        long maxValue1 = Long.MAX_VALUE;
        System.out.println(maxValue1);
        long l = System.currentTimeMillis();
        System.out.println("时间毫秒"+l);
    }
}

