package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for new line items to be added to the order as part of an exchange.
 */
public class ExchangeLineItemInput {
  /**
   * The gift card codes associated with the physical gift cards.
   */
  private List<String> giftCardCodes;

  /**
   * The ID of the product variant to be added to the order as part of an exchange.
   */
  private String variantId;

  /**
   * The quantity of the item to be added.
   */
  private int quantity;

  /**
   * The discount to be applied to the exchange line item.
   */
  private ExchangeLineItemAppliedDiscountInput appliedDiscount;

  public ExchangeLineItemInput() {
  }

  /**
   * The gift card codes associated with the physical gift cards.
   */
  public List<String> getGiftCardCodes() {
    return giftCardCodes;
  }

  public void setGiftCardCodes(List<String> giftCardCodes) {
    this.giftCardCodes = giftCardCodes;
  }

  /**
   * The ID of the product variant to be added to the order as part of an exchange.
   */
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
  }

  /**
   * The quantity of the item to be added.
   */
  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  /**
   * The discount to be applied to the exchange line item.
   */
  public ExchangeLineItemAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(ExchangeLineItemAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  @Override
  public String toString() {
    return "ExchangeLineItemInput{giftCardCodes='" + giftCardCodes + "', variantId='" + variantId + "', quantity='" + quantity + "', appliedDiscount='" + appliedDiscount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExchangeLineItemInput that = (ExchangeLineItemInput) o;
    return Objects.equals(giftCardCodes, that.giftCardCodes) &&
        Objects.equals(variantId, that.variantId) &&
        quantity == that.quantity &&
        Objects.equals(appliedDiscount, that.appliedDiscount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(giftCardCodes, variantId, quantity, appliedDiscount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The gift card codes associated with the physical gift cards.
     */
    private List<String> giftCardCodes;

    /**
     * The ID of the product variant to be added to the order as part of an exchange.
     */
    private String variantId;

    /**
     * The quantity of the item to be added.
     */
    private int quantity;

    /**
     * The discount to be applied to the exchange line item.
     */
    private ExchangeLineItemAppliedDiscountInput appliedDiscount;

    public ExchangeLineItemInput build() {
      ExchangeLineItemInput result = new ExchangeLineItemInput();
      result.giftCardCodes = this.giftCardCodes;
      result.variantId = this.variantId;
      result.quantity = this.quantity;
      result.appliedDiscount = this.appliedDiscount;
      return result;
    }

    /**
     * The gift card codes associated with the physical gift cards.
     */
    public Builder giftCardCodes(List<String> giftCardCodes) {
      this.giftCardCodes = giftCardCodes;
      return this;
    }

    /**
     * The ID of the product variant to be added to the order as part of an exchange.
     */
    public Builder variantId(String variantId) {
      this.variantId = variantId;
      return this;
    }

    /**
     * The quantity of the item to be added.
     */
    public Builder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     * The discount to be applied to the exchange line item.
     */
    public Builder appliedDiscount(ExchangeLineItemAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }
  }
}
