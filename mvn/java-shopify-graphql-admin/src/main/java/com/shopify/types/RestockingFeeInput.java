package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RestockingFeeInput {
  
  private double percentage;

  public RestockingFeeInput() {
  }

  
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "RestockingFeeInput{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestockingFeeInput that = (RestockingFeeInput) o;
    return percentage == that.percentage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(percentage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private double percentage;

    public RestockingFeeInput build() {
      RestockingFeeInput result = new RestockingFeeInput();
      result.percentage = this.percentage;
      return result;
    }

    
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
