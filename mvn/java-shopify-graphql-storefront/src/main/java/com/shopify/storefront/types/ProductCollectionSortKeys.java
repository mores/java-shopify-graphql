package com.shopify.storefront.types;

/**
 * Sort options for products within a [`Collection`](https://shopify.dev/docs/api/storefront/current/objects/Collection). Used by the [`products`](https://shopify.dev/docs/api/storefront/current/objects/Collection#field-Collection.fields.products)
 * connection to order results by best-selling, price, title, creation date, or the
 * collection's default and manual ordering.
 *
 * > Note: The [`RELEVANCE`](https://shopify.dev/docs/api/storefront/current/enums/ProductCollectionSortKeys#enums-RELEVANCE) key applies only when you specify a search query.
 */
public enum ProductCollectionSortKeys {
  TITLE,

  PRICE,

  BEST_SELLING,

  CREATED,

  ID,

  MANUAL,

  COLLECTION_DEFAULT,

  RELEVANCE
}
