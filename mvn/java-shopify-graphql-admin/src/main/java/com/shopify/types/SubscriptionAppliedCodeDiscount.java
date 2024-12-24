package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class SubscriptionAppliedCodeDiscount implements SubscriptionDiscount {
  
  private String id;

  
  private String redeemCode;

  
  private SubscriptionDiscountRejectionReason rejectionReason;

  public SubscriptionAppliedCodeDiscount() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getRedeemCode() {
    return redeemCode;
  }

  public void setRedeemCode(String redeemCode) {
    this.redeemCode = redeemCode;
  }

  
  public SubscriptionDiscountRejectionReason getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(SubscriptionDiscountRejectionReason rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  @Override
  public String toString() {
    return "SubscriptionAppliedCodeDiscount{id='" + id + "', redeemCode='" + redeemCode + "', rejectionReason='" + rejectionReason + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SubscriptionAppliedCodeDiscount that = (SubscriptionAppliedCodeDiscount) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(redeemCode, that.redeemCode) &&
        Objects.equals(rejectionReason, that.rejectionReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, redeemCode, rejectionReason);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String redeemCode;

    
    private SubscriptionDiscountRejectionReason rejectionReason;

    public SubscriptionAppliedCodeDiscount build() {
      SubscriptionAppliedCodeDiscount result = new SubscriptionAppliedCodeDiscount();
      result.id = this.id;
      result.redeemCode = this.redeemCode;
      result.rejectionReason = this.rejectionReason;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder redeemCode(String redeemCode) {
      this.redeemCode = redeemCode;
      return this;
    }

    
    public Builder rejectionReason(SubscriptionDiscountRejectionReason rejectionReason) {
      this.rejectionReason = rejectionReason;
      return this;
    }
  }
}
