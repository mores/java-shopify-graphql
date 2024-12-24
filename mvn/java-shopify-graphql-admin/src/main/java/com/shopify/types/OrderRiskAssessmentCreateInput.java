package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderRiskAssessmentCreateInput {
  
  private String orderId;

  
  private RiskAssessmentResult riskLevel;

  
  private List<OrderRiskAssessmentFactInput> facts;

  public OrderRiskAssessmentCreateInput() {
  }

  
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  
  public RiskAssessmentResult getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(RiskAssessmentResult riskLevel) {
    this.riskLevel = riskLevel;
  }

  
  public List<OrderRiskAssessmentFactInput> getFacts() {
    return facts;
  }

  public void setFacts(List<OrderRiskAssessmentFactInput> facts) {
    this.facts = facts;
  }

  @Override
  public String toString() {
    return "OrderRiskAssessmentCreateInput{orderId='" + orderId + "', riskLevel='" + riskLevel + "', facts='" + facts + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderRiskAssessmentCreateInput that = (OrderRiskAssessmentCreateInput) o;
    return Objects.equals(orderId, that.orderId) &&
        Objects.equals(riskLevel, that.riskLevel) &&
        Objects.equals(facts, that.facts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, riskLevel, facts);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String orderId;

    
    private RiskAssessmentResult riskLevel;

    
    private List<OrderRiskAssessmentFactInput> facts;

    public OrderRiskAssessmentCreateInput build() {
      OrderRiskAssessmentCreateInput result = new OrderRiskAssessmentCreateInput();
      result.orderId = this.orderId;
      result.riskLevel = this.riskLevel;
      result.facts = this.facts;
      return result;
    }

    
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    
    public Builder riskLevel(RiskAssessmentResult riskLevel) {
      this.riskLevel = riskLevel;
      return this;
    }

    
    public Builder facts(List<OrderRiskAssessmentFactInput> facts) {
      this.facts = facts;
      return this;
    }
  }
}
