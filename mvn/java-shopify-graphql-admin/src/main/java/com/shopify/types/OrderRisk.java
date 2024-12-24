package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderRisk {
  
  private boolean display;

  
  private OrderRiskLevel level;

  
  private String message;

  public OrderRisk() {
  }

  
  public boolean getDisplay() {
    return display;
  }

  public void setDisplay(boolean display) {
    this.display = display;
  }

  
  public OrderRiskLevel getLevel() {
    return level;
  }

  public void setLevel(OrderRiskLevel level) {
    this.level = level;
  }

  
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "OrderRisk{display='" + display + "', level='" + level + "', message='" + message + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderRisk that = (OrderRisk) o;
    return display == that.display &&
        Objects.equals(level, that.level) &&
        Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(display, level, message);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean display;

    
    private OrderRiskLevel level;

    
    private String message;

    public OrderRisk build() {
      OrderRisk result = new OrderRisk();
      result.display = this.display;
      result.level = this.level;
      result.message = this.message;
      return result;
    }

    
    public Builder display(boolean display) {
      this.display = display;
      return this;
    }

    
    public Builder level(OrderRiskLevel level) {
      this.level = level;
      return this;
    }

    
    public Builder message(String message) {
      this.message = message;
      return this;
    }
  }
}
