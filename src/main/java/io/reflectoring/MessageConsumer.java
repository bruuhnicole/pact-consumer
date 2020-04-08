package io.reflectoring;


import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;

import java.io.IOException;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageConsumer {

  private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

  private ObjectMapper objectMapper;

  public MessageConsumer(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  public void consumeStringMessage(String messageString) throws IOException {
    logger.info("Consuming message '{}'", messageString);
    ProductCreatedMessage message = objectMapper.readValue(messageString, ProductCreatedMessage.class);
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
    Set<ConstraintViolation<ProductCreatedMessage>> violations = validator.validate(message);
    if(!violations.isEmpty()){
      throw new ConstraintViolationException(violations);
    }
  }

}
