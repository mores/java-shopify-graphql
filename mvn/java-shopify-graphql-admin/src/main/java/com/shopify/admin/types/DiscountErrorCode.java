package com.shopify.admin.types;

/**
 * Possible error codes that can be returned by `DiscountUserError`.
 */
public enum DiscountErrorCode {
  /**
   * The input value is blank.
   */
  BLANK,

  /**
   * The input value needs to be blank.
   */
  PRESENT,

  /**
   * The input value should be equal to the value allowed.
   */
  EQUAL_TO,

  /**
   * The input value should be greater than the minimum allowed value.
   */
  GREATER_THAN,

  /**
   * The input value should be greater than or equal to the minimum value allowed.
   */
  GREATER_THAN_OR_EQUAL_TO,

  /**
   * The input value is invalid.
   */
  INVALID,

  /**
   * The input value should be less than or equal to the maximum value allowed.
   */
  LESS_THAN_OR_EQUAL_TO,

  /**
   * The input value should be less than the maximum value allowed.
   */
  LESS_THAN,

  /**
   * The input value is already taken.
   */
  TAKEN,

  /**
   * The input value is too long.
   */
  TOO_LONG,

  /**
   * The input value is too short.
   */
  TOO_SHORT,

  /**
   * Unexpected internal error happened.
   */
  INTERNAL_ERROR,

  /**
   * Too many arguments provided.
   */
  TOO_MANY_ARGUMENTS,

  /**
   * Missing a required argument.
   */
  MISSING_ARGUMENT,

  /**
   * The active period overlaps with other automatic discounts. At any given time, only 25 automatic discounts can be active.
   */
  ACTIVE_PERIOD_OVERLAP,

  /**
   * The end date should be after the start date.
   */
  END_DATE_BEFORE_START_DATE,

  /**
   * The value exceeded the maximum allowed value.
   */
  EXCEEDED_MAX,

  /**
   * Specify a minimum subtotal or a quantity, but not both.
   */
  MINIMUM_SUBTOTAL_AND_QUANTITY_RANGE_BOTH_PRESENT,

  /**
   * The value is outside of the allowed range.
   */
  VALUE_OUTSIDE_RANGE,

  /**
   * The attribute selection contains conflicting settings.
   */
  CONFLICT,

  /**
   * The value is already present through another selection.
   */
  IMPLICIT_DUPLICATE,

  /**
   * The input value is already present.
   */
  DUPLICATE,

  /**
   * The input value isn't included in the list.
   */
  INCLUSION,

  /**
   * The `combinesWith` settings are invalid for the discount class.
   */
  INVALID_COMBINES_WITH_FOR_DISCOUNT_CLASS,

  /**
   * The discountClass is invalid for the price rule.
   */
  INVALID_DISCOUNT_CLASS_FOR_PRICE_RULE,

  /**
   * Discounts and condition types are not compatible with each other.
   */
  DISCOUNT_NOT_COMPATIBLE_WITH_CONDITION_TYPES,

  /**
   * The active period overlaps with too many other app-provided discounts. There's
   * a limit on the number of app discounts that can be active at any given time.
   */
  MAX_APP_DISCOUNTS,

  /**
   * A discount cannot have both appliesOnOneTimePurchase and appliesOnSubscription set to false.
   */
  APPLIES_ON_NOTHING,

  /**
   * Recurring cycle limit must be a valid integer greater than or equal to 0.
   */
  RECURRING_CYCLE_LIMIT_NOT_A_VALID_INTEGER,

  /**
   * Recurring cycle limit must be 1 when discount does not apply to subscription items.
   */
  MULTIPLE_RECURRING_CYCLE_LIMIT_FOR_NON_SUBSCRIPTION_ITEMS,

  /**
   * Either function ID or function handle must be provided.
   */
  MISSING_FUNCTION_IDENTIFIER,

  /**
   * Only one of function ID or function handle is allowed.
   */
  MULTIPLE_FUNCTION_IDENTIFIERS,

  /**
   * The tag title exceeds the maximum length of 255 characters.
   */
  INVALID_TAG_LENGTH,

  /**
   * The number of tags exceeds the maximum of 5.
   */
  TOO_MANY_TAGS,

  /**
   * The number of tags in `productDiscountsWithTagsOnSameCartLine` exceeds the maximum of 10.
   */
  TOO_MANY_PRODUCT_DISCOUNTS_WITH_TAGS_ON_SAME_CART_LINE,

  /**
   * The `productDiscountsWithTagsOnSameCartLine` field is only valid for discounts with the PRODUCT discount class.
   */
  INVALID_PRODUCT_DISCOUNTS_WITH_TAGS_ON_SAME_CART_LINE_FOR_DISCOUNT_CLASS,

  /**
   * The `productDiscountsWithTagsOnSameCartLine` field can only be specified when `productDiscounts` is true.
   */
  INVALID_PRODUCT_DISCOUNTS_WITH_TAGS_ON_SAME_CART_LINE_WITHOUT_PRODUCT_DISCOUNTS,

  /**
   * The `productDiscounts` field can't be set to false when
   * `productDiscountsWithTagsOnSameCartLine` tags exist on the discount.
   */
  INVALID_PRODUCT_DISCOUNTS_FALSE_WITH_EXISTING_TAGS_ON_SAME_CART_LINE,

  /**
   * The shop's plan does not allow setting `productDiscountsWithTagsOnSameCartLine`.
   */
  PRODUCT_DISCOUNTS_WITH_TAGS_ON_SAME_CART_LINE_NOT_ENTITLED
}
