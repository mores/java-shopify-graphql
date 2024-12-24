package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliverySetting {
  
  private DeliveryLegacyModeBlocked legacyModeBlocked;

  
  private boolean legacyModeProfiles;

  public DeliverySetting() {
  }

  
  public DeliveryLegacyModeBlocked getLegacyModeBlocked() {
    return legacyModeBlocked;
  }

  public void setLegacyModeBlocked(DeliveryLegacyModeBlocked legacyModeBlocked) {
    this.legacyModeBlocked = legacyModeBlocked;
  }

  
  public boolean getLegacyModeProfiles() {
    return legacyModeProfiles;
  }

  public void setLegacyModeProfiles(boolean legacyModeProfiles) {
    this.legacyModeProfiles = legacyModeProfiles;
  }

  @Override
  public String toString() {
    return "DeliverySetting{legacyModeBlocked='" + legacyModeBlocked + "', legacyModeProfiles='" + legacyModeProfiles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliverySetting that = (DeliverySetting) o;
    return Objects.equals(legacyModeBlocked, that.legacyModeBlocked) &&
        legacyModeProfiles == that.legacyModeProfiles;
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyModeBlocked, legacyModeProfiles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DeliveryLegacyModeBlocked legacyModeBlocked;

    
    private boolean legacyModeProfiles;

    public DeliverySetting build() {
      DeliverySetting result = new DeliverySetting();
      result.legacyModeBlocked = this.legacyModeBlocked;
      result.legacyModeProfiles = this.legacyModeProfiles;
      return result;
    }

    
    public Builder legacyModeBlocked(DeliveryLegacyModeBlocked legacyModeBlocked) {
      this.legacyModeBlocked = legacyModeBlocked;
      return this;
    }

    
    public Builder legacyModeProfiles(boolean legacyModeProfiles) {
      this.legacyModeProfiles = legacyModeProfiles;
      return this;
    }
  }
}
