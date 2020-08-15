package cf.naechelin.controller;

import cf.naechelin.service.coupon.CouponService;
import org.springframework.stereotype.Controller;

@Controller
public class CouponController
{
    private CouponService service;

    public CouponController() {}

    public String insert()
    {
        return "insert";
    }

    public String delete()
    {
        return "delete";
    }

    public String view()
    {
        return "view";
    }

    public String list()
    {
        return "list";
    }

    public String use()
    {
        return "use";
    }
}
