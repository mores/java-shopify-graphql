package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for customizing a custom font.
 */
public class CheckoutAndAccountsConfigurationBrandingCustomFontInput {
  /**
   * The font weight. Its value should be between 100 and 900.
   */
  private int weight;

  /**
   * A globally-unique ID for a font file uploaded via the Files api. Allowed font types are .woff and .woff2.
   */
  private String genericFileId;

  public CheckoutAndAccountsConfigurationBrandingCustomFontInput() {
  }

  /**
   * The font weight. Its value should be between 100 and 900.
   */
  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  /**
   * A globally-unique ID for a font file uploaded via the Files api. Allowed font types are .woff and .woff2.
   */
  public String getGenericFileId() {
    return genericFileId;
  }

  public void setGenericFileId(String genericFileId) {
    this.genericFileId = genericFileId;
  }

  @Override
  public String toString() {
    return "CheckoutAndAccountsConfigurationBrandingCustomFontInput{weight='" + weight + "', genericFileId='" + genericFileId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutAndAccountsConfigurationBrandingCustomFontInput that = (CheckoutAndAccountsConfigurationBrandingCustomFontInput) o;
    return weight == that.weight &&
        Objects.equals(genericFileId, that.genericFileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, genericFileId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The font weight. Its value should be between 100 and 900.
     */
    private int weight;

    /**
     * A globally-unique ID for a font file uploaded via the Files api. Allowed font types are .woff and .woff2.
     */
    private String genericFileId;

    public CheckoutAndAccountsConfigurationBrandingCustomFontInput build() {
      CheckoutAndAccountsConfigurationBrandingCustomFontInput result = new CheckoutAndAccountsConfigurationBrandingCustomFontInput();
      result.weight = this.weight;
      result.genericFileId = this.genericFileId;
      return result;
    }

    /**
     * The font weight. Its value should be between 100 and 900.
     */
    public Builder weight(int weight) {
      this.weight = weight;
      return this;
    }

    /**
     * A globally-unique ID for a font file uploaded via the Files api. Allowed font types are .woff and .woff2.
     */
    public Builder genericFileId(String genericFileId) {
      this.genericFileId = genericFileId;
      return this;
    }
  }
}
