package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A typed identifier that represents an individual within a tax jurisdiction.
 */
public class ShopifyPaymentsTaxIdentification {
  /**
   * The type of the identification.
   */
  private ShopifyPaymentsTaxIdentificationType taxIdentificationType;

  /**
   * The value of the identification.
   */
  private String value;

  public ShopifyPaymentsTaxIdentification() {
  }

  /**
   * The type of the identification.
   */
  public ShopifyPaymentsTaxIdentificationType getTaxIdentificationType() {
    return taxIdentificationType;
  }

  public void setTaxIdentificationType(ShopifyPaymentsTaxIdentificationType taxIdentificationType) {
    this.taxIdentificationType = taxIdentificationType;
  }

  /**
   * The value of the identification.
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "ShopifyPaymentsTaxIdentification{taxIdentificationType='" + taxIdentificationType + "', value='" + value + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyPaymentsTaxIdentification that = (ShopifyPaymentsTaxIdentification) o;
    return Objects.equals(taxIdentificationType, that.taxIdentificationType) &&
        Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxIdentificationType, value);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The type of the identification.
     */
    private ShopifyPaymentsTaxIdentificationType taxIdentificationType;

    /**
     * The value of the identification.
     */
    private String value;

    public ShopifyPaymentsTaxIdentification build() {
      ShopifyPaymentsTaxIdentification result = new ShopifyPaymentsTaxIdentification();
      result.taxIdentificationType = this.taxIdentificationType;
      result.value = this.value;
      return result;
    }

    /**
     * The type of the identification.
     */
    public Builder taxIdentificationType(
        ShopifyPaymentsTaxIdentificationType taxIdentificationType) {
      this.taxIdentificationType = taxIdentificationType;
      return this;
    }

    /**
     * The value of the identification.
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }
}
