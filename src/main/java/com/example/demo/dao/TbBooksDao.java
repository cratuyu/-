package com.example.demo.dao;


import com.example.demo.entity.TbBooks;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbBooksDao extends PagingAndSortingRepository<TbBooks, Long> ,JpaSpecificationExecutor<TbBooks> {

    /**
     * 获得 所有该作者的书籍信息
     * @param author 作者
     * @return List<TbBooks>
     */
//    @Query(value = "select * from tb_books where author=:author", nativeQuery = true)
    List<TbBooks> findAllByAuthor(String author);
    List<TbBooks> findByAuthor(String author);
}
