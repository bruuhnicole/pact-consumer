package com.product.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Product {

	@NotNull
	@JsonProperty("id")
	private long id;

	@NotNull
	@JsonProperty("name")
	private String name;

}
