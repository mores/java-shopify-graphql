package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A warning that is displayed to the merchant when a change is made to a draft order.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = DraftOrderBundleAddedWarning.class, name = "DraftOrderBundleAddedWarning"),
    @JsonSubTypes.Type(value = DraftOrderDiscountNotAppliedWarning.class, name = "DraftOrderDiscountNotAppliedWarning"),
    @JsonSubTypes.Type(value = DraftOrderMarketRegionCountryCodeNotSupportedWarning.class, name = "DraftOrderMarketRegionCountryCodeNotSupportedWarning")
})
public interface DraftOrderWarning {
  /**
   * The error code.
   */
  String getErrorCode();

  /**
   * The input field that the warning applies to.
   */
  String getField();

  /**
   * The warning message.
   */
  String getMessage();
}
