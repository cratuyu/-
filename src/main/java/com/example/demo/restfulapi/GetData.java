package com.example.demo.restfulapi;

import com.example.demo.dao.TbBooksDao;
import com.example.demo.entity.TbBooks;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/1/21 14:06
 */
@Controller
public class GetData {

    @Autowired
    private TbBooksDao tbBooksDao;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    /**
     * 可以通过redisTemplate 操作redis中的数据
     */
    @Autowired
    @Qualifier("SelfRedisTemplate")
    RedisTemplate<String,String> redisTemplate;

    /**
     * 我们通过@ApiOperation注解来给API增加说明, 通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明。
     * @Cacheable 是缓存注解  包名+类名+方法名+所有参数 故此处应将需要区别的参数 在方法入口时注明
     * @param author
     * @return
     */
    @Cacheable(value="user-key")
    @GetMapping("/bookData")
    @ResponseBody
    @ApiOperation(value="获取书籍信息", notes="获取数据库中全部书籍信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "author", value = "作者名", required = true, paramType = "query",dataType = "String")}
            )
    public List<TbBooks> getTbBooks(@RequestParam String author){
        return tbBooksDao.findAllByAuthor(author);
    }
}
