package com.gsccs.mall.foundation.dao;

import com.gsccs.mall.core.base.GenericDAO;
import com.gsccs.mall.foundation.domain.Message;

import org.springframework.stereotype.Repository;

@Repository("messageDAO")
public class MessageDAO extends GenericDAO<Message>
{
}

