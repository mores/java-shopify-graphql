package com.shopify.admin.types;

/**
 * The possible values for the marketing subscription opt-in level enabled at the
 * time the customer consented to receive marketing information.
 *
 * The levels are defined by [the M3AAWG best practices guideline
 *   document](https://www.m3aawg.org/sites/maawg/files/news/M3AAWG_Senders_BCP_Ver3-2015-02.pdf).
 */
public enum CustomerMarketingOptInLevel {
  SINGLE_OPT_IN,

  CONFIRMED_OPT_IN,

  UNKNOWN
}
