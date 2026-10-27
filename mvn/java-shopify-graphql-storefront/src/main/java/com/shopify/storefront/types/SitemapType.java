package com.shopify.storefront.types;

/**
 * The types of resources potentially present in a sitemap.
 */
public enum SitemapType {
  /**
   * Products present in the sitemap.
   */
  PRODUCT,

  /**
   * Collections present in the sitemap.
   */
  COLLECTION,

  /**
   * Pages present in the sitemap.
   */
  PAGE,

  /**
   * Metaobjects present in the sitemap. Only metaobject types with the
   * [`renderable` capability](https://shopify.dev/docs/apps/build/custom-data/metaobjects/use-metaobject-capabilities#render-metaobjects-as-web-pages)
   * are included in sitemap.
   */
  METAOBJECT,

  /**
   * Blogs present in the sitemap.
   */
  BLOG,

  /**
   * Articles present in the sitemap.
   */
  ARTICLE
}
