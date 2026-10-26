package com.shopify.admin.types;

/**
 * The set of valid sort keys for the CompanyContact query.
 */
public enum CompanyContactSortKeys {
  /**
   * Sort by the `company_id` value.
   */
  COMPANY_ID,

  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `email` value.
   */
  EMAIL,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `name` value.
   */
  NAME,

  /**
   * Sort by the `name_email` value.
   */
  NAME_EMAIL,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the `title` value.
   */
  TITLE,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT
}
