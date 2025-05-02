package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * The discounts that have been applied to the cart line.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CartAutomaticDiscountAllocation.class, name = "CartAutomaticDiscountAllocation"),
    @JsonSubTypes.Type(value = CartCodeDiscountAllocation.class, name = "CartCodeDiscountAllocation"),
    @JsonSubTypes.Type(value = CartCustomDiscountAllocation.class, name = "CartCustomDiscountAllocation")
})
public interface CartDiscountAllocation {
  /**
   * The discount that have been applied on the cart line.
   */
  CartDiscountApplication getDiscountApplication();

  /**
   * The discounted amount that has been applied to the cart line.
   */
  MoneyV2 getDiscountedAmount();

  /**
   * The type of line that the discount is applicable towards.
   */
  DiscountApplicationTargetType getTargetType();
}
