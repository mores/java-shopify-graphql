package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AbandonmentUpdateActivitiesDeliveryStatusesPayload {
  
  private Abandonment abandonment;

  
  private List<AbandonmentUpdateActivitiesDeliveryStatusesUserError> userErrors;

  public AbandonmentUpdateActivitiesDeliveryStatusesPayload() {
  }

  
  public Abandonment getAbandonment() {
    return abandonment;
  }

  public void setAbandonment(Abandonment abandonment) {
    this.abandonment = abandonment;
  }

  
  public List<AbandonmentUpdateActivitiesDeliveryStatusesUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AbandonmentUpdateActivitiesDeliveryStatusesUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AbandonmentUpdateActivitiesDeliveryStatusesPayload{abandonment='" + abandonment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonmentUpdateActivitiesDeliveryStatusesPayload that = (AbandonmentUpdateActivitiesDeliveryStatusesPayload) o;
    return Objects.equals(abandonment, that.abandonment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abandonment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Abandonment abandonment;

    
    private List<AbandonmentUpdateActivitiesDeliveryStatusesUserError> userErrors;

    public AbandonmentUpdateActivitiesDeliveryStatusesPayload build() {
      AbandonmentUpdateActivitiesDeliveryStatusesPayload result = new AbandonmentUpdateActivitiesDeliveryStatusesPayload();
      result.abandonment = this.abandonment;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder abandonment(Abandonment abandonment) {
      this.abandonment = abandonment;
      return this;
    }

    
    public Builder userErrors(
        List<AbandonmentUpdateActivitiesDeliveryStatusesUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
