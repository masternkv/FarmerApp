package com.farmer.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Component
@Entity
@Table(name="farmer_info")
@DynamicInsert
@DynamicUpdate
public class Farmer {
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private int f_id;
	 private String f_name;
	 private String f_midd_name;
	 private String f_last_name;
	 private String f_gender;
	 private String f_dob;
	 private String f_address;
	 private long f_pri_mobile_no;
	 private long f_seco_mobile_no;
	 private String f_state;
	 private String f_dist_code;
	 private String f_sub_dist_code;
	 private String f_vill_block;
	 private String f_village;
	 private String f_type;
	 private String f_land_type;
	 private String f_cast;
	 private String f_pan_no;
	 private String f_adhar_no;
	 
	 @JsonManagedReference
		@OneToMany(cascade=CascadeType.ALL,
				   fetch=FetchType.EAGER,
				   mappedBy="farmer") 
	 List<Product> product_info;

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getF_midd_name() {
		return f_midd_name;
	}

	public void setF_midd_name(String f_midd_name) {
		this.f_midd_name = f_midd_name;
	}

	public String getF_last_name() {
		return f_last_name;
	}

	public void setF_last_name(String f_last_name) {
		this.f_last_name = f_last_name;
	}

	public String getF_gender() {
		return f_gender;
	}

	public void setF_gender(String f_gender) {
		this.f_gender = f_gender;
	}

	public String getF_dob() {
		return f_dob;
	}

	public void setF_dob(String f_dob) {
		this.f_dob = f_dob;
	}

	public String getF_address() {
		return f_address;
	}

	public void setF_address(String f_address) {
		this.f_address = f_address;
	}

	public long getF_pri_mobile_no() {
		return f_pri_mobile_no;
	}

	public void setF_pri_mobile_no(long f_pri_mobile_no) {
		this.f_pri_mobile_no = f_pri_mobile_no;
	}

	public long getF_seco_mobile_no() {
		return f_seco_mobile_no;
	}

	public void setF_seco_mobile_no(long f_seco_mobile_no) {
		this.f_seco_mobile_no = f_seco_mobile_no;
	}

	public String getF_state() {
		return f_state;
	}

	public void setF_state(String f_state) {
		this.f_state = f_state;
	}

	public String getF_dist_code() {
		return f_dist_code;
	}

	public void setF_dist_code(String f_dist_code) {
		this.f_dist_code = f_dist_code;
	}

	public String getF_sub_dist_code() {
		return f_sub_dist_code;
	}

	public void setF_sub_dist_code(String f_sub_dist_code) {
		this.f_sub_dist_code = f_sub_dist_code;
	}

	public String getF_vill_block() {
		return f_vill_block;
	}

	public void setF_vill_block(String f_vill_block) {
		this.f_vill_block = f_vill_block;
	}

	public String getF_village() {
		return f_village;
	}

	public void setF_village(String f_village) {
		this.f_village = f_village;
	}

	public String getF_type() {
		return f_type;
	}

	public void setF_type(String f_type) {
		this.f_type = f_type;
	}

	public String getF_land_type() {
		return f_land_type;
	}

	public void setF_land_type(String f_land_type) {
		this.f_land_type = f_land_type;
	}

	public String getF_cast() {
		return f_cast;
	}

	public void setF_cast(String f_cast) {
		this.f_cast = f_cast;
	}

	public String getF_pan_no() {
		return f_pan_no;
	}

	public void setF_pan_no(String f_pan_no) {
		this.f_pan_no = f_pan_no;
	}

	public String getF_adhar_no() {
		return f_adhar_no;
	}

	public void setF_adhar_no(String f_adhar_no) {
		this.f_adhar_no = f_adhar_no;
	}

	public List<Product> getProduct_info() {
		return product_info;
	}

	public void setProduct_info(List<Product> product_info) {
		this.product_info = product_info;
	}

	@Override
	public String toString() {
		return "Farmer [f_id=" + f_id + ", f_name=" + f_name + ", f_midd_name=" + f_midd_name + ", f_last_name="
				+ f_last_name + ", f_gender=" + f_gender + ", f_dob=" + f_dob + ", f_address=" + f_address
				+ ", f_pri_mobile_no=" + f_pri_mobile_no + ", f_seco_mobile_no=" + f_seco_mobile_no + ", f_state="
				+ f_state + ", f_dist_code=" + f_dist_code + ", f_sub_dist_code=" + f_sub_dist_code + ", f_vill_block="
				+ f_vill_block + ", f_village=" + f_village + ", f_type=" + f_type + ", f_land_type=" + f_land_type
				+ ", f_cast=" + f_cast + ", f_pan_no=" + f_pan_no + ", f_adhar_no=" + f_adhar_no + ", product_info="
				+ product_info + "]";
	}

	 
	 

}
