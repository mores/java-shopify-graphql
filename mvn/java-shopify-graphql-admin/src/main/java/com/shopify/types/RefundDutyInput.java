package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RefundDutyInput {
  
  private String dutyId;

  
  private RefundDutyRefundType refundType;

  public RefundDutyInput() {
  }

  
  public String getDutyId() {
    return dutyId;
  }

  public void setDutyId(String dutyId) {
    this.dutyId = dutyId;
  }

  
  public RefundDutyRefundType getRefundType() {
    return refundType;
  }

  public void setRefundType(RefundDutyRefundType refundType) {
    this.refundType = refundType;
  }

  @Override
  public String toString() {
    return "RefundDutyInput{dutyId='" + dutyId + "', refundType='" + refundType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RefundDutyInput that = (RefundDutyInput) o;
    return Objects.equals(dutyId, that.dutyId) &&
        Objects.equals(refundType, that.refundType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dutyId, refundType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String dutyId;

    
    private RefundDutyRefundType refundType;

    public RefundDutyInput build() {
      RefundDutyInput result = new RefundDutyInput();
      result.dutyId = this.dutyId;
      result.refundType = this.refundType;
      return result;
    }

    
    public Builder dutyId(String dutyId) {
      this.dutyId = dutyId;
      return this;
    }

    
    public Builder refundType(RefundDutyRefundType refundType) {
      this.refundType = refundType;
      return this;
    }
  }
}
