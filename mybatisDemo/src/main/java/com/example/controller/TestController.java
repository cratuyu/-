package com.example.controller;

import com.example.dao.TbBooksDao;
import com.example.entity.TbBooks;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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

}
