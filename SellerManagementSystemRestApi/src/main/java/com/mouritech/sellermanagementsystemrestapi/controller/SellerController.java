package com.mouritech.sellermanagementsystemrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.sellermanagementsystemrestapi.entity.Seller;
import com.mouritech.sellermanagementsystemrestapi.exception.SellerNotFoundException;
import com.mouritech.sellermanagementsystemrestapi.service.SellerService;

@RestController
@RequestMapping("/api/v1")
public class SellerController {
	
	@Autowired
	private SellerService selService;
	
	@PostMapping("/seller") 
	public ResponseEntity<?> saveSeller(@RequestBody Seller newSeller) {
		selService.saveSeller(newSeller);
		return ResponseEntity.ok().body("New seller added successfully");
	}
	
	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> getAllSeller() {
		List<Seller> sellerList = selService.getAllSeller();
		return ResponseEntity.ok().body(sellerList);
	}
	
	@PutMapping("/seller/{selid}")
	public ResponseEntity<?> updateSeller(@PathVariable("selid") Long selid,@RequestBody Seller NewSeller ) throws SellerNotFoundException {
		//Order existingOrder = null;
		selService.updateSeller(selid,NewSeller);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }

	@PutMapping("/seller/{selid}/{selphn}")
	public ResponseEntity<?> updateSellerMobile(@PathVariable("selid") Long selid,
			@PathVariable("selphn") long selphn) throws SellerNotFoundException {
		//Order existingOrder = null;orddate
		selService.updateSellerMobile(selid,selphn);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@PutMapping("/seller/{selid}/{selemail}")
	public ResponseEntity<?> updateSellerEmail(@PathVariable("selid") Long selid,
			@PathVariable("selemail") String selemail) throws SellerNotFoundException {
		//Order existingOrder = null;orddate
		selService.updateSellerEmail(selid,selemail);
		return ResponseEntity.ok().body("Seller updated successfully");
		
	 }
	
	@GetMapping("/seller/{selid}")
	public ResponseEntity<Seller> getSeller(@PathVariable("selid") Long selid) throws SellerNotFoundException {
		Seller seller = selService.getSeller(selid);
		return ResponseEntity.ok().body(seller);
	}
	
	@DeleteMapping("/seller/{selid}")
	public ResponseEntity<?> deleteSeller(@PathVariable("selid") Long selid) throws SellerNotFoundException {
		selService.deleteSeller(selid);
		return ResponseEntity.ok().body("seller deleted successfully");
	}
}
