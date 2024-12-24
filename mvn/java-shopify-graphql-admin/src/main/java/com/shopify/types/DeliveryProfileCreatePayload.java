package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryProfileCreatePayload {
  
  private DeliveryProfile profile;

  
  private List<UserError> userErrors;

  public DeliveryProfileCreatePayload() {
  }

  
  public DeliveryProfile getProfile() {
    return profile;
  }

  public void setProfile(DeliveryProfile profile) {
    this.profile = profile;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliveryProfileCreatePayload{profile='" + profile + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProfileCreatePayload that = (DeliveryProfileCreatePayload) o;
    return Objects.equals(profile, that.profile) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profile, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DeliveryProfile profile;

    
    private List<UserError> userErrors;

    public DeliveryProfileCreatePayload build() {
      DeliveryProfileCreatePayload result = new DeliveryProfileCreatePayload();
      result.profile = this.profile;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder profile(DeliveryProfile profile) {
      this.profile = profile;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
