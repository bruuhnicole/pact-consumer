package io.reflectoring;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ProductCreatedMessage {

	@NotNull
	private String messageUuid;

	@NotNull
	private Product product;

}
