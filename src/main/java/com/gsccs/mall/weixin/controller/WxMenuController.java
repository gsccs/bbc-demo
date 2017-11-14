package com.gsccs.mall.weixin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpMenuService;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.menu.WxMpGetSelfMenuInfoResult;
import me.chanjar.weixin.mp.bean.menu.WxMpMenu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gsccs.mall.core.annotation.SecurityMapping;
import com.gsccs.mall.core.mv.JModelAndView;
import com.gsccs.mall.foundation.service.ISysConfigService;
import com.gsccs.mall.foundation.service.IUserConfigService;

@Controller
public class WxMenuController implements WxMpMenuService{
	
	
	private static final String CACHENAME = "/wxappmenu/list";
	private static final String CACHENAME_KEY = "key";
	
	@Autowired
	private ISysConfigService configService;
	@Autowired
	private IUserConfigService userConfigService;
	@Autowired
	private WxMpService wxService;
	
	
	@SecurityMapping(display = false, rsequence = 0, title="微商城配置", value="/admin/set_wxmenu.htm*", rtype="admin", rname="微信店铺", rcode="weixin_admin", rgroup="运营")
	@RequestMapping({"/admin/set_wxmenu.htm"})
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
		System.out.println("wx_menu");
		 ModelAndView mv = new JModelAndView("admin/blue/wx_menu.html", 
			       this.configService.getSysConfig(), this.userConfigService
			       .getUserConfig(), 0, request, response);
		 return mv;
	}
	
	
	public void list(){
		//获取公众号已设置的菜单列表
		String appid = configService.getSysConfig().getWxAppid();
		if(appid == null ){
			//rendFailedJson("没有绑定公众账号");
			return;
		}
		
		/*String authAppId = getUsedAuthUser().getAppId();
		ApiResult apiResult = CacheKit.get(CACHENAME, CACHENAME_KEY + authAppId);
		if(apiResult == null){
			apiResult = MenuApi.getMenu();
			
			if(apiResult.isAccessTokenInvalid()){
				rendFailedJson("请重新绑定公众号");
				return;
			}
			if(!apiResult.isSucceed()){
				rendFailedJson("调用获取菜单接口失败");
				return;
			}
			CacheKit.put(CACHENAME, CACHENAME_KEY + authAppId, apiResult);
		}*/
		
		//rendSuccessJson(apiResult);
	}


	@Override
	public WxMpGetSelfMenuInfoResult getSelfMenuInfo() throws WxErrorException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String menuCreate(WxMenu arg0) throws WxErrorException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String menuCreate(String arg0) throws WxErrorException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void menuDelete() throws WxErrorException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void menuDelete(String arg0) throws WxErrorException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public WxMpMenu menuGet() throws WxErrorException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public WxMenu menuTryMatch(String arg0) throws WxErrorException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
