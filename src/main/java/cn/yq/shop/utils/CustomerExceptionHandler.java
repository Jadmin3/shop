package cn.yq.shop.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Jadmin
 * @Date: 2019/4/24 11:25
 * @Version 1.0
 */
@Component
public class CustomerExceptionHandler implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception exception) {

        AuctionPriceException ex = null;
        if (exception instanceof AuctionPriceException){
            ex = (AuctionPriceException) exception;
        } else {
            ex = new AuctionPriceException("未知异常！");
        }
       ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg",ex.getMessage());
        mv.setViewName("error");


        return mv;
    }
}
