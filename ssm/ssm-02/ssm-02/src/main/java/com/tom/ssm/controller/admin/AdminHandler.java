package com.tom.ssm.controller.admin;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tom.ssm.entity.BookEntity;
import com.tom.ssm.entity.CategoryEntity;
import com.tom.ssm.entity.UserEntity;
import com.tom.ssm.service.admin.AdminService;
import com.tom.ssm.service.admin.BookService;
import com.tom.ssm.service.admin.CategoryService;
import com.tom.ssm.service.user.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * ClassName: AdminHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/11 19:55
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminHandler {

    @Autowired
    private AdminService adminService;

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 管理员登录验证
     * @param userEntity
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/adminLogin",method = RequestMethod.POST)
    public int adminLogin(@RequestParam("remPwd")String remPwd,
                          UserEntity userEntity,
                          HttpSession session,
                          HttpServletRequest request,
                          HttpServletResponse response) throws IOException, ServletException {

        //TODO 测试输出
        System.out.println(remPwd);
        System.out.println("username:"+userEntity.getUsername()+",password:"+userEntity.getPassword());

        //返回验证后的管理员
        UserEntity user = adminService.getUserEntityByUsernameAndPassword(userEntity);
        if(user!=null&&user.getStatus()==1){    //如果user不为空并且身份为管理员(1)

            //TODO 测试输出
            System.out.println("前台获取的值：username==>"+user.getUsername()+"----password==>"+user.getPassword());
            //将登录的管理员存到session中,记录管理员登录状态
            session.setAttribute("loginAdmin",user.getUsername());
            if("yes".equals(remPwd)){
                String str = user.getUsername()+"#"+user.getPassword();
                //将用户名和密码存入Cookie
                String usernameAndPassword = URLEncoder.encode(str,"UTF-8");
                Cookie cookie = new Cookie("usernameAndPassword",usernameAndPassword);
                cookie.setMaxAge(60*60*24*7);
                //TODO 这个地方异常===>getWriter() has already been called for this response
                //response.addCookie(cookie);
            }
            return 1;
        }else if (user==null){      //如果user为空，表示账号密码错误
            //TODO 测试输出
            System.out.println("账号密码错误");
            return 2;
        }else {                 //如果user不为空，但是身份为用户(0)
            System.out.println("身份为用户");
            return 0;
        }
    }

    /**
     * 跳转到书城页面
     * @return
     */
    @RequestMapping(value = "/sendToBookPage",method = RequestMethod.GET)
    public String sendToBookPage(HttpServletRequest request,
                                 @RequestParam(value = "pageNumber",defaultValue = "1")int pageNumber,
                                 @RequestParam(value = "pageSize",defaultValue = "6")int pageSize){

        PageHelper.startPage(pageNumber, pageSize);
        List<BookEntity> bookList = bookService.findAllBook();
        PageInfo<BookEntity> pageInfo = new PageInfo<>(bookList);

        //request.setAttribute("bookList",pageInfo);
        request.setAttribute("pageInfo",pageInfo);

        //TODO 测试输出
        System.out.println("跳转到bookpage界面");
        System.out.println("=====> 1");
        System.out.println("=====> 2");
        return "bookpage";
    }


    /**
     * 跳转到添加页面
     */
    @Autowired BookEntity bookEntity;
    @RequestMapping(value = "/toAdd",method = RequestMethod.GET)
    public String toAdd(HttpServletRequest request){
        List<CategoryEntity> categoryList = categoryService.findAllCategory();
        request.setAttribute("categoryList",categoryList);

        //解决REST回显问题
        request.setAttribute("command",bookEntity);
        return "update";
    }


    /**
     * 添加
     * @param bookEntity
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(BookEntity bookEntity){
        System.out.println("进入add========>");

        //生成bookId
        long l = System.currentTimeMillis();
        String id = Long.toString(l/1000);
        bookEntity.setBookId(Integer.valueOf(id));

        System.out.println(bookEntity);
        boolean flag = adminService.addBook(bookEntity);
        if(flag){
            //插入成功返回列表
            return "redirect:/admin/sendToBookPage";
        }else{
            //插入失败写返回的数据
            //数据......
            return "redirect:/admin/sendToBookPage";
        }

    }


    /**
     * 删除
     * @param bookId
     * @return
     */
    @RequestMapping(value = "/del",method = RequestMethod.POST)
    @ResponseBody
    public int del(@RequestParam("bookId")Integer bookId){
        System.out.println(bookId);
        boolean flag = adminService.delBook(bookId);
        System.out.println(flag+"----------------");
        if (flag){
            return 1;
        }else {
            return 0;
        }
    }


}
