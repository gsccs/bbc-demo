 package com.gsccs.mall.manage.buyer.action;
 
 import com.gsccs.mall.core.annotation.SecurityMapping;
import com.gsccs.mall.core.domain.virtual.SysMap;
import com.gsccs.mall.core.mv.JModelAndView;
import com.gsccs.mall.core.query.support.IPageList;
import com.gsccs.mall.core.security.support.SecurityUserHolder;
import com.gsccs.mall.core.tools.CommUtil;
import com.gsccs.mall.foundation.domain.User;
import com.gsccs.mall.foundation.domain.query.ConsultQueryObject;
import com.gsccs.mall.foundation.service.IConsultService;
import com.gsccs.mall.foundation.service.ISysConfigService;
import com.gsccs.mall.foundation.service.IUserConfigService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 @Controller
 public class ConsultBuyerAction
 {
 
   @Autowired
   private ISysConfigService configService;
 
   @Autowired
   private IUserConfigService userConfigService;
 
   @Autowired
   private IConsultService consultService;
 
   @SecurityMapping(display = false, rsequence = 0, title="买家咨询列表", value="/buyer/consult.htm*", rtype="buyer", rname="用户中心", rcode="user_center", rgroup="用户中心")
   @RequestMapping({"/buyer/consult.htm"})
   public ModelAndView consult(HttpServletRequest request, HttpServletResponse response, String reply, String currentPage)
   {
     ModelAndView mv = new JModelAndView(
       "user/default/usercenter/buyer_consult.html", this.configService
       .getSysConfig(), 
       this.userConfigService.getUserConfig(), 0, request, response);
     ConsultQueryObject qo = new ConsultQueryObject(currentPage, mv, 
       "addTime", "desc");
     if (!CommUtil.null2String(reply).equals("")) {
       qo.addQuery("obj.reply", 
         new SysMap("reply", 
         Boolean.valueOf(CommUtil.null2Boolean(reply))), "=");
     }
     qo.addQuery("obj.consult_user.id", 
       new SysMap("consult_user", 
       SecurityUserHolder.getCurrentUser().getId()), "=");
     IPageList pList = this.consultService.list(qo);
     CommUtil.saveIPageList2ModelAndView("", "", "", pList, mv);
     mv.addObject("reply", CommUtil.null2String(reply));
     return mv;
   }
 }


 
 
 