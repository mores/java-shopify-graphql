package com.shopify.storefront.types;

/**
 * Sort options for products within a [`Collection`](https://shopify.dev/docs/api/storefront/current/objects/Collection). Used by the [`products`](https://shopify.dev/docs/api/storefront/current/objects/Collection#field-Collection.fields.products)
 * connection to order results by best-selling, price, title, creation date, or the
 * collection's default and manual ordering.
 *
 * > Note: The [`RELEVANCE`](https://shopify.dev/docs/api/storefront/current/enums/ProductCollectionSortKeys#enums-RELEVANCE) key applies only when you specify a search query.
 */
public enum ProductCollectionSortKeys {
  /**
   * Sort by the `title` value.
   */
  TITLE,

  /**
   * Sort by the `price` value.
   */
  PRICE,

  /**
   * Sort by the `best-selling` value.
   */
  BEST_SELLING,

  /**
   * Sort by the `created` value.
   */
  CREATED,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `manual` value.
   */
  MANUAL,

  /**
   * Sort by the `collection-default` value.
   */
  COLLECTION_DEFAULT,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE
}
