package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields used to determine available delivery options for a draft order.
 */
public class DraftOrderAvailableDeliveryOptionsInput {
  /**
   * The discount that will be applied to the draft order.
   * A draft order line item can have one discount. A draft order can also have one order-level discount.
   */
  private DraftOrderAppliedDiscountInput appliedDiscount;

  /**
   * Discount codes that will be attempted to be applied to the draft order. If the
   * draft isn't eligible for any given discount code it will be skipped during calculation.
   */
  private List<String> discountCodes;

  /**
   * Whether or not to accept automatic discounts on the draft order during calculation.
   * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
   * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
   */
  private Boolean acceptAutomaticDiscounts;

  /**
   * Product variant line item or custom line item associated to the draft order.
   * Each draft order must include at least one line item.
   */
  private List<DraftOrderLineItemInput> lineItems;

  /**
   * The mailing address to where the order will be shipped.
   */
  private MailingAddressInput shippingAddress;

  /**
   * The selected country code that determines the pricing of the draft order.
   */
  private CountryCode marketRegionCountryCode;

  /**
   * The purchasing entity for the draft order.
   */
  private PurchasingEntityInput purchasingEntity;

  public DraftOrderAvailableDeliveryOptionsInput() {
  }

  /**
   * The discount that will be applied to the draft order.
   * A draft order line item can have one discount. A draft order can also have one order-level discount.
   */
  public DraftOrderAppliedDiscountInput getAppliedDiscount() {
    return appliedDiscount;
  }

  public void setAppliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
    this.appliedDiscount = appliedDiscount;
  }

  /**
   * Discount codes that will be attempted to be applied to the draft order. If the
   * draft isn't eligible for any given discount code it will be skipped during calculation.
   */
  public List<String> getDiscountCodes() {
    return discountCodes;
  }

  public void setDiscountCodes(List<String> discountCodes) {
    this.discountCodes = discountCodes;
  }

  /**
   * Whether or not to accept automatic discounts on the draft order during calculation.
   * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
   * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
   */
  public Boolean getAcceptAutomaticDiscounts() {
    return acceptAutomaticDiscounts;
  }

  public void setAcceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
    this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
  }

  /**
   * Product variant line item or custom line item associated to the draft order.
   * Each draft order must include at least one line item.
   */
  public List<DraftOrderLineItemInput> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<DraftOrderLineItemInput> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The mailing address to where the order will be shipped.
   */
  public MailingAddressInput getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(MailingAddressInput shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  /**
   * The selected country code that determines the pricing of the draft order.
   */
  public CountryCode getMarketRegionCountryCode() {
    return marketRegionCountryCode;
  }

  public void setMarketRegionCountryCode(CountryCode marketRegionCountryCode) {
    this.marketRegionCountryCode = marketRegionCountryCode;
  }

  /**
   * The purchasing entity for the draft order.
   */
  public PurchasingEntityInput getPurchasingEntity() {
    return purchasingEntity;
  }

  public void setPurchasingEntity(PurchasingEntityInput purchasingEntity) {
    this.purchasingEntity = purchasingEntity;
  }

  @Override
  public String toString() {
    return "DraftOrderAvailableDeliveryOptionsInput{appliedDiscount='" + appliedDiscount + "', discountCodes='" + discountCodes + "', acceptAutomaticDiscounts='" + acceptAutomaticDiscounts + "', lineItems='" + lineItems + "', shippingAddress='" + shippingAddress + "', marketRegionCountryCode='" + marketRegionCountryCode + "', purchasingEntity='" + purchasingEntity + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderAvailableDeliveryOptionsInput that = (DraftOrderAvailableDeliveryOptionsInput) o;
    return Objects.equals(appliedDiscount, that.appliedDiscount) &&
        Objects.equals(discountCodes, that.discountCodes) &&
        Objects.equals(acceptAutomaticDiscounts, that.acceptAutomaticDiscounts) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(shippingAddress, that.shippingAddress) &&
        Objects.equals(marketRegionCountryCode, that.marketRegionCountryCode) &&
        Objects.equals(purchasingEntity, that.purchasingEntity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDiscount, discountCodes, acceptAutomaticDiscounts, lineItems, shippingAddress, marketRegionCountryCode, purchasingEntity);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The discount that will be applied to the draft order.
     * A draft order line item can have one discount. A draft order can also have one order-level discount.
     */
    private DraftOrderAppliedDiscountInput appliedDiscount;

    /**
     * Discount codes that will be attempted to be applied to the draft order. If the
     * draft isn't eligible for any given discount code it will be skipped during calculation.
     */
    private List<String> discountCodes;

    /**
     * Whether or not to accept automatic discounts on the draft order during calculation.
     * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
     * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
     */
    private Boolean acceptAutomaticDiscounts;

    /**
     * Product variant line item or custom line item associated to the draft order.
     * Each draft order must include at least one line item.
     */
    private List<DraftOrderLineItemInput> lineItems;

    /**
     * The mailing address to where the order will be shipped.
     */
    private MailingAddressInput shippingAddress;

    /**
     * The selected country code that determines the pricing of the draft order.
     */
    private CountryCode marketRegionCountryCode;

    /**
     * The purchasing entity for the draft order.
     */
    private PurchasingEntityInput purchasingEntity;

    public DraftOrderAvailableDeliveryOptionsInput build() {
      DraftOrderAvailableDeliveryOptionsInput result = new DraftOrderAvailableDeliveryOptionsInput();
      result.appliedDiscount = this.appliedDiscount;
      result.discountCodes = this.discountCodes;
      result.acceptAutomaticDiscounts = this.acceptAutomaticDiscounts;
      result.lineItems = this.lineItems;
      result.shippingAddress = this.shippingAddress;
      result.marketRegionCountryCode = this.marketRegionCountryCode;
      result.purchasingEntity = this.purchasingEntity;
      return result;
    }

    /**
     * The discount that will be applied to the draft order.
     * A draft order line item can have one discount. A draft order can also have one order-level discount.
     */
    public Builder appliedDiscount(DraftOrderAppliedDiscountInput appliedDiscount) {
      this.appliedDiscount = appliedDiscount;
      return this;
    }

    /**
     * Discount codes that will be attempted to be applied to the draft order. If the
     * draft isn't eligible for any given discount code it will be skipped during calculation.
     */
    public Builder discountCodes(List<String> discountCodes) {
      this.discountCodes = discountCodes;
      return this;
    }

    /**
     * Whether or not to accept automatic discounts on the draft order during calculation.
     * If false, only discount codes and custom draft order discounts (see `appliedDiscount`) will be applied.
     * If true, eligible automatic discounts will be applied in addition to discount codes and custom draft order discounts.
     */
    public Builder acceptAutomaticDiscounts(Boolean acceptAutomaticDiscounts) {
      this.acceptAutomaticDiscounts = acceptAutomaticDiscounts;
      return this;
    }

    /**
     * Product variant line item or custom line item associated to the draft order.
     * Each draft order must include at least one line item.
     */
    public Builder lineItems(List<DraftOrderLineItemInput> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The mailing address to where the order will be shipped.
     */
    public Builder shippingAddress(MailingAddressInput shippingAddress) {
      this.shippingAddress = shippingAddress;
      return this;
    }

    /**
     * The selected country code that determines the pricing of the draft order.
     */
    public Builder marketRegionCountryCode(CountryCode marketRegionCountryCode) {
      this.marketRegionCountryCode = marketRegionCountryCode;
      return this;
    }

    /**
     * The purchasing entity for the draft order.
     */
    public Builder purchasingEntity(PurchasingEntityInput purchasingEntity) {
      this.purchasingEntity = purchasingEntity;
      return this;
    }
  }
}
