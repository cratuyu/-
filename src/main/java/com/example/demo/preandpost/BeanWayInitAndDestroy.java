package com.example.demo.preandpost;

import com.example.demo.controller.SaveData;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/1/14 10:56
 */
public class BeanWayInitAndDestroy {

    @Autowired
    private SaveData saveData;

    public void init(){
        System.out.println("Bean的初始化方法 ");
    }

    public BeanWayInitAndDestroy(){
        super();
        System.out.println("Bean的构造方法");
    }

    public void destroy(){
        System.out.println("Bean的销毁方法");
    }
}
