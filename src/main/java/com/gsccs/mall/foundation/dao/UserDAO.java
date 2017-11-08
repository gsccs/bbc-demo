package com.gsccs.mall.foundation.dao;

import com.gsccs.mall.core.base.GenericDAO;
import com.gsccs.mall.foundation.domain.User;

import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO extends GenericDAO<User>
{
}

