package cf.naechelin.controller;

import cf.naechelin.service.likey.LikeyDeleteServiceImpl;
import cf.naechelin.service.likey.LikeyInsertServiceImpl;
import cf.naechelin.service.likey.LikeyListServiceImpl;
import cf.naechelin.vo.StoreVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LikeyController
{
    @Autowired
    @Qualifier("likeyInsertService")
    LikeyInsertServiceImpl insertService;

    @Autowired
    @Qualifier("likeyDeleteService")
    LikeyDeleteServiceImpl deleteService;

    @Autowired
    @Qualifier("likeyListService")
    LikeyListServiceImpl listService;

    @RequestMapping(value="store/{storeId}/like", method = RequestMethod.POST)
    public void insert(HttpSession session, @PathVariable("storeId") int storeId, Model model){
        if(session == null) { return; }
        int memberId = Integer.parseInt(session.getAttribute("memberId").toString());
        insertService.doService(memberId,storeId);
        model.addAttribute("관심 목록 추가");
    }

    @RequestMapping(value="store/{storeId}/like", method = RequestMethod.DELETE)
    public void delete(HttpSession session, @PathVariable("storeId") int storeId,Model model){
        if(session == null) { return; }
        int memberId = Integer.parseInt(session.getAttribute("memberId").toString());
        insertService.doService(memberId,storeId);
        model.addAttribute("관심 목록 삭제");
    }

    @RequestMapping(value="likey/list", method = RequestMethod.GET)
    public void likeyList(HttpSession session,Model model){
        if(session == null) { return; }
        List<StoreVO> list = new ArrayList<>();
        String memberId = session.getAttribute("memberId").toString();
        listService.doService("member_id",memberId+"");
        model.addAttribute("member_id",memberId);
    }

}
