package com.shopify.storefront.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * A common interface for querying discount allocations regardless of how the
 * discount was applied ([automatic](https://help.shopify.com/manual/discounts/discount-methods/automatic-discounts), [code](https://help.shopify.com/manual/discounts/discount-methods/discount-codes),
 * or custom). Each implementation represents a different discount source.
 *
 * Tracks how a discount distributes across [cart
 * lines](https://shopify.dev/docs/api/storefront/current/objects/CartLine). Each
 * allocation includes the [`CartDiscountApplication`](https://shopify.dev/docs/api/storefront/current/objects/CartDiscountApplication)
 * details, the discounted amount, and whether the discount targets line items or shipping.
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
