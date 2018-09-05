package com.cg.business.repo;

import java.sql.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.business.beans.MerchantBean;
import com.cg.business.beans.OrderBean;
import com.cg.business.beans.PaymentDetailsBean;
import com.cg.business.beans.ProductBean;




@Repository
public interface BusinessRepository extends JpaRepository<ProductBean, String>{
	
	
	@Query("select a from PaymentDetailsBean a where a.transactionDate BETWEEN (:start) AND (:end)")
	List<PaymentDetailsBean> transactionAnalysis(@Param(value="start") Date start,@Param(value="end") Date end);
	
	@Query(value="select a from MerchantBean a where a.emailId=(:emailId) ")
	MerchantBean getId(@Param(value="emailId")String emailId);
	
	@Query(value="select a from OrderBean a where a.orderId=(:orderId) ")
	OrderBean getDetails(@Param(value="orderId")String orderId);

	
	
	
	
	
}
