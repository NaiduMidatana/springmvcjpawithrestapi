package com.mouritech.sellermanagementsystemrestapi.service;

import java.util.List;

import com.mouritech.sellermanagementsystemrestapi.entity.Seller;
import com.mouritech.sellermanagementsystemrestapi.exception.SellerNotFoundException;

public interface  SellerService {

	
	void saveSeller(Seller newSeller);

	List<Seller> getAllSeller();

	void updateSeller(Long selid, Seller newSeller);

	void updateSellerMobile(Long selid, long selphn);

	void updateSellerEmail(Long selid, String selemail);

	Seller getSeller(Long ordid) throws SellerNotFoundException;

	void deleteSeller(Long ordid);

}
