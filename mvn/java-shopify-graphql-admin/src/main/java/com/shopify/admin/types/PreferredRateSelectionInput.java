package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for selecting a preferred shipping rate by carrier and service codes.
 */
public class PreferredRateSelectionInput {
  /**
   * The code identifying the carrier for the preferred rate. Examples include
   * `usps`, `ups_shipping`, `dhl_express`, and `canada_post`.
   */
  private String carrierCode;

  /**
   * The carrier-defined service code for the preferred rate.
   */
  private String serviceCode;

  public PreferredRateSelectionInput() {
  }

  /**
   * The code identifying the carrier for the preferred rate. Examples include
   * `usps`, `ups_shipping`, `dhl_express`, and `canada_post`.
   */
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  /**
   * The carrier-defined service code for the preferred rate.
   */
  public String getServiceCode() {
    return serviceCode;
  }

  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }

  @Override
  public String toString() {
    return "PreferredRateSelectionInput{carrierCode='" + carrierCode + "', serviceCode='" + serviceCode + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PreferredRateSelectionInput that = (PreferredRateSelectionInput) o;
    return Objects.equals(carrierCode, that.carrierCode) &&
        Objects.equals(serviceCode, that.serviceCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierCode, serviceCode);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The code identifying the carrier for the preferred rate. Examples include
     * `usps`, `ups_shipping`, `dhl_express`, and `canada_post`.
     */
    private String carrierCode;

    /**
     * The carrier-defined service code for the preferred rate.
     */
    private String serviceCode;

    public PreferredRateSelectionInput build() {
      PreferredRateSelectionInput result = new PreferredRateSelectionInput();
      result.carrierCode = this.carrierCode;
      result.serviceCode = this.serviceCode;
      return result;
    }

    /**
     * The code identifying the carrier for the preferred rate. Examples include
     * `usps`, `ups_shipping`, `dhl_express`, and `canada_post`.
     */
    public Builder carrierCode(String carrierCode) {
      this.carrierCode = carrierCode;
      return this;
    }

    /**
     * The carrier-defined service code for the preferred rate.
     */
    public Builder serviceCode(String serviceCode) {
      this.serviceCode = serviceCode;
      return this;
    }
  }
}
