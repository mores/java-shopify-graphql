package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionManualDiscountEntitledLinesInput {
  
  private Boolean all;

  
  private SubscriptionManualDiscountLinesInput lines;

  public SubscriptionManualDiscountEntitledLinesInput() {
  }

  
  public Boolean getAll() {
    return all;
  }

  public void setAll(Boolean all) {
    this.all = all;
  }

  
  public SubscriptionManualDiscountLinesInput getLines() {
    return lines;
  }

  public void setLines(SubscriptionManualDiscountLinesInput lines) {
    this.lines = lines;
  }

  @Override
  public String toString() {
    return "SubscriptionManualDiscountEntitledLinesInput{all='" + all + "', lines='" + lines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionManualDiscountEntitledLinesInput that = (SubscriptionManualDiscountEntitledLinesInput) o;
    return Objects.equals(all, that.all) &&
        Objects.equals(lines, that.lines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, lines);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private Boolean all;

    
    private SubscriptionManualDiscountLinesInput lines;

    public SubscriptionManualDiscountEntitledLinesInput build() {
      SubscriptionManualDiscountEntitledLinesInput result = new SubscriptionManualDiscountEntitledLinesInput();
      result.all = this.all;
      result.lines = this.lines;
      return result;
    }

    
    public Builder all(Boolean all) {
      this.all = all;
      return this;
    }

    
    public Builder lines(SubscriptionManualDiscountLinesInput lines) {
      this.lines = lines;
      return this;
    }
  }
}
