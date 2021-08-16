package com.farmer.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Component
@Entity
@Table(name="product_info")
@DynamicInsert
@DynamicUpdate
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int product_id;
	private String product_name;
	private String product_desc;
	private String product_price;
	private String product_status;
	private String product_other_detail;
	private int product_qty;
	private int product_img_loc;
	@JsonBackReference
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="f_id",insertable=false, updatable=false, 
	        nullable=true)
	private Farmer farmer;
	
	 @Column(name = "f_id")
	 @JsonProperty("f_id")
	 private Integer f_id;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_desc() {
		return product_desc;
	}

	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}

	public String getProduct_price() {
		return product_price;
	}

	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}

	public String getProduct_status() {
		return product_status;
	}

	public void setProduct_status(String product_status) {
		this.product_status = product_status;
	}

	public String getProduct_other_detail() {
		return product_other_detail;
	}

	public void setProduct_other_detail(String product_other_detail) {
		this.product_other_detail = product_other_detail;
	}

	public int getProduct_qty() {
		return product_qty;
	}

	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}

	public int getProduct_img_loc() {
		return product_img_loc;
	}

	public void setProduct_img_loc(int product_img_loc) {
		this.product_img_loc = product_img_loc;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	
	


	public Integer getF_id() {
		return f_id;
	}

	public void setF_id(Integer f_id) {
		this.f_id = f_id;
	}

	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_desc=" + product_desc
				+ ", product_price=" + product_price + ", product_status=" + product_status + ", product_other_detail="
				+ product_other_detail + ", product_qty=" + product_qty + ", product_img_loc=" + product_img_loc
				+ ", farmer=" + farmer + "]";
	}
	
	
}
