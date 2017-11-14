package com.gsccs.mall.weixin.services;


import javax.annotation.PostConstruct;

import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpMessageRouter;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import me.chanjar.weixin.mp.bean.kefu.result.WxMpKfOnlineList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsccs.mall.foundation.service.ISysConfigService;


@Service
public class WeixinService extends WxMpServiceImpl {
  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private ISysConfigService configService;

  @PostConstruct
  public void init() {
    final WxMpInMemoryConfigStorage config = new WxMpInMemoryConfigStorage();
    config.setAppId(this.configService.getSysConfig().getWxAppid());// 设置微信公众号的appid
    config.setSecret(this.configService.getSysConfig().getWxSecret());// 设置微信公众号的app corpSecret
    config.setToken(this.configService.getSysConfig().getWxToken());// 设置微信公众号的token
    config.setAesKey(this.configService.getSysConfig().getWxAesKey());// 设置消息加解密密钥
    super.setWxMpConfigStorage(config);

    this.refreshRouter();
  }

  private void refreshRouter() {
    final WxMpMessageRouter newRouter = new WxMpMessageRouter(this);
    
  }


  public boolean hasKefuOnline() {
    try {
      WxMpKfOnlineList kfOnlineList = this.getKefuService().kfOnlineList();
      return kfOnlineList != null && kfOnlineList.getKfOnlineList().size() > 0;
    } catch (Exception e) {
      this.logger.error("获取客服在线状态异常: " + e.getMessage(), e);
    }

    return false;
  }


}