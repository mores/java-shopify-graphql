package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to update a font.
 */
public class CheckoutBrandingCustomFontInput {
  /**
   * The font weight. Its value should be between 100 and 900.
   */
  private int weight;

  /**
   * A globally-unique ID for a font file uploaded via the Files api.
   * Allowed font types are .woff and .woff2.
   */
  private String genericFileId;

  public CheckoutBrandingCustomFontInput() {
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
   * A globally-unique ID for a font file uploaded via the Files api.
   * Allowed font types are .woff and .woff2.
   */
  public String getGenericFileId() {
    return genericFileId;
  }

  public void setGenericFileId(String genericFileId) {
    this.genericFileId = genericFileId;
  }

  @Override
  public String toString() {
    return "CheckoutBrandingCustomFontInput{weight='" + weight + "', genericFileId='" + genericFileId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CheckoutBrandingCustomFontInput that = (CheckoutBrandingCustomFontInput) o;
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
     * A globally-unique ID for a font file uploaded via the Files api.
     * Allowed font types are .woff and .woff2.
     */
    private String genericFileId;

    public CheckoutBrandingCustomFontInput build() {
      CheckoutBrandingCustomFontInput result = new CheckoutBrandingCustomFontInput();
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
     * A globally-unique ID for a font file uploaded via the Files api.
     * Allowed font types are .woff and .woff2.
     */
    public Builder genericFileId(String genericFileId) {
      this.genericFileId = genericFileId;
      return this;
    }
  }
}
