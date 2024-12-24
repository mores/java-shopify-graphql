package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class AbandonmentEmailStateUpdatePayload {
  
  private Abandonment abandonment;

  
  private List<AbandonmentEmailStateUpdateUserError> userErrors;

  public AbandonmentEmailStateUpdatePayload() {
  }

  
  public Abandonment getAbandonment() {
    return abandonment;
  }

  public void setAbandonment(Abandonment abandonment) {
    this.abandonment = abandonment;
  }

  
  public List<AbandonmentEmailStateUpdateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<AbandonmentEmailStateUpdateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "AbandonmentEmailStateUpdatePayload{abandonment='" + abandonment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbandonmentEmailStateUpdatePayload that = (AbandonmentEmailStateUpdatePayload) o;
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

    
    private List<AbandonmentEmailStateUpdateUserError> userErrors;

    public AbandonmentEmailStateUpdatePayload build() {
      AbandonmentEmailStateUpdatePayload result = new AbandonmentEmailStateUpdatePayload();
      result.abandonment = this.abandonment;
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder abandonment(Abandonment abandonment) {
      this.abandonment = abandonment;
      return this;
    }

    
    public Builder userErrors(List<AbandonmentEmailStateUpdateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
