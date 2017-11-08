package com.gsccs.mall.foundation.service;

import com.gsccs.mall.core.query.support.IPageList;
import com.gsccs.mall.core.query.support.IQueryObject;
import com.gsccs.mall.foundation.domain.GroupGoods;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IGroupGoodsService
{
  public abstract boolean save(GroupGoods paramGroupGoods);

  public abstract GroupGoods getObjById(Long paramLong);

  public abstract boolean delete(Long paramLong);

  public abstract boolean batchDelete(List<Serializable> paramList);

  public abstract IPageList list(IQueryObject paramIQueryObject);

  public abstract boolean update(GroupGoods paramGroupGoods);

  public abstract List<GroupGoods> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}



 
 