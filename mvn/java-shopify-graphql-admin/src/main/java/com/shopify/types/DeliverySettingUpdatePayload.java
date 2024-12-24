package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliverySettingUpdatePayload {
  
  private DeliverySetting setting;

  
  private List<UserError> userErrors;

  public DeliverySettingUpdatePayload() {
  }

  
  public DeliverySetting getSetting() {
    return setting;
  }

  public void setSetting(DeliverySetting setting) {
    this.setting = setting;
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "DeliverySettingUpdatePayload{setting='" + setting + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliverySettingUpdatePayload that = (DeliverySettingUpdatePayload) o;
    return Objects.equals(setting, that.setting) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(setting, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private DeliverySetting setting;

    
    private List<UserError> userErrors;

    public DeliverySettingUpdatePayload build() {
      DeliverySettingUpdatePayload result = new DeliverySettingUpdatePayload();
      result.setting = this.setting;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder setting(DeliverySetting setting) {
      this.setting = setting;
      return this;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
