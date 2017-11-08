package com.gsccs.mall.foundation.dao;

import com.gsccs.mall.core.base.GenericDAO;
import com.gsccs.mall.foundation.domain.Article;

import org.springframework.stereotype.Repository;

@Repository("articleDAO")
public class ArticleDAO extends GenericDAO<Article>
{
}
