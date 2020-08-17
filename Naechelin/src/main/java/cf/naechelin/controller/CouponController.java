package cf.naechelin.controller;

import cf.naechelin.service.coupon.CouponService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/coupon")
public class CouponController
{
    private CouponService service;

    public CouponController() {}

    @RequestMapping(value = "/{couponId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("couponId") int couponId, HttpSession session)
    {
        return "delete";
    }

    @RequestMapping(value = "/{couponId}", method = RequestMethod.GET)
    public String view(@PathVariable("couponId") int couponId, HttpSession session)
    {
        return "view";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String list(HttpSession session)
    {
        return "list";
    }

    @RequestMapping(method = RequestMethod.HEAD)
    public String usedList(HttpSession session)
    {
        return "list";
    }
}
