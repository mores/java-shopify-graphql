package com.shopify.admin.types;

/**
 * The public-facing category for an app.
 */
public enum AppPublicCategory {
  /**
   * The app's public category is [private](https://shopify.dev/apps/distribution#deprecated-app-types).
   */
  PRIVATE,

  /**
   * The app's public category is [public](https://shopify.dev/apps/distribution#capabilities-and-requirements).
   */
  PUBLIC,

  /**
   * The app's public category is [custom](https://shopify.dev/apps/distribution#capabilities-and-requirements).
   */
  CUSTOM,

  /**
   * The app's public category is other. An app is in this category if it's not
   * classified under any of the other app types (private, public, or custom).
   */
  OTHER
}
