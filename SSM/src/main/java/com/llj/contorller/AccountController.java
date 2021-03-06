package com.llj.contorller;

import com.llj.domain.Account;
import com.llj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountservice;

    @RequestMapping("/findAll")
    public String findAll(Model model)
    {
        model.addAttribute("list",accountservice.findAll());
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountservice.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
    }
}
