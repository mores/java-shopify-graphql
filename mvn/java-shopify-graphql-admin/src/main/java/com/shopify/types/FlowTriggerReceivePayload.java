package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class FlowTriggerReceivePayload {
  
  private List<UserError> userErrors;

  public FlowTriggerReceivePayload() {
  }

  
  public List<UserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<UserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "FlowTriggerReceivePayload{userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FlowTriggerReceivePayload that = (FlowTriggerReceivePayload) o;
    return Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<UserError> userErrors;

    public FlowTriggerReceivePayload build() {
      FlowTriggerReceivePayload result = new FlowTriggerReceivePayload();
      result.userErrors = this.userErrors;
      return result;
    }

    
    public Builder userErrors(List<UserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
