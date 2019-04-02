package com.example.dao;

import com.example.entity.TbBooks;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 接口名应和对应xml文件同名
@Mapper
public interface TbBooksDao {

    /**
     * 如果返回的是列表 只需用list 包住即可
     * @param author
     * @return
     */
    List<TbBooks> findBooksByAuthor(String author);

    TbBooks findBookById(int id);
}
