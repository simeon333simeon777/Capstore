package com.cg.business.service;

import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.business.beans.AdminBean;
import com.cg.business.beans.MerchantBean;
import com.cg.business.beans.OrderBean;
import com.cg.business.beans.PaymentDetailsBean;
import com.cg.business.beans.ProductBean;
import com.cg.business.repo.BusinessRepository;

import comc.cg.business.exception.BusinessException;
@Service
public class BusinessServiceImpl implements BusinessService{
	@Autowired
	BusinessRepository repo;
	/*@Transactional
	@Override
	public ProductBean generateAnalysis(String emailId, String productId) throws BusinessException {
		ProductBean product1=new ProductBean();
		AdminBean admin1=repo.getDetails(emailId);
		System.out.println(admin1);
		//System.out.println(productId);
		System.out.println(product1);
		if(admin1.getEmailId().equals(emailId)&&(product1.getProductId().equals(productId))) {
			//product1.getProductId(product1);
			product1.setCategory(product.getCategory());
			product1.setFeedbackProduct(product.getFeedbackProduct());
			product1.setMerchant(product.getMerchant());
			product1.setCategory(product.getProductName());
			product1.setPrice(product.getPrice());
			product1.setProductName(product.getProductName());
			product1.setQuantity(product.getQuantity());
			product1.setPromoCode(product.getPromoCode());
			product1.setDiscount(product.getDiscount());

			//System.out.println(product1);
			//repo.save(product1);


			return product1;
		}
		else {
			throw new BusinessException("business analysis can not be generated");
		}


	}*/
	@Override
	public List<PaymentDetailsBean> transactionAnalysis(Date start, Date end){
		
		return repo.transactionAnalysis(start, end);
	}
	@Override
	public MerchantBean category(String emailId) throws BusinessException{
		
		return repo.getId(emailId);
	}
	@Override
	public OrderBean getDetails(String orderId) throws BusinessException {
		
		return repo.getDetails(orderId);
	}
	
}



