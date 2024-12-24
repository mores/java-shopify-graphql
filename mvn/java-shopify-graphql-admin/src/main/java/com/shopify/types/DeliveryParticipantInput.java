package com.shopify.types;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryParticipantInput {
  
  private String id;

  
  private String carrierServiceId;

  
  private MoneyInput fixedFee;

  
  private Double percentageOfRateFee;

  
  private List<DeliveryParticipantServiceInput> participantServices;

  
  private Boolean adaptToNewServices;

  public DeliveryParticipantInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getCarrierServiceId() {
    return carrierServiceId;
  }

  public void setCarrierServiceId(String carrierServiceId) {
    this.carrierServiceId = carrierServiceId;
  }

  
  public MoneyInput getFixedFee() {
    return fixedFee;
  }

  public void setFixedFee(MoneyInput fixedFee) {
    this.fixedFee = fixedFee;
  }

  
  public Double getPercentageOfRateFee() {
    return percentageOfRateFee;
  }

  public void setPercentageOfRateFee(Double percentageOfRateFee) {
    this.percentageOfRateFee = percentageOfRateFee;
  }

  
  public List<DeliveryParticipantServiceInput> getParticipantServices() {
    return participantServices;
  }

  public void setParticipantServices(List<DeliveryParticipantServiceInput> participantServices) {
    this.participantServices = participantServices;
  }

  
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
    
    private String id;

    
    private String carrierServiceId;

    
    private MoneyInput fixedFee;

    
    private Double percentageOfRateFee;

    
    private List<DeliveryParticipantServiceInput> participantServices;

    
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder carrierServiceId(String carrierServiceId) {
      this.carrierServiceId = carrierServiceId;
      return this;
    }

    
    public Builder fixedFee(MoneyInput fixedFee) {
      this.fixedFee = fixedFee;
      return this;
    }

    
    public Builder percentageOfRateFee(Double percentageOfRateFee) {
      this.percentageOfRateFee = percentageOfRateFee;
      return this;
    }

    
    public Builder participantServices(List<DeliveryParticipantServiceInput> participantServices) {
      this.participantServices = participantServices;
      return this;
    }

    
    public Builder adaptToNewServices(Boolean adaptToNewServices) {
      this.adaptToNewServices = adaptToNewServices;
      return this;
    }
  }
}
