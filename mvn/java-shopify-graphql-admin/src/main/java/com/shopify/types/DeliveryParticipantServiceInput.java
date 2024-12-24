package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliveryParticipantServiceInput {
  
  private String name;

  
  private boolean active;

  public DeliveryParticipantServiceInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  @Override
  public String toString() {
    return "DeliveryParticipantServiceInput{name='" + name + "', active='" + active + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryParticipantServiceInput that = (DeliveryParticipantServiceInput) o;
    return Objects.equals(name, that.name) &&
        active == that.active;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private boolean active;

    public DeliveryParticipantServiceInput build() {
      DeliveryParticipantServiceInput result = new DeliveryParticipantServiceInput();
      result.name = this.name;
      result.active = this.active;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }
  }
}
