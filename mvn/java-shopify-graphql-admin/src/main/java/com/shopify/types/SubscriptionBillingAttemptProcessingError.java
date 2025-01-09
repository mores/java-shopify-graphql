package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * An error that prevented a billing attempt.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptGenericError.class, name = "SubscriptionBillingAttemptGenericError"),
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptInsufficientStockProductVariantsError.class, name = "SubscriptionBillingAttemptInsufficientStockProductVariantsError"),
    @JsonSubTypes.Type(value = SubscriptionBillingAttemptOutOfStockProductVariantsError.class, name = "SubscriptionBillingAttemptOutOfStockProductVariantsError")
})
public interface SubscriptionBillingAttemptProcessingError {
  /**
   * The code for the error.
   */
  SubscriptionBillingAttemptErrorCode getCode();

  /**
   * An explanation of the error.
   */
  String getMessage();
}
