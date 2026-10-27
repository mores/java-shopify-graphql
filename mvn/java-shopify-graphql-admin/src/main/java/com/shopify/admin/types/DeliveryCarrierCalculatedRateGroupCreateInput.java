package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating a rate group for a carrier-calculated shipping option.
 */
public class DeliveryCarrierCalculatedRateGroupCreateInput {
  /**
   * The ID of the carrier service to use for this rate group.
   */
  private String carrierServiceId;

  /**
   * Carrier-provided services to include or exclude.
   * Services not listed follow the default behavior based on `autoIncludeNewServices`.
   */
  private List<DeliveryCarrierCalculatedRateGroupServiceInput> serviceConfiguration;

  /**
   * The flat amount added to or subtracted from carrier rates.
   */
  private MoneyInput absoluteAdjustment;

  /**
   * The percentage added to or subtracted from carrier rates.
   */
  private Integer percentageAdjustment;

  /**
   * Collection and origin location conditions for this rate group.
   */
  private DeliveryRateConditionsCreateInput conditions;

  /**
   * Whether new services from this carrier are automatically included at checkout.
   * When omitted, defaults to true. Set to false to offer only explicitly
   * included services for carriers that support service discovery.
   */
  private Boolean autoIncludeNewServices;

  public DeliveryCarrierCalculatedRateGroupCreateInput() {
  }

  /**
   * The ID of the carrier service to use for this rate group.
   */
  public String getCarrierServiceId() {
    return carrierServiceId;
  }

  public void setCarrierServiceId(String carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  /**
   * Carrier-provided services to include or exclude.
   * Services not listed follow the default behavior based on `autoIncludeNewServices`.
   */
  public List<DeliveryCarrierCalculatedRateGroupServiceInput> getServiceConfiguration() {
    return serviceConfiguration;
  }

  public void setServiceConfiguration(
      List<DeliveryCarrierCalculatedRateGroupServiceInput> serviceConfiguration) {
    this.serviceConfiguration = serviceConfiguration;
  }

  /**
   * The flat amount added to or subtracted from carrier rates.
   */
  public MoneyInput getAbsoluteAdjustment() {
    return absoluteAdjustment;
  }

  public void setAbsoluteAdjustment(MoneyInput absoluteAdjustment) {
    this.absoluteAdjustment = absoluteAdjustment;
  }

  /**
   * The percentage added to or subtracted from carrier rates.
   */
  public Integer getPercentageAdjustment() {
    return percentageAdjustment;
  }

  public void setPercentageAdjustment(Integer percentageAdjustment) {
    this.percentageAdjustment = percentageAdjustment;
  }

  /**
   * Collection and origin location conditions for this rate group.
   */
  public DeliveryRateConditionsCreateInput getConditions() {
    return conditions;
  }

  public void setConditions(DeliveryRateConditionsCreateInput conditions) {
    this.conditions = conditions;
  }

  /**
   * Whether new services from this carrier are automatically included at checkout.
   * When omitted, defaults to true. Set to false to offer only explicitly
   * included services for carriers that support service discovery.
   */
  public Boolean getAutoIncludeNewServices() {
    return autoIncludeNewServices;
  }

  public void setAutoIncludeNewServices(Boolean autoIncludeNewServices) {
    this.autoIncludeNewServices = autoIncludeNewServices;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierCalculatedRateGroupCreateInput{carrierServiceId='" + carrierServiceId + "', serviceConfiguration='" + serviceConfiguration + "', absoluteAdjustment='" + absoluteAdjustment + "', percentageAdjustment='" + percentageAdjustment + "', conditions='" + conditions + "', autoIncludeNewServices='" + autoIncludeNewServices + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierCalculatedRateGroupCreateInput that = (DeliveryCarrierCalculatedRateGroupCreateInput) o;
    return Objects.equals(carrierServiceId, that.carrierServiceId) &&
        Objects.equals(serviceConfiguration, that.serviceConfiguration) &&
        Objects.equals(absoluteAdjustment, that.absoluteAdjustment) &&
        Objects.equals(percentageAdjustment, that.percentageAdjustment) &&
        Objects.equals(conditions, that.conditions) &&
        Objects.equals(autoIncludeNewServices, that.autoIncludeNewServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierServiceId, serviceConfiguration, absoluteAdjustment, percentageAdjustment, conditions, autoIncludeNewServices);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the carrier service to use for this rate group.
     */
    private String carrierServiceId;

    /**
     * Carrier-provided services to include or exclude.
     * Services not listed follow the default behavior based on `autoIncludeNewServices`.
     */
    private List<DeliveryCarrierCalculatedRateGroupServiceInput> serviceConfiguration;

    /**
     * The flat amount added to or subtracted from carrier rates.
     */
    private MoneyInput absoluteAdjustment;

    /**
     * The percentage added to or subtracted from carrier rates.
     */
    private Integer percentageAdjustment;

    /**
     * Collection and origin location conditions for this rate group.
     */
    private DeliveryRateConditionsCreateInput conditions;

    /**
     * Whether new services from this carrier are automatically included at checkout.
     * When omitted, defaults to true. Set to false to offer only explicitly
     * included services for carriers that support service discovery.
     */
    private Boolean autoIncludeNewServices;

    public DeliveryCarrierCalculatedRateGroupCreateInput build() {
      DeliveryCarrierCalculatedRateGroupCreateInput result = new DeliveryCarrierCalculatedRateGroupCreateInput();
      result.carrierServiceId = this.carrierServiceId;
      result.serviceConfiguration = this.serviceConfiguration;
      result.absoluteAdjustment = this.absoluteAdjustment;
      result.percentageAdjustment = this.percentageAdjustment;
      result.conditions = this.conditions;
      result.autoIncludeNewServices = this.autoIncludeNewServices;
      return result;
    }

    /**
     * The ID of the carrier service to use for this rate group.
     */
    public Builder carrierServiceId(String carrierServiceId) {
      this.carrierServiceId = carrierServiceId;
      return this;
    }

    /**
     * Carrier-provided services to include or exclude.
     * Services not listed follow the default behavior based on `autoIncludeNewServices`.
     */
    public Builder serviceConfiguration(
        List<DeliveryCarrierCalculatedRateGroupServiceInput> serviceConfiguration) {
      this.serviceConfiguration = serviceConfiguration;
      return this;
    }

    /**
     * The flat amount added to or subtracted from carrier rates.
     */
    public Builder absoluteAdjustment(MoneyInput absoluteAdjustment) {
      this.absoluteAdjustment = absoluteAdjustment;
      return this;
    }

    /**
     * The percentage added to or subtracted from carrier rates.
     */
    public Builder percentageAdjustment(Integer percentageAdjustment) {
      this.percentageAdjustment = percentageAdjustment;
      return this;
    }

    /**
     * Collection and origin location conditions for this rate group.
     */
    public Builder conditions(DeliveryRateConditionsCreateInput conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Whether new services from this carrier are automatically included at checkout.
     * When omitted, defaults to true. Set to false to offer only explicitly
     * included services for carriers that support service discovery.
     */
    public Builder autoIncludeNewServices(Boolean autoIncludeNewServices) {
      this.autoIncludeNewServices = autoIncludeNewServices;
      return this;
    }
  }
}
