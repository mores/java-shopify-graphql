package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for updating a rate group for a carrier-calculated shipping option.
 */
public class DeliveryCarrierCalculatedRateGroupUpdateInput {
  /**
   * The ID of the rate group to update
   */
  private String id;

  /**
   * The ID of the carrier service that provides rates for this shipping option.
   */
  private String carrierServiceId;

  /**
   * Carrier-provided services to include or exclude. Replaces the existing configuration.
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
  private DeliveryRateConditionsUpdateInput conditions;

  /**
   * Whether new services from this carrier are automatically included at checkout.
   * When true, buyers see any service that isn't excluded.
   * When false, buyers see only included services.
   */
  private Boolean autoIncludeNewServices;

  public DeliveryCarrierCalculatedRateGroupUpdateInput() {
  }

  /**
   * The ID of the rate group to update
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the carrier service that provides rates for this shipping option.
   */
  public String getCarrierServiceId() {
    return carrierServiceId;
  }

  public void setCarrierServiceId(String carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  /**
   * Carrier-provided services to include or exclude. Replaces the existing configuration.
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
  public DeliveryRateConditionsUpdateInput getConditions() {
    return conditions;
  }

  public void setConditions(DeliveryRateConditionsUpdateInput conditions) {
    this.conditions = conditions;
  }

  /**
   * Whether new services from this carrier are automatically included at checkout.
   * When true, buyers see any service that isn't excluded.
   * When false, buyers see only included services.
   */
  public Boolean getAutoIncludeNewServices() {
    return autoIncludeNewServices;
  }

  public void setAutoIncludeNewServices(Boolean autoIncludeNewServices) {
    this.autoIncludeNewServices = autoIncludeNewServices;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierCalculatedRateGroupUpdateInput{id='" + id + "', carrierServiceId='" + carrierServiceId + "', serviceConfiguration='" + serviceConfiguration + "', absoluteAdjustment='" + absoluteAdjustment + "', percentageAdjustment='" + percentageAdjustment + "', conditions='" + conditions + "', autoIncludeNewServices='" + autoIncludeNewServices + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierCalculatedRateGroupUpdateInput that = (DeliveryCarrierCalculatedRateGroupUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(carrierServiceId, that.carrierServiceId) &&
        Objects.equals(serviceConfiguration, that.serviceConfiguration) &&
        Objects.equals(absoluteAdjustment, that.absoluteAdjustment) &&
        Objects.equals(percentageAdjustment, that.percentageAdjustment) &&
        Objects.equals(conditions, that.conditions) &&
        Objects.equals(autoIncludeNewServices, that.autoIncludeNewServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, carrierServiceId, serviceConfiguration, absoluteAdjustment, percentageAdjustment, conditions, autoIncludeNewServices);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the rate group to update
     */
    private String id;

    /**
     * The ID of the carrier service that provides rates for this shipping option.
     */
    private String carrierServiceId;

    /**
     * Carrier-provided services to include or exclude. Replaces the existing configuration.
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
    private DeliveryRateConditionsUpdateInput conditions;

    /**
     * Whether new services from this carrier are automatically included at checkout.
     * When true, buyers see any service that isn't excluded.
     * When false, buyers see only included services.
     */
    private Boolean autoIncludeNewServices;

    public DeliveryCarrierCalculatedRateGroupUpdateInput build() {
      DeliveryCarrierCalculatedRateGroupUpdateInput result = new DeliveryCarrierCalculatedRateGroupUpdateInput();
      result.id = this.id;
      result.carrierServiceId = this.carrierServiceId;
      result.serviceConfiguration = this.serviceConfiguration;
      result.absoluteAdjustment = this.absoluteAdjustment;
      result.percentageAdjustment = this.percentageAdjustment;
      result.conditions = this.conditions;
      result.autoIncludeNewServices = this.autoIncludeNewServices;
      return result;
    }

    /**
     * The ID of the rate group to update
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the carrier service that provides rates for this shipping option.
     */
    public Builder carrierServiceId(String carrierServiceId) {
      this.carrierServiceId = carrierServiceId;
      return this;
    }

    /**
     * Carrier-provided services to include or exclude. Replaces the existing configuration.
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
    public Builder conditions(DeliveryRateConditionsUpdateInput conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * Whether new services from this carrier are automatically included at checkout.
     * When true, buyers see any service that isn't excluded.
     * When false, buyers see only included services.
     */
    public Builder autoIncludeNewServices(Boolean autoIncludeNewServices) {
      this.autoIncludeNewServices = autoIncludeNewServices;
      return this;
    }
  }
}
