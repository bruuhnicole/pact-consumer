package io.reflectoring;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ProductCreatedMessage {

	@NotNull
	@JsonProperty("messageUuid")
	private String messageUuid;

	@NotNull
	@JsonProperty("product")
	private Product product;

}
