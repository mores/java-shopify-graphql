package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class CalculatedRestockingFee implements com.shopify.types.CalculatedReturnFee {
  
  private MoneyBag amountSet;

  
  private String id;

  
  private double percentage;

  public CalculatedRestockingFee() {
  }

  
  public MoneyBag getAmountSet() {
    return amountSet;
  }

  public void setAmountSet(MoneyBag amountSet) {
    this.amountSet = amountSet;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public double getPercentage() {
    return percentage;
  }

  public void setPercentage(double percentage) {
    this.percentage = percentage;
  }

  @Override
  public String toString() {
    return "CalculatedRestockingFee{amountSet='" + amountSet + "', id='" + id + "', percentage='" + percentage + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CalculatedRestockingFee that = (CalculatedRestockingFee) o;
    return Objects.equals(amountSet, that.amountSet) &&
        Objects.equals(id, that.id) &&
        percentage == that.percentage;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountSet, id, percentage);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private MoneyBag amountSet;

    
    private String id;

    
    private double percentage;

    public CalculatedRestockingFee build() {
      CalculatedRestockingFee result = new CalculatedRestockingFee();
      result.amountSet = this.amountSet;
      result.id = this.id;
      result.percentage = this.percentage;
      return result;
    }

    
    public Builder amountSet(MoneyBag amountSet) {
      this.amountSet = amountSet;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder percentage(double percentage) {
      this.percentage = percentage;
      return this;
    }
  }
}
