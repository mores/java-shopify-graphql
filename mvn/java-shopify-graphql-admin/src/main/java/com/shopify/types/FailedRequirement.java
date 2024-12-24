package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class FailedRequirement {
  
  private NavigationItem action;

  
  private String message;

  public FailedRequirement() {
  }

  
  public NavigationItem getAction() {
    return action;
  }

  public void setAction(NavigationItem action) {
    this.action = action;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "FailedRequirement{action='" + action + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FailedRequirement that = (FailedRequirement) o;
    return Objects.equals(action, that.action) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private NavigationItem action;

    
    private String message;

    public FailedRequirement build() {
      FailedRequirement result = new FailedRequirement();
      result.action = this.action;
      result.message = this.message;
      return result;
    }

    
    public Builder action(NavigationItem action) {
      this.action = action;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
