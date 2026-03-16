package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Captures the intent of a discount at the time it was applied. Each
 * implementation represents a different discount source, such as [automatic discounts](https://help.shopify.com/manual/discounts/discount-methods/automatic-discounts), [discount codes](https://help.shopify.com/manual/discounts/discount-methods/discount-codes),
 * and manual discounts.
 *
 * The actual discounted amount on a line item or shipping line is represented by the [`DiscountAllocation`](https://shopify.dev/docs/api/storefront/current/objects/DiscountAllocation)
 * object, which references the discount application it originated from.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = AutomaticDiscountApplication.class, name = "AutomaticDiscountApplication"),
    @JsonSubTypes.Type(value = DiscountCodeApplication.class, name = "DiscountCodeApplication"),
    @JsonSubTypes.Type(value = ManualDiscountApplication.class, name = "ManualDiscountApplication"),
    @JsonSubTypes.Type(value = ScriptDiscountApplication.class, name = "ScriptDiscountApplication")
})
public interface DiscountApplication {
  /**
   * The method by which the discount's value is allocated to its entitled items.
   */
  DiscountApplicationAllocationMethod getAllocationMethod();

  /**
   * Which lines of targetType that the discount is allocated over.
   */
  DiscountApplicationTargetSelection getTargetSelection();

  /**
   * The type of line that the discount is applicable towards.
   */
  DiscountApplicationTargetType getTargetType();

  /**
   * The value of the discount application.
   */
  PricingValue getValue();
}
