package cf.naechelin.controller;

import cf.naechelin.exception.ReviewException;
import cf.naechelin.service.review.*;
import cf.naechelin.vo.NaechelinStarVO;
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
public class ReivewController
{
    @Autowired
    @Qualifier("reviewInsertService")
    ReviewInsertService insertService;

    @Autowired
    @Qualifier("reviewUpdateService")
    ReviewUpdateService reviewUpdateService;

    @Autowired
    @Qualifier("reviewDeleteService")
    ReviewDeleteService deleteService;

    @Autowired
    @Qualifier("reviewDetailService")
    ReviewDetailService detailService;

    @Autowired
    @Qualifier("reviewListService")
    ReviewListService listService;

    @Autowired
    @Qualifier("viewNaechelinService")
    ViewNaechelinService naechelinService;

    @Autowired
    @Qualifier("naechelinGuideService")
    NaechelinGuideService naechelinGuideService;


    @RequestMapping(value="review/{storeId}", method = RequestMethod.GET)
    public String insert(HttpSession session, @PathVariable("storeId") int storeId)
    {
        return "review/insert";
    }

    @RequestMapping(value="review/{storeId}", method = RequestMethod.POST)
    public String insert(HttpServletRequest request, @PathVariable("storeId") int storeId)
    {
        HttpSession session = request.getSession(false);
        String mStr = (session.getAttribute("memberId")).toString();
        if(mStr == null){
            return "review/error";
        }
        int memberId = Integer.parseInt(mStr);

        try
        {
            insertService.doService(memberId, storeId);
        }
        catch(ReviewException e){
            //에러 페이지 띄우기
        }
        return "review/home";
    }

    @RequestMapping(value = "review/{storeId}",method = RequestMethod.DELETE)
    public String delete(HttpServletRequest request, @PathVariable("storeId") int storeId)
    {
        HttpSession session = request.getSession(false);
        String memberStr = (session.getAttribute("memberId")).toString();
        if(memberStr == null){
            return "review/error";
        }
        int memberId = Integer.parseInt(memberStr);
        try{
            deleteService.doService(memberId,storeId);
        }
        catch(ReviewException e){

        }
        return "review/home";
    }

    @RequestMapping(value="review/{storeId}",method=RequestMethod.HEAD)
    public String update(HttpSession session)
    {
        return "review/insert";
    }

    @RequestMapping(value="review/{storeId}",method=RequestMethod.PUT)
    public String update(HttpSession session, @PathVariable("storeId") int storeId){
        String memStr = session.getAttribute("memberId").toString();
        if(memStr == null){
            return "review/error";
        }
        int memberId = Integer.parseInt(memStr);
        try{
            reviewUpdateService.doService(memberId,storeId);
        }
        catch (ReviewException e){

        }
        return "review/home";
    }

    @RequestMapping(value = "review/{storeId}/list",method = RequestMethod.GET)
    public String list(HttpSession session,Model model, @PathVariable("storeId") int storeId){
//        if(session == null){
//            return "review/error";
//        }
        try
        {
            model.addAttribute("list", listService.doService("storeId", storeId));
        }
        catch(ReviewException e){
            e.printStackTrace();
        }
        return "review/list";
    }

    @RequestMapping(value = "/naechelin",method = RequestMethod.GET)
    public String Naechelin(HttpSession session, Model model){

        int memberId = Integer.parseInt(session.getAttribute("sessionId").toString());

        List<NaechelinStarVO> list = naechelinService.doService("memberId",memberId);
        model.addAttribute("list",list);
        return "review/list";
    }

    @RequestMapping(value = "/naechelinguide", method=RequestMethod.GET)
    public String naechelinGuide(HttpSession session,Model model){
        if(session.getAttribute("memberId") == null){
            return "review/error";
        }
        List<NaechelinStarVO> list = naechelinGuideService.doService();
        model.addAttribute("list",list);
        return "review/list";
    }
}
