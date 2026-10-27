package com.shopify.admin.types;

/**
 * The possible values for the marketing subscription opt-in level enabled at the
 * time the customer consented to receive marketing information.
 *
 * The levels are defined by [the M3AAWG best practices guideline
 *   document](https://www.m3aawg.org/sites/maawg/files/news/M3AAWG_Senders_BCP_Ver3-2015-02.pdf).
 */
public enum CustomerMarketingOptInLevel {
  /**
   * After providing their information, the customer receives marketing information without any
   * intermediate steps.
   */
  SINGLE_OPT_IN,

  /**
   * After providing their information, the customer receives a confirmation and is required to
   * perform a intermediate step before receiving marketing information.
   */
  CONFIRMED_OPT_IN,

  /**
   * The customer receives marketing information but how they were opted in is unknown.
   */
  UNKNOWN
}
