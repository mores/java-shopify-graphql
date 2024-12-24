package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DepositInput {
  
  private double percentage;

  public DepositInput() {
  }

  
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "DepositInput{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DepositInput that = (DepositInput) o;
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

    public DepositInput build() {
      DepositInput result = new DepositInput();
      result.percentage = this.percentage;
      return result;
    }

    
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
