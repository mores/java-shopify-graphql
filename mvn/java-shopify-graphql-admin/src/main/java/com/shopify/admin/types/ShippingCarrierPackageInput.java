package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a carrier-defined package to use for the shipping label purchase.
 */
public class ShippingCarrierPackageInput {
  /**
   * The carrier-defined display name for the package.
   */
  private String name;

  /**
   * The code identifying the carrier that supplies the package. Examples include
   * `usps`, `ups_shipping`, `dhl_express`, and `canada_post`.
   */
  private String carrierCode;

  /**
   * The code identifying the carrier package type.
   */
  private String carrierPackageCode;

  public ShippingCarrierPackageInput() {
  }

  /**
   * The carrier-defined display name for the package.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The code identifying the carrier that supplies the package. Examples include
   * `usps`, `ups_shipping`, `dhl_express`, and `canada_post`.
   */
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  /**
   * The code identifying the carrier package type.
   */
  public String getCarrierPackageCode() {
    return carrierPackageCode;
  }

  public void setCarrierPackageCode(String carrierPackageCode) {
    this.carrierPackageCode = carrierPackageCode;
  }

  @Override
  public String toString() {
    return "ShippingCarrierPackageInput{name='" + name + "', carrierCode='" + carrierCode + "', carrierPackageCode='" + carrierPackageCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShippingCarrierPackageInput that = (ShippingCarrierPackageInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(carrierCode, that.carrierCode) &&
        Objects.equals(carrierPackageCode, that.carrierPackageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, carrierCode, carrierPackageCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The carrier-defined display name for the package.
     */
    private String name;

    /**
     * The code identifying the carrier that supplies the package. Examples include
     * `usps`, `ups_shipping`, `dhl_express`, and `canada_post`.
     */
    private String carrierCode;

    /**
     * The code identifying the carrier package type.
     */
    private String carrierPackageCode;

    public ShippingCarrierPackageInput build() {
      ShippingCarrierPackageInput result = new ShippingCarrierPackageInput();
      result.name = this.name;
      result.carrierCode = this.carrierCode;
      result.carrierPackageCode = this.carrierPackageCode;
      return result;
    }

    /**
     * The carrier-defined display name for the package.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The code identifying the carrier that supplies the package. Examples include
     * `usps`, `ups_shipping`, `dhl_express`, and `canada_post`.
     */
    public Builder carrierCode(String carrierCode) {
      this.carrierCode = carrierCode;
      return this;
    }

    /**
     * The code identifying the carrier package type.
     */
    public Builder carrierPackageCode(String carrierPackageCode) {
      this.carrierPackageCode = carrierPackageCode;
      return this;
    }
  }
}
