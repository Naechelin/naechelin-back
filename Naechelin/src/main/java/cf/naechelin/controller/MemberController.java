package cf.naechelin.controller;

import cf.naechelin.service.member.*;
import cf.naechelin.vo.MemberVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class MemberController
{
    @Autowired
    @Qualifier("memberLoginService")
    MemberLoginService memberLoginService;

    @Autowired
    @Qualifier("memberLogoutService")
    MemberLogoutService memberLogoutService;

    @Autowired
    @Qualifier("memberSignUpService")
    MemberSignUpService memberSignUpService;

    @Autowired
    @Qualifier("memberSignOutService")
    MemberSignOutService memberSignOutService;

    @Autowired
    @Qualifier("memberUpdateService")
    MemberUpdateService memberUpdateService;

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String login(MemberVO vo, HttpServletRequest request)
    {
        return "member/login";
    }

    @RequestMapping(value="/logout", method=RequestMethod.POST)
    public String logout(HttpSession session)
    {
        return "member/logout";
    }

    @RequestMapping(value="/signup", method=RequestMethod.GET)
    public String signUp()
    {
        return "member/insert";
    }

    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public String signUp(HttpSession session)
    {
        return "member/insert";
    }

    @RequestMapping(value="/signout", method=RequestMethod.DELETE)
    public String signOut(HttpSession session)
    {
        return "member/signOut";
    }

    @RequestMapping(value="/signup", method=RequestMethod.PUT)
    public String update(HttpSession session)
    {
        return "member/update";
    }

    @RequestMapping(value="/signup", method=RequestMethod.POST)
    public String update(HttpSession session, Model model)
    {
        return "member/update";
    }

    /* public String typeList(Model model)
    {
        return "typeList";
    }
    */
}
