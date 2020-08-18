package cf.naechelin.controller;

import cf.naechelin.exception.store.StoreException;
import cf.naechelin.service.store.*;
import cf.naechelin.vo.MemberVO;
import cf.naechelin.vo.QueryVO;
import cf.naechelin.vo.StoreVO;
import cf.naechelin.vo.VisitVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/owner")
public class StoreController
{
    @Autowired
    @Qualifier("storeInsertRequestService")
    StoreInsertRequestService storeInsertRequestService;

    @Autowired
    @Qualifier("storeUpdateRequestService")
    StoreUpdateRequestService storeUpdateRequestService;

    @Autowired
    @Qualifier("storeDeleteRequestService")
    StoreDeleteRequestService storeDeleteRequestService;

    @Autowired
    @Qualifier("storeViewService")
    StoreViewService storeViewService;

    @Autowired
    @Qualifier("storeListByStringService")
    StoreListByStringService storeListByStringService;

    @Autowired
    @Qualifier("storeListByIntegerService")
    StoreListByIntegerService storeListByIntegerService;

    @Autowired
    @Qualifier("storeHowManyVisitsService")
    StoreHowManyVisitsService storeHowManyVisitsService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String insertRequest(HttpSession session, Model model)
    {
        MemberVO member = (MemberVO)(session.getAttribute("member"));
        if(member == null) {return "login"; }
        StoreVO store = new StoreVO();
        store.setMember(member);
        model.addAttribute("store", store);
        return "owner/registerForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String insertRequest(HttpServletRequest request, StoreVO store, Model model)
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("member") == null) {return "login"; }
        try
        {
            storeInsertRequestService.doService(store);
        }
        catch (StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "redirect:/policy";
    }

    @RequestMapping(value = "/{storeId}", method = RequestMethod.GET)
    public String updateRequest(HttpSession session, Model model, @PathVariable int storeId)
    {
        if(session.getAttribute("member") == null) { return "login"; }
        try
        {
            StoreVO store = storeViewService.doService(storeId);
            model.addAttribute("store", store);
        }
        catch (StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/registerForm";
    }

    @RequestMapping(value = "/{storeId}", method = RequestMethod.POST)
    public String updateRequest(HttpServletRequest request, StoreVO store, Model model)
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("member") == null) {return "login"; }
        try
        {
            storeUpdateRequestService.doService(store);
            model.addAttribute("store", store);
        }
        catch(StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/store";
    }

    @RequestMapping(value = "/{storeId}", method = RequestMethod.DELETE)
    public String deleteRequest(HttpServletRequest request,  Model model, @PathVariable int storeId)
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("member") == null) {return "login"; }
        try
        {
            StoreVO store = new StoreVO();
            store.setStoreId(storeId);
            storeDeleteRequestService.doService(store);
        }
        catch(StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/home";
    }

    @RequestMapping(value = "/{storeId}/view", method = RequestMethod.GET)
    public String view(HttpServletRequest request, Model model, @PathVariable int storeId)
    {
        HttpSession session = request.getSession();
        if(session.getAttribute("member") == null) {return "login"; }
        try
        {
            StoreVO store = storeViewService.doService(storeId);
            model.addAttribute("store",store);
            List<VisitVO> visits = storeHowManyVisitsService.doService(store);
            int num = visits.size();
            model.addAttribute("visits",num);
        }
        catch(StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }

        return "owner/store";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String list(HttpServletRequest request, Model model)
    {
        HttpSession session = request.getSession();
        MemberVO member = (MemberVO)session.getAttribute("member");
        try
        {
            QueryVO query = new QueryVO("memberId", member.getMemberId()+"");
            List<StoreVO> storeList = storeListByStringService.doService(query);
            model.addAttribute("storeList", storeList);
        }
        catch(StoreException e)
        {
            model.addAttribute(e.getMessage());
            e.printStackTrace();
            return "owner/error";
        }
        return "owner/home";
    }
}
