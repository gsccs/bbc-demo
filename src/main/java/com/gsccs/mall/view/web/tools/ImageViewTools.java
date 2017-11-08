 package com.gsccs.mall.view.web.tools;
 
 import com.gsccs.mall.foundation.domain.Accessory;
import com.gsccs.mall.foundation.domain.SysConfig;
import com.gsccs.mall.foundation.service.ISysConfigService;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
 @Component
 public class ImageViewTools
 {
 
   @Autowired
   private ISysConfigService configService;
 
   public String random_login_img()
   {
     String img = "";
     SysConfig config = this.configService.getSysConfig();
     if (config.getLogin_imgs().size() > 0) {
       Random random = new Random();
       Accessory acc = (Accessory)config.getLogin_imgs().get(
         random.nextInt(config.getLogin_imgs().size()));
       img = acc.getPath() + "/" + acc.getName();
     } else {
       img = "resources/style/common/images/login_img.jpg";
     }
     return img;
   }
 }


 
 
 