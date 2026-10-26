package com.shopify.admin.types;

/**
 * The business type of a Shopify Payments account.
 */
public enum ShopifyPaymentsBusinessType {
  /**
   * The business type is a corporation.
   */
  CORPORATION,

  /**
   * The business type is a government.
   */
  GOVERNMENT,

  /**
   * The business type is an incorporated partnership.
   */
  INCORPORATED_PARTNERSHIP,

  /**
   * The business is an individual.
   */
  INDIVIDUAL,

  /**
   * The business type is a Limited Liability Company.
   */
  LLC,

  /**
   * The business type is a non profit.
   */
  NON_PROFIT,

  /**
   * The business type is a non profit (incorporated).
   */
  NON_PROFIT_INCORPORATED,

  /**
   * The business type is a non profit (unincorporated).
   */
  NON_PROFIT_UNINCORPORATED,

  /**
   * The business type is a non profit (unincorporated_association).
   */
  NON_PROFIT_UNINCORPORATED_ASSOCIATION,

  /**
   * The business type is a non profit (registered charity).
   */
  NON_PROFIT_REGISTERED_CHARITY,

  /**
   * The business type is a partnership.
   */
  PARTNERSHIP,

  /**
   * The business type is a private corporation.
   */
  PRIVATE_CORPORATION,

  /**
   * The business type is a public company.
   */
  PUBLIC_COMPANY,

  /**
   * The business type is a public corporation.
   */
  PUBLIC_CORPORATION,

  /**
   * The business type is a sole proprietorship.
   */
  SOLE_PROP,

  /**
   * The business type is an unincorporated partnership.
   */
  UNINCORPORATED_PARTNERSHIP,

  /**
   * The business type is a private multi member LLC.
   */
  PRIVATE_MULTI_MEMBER_LLC,

  /**
   * The business type is a private single member LLC.
   */
  PRIVATE_SINGLE_MEMBER_LLC,

  /**
   * The business type is a private unincorporated association.
   */
  PRIVATE_UNINCORPORATED_ASSOCIATION,

  /**
   * The business type is a private partnership.
   */
  PRIVATE_PARTNERSHIP,

  /**
   * The business type is a public partnership.
   */
  PUBLIC_PARTNERSHIP,

  /**
   * The business type is a free zone establishment.
   */
  FREE_ZONE_ESTABLISHMENT,

  /**
   * The business type is a free zone LLC.
   */
  FREE_ZONE_LLC,

  /**
   * The business type is a sole establishment.
   */
  SOLE_ESTABLISHMENT,

  /**
   * The business type is not set. This is usually because onboarding is incomplete.
   */
  NOT_SET
}
