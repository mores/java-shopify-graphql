package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryParticipantService {
  
  private boolean active;

  
  private String name;

  public DeliveryParticipantService() {
  }

  
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "DeliveryParticipantService{active='" + active + "', name='" + name + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryParticipantService that = (DeliveryParticipantService) o;
    return active == that.active &&
        Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, name);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean active;

    
    private String name;

    public DeliveryParticipantService build() {
      DeliveryParticipantService result = new DeliveryParticipantService();
      result.active = this.active;
      result.name = this.name;
      return result;
    }

    
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }
  }
}
