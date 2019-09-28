package com.gye.controller;

import com.gye.domain.Detail;
import com.gye.domain.Paytype;
import com.gye.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    private DetailService detailService;

    //保存
    @RequestMapping(value = "/save",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Detail detail){
        detailService.save(detail);
        return "保存成功";
    }

    @RequestMapping(value = "/updateEntity",produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String updateEntity(Detail detail, HttpServletRequest request){
        String paynum = request.getParameter("show");
        detail.setPid(paynum);
        Paytype paytype = new Paytype();
        paytype.setPayname(paynum);

        detailService.updateEntity(detail);
        return "修改成功";
    }
    //查询
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Detail> detailList = detailService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("detailList",detailList);
        modelAndView.setViewName("detailList");
        return modelAndView;
    }

    //删除
    @RequestMapping("/del/{id}")
    public String del(@PathVariable("id") int id){
        detailService.del(id);
        return "redirect:/detail/findAll";
    }

    //修改
    @RequestMapping("/update/{id}")
    public ModelAndView update(@PathVariable("id") int id){
        Detail detail = detailService.update(id);
        List<Paytype> paytypeList = detailService.findAllByPayType();
        detail.setList(paytypeList);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("detail",detail);
        modelAndView.setViewName("update");
        return modelAndView;
    }

}
