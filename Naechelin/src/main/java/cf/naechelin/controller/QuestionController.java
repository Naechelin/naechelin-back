package cf.naechelin.controller;

import cf.naechelin.service.question.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    @Qualifier("questionAnswerDeleteService")
    QuestionAnswerDeleteService questionAnswerDeleteService;

    @Autowired
    @Qualifier("questionAnswerInsertService")
    QuestionAnswerInsertService questionAnswerInsertService;

    @Autowired
    @Qualifier("questionDeleteService")
    QuestionDeleteService questionDeleteService;

    @Autowired
    @Qualifier("questionFindDetailService")
    QuestionFindDetailService questionFineDetailService;

    @Autowired
    @Qualifier("questionFindListService")
    QuestionFindListService questionFindListService;

    @Autowired
    @Qualifier("questionUpdateService")
    QuestionUpdateService questionUpdateService;

    @RequestMapping(method=RequestMethod.PUT)
    public String insert()
    {
        return "question/insert";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String insert(HttpSession session)
    {
        return "insert";
    }

    @RequestMapping(method=RequestMethod.HEAD)
    public String update()
    {
        return "update";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String update(HttpSession session)
    {
        return "update";
    }

    @RequestMapping(value="/{memberId}", method=RequestMethod.DELETE)
    public String delete(HttpSession session, @PathVariable("questionId") int questionId)
    {
        return "delete";
    }

    @RequestMapping(method=RequestMethod.GET)
    public String findList(HttpSession session)
    {
        return "findList";
    }

    @RequestMapping(value="/{questionId}", method=RequestMethod.GET)
    public String findDetail(HttpSession session)
    {
        return "findDetail";
    }

    @RequestMapping(value="/answer/{questionId}", method=RequestMethod.GET)
    public String answerInsert()
    {
        return "answer";
    }

    @RequestMapping(value="/answer/{questionId}", method=RequestMethod.POST)
    public String answerInsert(HttpSession session)
    {
        return "answerInsert";
    }

    @RequestMapping(value="/answer/{questionId}", method=RequestMethod.DELETE)
    public String answerDelete(Model model)
    {
        return "answerDelete";
    }
}
