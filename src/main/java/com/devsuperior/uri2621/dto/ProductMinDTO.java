package com.devsuperior.uri2621.dto;

import com.devsuperior.uri2621.projections.ProductMinProjetion;

public class ProductMinDTO {
	
	private String name;
	
	public ProductMinDTO() {
	}

	public ProductMinDTO(String name) {
		this.name = name;
	}
	
	public ProductMinDTO(ProductMinProjetion projection) {
		name = projection.geName();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ProductMinDTO [name=" + name + "]";
	}
}
