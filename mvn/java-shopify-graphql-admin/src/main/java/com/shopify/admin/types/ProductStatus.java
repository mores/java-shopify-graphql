package com.shopify.admin.types;

/**
 * The possible product statuses.
 */
public enum ProductStatus {
  /**
   * The product is ready to sell and can be published to sales channels and apps.
   * Products with an active status aren't automatically published to sales
   * channels, such as the online store, or apps. By default, existing products are set to active.
   */
  ACTIVE,

  /**
   * The product is no longer being sold and isn't available to customers on sales channels and apps.
   */
  ARCHIVED,

  /**
   * The product isn't ready to sell and is unavailable to customers on sales
   * channels and apps. By default, duplicated and unarchived products are set to draft.
   */
  DRAFT,

  /**
   * The product is active but you need a direct link to view it. The product
   * doesn't show up in search, collections, or product recommendations. It will be
   * returned in Storefront API and Liquid only when referenced individually by
   * handle, id, or metafield reference.This status is only visible from 2025-10
   * and up, is translated to active in older versions and can't be changed from
   * unlisted in older versions.
   */
  UNLISTED
}
