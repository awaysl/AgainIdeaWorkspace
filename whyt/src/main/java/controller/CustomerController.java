package controller;

import beans.Customer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.CustomerService;
import serviceImp.CustomerServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

/**
 * Created by 0100060991 on 2016/9/18.
 */
@Controller
@RequestMapping("/cuscon")
public class CustomerController {

    @Resource
    private CustomerService customerService;

    @RequestMapping(value = "/trans")
    public ModelAndView modelAndView(HttpServletRequest req, HttpServletResponse resp){
        String customernumber = req.getParameter("customernumber");
        Customer customer = customerService.getCustomerByNumber(customernumber);
        System.out.println(customer.toString());
        System.out.print("aaa");
        return new ModelAndView("login");
    }

}
