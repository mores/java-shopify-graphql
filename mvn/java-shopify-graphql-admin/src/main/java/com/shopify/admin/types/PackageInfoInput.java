package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields that describe package information for the shipping label
 * purchase. Exactly one of `customPackage` or `carrierPackage` must be provided.
 */
public class PackageInfoInput {
  /**
   * A package with custom dimensions and empty-package weight. Mutually exclusive with `carrierPackage`.
   */
  private ShippingLabelPurchaseCustomPackageInput customPackage;

  /**
   * A standard package provided by the carrier. Mutually exclusive with `customPackage`.
   */
  private ShippingCarrierPackageInput carrierPackage;

  public PackageInfoInput() {
  }

  /**
   * A package with custom dimensions and empty-package weight. Mutually exclusive with `carrierPackage`.
   */
  public ShippingLabelPurchaseCustomPackageInput getCustomPackage() {
    return customPackage;
  }

  public void setCustomPackage(ShippingLabelPurchaseCustomPackageInput customPackage) {
    this.customPackage = customPackage;
  }

  /**
   * A standard package provided by the carrier. Mutually exclusive with `customPackage`.
   */
  public ShippingCarrierPackageInput getCarrierPackage() {
    return carrierPackage;
  }

  public void setCarrierPackage(ShippingCarrierPackageInput carrierPackage) {
    this.carrierPackage = carrierPackage;
  }

  @Override
  public String toString() {
    return "PackageInfoInput{customPackage='" + customPackage + "', carrierPackage='" + carrierPackage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PackageInfoInput that = (PackageInfoInput) o;
    return Objects.equals(customPackage, that.customPackage) &&
        Objects.equals(carrierPackage, that.carrierPackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customPackage, carrierPackage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A package with custom dimensions and empty-package weight. Mutually exclusive with `carrierPackage`.
     */
    private ShippingLabelPurchaseCustomPackageInput customPackage;

    /**
     * A standard package provided by the carrier. Mutually exclusive with `customPackage`.
     */
    private ShippingCarrierPackageInput carrierPackage;

    public PackageInfoInput build() {
      PackageInfoInput result = new PackageInfoInput();
      result.customPackage = this.customPackage;
      result.carrierPackage = this.carrierPackage;
      return result;
    }

    /**
     * A package with custom dimensions and empty-package weight. Mutually exclusive with `carrierPackage`.
     */
    public Builder customPackage(ShippingLabelPurchaseCustomPackageInput customPackage) {
      this.customPackage = customPackage;
      return this;
    }

    /**
     * A standard package provided by the carrier. Mutually exclusive with `customPackage`.
     */
    public Builder carrierPackage(ShippingCarrierPackageInput carrierPackage) {
      this.carrierPackage = carrierPackage;
      return this;
    }
  }
}
