package com.example.demo.config.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Company: www.leadmap.net
 * Description:
 *
 * @author: 96964
 * @Date: 2019/1/16 11:19
 */
@ControllerAdvice
public class ExceptionHandlerAdvice {

    /**
     * @ExceptionHandler 在此定义全局处理, 通过 value属性 过滤拦截的条件, 在此处我们可以看出我们拦截所有
     * 的Exception
     * @param exception
     * @param webRequest
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest webRequest){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", exception.getMessage());
        System.out.println("自己测试:"+exception.getMessage());
        exception.printStackTrace();
        return modelAndView;
    }

    /**
     * @ModelAttribute 注解将键值对添加到全局, 所有注解的@RequestMapping的方法可获得此键值对
     * @param model
     */
    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg", "额外信息");
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");
    }
}
