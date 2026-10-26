package com.shopify.storefront.types;

/**
 * The recommendation intent that is used to generate product recommendations.
 * You can use intent to generate product recommendations according to different strategies.
 */
public enum ProductRecommendationIntent {
  /**
   * Offer customers a mix of products that are similar or complementary to a
   * product for which recommendations are to be fetched. An example is
   * substitutable products that display in a You may also like section.
   */
  RELATED,

  /**
   * Offer customers products that are complementary to a product for which
   * recommendations are to be fetched. An example is add-on products that display
   * in a Pair it with section.
   */
  COMPLEMENTARY
}
