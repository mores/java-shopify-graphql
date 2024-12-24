package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DepositPercentage implements DepositConfiguration {
  
  private double percentage;

  public DepositPercentage() {
  }

  
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "DepositPercentage{percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DepositPercentage that = (DepositPercentage) o;
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

    public DepositPercentage build() {
      DepositPercentage result = new DepositPercentage();
      result.percentage = this.percentage;
      return result;
    }

    
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
