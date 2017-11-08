 package com.gsccs.mall.view.web.action;
 
 import com.gsccs.mall.core.mv.JModelAndView;
import com.gsccs.mall.foundation.domain.Document;
import com.gsccs.mall.foundation.service.IDocumentService;
import com.gsccs.mall.foundation.service.ISysConfigService;
import com.gsccs.mall.foundation.service.IUserConfigService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
 @Controller
 public class DocumentViewAction
 {
 
   @Autowired
   private ISysConfigService configService;
 
   @Autowired
   private IUserConfigService userConfigService;
 
   @Autowired
   private IDocumentService documentService;
 
   @RequestMapping({"/doc.htm"})
   public ModelAndView doc(HttpServletRequest request, HttpServletResponse response, String mark)
   {
     ModelAndView mv = new JModelAndView("doc.html", this.configService
       .getSysConfig(), this.userConfigService.getUserConfig(), 1, 
       request, response);
     Document obj = this.documentService.getObjByProperty("mark", mark);
     mv.addObject("obj", obj);
     return mv;
   }
 }


 
 
 