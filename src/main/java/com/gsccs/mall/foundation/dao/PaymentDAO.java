package com.gsccs.mall.foundation.dao;

import com.gsccs.mall.core.base.GenericDAO;
import com.gsccs.mall.foundation.domain.Payment;

import org.springframework.stereotype.Repository;

@Repository("paymentDAO")
public class PaymentDAO extends GenericDAO<Payment>
{
}
