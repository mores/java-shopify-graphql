package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for creating an order risk assessment.
 */
public class OrderRiskAssessmentCreateInput {
  /**
   * The ID of the order to assess.
   */
  private String orderId;

  /**
   * The risk level assigned to the order.
   */
  private RiskAssessmentResult riskLevel;

  /**
   * Facts to include with the risk assessment. Up to 20 facts can be provided.
   */
  private List<OrderRiskAssessmentFactInput> facts;

  public OrderRiskAssessmentCreateInput() {
  }

  /**
   * The ID of the order to assess.
   */
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  /**
   * The risk level assigned to the order.
   */
  public RiskAssessmentResult getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(RiskAssessmentResult riskLevel) {
    this.riskLevel = riskLevel;
  }

  /**
   * Facts to include with the risk assessment. Up to 20 facts can be provided.
   */
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
    /**
     * The ID of the order to assess.
     */
    private String orderId;

    /**
     * The risk level assigned to the order.
     */
    private RiskAssessmentResult riskLevel;

    /**
     * Facts to include with the risk assessment. Up to 20 facts can be provided.
     */
    private List<OrderRiskAssessmentFactInput> facts;

    public OrderRiskAssessmentCreateInput build() {
      OrderRiskAssessmentCreateInput result = new OrderRiskAssessmentCreateInput();
      result.orderId = this.orderId;
      result.riskLevel = this.riskLevel;
      result.facts = this.facts;
      return result;
    }

    /**
     * The ID of the order to assess.
     */
    public Builder orderId(String orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     * The risk level assigned to the order.
     */
    public Builder riskLevel(RiskAssessmentResult riskLevel) {
      this.riskLevel = riskLevel;
      return this;
    }

    /**
     * Facts to include with the risk assessment. Up to 20 facts can be provided.
     */
    public Builder facts(List<OrderRiskAssessmentFactInput> facts) {
      this.facts = facts;
      return this;
    }
  }
}
