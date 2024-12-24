package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RestrictedForResource {
  
  private boolean restricted;

  
  private String restrictedReason;

  public RestrictedForResource() {
  }

  
  public boolean getRestricted() {
    return restricted;
  }

  public void setRestricted(boolean restricted) {
    this.restricted = restricted;
  }

  
  public String getRestrictedReason() {
    return restrictedReason;
  }

  public void setRestrictedReason(String restrictedReason) {
    this.restrictedReason = restrictedReason;
  }

  @Override
  public String toString() {
    return "RestrictedForResource{restricted='" + restricted + "', restrictedReason='" + restrictedReason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestrictedForResource that = (RestrictedForResource) o;
    return restricted == that.restricted &&
        Objects.equals(restrictedReason, that.restrictedReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restricted, restrictedReason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean restricted;

    
    private String restrictedReason;

    public RestrictedForResource build() {
      RestrictedForResource result = new RestrictedForResource();
      result.restricted = this.restricted;
      result.restrictedReason = this.restrictedReason;
      return result;
    }

    
    public Builder restricted(boolean restricted) {
      this.restricted = restricted;
      return this;
    }

    
    public Builder restrictedReason(String restrictedReason) {
      this.restrictedReason = restrictedReason;
      return this;
    }
  }
}
