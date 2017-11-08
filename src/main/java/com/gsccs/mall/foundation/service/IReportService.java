package com.gsccs.mall.foundation.service;

import com.gsccs.mall.core.query.support.IPageList;
import com.gsccs.mall.core.query.support.IQueryObject;
import com.gsccs.mall.foundation.domain.Report;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IReportService
{
  public abstract boolean save(Report paramReport);

  public abstract Report getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(Report paramReport);

  public abstract List<Report> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 