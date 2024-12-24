package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class SubscriptionDiscountEntitledLines {
  
  private boolean all;

  
  private SubscriptionLineConnection lines;

  public SubscriptionDiscountEntitledLines() {
  }

  
  public boolean getAll() {
    return all;
  }

  public void setAll(boolean all) {
    this.all = all;
  }

  
  public SubscriptionLineConnection getLines() {
    return lines;
  }

  public void setLines(SubscriptionLineConnection lines) {
    this.lines = lines;
  }

  @Override
  public String toString() {
    return "SubscriptionDiscountEntitledLines{all='" + all + "', lines='" + lines + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionDiscountEntitledLines that = (SubscriptionDiscountEntitledLines) o;
    return all == that.all &&
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
    
    private boolean all;

    
    private SubscriptionLineConnection lines;

    public SubscriptionDiscountEntitledLines build() {
      SubscriptionDiscountEntitledLines result = new SubscriptionDiscountEntitledLines();
      result.all = this.all;
      result.lines = this.lines;
      return result;
    }

    
    public Builder all(boolean all) {
      this.all = all;
      return this;
    }

    
    public Builder lines(SubscriptionLineConnection lines) {
      this.lines = lines;
      return this;
    }
  }
}
