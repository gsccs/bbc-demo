 package com.gsccs.mall.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.gsccs.mall.core.query.QueryObject;
 
 public class PredepositCashQueryObject extends QueryObject
 {
   public PredepositCashQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public PredepositCashQueryObject()
   {
   }
 }



 
 