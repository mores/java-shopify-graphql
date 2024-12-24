package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryMethodDefinitionCounts {
  
  private int participantDefinitionsCount;

  
  private int rateDefinitionsCount;

  public DeliveryMethodDefinitionCounts() {
  }

  
  public int getParticipantDefinitionsCount() {
    return participantDefinitionsCount;
  }

  public void setParticipantDefinitionsCount(int participantDefinitionsCount) {
    this.participantDefinitionsCount = participantDefinitionsCount;
  }

  
  public int getRateDefinitionsCount() {
    return rateDefinitionsCount;
  }

  public void setRateDefinitionsCount(int rateDefinitionsCount) {
    this.rateDefinitionsCount = rateDefinitionsCount;
  }

  @Override
  public String toString() {
    return "DeliveryMethodDefinitionCounts{participantDefinitionsCount='" + participantDefinitionsCount + "', rateDefinitionsCount='" + rateDefinitionsCount + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryMethodDefinitionCounts that = (DeliveryMethodDefinitionCounts) o;
    return participantDefinitionsCount == that.participantDefinitionsCount &&
        rateDefinitionsCount == that.rateDefinitionsCount;
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantDefinitionsCount, rateDefinitionsCount);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private int participantDefinitionsCount;

    
    private int rateDefinitionsCount;

    public DeliveryMethodDefinitionCounts build() {
      DeliveryMethodDefinitionCounts result = new DeliveryMethodDefinitionCounts();
      result.participantDefinitionsCount = this.participantDefinitionsCount;
      result.rateDefinitionsCount = this.rateDefinitionsCount;
      return result;
    }

    
    public Builder participantDefinitionsCount(int participantDefinitionsCount) {
      this.participantDefinitionsCount = participantDefinitionsCount;
      return this;
    }

    
    public Builder rateDefinitionsCount(int rateDefinitionsCount) {
      this.rateDefinitionsCount = rateDefinitionsCount;
      return this;
    }
  }
}
