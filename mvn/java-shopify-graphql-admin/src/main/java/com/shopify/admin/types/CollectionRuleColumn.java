package com.shopify.admin.types;

/**
 * Specifies the attribute of a product being used to populate the collection.
 */
public enum CollectionRuleColumn {
  /**
   * The [`tag`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-Product.fields.tags) attribute.
   */
  TAG,

  /**
   * The [`title`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-Product.fields.title) attribute.
   */
  TITLE,

  /**
   * The [`type`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-Product.fields.productType) attribute.
   */
  TYPE,

  /**
   * The [`product_taxonomy_node_id`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-Product.fields.productCategory) attribute.
   */
  PRODUCT_TAXONOMY_NODE_ID,

  /**
   * This rule type is designed to dynamically include products in a collection based on their category id.
   * When a specific product category is set as a condition, this rule will match
   * products that are directly assigned to the specified category.
   */
  PRODUCT_CATEGORY_ID,

  /**
   * This rule type is designed to dynamically include products in a collection based on their category id.
   * When a specific product category is set as a condition, this rule will not only match products that are
   * directly assigned to the specified category but also include any products
   * categorized under any descendant of that category.
   */
  PRODUCT_CATEGORY_ID_WITH_DESCENDANTS,

  /**
   * The [`vendor`](https://shopify.dev/api/admin-graphql/latest/objects/Product#field-Product.fields.vendor) attribute.
   */
  VENDOR,

  /**
   * The [`variant_price`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-ProductVariant.fields.price) attribute.
   */
  VARIANT_PRICE,

  /**
   * An attribute evaluated based on the `compare_at_price` attribute of the product's variants.
   * With `is_set` relation, the rule matches products with at least one variant with `compare_at_price` set.
   * With `is_not_set` relation, the rule matches matches products with at least one variant with `compare_at_price` not set.
   */
  IS_PRICE_REDUCED,

  /**
   * The [`variant_compare_at_price`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-ProductVariant.fields.compareAtPrice) attribute.
   */
  VARIANT_COMPARE_AT_PRICE,

  /**
   * The [`variant_weight`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-ProductVariant.fields.inventoryItem.measurement.weight) attribute.
   */
  VARIANT_WEIGHT,

  /**
   * The [`variant_inventory`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-ProductVariant.fields.inventoryQuantity) attribute.
   */
  VARIANT_INVENTORY,

  /**
   * The [`variant_title`](https://shopify.dev/api/admin-graphql/latest/objects/ProductVariant#field-ProductVariant.fields.title) attribute.
   */
  VARIANT_TITLE,

  /**
   * This category includes metafield definitions that have the `useAsCollectionCondition` flag set to true.
   */
  PRODUCT_METAFIELD_DEFINITION,

  /**
   * This category includes metafield definitions that have the `useAsCollectionCondition` flag set to true.
   */
  VARIANT_METAFIELD_DEFINITION
}
