package com.gsccs.mall.foundation.service;

import com.gsccs.mall.core.query.support.IPageList;
import com.gsccs.mall.core.query.support.IQueryObject;
import com.gsccs.mall.foundation.domain.ExpressCompany;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IExpressCompanyService
{
  public abstract boolean save(ExpressCompany paramExpressCompany);

  public abstract ExpressCompany getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(ExpressCompany paramExpressCompany);

  public abstract List<ExpressCompany> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 