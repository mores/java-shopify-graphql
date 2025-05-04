package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to specify a region.
 */
public class DeliveryProvinceInput {
  /**
   * The code of the region.
   */
  private String code;

  public DeliveryProvinceInput() {
  }

  /**
   * The code of the region.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String toString() {
    return "DeliveryProvinceInput{code='" + code + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProvinceInput that = (DeliveryProvinceInput) o;
    return Objects.equals(code, that.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code of the region.
     */
    private String code;

    public DeliveryProvinceInput build() {
      DeliveryProvinceInput result = new DeliveryProvinceInput();
      result.code = this.code;
      return result;
    }

    /**
     * The code of the region.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }
  }
}
