package cn.controller;

import cn.entity.Deliver;
import cn.entity.Firm;
import cn.entity.Post;
import cn.entity.User;
import cn.service.DeliverService;
import cn.service.FirmService;
import cn.service.PostService;
import cn.tool.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@RequestMapping("/deliver")
public class DeliverController {

    @Autowired
    private DeliverService deliverService;



    @RequestMapping("doadd")
    public String insertSelective(Deliver deliver){
        deliver.setResult("未通过");
        deliver.setAudit(0);
        deliver.setIsdel(0);
        int con=deliverService.insertSelective(deliver);
        if(con>0){
            return "redirect:"+ Const.ROOT01+"panduan/getNotice";
        }else {
            return null;
        }
    }

    @RequestMapping("getDeliver")
    public String getDeliver(HttpSession session,Model model){
    	Object obj=session.getAttribute("user");
    	if(obj!=null){
	        String firm=((Firm)obj).getFirm();
	        List<Deliver> delivers=deliverService.getDeliver(firm);
	        model.addAttribute("delivers",delivers);
    	}
        return "toudi";
    }

    @RequestMapping("doupdate")
    public String updateByPrimaryKeySelective(Deliver deliver){
        deliver.setAudit(1);
        deliver.setResult("已通过");
        int con=deliverService.updateByPrimaryKeySelective(deliver);
        if(con>0){
            return "redirect:"+ Const.ROOT01+"deliver/getDeliver";
        }else {
            return null;
        }
    }

    @RequestMapping("getUserDeliver")
    public String getUserDeliver(HttpSession session,Model model){
        Integer user=((User)session.getAttribute("user")).getId();
        List<Deliver> delivers=deliverService.getUserDeliver(user);
        model.addAttribute("delivers",delivers);
        return "liebiao";
    }

    @RequestMapping("getDeliver1")
    public String getDeliver1(HttpSession session,Model model){
        Object obj=session.getAttribute("user");
        if(obj!=null){
            String firm=((Firm)obj).getFirm();
            List<Deliver> delivers=deliverService.getDeliver1(firm);
            model.addAttribute("delivers",delivers);
        }
        return "toudi1";
    }
    @RequestMapping("getDeliver2")
    public String getDeliver2(HttpSession session,Model model){
        Object obj=session.getAttribute("user");
        if(obj!=null){
            String firm=((Firm)obj).getFirm();
            List<Deliver> delivers=deliverService.getDeliver2(firm);
            model.addAttribute("delivers",delivers);
        }
        return "toudi2";
    }
    @RequestMapping("getDeliver3")
    public String getDeliver3(HttpSession session,Model model){
        Object obj=session.getAttribute("user");
        if(obj!=null){
            String firm=((Firm)obj).getFirm();
            List<Deliver> delivers=deliverService.getDeliver3(firm);
            model.addAttribute("delivers",delivers);
        }
        return "toudi3";
    }

    @RequestMapping("getDeliver31")
    public String getDeliver31(HttpSession session,Model model){
        Object obj=session.getAttribute("user");
        if(obj!=null){
            String firm=((Firm)obj).getFirm();
            List<Deliver> delivers=deliverService.getDeliver31(firm);
            model.addAttribute("delivers",delivers);
        }
        return "toudi31";
    }

    @RequestMapping("getDeliver4")
    public String getDeliver4(HttpSession session,Model model){
        Object obj=session.getAttribute("user");
        if(obj!=null){
            String firm=((Firm)obj).getFirm();
            List<Deliver> delivers=deliverService.getDeliver4(firm);
            model.addAttribute("delivers",delivers);
        }
        return "toudi4";
    }

    @RequestMapping("doupdate1")
    public String updateByPrimaryKeySelective1(Deliver deliver){
        deliver.setAudit(2);
        deliver.setResult("已通过");
        int con=deliverService.updateByPrimaryKeySelective(deliver);
        if(con>0){
            return "redirect:"+ Const.ROOT01+"deliver/getDeliver1";
        }else {
            return null;
        }
    }

    @RequestMapping("doupdate2")
    public String updateByPrimaryKeySelective2(Deliver deliver){
        deliver.setAudit(3);
        deliver.setResult("已通过");
        int con=deliverService.updateByPrimaryKeySelective(deliver);
        if(con>0){
            return "redirect:"+ Const.ROOT01+"deliver/getDeliver2";
        }else {
            return null;
        }
    }

    @RequestMapping("doupdate3")
    public String updateByPrimaryKeySelective3(Deliver deliver){
        deliver.setAudit(4);
        deliver.setResult("已通过");
        int con=deliverService.updateByPrimaryKeySelective(deliver);
        if(con>0){
            return "redirect:"+ Const.ROOT01+"deliver/getDeliver3";
        }else {
            return null;
        }
    }

    @RequestMapping("doupdate4")
    public String updateByPrimaryKeySelective4(Deliver deliver){
        deliver.setAudit(1);
        deliver.setResult("已通过");
        int con=deliverService.updateByPrimaryKeySelective(deliver);
        if(con>0){
            return "redirect:"+ Const.ROOT01+"deliver/getDeliver3";
        }else {
            return null;
        }
    }

    @RequestMapping("doupdate9")
    public String updateByPrimaryKeySelective9(Deliver deliver){
        deliver.setAudit(9);
        deliver.setResult("已通过");
        int con=deliverService.updateByPrimaryKeySelective(deliver);
        if(con>0){
            return "redirect:"+ Const.ROOT01+"deliver/getDeliver1";
        }else {
            return null;
        }
    }

}
