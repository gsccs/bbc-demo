package com.gsccs.mall.foundation.service;

import com.gsccs.mall.core.query.support.IPageList;
import com.gsccs.mall.core.query.support.IQueryObject;
import com.gsccs.mall.foundation.domain.StoreGradeLog;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IStoreGradeLogService
{
  public abstract boolean save(StoreGradeLog paramStoreGradeLog);

  public abstract StoreGradeLog getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(StoreGradeLog paramStoreGradeLog);

  public abstract List<StoreGradeLog> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 