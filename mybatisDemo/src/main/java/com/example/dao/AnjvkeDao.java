package com.example.dao;

import com.example.entity.Anjvke;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface AnjvkeDao {

    /**
     * 查询数据
     * @param price 价格
     * @param size1 最小值
     * @param size2 最小值
     * @param m 第m条数据
     * @param n 取几条数据
     * @return
     */
    List<Anjvke> findByPriceAndSize(@Param("price") int price,@Param("size1") int size1,@Param("size2") int size2,
                                    @Param("m")int m,@Param("n") int n);
}
