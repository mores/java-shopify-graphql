package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeliverySettingInput {
  
  private Boolean legacyModeProfiles;

  public DeliverySettingInput() {
  }

  
  public Boolean getLegacyModeProfiles() {
    return legacyModeProfiles;
  }

  public void setLegacyModeProfiles(Boolean legacyModeProfiles) {
    this.legacyModeProfiles = legacyModeProfiles;
  }

  @Override
  public String toString() {
    return "DeliverySettingInput{legacyModeProfiles='" + legacyModeProfiles + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliverySettingInput that = (DeliverySettingInput) o;
    return Objects.equals(legacyModeProfiles, that.legacyModeProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legacyModeProfiles);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean legacyModeProfiles;

    public DeliverySettingInput build() {
      DeliverySettingInput result = new DeliverySettingInput();
      result.legacyModeProfiles = this.legacyModeProfiles;
      return result;
    }

    
    public Builder legacyModeProfiles(Boolean legacyModeProfiles) {
      this.legacyModeProfiles = legacyModeProfiles;
      return this;
    }
  }
}
