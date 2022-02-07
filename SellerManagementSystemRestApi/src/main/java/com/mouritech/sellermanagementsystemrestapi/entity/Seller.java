package com.mouritech.sellermanagementsystemrestapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "seller_details")
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seller_id")
	private Long sellerId;
	
	@Column(name = "seller_name")
	@NotNull
	private String sellerName;
	
	@Column(name = "seller_email")
	@NotNull
	private String sellerEmail;
	
	@Column(name = "seller_city")
	@NotNull
	private String sellerCity;
	
	@Column(name = "seller_phn")
	@NotNull
	private long sellerPhn;
	
	@Column(name = "seller_cat")
	@NotNull
	private String sellerCategory;

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerEmail() {
		return sellerEmail;
	}

	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}

	public String getSellerCity() {
		return sellerCity;
	}

	public void setSellerCity(String sellerCity) {
		this.sellerCity = sellerCity;
	}

	public long getSellerPhn() {
		return sellerPhn;
	}

	public void setSellerPhn(long sellerPhn) {
		this.sellerPhn = sellerPhn;
	}

	public String getSellerCategory() {
		return sellerCategory;
	}

	public void setSellerCategory(String sellerCategory) {
		this.sellerCategory = sellerCategory;
	}

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seller(Long sellerId, String sellerName, String sellerEmail, String sellerCity, long sellerPhn,
			String sellerCategory) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerCity = sellerCity;
		this.sellerPhn = sellerPhn;
		this.sellerCategory = sellerCategory;
	}

	public Seller(String sellerName, String sellerEmail, String sellerCity, long sellerPhn, String sellerCategory) {
		super();
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerCity = sellerCity;
		this.sellerPhn = sellerPhn;
		this.sellerCategory = sellerCategory;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", sellerCity=" + sellerCity + ", sellerPhn=" + sellerPhn + ", sellerCategory=" + sellerCategory
				+ "]";
	}
	
}
