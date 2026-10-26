package com.shopify.admin.types;

/**
 * The set of valid sort keys for the CompanyLocation query.
 */
public enum CompanyLocationSortKeys {
  /**
   * Sort by the `company_and_location_name` value.
   */
  COMPANY_AND_LOCATION_NAME,

  /**
   * Sort by the `company_id` value.
   */
  COMPANY_ID,

  /**
   * Sort by the `created_at` value.
   */
  CREATED_AT,

  /**
   * Sort by the `id` value.
   */
  ID,

  /**
   * Sort by the `name` value.
   */
  NAME,

  /**
   * Sort by relevance to the search terms when the `query` parameter is specified on the connection.
   * Don't use this sort key when no search query is specified.
   */
  RELEVANCE,

  /**
   * Sort by the `updated_at` value.
   */
  UPDATED_AT
}
