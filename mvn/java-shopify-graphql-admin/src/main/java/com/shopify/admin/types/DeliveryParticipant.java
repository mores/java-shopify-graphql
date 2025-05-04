package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A participant defines carrier-calculated rates for shipping services
 * with a possible merchant-defined fixed fee or a percentage-of-rate fee.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryParticipant implements DeliveryRateProvider, com.shopify.admin.types.Node {
  /**
   * Whether to display new shipping services automatically to the customer when the service becomes available.
   */
  private boolean adaptToNewServicesFlag;

  /**
   * The carrier used for this participant.
   */
  private DeliveryCarrierService carrierService;

  /**
   * The merchant-defined fixed fee for this participant.
   */
  private MoneyV2 fixedFee;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The carrier-specific services offered by the participant, and whether each service is active.
   */
  private List<DeliveryParticipantService> participantServices;

  /**
   * The merchant-defined percentage-of-rate fee for this participant.
   */
  private double percentageOfRateFee;

  public DeliveryParticipant() {
  }

  /**
   * Whether to display new shipping services automatically to the customer when the service becomes available.
   */
  public boolean getAdaptToNewServicesFlag() {
    return adaptToNewServicesFlag;
  }

  public void setAdaptToNewServicesFlag(boolean adaptToNewServicesFlag) {
    this.adaptToNewServicesFlag = adaptToNewServicesFlag;
  }

  /**
   * The carrier used for this participant.
   */
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  /**
   * The merchant-defined fixed fee for this participant.
   */
  public MoneyV2 getFixedFee() {
    return fixedFee;
  }

  public void setFixedFee(MoneyV2 fixedFee) {
    this.fixedFee = fixedFee;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The carrier-specific services offered by the participant, and whether each service is active.
   */
  public List<DeliveryParticipantService> getParticipantServices() {
    return participantServices;
  }

  public void setParticipantServices(List<DeliveryParticipantService> participantServices) {
    this.participantServices = participantServices;
  }

  /**
   * The merchant-defined percentage-of-rate fee for this participant.
   */
  public double getPercentageOfRateFee() {
    return percentageOfRateFee;
  }

  public void setPercentageOfRateFee(double percentageOfRateFee) {
    this.percentageOfRateFee = percentageOfRateFee;
  }

  @Override
  public String toString() {
    return "DeliveryParticipant{adaptToNewServicesFlag='" + adaptToNewServicesFlag + "', carrierService='" + carrierService + "', fixedFee='" + fixedFee + "', id='" + id + "', participantServices='" + participantServices + "', percentageOfRateFee='" + percentageOfRateFee + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryParticipant that = (DeliveryParticipant) o;
    return adaptToNewServicesFlag == that.adaptToNewServicesFlag &&
        Objects.equals(carrierService, that.carrierService) &&
        Objects.equals(fixedFee, that.fixedFee) &&
        Objects.equals(id, that.id) &&
        Objects.equals(participantServices, that.participantServices) &&
        percentageOfRateFee == that.percentageOfRateFee;
  }

  @Override
  public int hashCode() {
    return Objects.hash(adaptToNewServicesFlag, carrierService, fixedFee, id, participantServices, percentageOfRateFee);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Whether to display new shipping services automatically to the customer when the service becomes available.
     */
    private boolean adaptToNewServicesFlag;

    /**
     * The carrier used for this participant.
     */
    private DeliveryCarrierService carrierService;

    /**
     * The merchant-defined fixed fee for this participant.
     */
    private MoneyV2 fixedFee;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The carrier-specific services offered by the participant, and whether each service is active.
     */
    private List<DeliveryParticipantService> participantServices;

    /**
     * The merchant-defined percentage-of-rate fee for this participant.
     */
    private double percentageOfRateFee;

    public DeliveryParticipant build() {
      DeliveryParticipant result = new DeliveryParticipant();
      result.adaptToNewServicesFlag = this.adaptToNewServicesFlag;
      result.carrierService = this.carrierService;
      result.fixedFee = this.fixedFee;
      result.id = this.id;
      result.participantServices = this.participantServices;
      result.percentageOfRateFee = this.percentageOfRateFee;
      return result;
    }

    /**
     * Whether to display new shipping services automatically to the customer when the service becomes available.
     */
    public Builder adaptToNewServicesFlag(boolean adaptToNewServicesFlag) {
      this.adaptToNewServicesFlag = adaptToNewServicesFlag;
      return this;
    }

    /**
     * The carrier used for this participant.
     */
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    /**
     * The merchant-defined fixed fee for this participant.
     */
    public Builder fixedFee(MoneyV2 fixedFee) {
      this.fixedFee = fixedFee;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The carrier-specific services offered by the participant, and whether each service is active.
     */
    public Builder participantServices(List<DeliveryParticipantService> participantServices) {
      this.participantServices = participantServices;
      return this;
    }

    /**
     * The merchant-defined percentage-of-rate fee for this participant.
     */
    public Builder percentageOfRateFee(double percentageOfRateFee) {
      this.percentageOfRateFee = percentageOfRateFee;
      return this;
    }
  }
}
