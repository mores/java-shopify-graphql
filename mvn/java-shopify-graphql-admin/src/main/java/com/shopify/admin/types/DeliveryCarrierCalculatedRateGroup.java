package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A rate group for a carrier-calculated shipping option.
 *
 * Sets the carrier service, rate adjustments,
 * and carrier-provided services offered at checkout.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryCarrierCalculatedRateGroup implements com.shopify.admin.types.DeliveryOptionDefinitionRateGroup {
  /**
   * The flat amount added to or subtracted from carrier rates.
   */
  private MoneyV2 absoluteAdjustment;

  /**
   * Whether new services from this carrier are automatically included at checkout.
   * When true, buyers see any service that isn't excluded.
   * When false, buyers see only included services.
   */
  private boolean autoIncludeNewServices;

  /**
   * The carrier service that provides rates for this rate group.
   */
  private DeliveryCarrierService carrierService;

  /**
   * Conditions that limit this rate group to specific collections or origin locations.
   */
  private DeliveryRateGroupConditions conditions;

  /**
   * A globally unique ID.
   */
  private String id;

  /**
   * The percentage added to or subtracted from carrier rates.
   * Applied after `absoluteAdjustment`. A value of 10 means +10%.
   */
  private Integer percentageAdjustment;

  /**
   * Carrier-provided services included or excluded for this rate group.
   */
  private List<DeliveryCarrierCalculatedRateGroupService> serviceConfiguration;

  public DeliveryCarrierCalculatedRateGroup() {
  }

  /**
   * The flat amount added to or subtracted from carrier rates.
   */
  public MoneyV2 getAbsoluteAdjustment() {
    return absoluteAdjustment;
  }

  public void setAbsoluteAdjustment(MoneyV2 absoluteAdjustment) {
    this.absoluteAdjustment = absoluteAdjustment;
  }

  /**
   * Whether new services from this carrier are automatically included at checkout.
   * When true, buyers see any service that isn't excluded.
   * When false, buyers see only included services.
   */
  public boolean getAutoIncludeNewServices() {
    return autoIncludeNewServices;
  }

  public void setAutoIncludeNewServices(boolean autoIncludeNewServices) {
    this.autoIncludeNewServices = autoIncludeNewServices;
  }

  /**
   * The carrier service that provides rates for this rate group.
   */
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  /**
   * Conditions that limit this rate group to specific collections or origin locations.
   */
  public DeliveryRateGroupConditions getConditions() {
    return conditions;
  }

  public void setConditions(DeliveryRateGroupConditions conditions) {
    this.conditions = conditions;
  }

  /**
   * A globally unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The percentage added to or subtracted from carrier rates.
   * Applied after `absoluteAdjustment`. A value of 10 means +10%.
   */
  public Integer getPercentageAdjustment() {
    return percentageAdjustment;
  }

  public void setPercentageAdjustment(Integer percentageAdjustment) {
    this.percentageAdjustment = percentageAdjustment;
  }

  /**
   * Carrier-provided services included or excluded for this rate group.
   */
  public List<DeliveryCarrierCalculatedRateGroupService> getServiceConfiguration() {
    return serviceConfiguration;
  }

  public void setServiceConfiguration(
      List<DeliveryCarrierCalculatedRateGroupService> serviceConfiguration) {
    this.serviceConfiguration = serviceConfiguration;
  }

  @Override
  public String toString() {
    return "DeliveryCarrierCalculatedRateGroup{absoluteAdjustment='" + absoluteAdjustment + "', autoIncludeNewServices='" + autoIncludeNewServices + "', carrierService='" + carrierService + "', conditions='" + conditions + "', id='" + id + "', percentageAdjustment='" + percentageAdjustment + "', serviceConfiguration='" + serviceConfiguration + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryCarrierCalculatedRateGroup that = (DeliveryCarrierCalculatedRateGroup) o;
    return Objects.equals(absoluteAdjustment, that.absoluteAdjustment) &&
        autoIncludeNewServices == that.autoIncludeNewServices &&
        Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(conditions, that.conditions) &&
        Objects.equals(id, that.id) &&
        Objects.equals(percentageAdjustment, that.percentageAdjustment) &&
        Objects.equals(serviceConfiguration, that.serviceConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absoluteAdjustment, autoIncludeNewServices, carrierService, conditions, id, percentageAdjustment, serviceConfiguration);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The flat amount added to or subtracted from carrier rates.
     */
    private MoneyV2 absoluteAdjustment;

    /**
     * Whether new services from this carrier are automatically included at checkout.
     * When true, buyers see any service that isn't excluded.
     * When false, buyers see only included services.
     */
    private boolean autoIncludeNewServices;

    /**
     * The carrier service that provides rates for this rate group.
     */
    private DeliveryCarrierService carrierService;

    /**
     * Conditions that limit this rate group to specific collections or origin locations.
     */
    private DeliveryRateGroupConditions conditions;

    /**
     * A globally unique ID.
     */
    private String id;

    /**
     * The percentage added to or subtracted from carrier rates.
     * Applied after `absoluteAdjustment`. A value of 10 means +10%.
     */
    private Integer percentageAdjustment;

    /**
     * Carrier-provided services included or excluded for this rate group.
     */
    private List<DeliveryCarrierCalculatedRateGroupService> serviceConfiguration;

    public DeliveryCarrierCalculatedRateGroup build() {
      DeliveryCarrierCalculatedRateGroup result = new DeliveryCarrierCalculatedRateGroup();
      result.absoluteAdjustment = this.absoluteAdjustment;
      result.autoIncludeNewServices = this.autoIncludeNewServices;
      result.carrierService = this.carrierService;
      result.conditions = this.conditions;
      result.id = this.id;
      result.percentageAdjustment = this.percentageAdjustment;
      result.serviceConfiguration = this.serviceConfiguration;
      return result;
    }

    /**
     * The flat amount added to or subtracted from carrier rates.
     */
    public Builder absoluteAdjustment(MoneyV2 absoluteAdjustment) {
      this.absoluteAdjustment = absoluteAdjustment;
      return this;
    }

    /**
     * Whether new services from this carrier are automatically included at checkout.
     * When true, buyers see any service that isn't excluded.
     * When false, buyers see only included services.
     */
    public Builder autoIncludeNewServices(boolean autoIncludeNewServices) {
      this.autoIncludeNewServices = autoIncludeNewServices;
      return this;
    }

    /**
     * The carrier service that provides rates for this rate group.
     */
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    /**
     * Conditions that limit this rate group to specific collections or origin locations.
     */
    public Builder conditions(DeliveryRateGroupConditions conditions) {
      this.conditions = conditions;
      return this;
    }

    /**
     * A globally unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The percentage added to or subtracted from carrier rates.
     * Applied after `absoluteAdjustment`. A value of 10 means +10%.
     */
    public Builder percentageAdjustment(Integer percentageAdjustment) {
      this.percentageAdjustment = percentageAdjustment;
      return this;
    }

    /**
     * Carrier-provided services included or excluded for this rate group.
     */
    public Builder serviceConfiguration(
        List<DeliveryCarrierCalculatedRateGroupService> serviceConfiguration) {
      this.serviceConfiguration = serviceConfiguration;
      return this;
    }
  }
}
