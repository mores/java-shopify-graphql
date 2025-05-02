package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The shop pay installments pricing information for a product variant.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class ShopPayInstallmentsProductVariantPricing implements com.shopify.types.Node {
  /**
   * Whether the product variant is available.
   */
  private boolean available;

  /**
   * Whether the product variant is eligible for Shop Pay Installments.
   */
  private boolean eligible;

  /**
   * The full price of the product variant.
   */
  private MoneyV2 fullPrice;

  /**
   * The ID of the product variant.
   */
  private String id;

  /**
   * The number of payment terms available for the product variant.
   */
  private Count installmentsCount;

  /**
   * The price per term for the product variant.
   */
  private MoneyV2 pricePerTerm;

  public ShopPayInstallmentsProductVariantPricing() {
  }

  /**
   * Whether the product variant is available.
   */
  public boolean getAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }

  /**
   * Whether the product variant is eligible for Shop Pay Installments.
   */
  public boolean getEligible() {
    return eligible;
  }

  public void setEligible(boolean eligible) {
    this.eligible = eligible;
  }

  /**
   * The full price of the product variant.
   */
  public MoneyV2 getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(MoneyV2 fullPrice) {
    this.fullPrice = fullPrice;
  }

  /**
   * The ID of the product variant.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The number of payment terms available for the product variant.
   */
  public Count getInstallmentsCount() {
    return installmentsCount;
  }

  public void setInstallmentsCount(Count installmentsCount) {
    this.installmentsCount = installmentsCount;
  }

  /**
   * The price per term for the product variant.
   */
  public MoneyV2 getPricePerTerm() {
    return pricePerTerm;
  }

  public void setPricePerTerm(MoneyV2 pricePerTerm) {
    this.pricePerTerm = pricePerTerm;
  }

  @Override
  public String toString() {
    return "ShopPayInstallmentsProductVariantPricing{available='" + available + "', eligible='" + eligible + "', fullPrice='" + fullPrice + "', id='" + id + "', installmentsCount='" + installmentsCount + "', pricePerTerm='" + pricePerTerm + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopPayInstallmentsProductVariantPricing that = (ShopPayInstallmentsProductVariantPricing) o;
    return available == that.available &&
        eligible == that.eligible &&
        Objects.equals(fullPrice, that.fullPrice) &&
        Objects.equals(id, that.id) &&
        Objects.equals(installmentsCount, that.installmentsCount) &&
        Objects.equals(pricePerTerm, that.pricePerTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, eligible, fullPrice, id, installmentsCount, pricePerTerm);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether the product variant is available.
     */
    private boolean available;

    /**
     * Whether the product variant is eligible for Shop Pay Installments.
     */
    private boolean eligible;

    /**
     * The full price of the product variant.
     */
    private MoneyV2 fullPrice;

    /**
     * The ID of the product variant.
     */
    private String id;

    /**
     * The number of payment terms available for the product variant.
     */
    private Count installmentsCount;

    /**
     * The price per term for the product variant.
     */
    private MoneyV2 pricePerTerm;

    public ShopPayInstallmentsProductVariantPricing build() {
      ShopPayInstallmentsProductVariantPricing result = new ShopPayInstallmentsProductVariantPricing();
      result.available = this.available;
      result.eligible = this.eligible;
      result.fullPrice = this.fullPrice;
      result.id = this.id;
      result.installmentsCount = this.installmentsCount;
      result.pricePerTerm = this.pricePerTerm;
      return result;
    }

    /**
     * Whether the product variant is available.
     */
    public Builder available(boolean available) {
      this.available = available;
      return this;
    }

    /**
     * Whether the product variant is eligible for Shop Pay Installments.
     */
    public Builder eligible(boolean eligible) {
      this.eligible = eligible;
      return this;
    }

    /**
     * The full price of the product variant.
     */
    public Builder fullPrice(MoneyV2 fullPrice) {
      this.fullPrice = fullPrice;
      return this;
    }

    /**
     * The ID of the product variant.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The number of payment terms available for the product variant.
     */
    public Builder installmentsCount(Count installmentsCount) {
      this.installmentsCount = installmentsCount;
      return this;
    }

    /**
     * The price per term for the product variant.
     */
    public Builder pricePerTerm(MoneyV2 pricePerTerm) {
      this.pricePerTerm = pricePerTerm;
      return this;
    }
  }
}
