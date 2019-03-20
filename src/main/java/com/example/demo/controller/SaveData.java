package com.example.demo.controller;

import com.example.demo.dao.TbBooksDao;
import io.swagger.annotations.Api;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import com.example.demo.entity.TbBooks;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: ljy
 * @Date: 2019/1/14 11:34
 */

@Controller
public class SaveData {

    @Autowired
    private TbBooksDao tbBooksDao;

    public void saveDatas(){
        TbBooks tbBooks = new TbBooks();
        tbBooks.setAuthor("金庸");
        tbBooks.setBookCount(32);
        tbBooks.setName("神雕侠侣");
        tbBooks.setPrice(49.9);
        List<TbBooks> list = tbBooksDao.findAllByAuthor("当年明月");
        tbBooksDao.save(tbBooks);
    }

    @GetMapping(value = "/getBooks")
    @ResponseBody
    public List<TbBooks> getbooks(HttpServletRequest request){
        String author = request.getParameter("Author");
        System.out.println(author);
//        List<TbBooks> list = new ArrayList<>();
        List<TbBooks> list = tbBooksDao.findAllByAuthor(author);
        System.out.println(list.get(0).getName());
        return tbBooksDao.findAllByAuthor(author);
    }

    /**
     * 接收上传的文件 并存储
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upfile(@RequestParam("file")MultipartFile multipartFile, HttpServletRequest request){
        try{
            File file = new File("d:/upload/" + multipartFile.getOriginalFilename());
            // Multipartfile 自带的快速写入文件方法
            multipartFile.transferTo(file);
            // 另一种写入方式
            // byte[] bytes = multipartFile.getBytes();
            // FileUtils.writeByteArrayToFile(file, bytes);
            return "index";
        }catch (IOException ex){
            ex.printStackTrace();
            return "error";
        }
    }

}
