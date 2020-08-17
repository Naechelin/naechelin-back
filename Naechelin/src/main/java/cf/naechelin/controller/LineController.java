package cf.naechelin.controller;

import cf.naechelin.service.line.LineService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller()
@RequestMapping("/line")
public class LineController
{
    private LineService service;

    @RequestMapping(method = RequestMethod.HEAD)
    public String insert()
    {
        return "insert";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String insert(HttpSession session)
    {
        return "insert";
    }

    /*
    public String update(HttpSession session)
    {
        return "update";
    }
    */

    @RequestMapping(value = "/{lineId}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("lineId") int lineId, HttpSession session)
    {
        return "delete";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String view(HttpSession session)
    {
        return "line";
    }

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    public String list(HttpSession session)
    {
        return "list";
    }
}
