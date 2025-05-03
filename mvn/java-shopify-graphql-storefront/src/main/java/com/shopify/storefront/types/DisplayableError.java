package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;
import java.util.List;

/**
 * Represents an error in the input of a mutation.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CartUserError.class, name = "CartUserError"),
    @JsonSubTypes.Type(value = CustomerUserError.class, name = "CustomerUserError"),
    @JsonSubTypes.Type(value = MetafieldDeleteUserError.class, name = "MetafieldDeleteUserError"),
    @JsonSubTypes.Type(value = MetafieldsSetUserError.class, name = "MetafieldsSetUserError"),
    @JsonSubTypes.Type(value = UserError.class, name = "UserError"),
    @JsonSubTypes.Type(value = UserErrorsShopPayPaymentRequestSessionUserErrors.class, name = "UserErrorsShopPayPaymentRequestSessionUserErrors")
})
public interface DisplayableError {
  /**
   * The path to the input field that caused the error.
   */
  List<String> getField();

  /**
   * The error message.
   */
  String getMessage();
}
