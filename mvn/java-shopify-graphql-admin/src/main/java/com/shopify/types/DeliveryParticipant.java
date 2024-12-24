package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryParticipant implements DeliveryRateProvider, com.shopify.types.Node {
  
  private boolean adaptToNewServicesFlag;

  
  private DeliveryCarrierService carrierService;

  
  private MoneyV2 fixedFee;

  
  private String id;

  
  private List<DeliveryParticipantService> participantServices;

  
  private double percentageOfRateFee;

  public DeliveryParticipant() {
  }

  
  public boolean getAdaptToNewServicesFlag() {
    return adaptToNewServicesFlag;
  }

  public void setAdaptToNewServicesFlag(boolean adaptToNewServicesFlag) {
    this.adaptToNewServicesFlag = adaptToNewServicesFlag;
  }

  
  public DeliveryCarrierService getCarrierService() {
    return carrierService;
  }

  public void setCarrierService(DeliveryCarrierService carrierService) {
    this.carrierService = carrierService;
  }

  
  public MoneyV2 getFixedFee() {
    return fixedFee;
  }

  public void setFixedFee(MoneyV2 fixedFee) {
    this.fixedFee = fixedFee;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<DeliveryParticipantService> getParticipantServices() {
    return participantServices;
  }

  public void setParticipantServices(List<DeliveryParticipantService> participantServices) {
    this.participantServices = participantServices;
  }

  
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
    
    private boolean adaptToNewServicesFlag;

    
    private DeliveryCarrierService carrierService;

    
    private MoneyV2 fixedFee;

    
    private String id;

    
    private List<DeliveryParticipantService> participantServices;

    
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

    
    public Builder adaptToNewServicesFlag(boolean adaptToNewServicesFlag) {
      this.adaptToNewServicesFlag = adaptToNewServicesFlag;
      return this;
    }

    
    public Builder carrierService(DeliveryCarrierService carrierService) {
      this.carrierService = carrierService;
      return this;
    }

    
    public Builder fixedFee(MoneyV2 fixedFee) {
      this.fixedFee = fixedFee;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder participantServices(List<DeliveryParticipantService> participantServices) {
      this.participantServices = participantServices;
      return this;
    }

    
    public Builder percentageOfRateFee(double percentageOfRateFee) {
      this.percentageOfRateFee = percentageOfRateFee;
      return this;
    }
  }
}
