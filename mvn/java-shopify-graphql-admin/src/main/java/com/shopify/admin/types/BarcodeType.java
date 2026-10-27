package com.shopify.admin.types;

/**
 * The identifier standard that a barcode value conforms to. A single value can satisfy more than one
 * standard, so declare the standard that the merchant or supplier assigned. If no `BarcodeType` is provided,
 * then no standard was declared and the value is stored as entered.
 */
public enum BarcodeType {
  /**
   * Universal Product Code. Used mainly in North America, as a 12-digit UPC-A or an 8-digit UPC-E.
   */
  UPC,

  /**
   * International Article Number. Used mainly outside North America, as a 13-digit EAN-13 or an 8-digit EAN-8.
   */
  EAN,

  /**
   * International Standard Book Number. The 10-digit or 13-digit code assigned to a book. A 13-digit ISBN is also an EAN-13.
   */
  ISBN,

  /**
   * Global Trade Item Number. Accepts 8, 12, 13, and 14-digit codes. Use `GTIN`
   * when the code is registered with GS1. Acceptable formats are GTIN-8, GTIN-12
   * (UPC) GTIN-13 (EAN) and GTIN-14.
   */
  GTIN,

  /**
   * Amazon Standard Identification Number. Assigned by Amazon and unique to its catalog.
   */
  ASIN,

  /**
   * Non-standardised manufacturer Product Identifier. A code assigned by the
   * manufacturer or supplier, such as a model or part number, used to identify a
   * product in EU customs declarations. It follows no published standard, so the
   * value is stored as entered.
   */
  NS_PID
}
