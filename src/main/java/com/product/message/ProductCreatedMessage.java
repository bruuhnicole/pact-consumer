package com.product.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProductCreatedMessage {

	@NotNull
	@JsonProperty("messageUuid")
	private String messageUuid;

	@NotNull
	@JsonProperty("product")
	private Product product;

}
