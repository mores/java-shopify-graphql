package com.shopify.admin.types;

/**
 * Some of the payment methods used in Shopify.
 */
public enum PaymentMethods {
  VISA,

  MASTERCARD,

  DISCOVER,

  AMERICAN_EXPRESS,

  DINERS_CLUB,

  JCB,

  /**
   * The payment method for UnionPay payment.
   */
  UNIONPAY,

  /**
   * The payment method for Elo payment.
   */
  ELO,

  DANKORT,

  MAESTRO,

  FORBRUGSFORENINGEN,

  PAYPAL,

  BOGUS,

  BITCOIN,

  LITECOIN,

  DOGECOIN,

  /**
   * The payment method for Interac payment.
   */
  INTERAC,

  /**
   * The payment method for eftpos_au payment.
   */
  EFTPOS,

  /**
   * The payment method for Cartes Bancaires payment.
   */
  CARTES_BANCAIRES,

  /**
   * The payment method for Bancontact payment.
   */
  BANCONTACT
}
