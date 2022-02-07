package com.mouritech.sellermanagementsystemrestapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.sellermanagementsystemrestapi.entity.Seller;
import com.mouritech.sellermanagementsystemrestapi.exception.SellerNotFoundException;
import com.mouritech.sellermanagementsystemrestapi.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService{

	@Autowired
	private SellerRepository sellerRepository;
	
	@Override
	@Transactional
	public void saveSeller(Seller newSeller) {
		sellerRepository.save(newSeller);
		
	}
	@Override
	@Transactional
	public List<Seller> getAllSeller() {
		
		return sellerRepository.findAll();
	}
	@Override
	@Transactional
	public void updateSeller(Long selid, Seller newSeller) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
		existingSeller.setSellerName(newSeller.getSellerName());
		existingSeller.setSellerEmail(newSeller.getSellerEmail());
		existingSeller.setSellerPhn(newSeller.getSellerPhn());
		existingSeller.setSellerCity(newSeller.getSellerCity());
		existingSeller.setSellerCategory(newSeller.getSellerCategory());
		
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	@Transactional
	public void updateSellerMobile(Long selid, long selphn) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
		existingSeller.setSellerPhn(selphn);
		
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	@Transactional
	public void updateSellerEmail(Long selid, String selemail) {
		Seller existingSeller = null;
		try {
			existingSeller = sellerRepository.findById(selid)
					.orElseThrow(() -> new SellerNotFoundException(selid));
		existingSeller.setSellerEmail(selemail);
		
			sellerRepository.save(existingSeller);
		} catch (SellerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	@Transactional
	public Seller getSeller(Long ordid) throws SellerNotFoundException {
		return sellerRepository.findById(ordid).orElseThrow(() -> new SellerNotFoundException(ordid));
		
	}
	@Override
	@Transactional
	public void deleteSeller(Long ordid) {
		sellerRepository.deleteById(ordid);
		
	}

}
