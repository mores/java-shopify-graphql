package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryLocationGroupZone {
  
  private DeliveryMethodDefinitionCounts methodDefinitionCounts;

  
  private DeliveryMethodDefinitionConnection methodDefinitions;

  
  private DeliveryZone zone;

  public DeliveryLocationGroupZone() {
  }

  
  public DeliveryMethodDefinitionCounts getMethodDefinitionCounts() {
    return methodDefinitionCounts;
  }

  public void setMethodDefinitionCounts(DeliveryMethodDefinitionCounts methodDefinitionCounts) {
    this.methodDefinitionCounts = methodDefinitionCounts;
  }

  
  public DeliveryMethodDefinitionConnection getMethodDefinitions() {
    return methodDefinitions;
  }

  public void setMethodDefinitions(DeliveryMethodDefinitionConnection methodDefinitions) {
    this.methodDefinitions = methodDefinitions;
  }

  
  public DeliveryZone getZone() {
    return zone;
  }

  public void setZone(DeliveryZone zone) {
    this.zone = zone;
  }

  @Override
  public String toString() {
    return "DeliveryLocationGroupZone{methodDefinitionCounts='" + methodDefinitionCounts + "', methodDefinitions='" + methodDefinitions + "', zone='" + zone + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryLocationGroupZone that = (DeliveryLocationGroupZone) o;
    return Objects.equals(methodDefinitionCounts, that.methodDefinitionCounts) &&
        Objects.equals(methodDefinitions, that.methodDefinitions) &&
        Objects.equals(zone, that.zone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(methodDefinitionCounts, methodDefinitions, zone);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DeliveryMethodDefinitionCounts methodDefinitionCounts;

    
    private DeliveryMethodDefinitionConnection methodDefinitions;

    
    private DeliveryZone zone;

    public DeliveryLocationGroupZone build() {
      DeliveryLocationGroupZone result = new DeliveryLocationGroupZone();
      result.methodDefinitionCounts = this.methodDefinitionCounts;
      result.methodDefinitions = this.methodDefinitions;
      result.zone = this.zone;
      return result;
    }

    
    public Builder methodDefinitionCounts(DeliveryMethodDefinitionCounts methodDefinitionCounts) {
      this.methodDefinitionCounts = methodDefinitionCounts;
      return this;
    }

    
    public Builder methodDefinitions(DeliveryMethodDefinitionConnection methodDefinitions) {
      this.methodDefinitions = methodDefinitions;
      return this;
    }

    
    public Builder zone(DeliveryZone zone) {
      this.zone = zone;
      return this;
    }
  }
}
