package com.cg.business.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cg.business.beans.MerchantBean;
import com.cg.business.beans.OrderBean;
import com.cg.business.beans.PaymentDetailsBean;
import com.cg.business.beans.ProductBean;
import com.cg.business.service.BusinessService;


import comc.cg.business.exception.BusinessException;

@RestController
public class BusinessController {
	@Autowired
BusinessService service;
	/*@RequestMapping(value="/generateanalysis",method=RequestMethod.GET)
	public ProductBean generateAnalysis( String emailId, String productId) throws BusinessException {
		
		return service.generateAnalysis(emailId, productId);
		
	}*/
	
	@RequestMapping(value="/generateanalysis",method=RequestMethod.GET)
	public List<PaymentDetailsBean> transactionAnalysis(Date start, Date end){
		
		return service.transactionAnalysis(start, end);
}
	
	@RequestMapping(value="/merchant",method=RequestMethod.GET)
	public MerchantBean category(String emailId) throws BusinessException{
		return service.category(emailId);
		
	}
	@RequestMapping(value="/report",method=RequestMethod.GET)
	public OrderBean getDetails(String orderId) throws BusinessException {
		return service.getDetails(orderId);
	}
	
}
