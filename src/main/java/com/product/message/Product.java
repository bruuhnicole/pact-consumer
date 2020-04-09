package com.product.message;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {

	@NotNull
	@JsonProperty("id")
	private long id;

	@NotNull
	@JsonProperty("name")
	private String name;

}
