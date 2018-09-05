package com.cg.business.service;

import java.sql.Date;
import java.util.List;

import com.cg.business.beans.AdminBean;
import com.cg.business.beans.MerchantBean;
import com.cg.business.beans.OrderBean;
import com.cg.business.beans.PaymentDetailsBean;
import com.cg.business.beans.ProductBean;

import comc.cg.business.exception.BusinessException;

public interface BusinessService {
	/*ProductBean generateAnalysis(String emailId, String productId) throws BusinessException;*/
	public List<PaymentDetailsBean> transactionAnalysis(Date start, Date end);
	
	public MerchantBean category(String emailId) throws BusinessException;
	
	public OrderBean getDetails(String orderId) throws BusinessException;
	
	
}
