package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a participant.
 */
public class DeliveryParticipantInput {
  /**
   * The ID of the participant.
   */
  private String id;

  /**
   * The ID of the carrier service for this participant.
   */
  private String carrierServiceId;

  /**
   * The fixed feed that's defined by the merchant for this participant.
   */
  private MoneyInput fixedFee;

  /**
   * The merchant-defined percentage-of-rate fee for this participant.
   */
  private Double percentageOfRateFee;

  /**
   * The list of shipping services offered by the participant.
   */
  private List<DeliveryParticipantServiceInput> participantServices;

  /**
   * Whether to automatically display new shipping services to the customer when a service becomes available.
   */
  private Boolean adaptToNewServices;

  public DeliveryParticipantInput() {
  }

  /**
   * The ID of the participant.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the carrier service for this participant.
   */
  public String getCarrierServiceId() {
    return carrierServiceId;
  }

  public void setCarrierServiceId(String carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  /**
   * The fixed feed that's defined by the merchant for this participant.
   */
  public MoneyInput getFixedFee() {
    return fixedFee;
  }

  public void setFixedFee(MoneyInput fixedFee) {
    this.fixedFee = fixedFee;
  }

  /**
   * The merchant-defined percentage-of-rate fee for this participant.
   */
  public Double getPercentageOfRateFee() {
    return percentageOfRateFee;
  }

  public void setPercentageOfRateFee(Double percentageOfRateFee) {
    this.percentageOfRateFee = percentageOfRateFee;
  }

  /**
   * The list of shipping services offered by the participant.
   */
  public List<DeliveryParticipantServiceInput> getParticipantServices() {
    return participantServices;
  }

  public void setParticipantServices(List<DeliveryParticipantServiceInput> participantServices) {
    this.participantServices = participantServices;
  }

  /**
   * Whether to automatically display new shipping services to the customer when a service becomes available.
   */
  public Boolean getAdaptToNewServices() {
    return adaptToNewServices;
  }

  public void setAdaptToNewServices(Boolean adaptToNewServices) {
    this.adaptToNewServices = adaptToNewServices;
  }

  @Override
  public String toString() {
    return "DeliveryParticipantInput{id='" + id + "', carrierServiceId='" + carrierServiceId + "', fixedFee='" + fixedFee + "', percentageOfRateFee='" + percentageOfRateFee + "', participantServices='" + participantServices + "', adaptToNewServices='" + adaptToNewServices + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryParticipantInput that = (DeliveryParticipantInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(carrierServiceId, that.carrierServiceId) &&
        Objects.equals(fixedFee, that.fixedFee) &&
        Objects.equals(percentageOfRateFee, that.percentageOfRateFee) &&
        Objects.equals(participantServices, that.participantServices) &&
        Objects.equals(adaptToNewServices, that.adaptToNewServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, carrierServiceId, fixedFee, percentageOfRateFee, participantServices, adaptToNewServices);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the participant.
     */
    private String id;

    /**
     * The ID of the carrier service for this participant.
     */
    private String carrierServiceId;

    /**
     * The fixed feed that's defined by the merchant for this participant.
     */
    private MoneyInput fixedFee;

    /**
     * The merchant-defined percentage-of-rate fee for this participant.
     */
    private Double percentageOfRateFee;

    /**
     * The list of shipping services offered by the participant.
     */
    private List<DeliveryParticipantServiceInput> participantServices;

    /**
     * Whether to automatically display new shipping services to the customer when a service becomes available.
     */
    private Boolean adaptToNewServices;

    public DeliveryParticipantInput build() {
      DeliveryParticipantInput result = new DeliveryParticipantInput();
      result.id = this.id;
      result.carrierServiceId = this.carrierServiceId;
      result.fixedFee = this.fixedFee;
      result.percentageOfRateFee = this.percentageOfRateFee;
      result.participantServices = this.participantServices;
      result.adaptToNewServices = this.adaptToNewServices;
      return result;
    }

    /**
     * The ID of the participant.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the carrier service for this participant.
     */
    public Builder carrierServiceId(String carrierServiceId) {
      this.carrierServiceId = carrierServiceId;
      return this;
    }

    /**
     * The fixed feed that's defined by the merchant for this participant.
     */
    public Builder fixedFee(MoneyInput fixedFee) {
      this.fixedFee = fixedFee;
      return this;
    }

    /**
     * The merchant-defined percentage-of-rate fee for this participant.
     */
    public Builder percentageOfRateFee(Double percentageOfRateFee) {
      this.percentageOfRateFee = percentageOfRateFee;
      return this;
    }

    /**
     * The list of shipping services offered by the participant.
     */
    public Builder participantServices(List<DeliveryParticipantServiceInput> participantServices) {
      this.participantServices = participantServices;
      return this;
    }

    /**
     * Whether to automatically display new shipping services to the customer when a service becomes available.
     */
    public Builder adaptToNewServices(Boolean adaptToNewServices) {
      this.adaptToNewServices = adaptToNewServices;
      return this;
    }
  }
}
