package com.example.controller;

import com.example.dao.AnjvkeDao;
import com.example.dao.TbBooksDao;
import com.example.entity.Anjvke;
import com.example.entity.TbBooks;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.logging.Logger;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/4/2 13:16
 */
@RestController
public class TestController {

    @Resource
    private TbBooksDao tbBooksDao;

    @Resource
    private AnjvkeDao anjvkeDao;

    @RequestMapping("/findBookById")
    public TbBooks findBook(){
        TbBooks tbBooks = tbBooksDao.findBookById(2);
        System.out.println(tbBooks.getBookName());
        return tbBooks;
    }

    @RequestMapping("/findBooksByAuthor")
    public List<TbBooks> findBooksByAuthor(){
        List<TbBooks> tbBooks = tbBooksDao.findBooksByAuthor("金庸");
        System.out.println(tbBooks.get(0).getBookName());
        return tbBooks;
    }

    @GetMapping("findAnjvkeByPriceAndSize")
    @ApiOperation(value="获取房子信息", notes="获取数据库中房子信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "size1", value = "最小值", required = true, paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "size2", value = "最大值", required = true, paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "price", value = "价格", paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "pageNumber", value = "分页页数", required = true, paramType = "query", dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "分页大小", required = true, paramType = "query", dataType = "int"),
    }
    )
    public List<Anjvke> findAnjvkeByPriceAndSize(HttpServletRequest request){
        int size1 = Integer.parseInt(request.getParameter("size1"));
        int size2 = Integer.parseInt(request.getParameter("size2"));
        int price = Integer.parseInt(request.getParameter("price"));
        int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
        int n = Integer.parseInt(request.getParameter("pageSize"));
        int m = pageNumber * n;
        return anjvkeDao.findByPriceAndSize(price, size1, size2, m, n);
    }
}
