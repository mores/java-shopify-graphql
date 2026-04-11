package com.shopify.storefront.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The parent line item of the cart line.
 */
public class CartLineParentInput {
  /**
   * The id of the parent line item.
   */
  private String lineId;

  /**
   * The ID of the parent line merchandise.
   */
  private String merchandiseId;

  public CartLineParentInput() {
  }

  /**
   * The id of the parent line item.
   */
  public String getLineId() {
    return lineId;
  }

  public void setLineId(String lineId) {
    this.lineId = lineId;
  }

  /**
   * The ID of the parent line merchandise.
   */
  public String getMerchandiseId() {
    return merchandiseId;
  }

  public void setMerchandiseId(String merchandiseId) {
    this.merchandiseId = merchandiseId;
  }

  @Override
  public String toString() {
    return "CartLineParentInput{lineId='" + lineId + "', merchandiseId='" + merchandiseId + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CartLineParentInput that = (CartLineParentInput) o;
    return Objects.equals(lineId, that.lineId) &&
        Objects.equals(merchandiseId, that.merchandiseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineId, merchandiseId);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The id of the parent line item.
     */
    private String lineId;

    /**
     * The ID of the parent line merchandise.
     */
    private String merchandiseId;

    public CartLineParentInput build() {
      CartLineParentInput result = new CartLineParentInput();
      result.lineId = this.lineId;
      result.merchandiseId = this.merchandiseId;
      return result;
    }

    /**
     * The id of the parent line item.
     */
    public Builder lineId(String lineId) {
      this.lineId = lineId;
      return this;
    }

    /**
     * The ID of the parent line merchandise.
     */
    public Builder merchandiseId(String merchandiseId) {
      this.merchandiseId = merchandiseId;
      return this;
    }
  }
}
