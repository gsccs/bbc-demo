 package com.gsccs.mall.foundation.domain.query;
 
 import org.springframework.web.servlet.ModelAndView;

import com.gsccs.mall.core.query.QueryObject;
 
 public class GoodsBrandCategoryQueryObject extends QueryObject
 {
   public GoodsBrandCategoryQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType)
   {
     super(currentPage, mv, orderBy, orderType);
   }
 
   public GoodsBrandCategoryQueryObject()
   {
   }
 }



 
 