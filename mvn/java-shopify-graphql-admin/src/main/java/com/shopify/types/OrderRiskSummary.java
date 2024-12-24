package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderRiskSummary {
  
  private List<OrderRiskAssessment> assessments;

  
  private OrderRiskRecommendationResult recommendation;

  public OrderRiskSummary() {
  }

  
  public List<OrderRiskAssessment> getAssessments() {
    return assessments;
  }

  public void setAssessments(List<OrderRiskAssessment> assessments) {
    this.assessments = assessments;
  }

  
  public OrderRiskRecommendationResult getRecommendation() {
    return recommendation;
  }

  public void setRecommendation(OrderRiskRecommendationResult recommendation) {
    this.recommendation = recommendation;
  }

  @Override
  public String toString() {
    return "OrderRiskSummary{assessments='" + assessments + "', recommendation='" + recommendation + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderRiskSummary that = (OrderRiskSummary) o;
    return Objects.equals(assessments, that.assessments) &&
        Objects.equals(recommendation, that.recommendation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assessments, recommendation);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<OrderRiskAssessment> assessments;

    
    private OrderRiskRecommendationResult recommendation;

    public OrderRiskSummary build() {
      OrderRiskSummary result = new OrderRiskSummary();
      result.assessments = this.assessments;
      result.recommendation = this.recommendation;
      return result;
    }

    
    public Builder assessments(List<OrderRiskAssessment> assessments) {
      this.assessments = assessments;
      return this;
    }

    
    public Builder recommendation(OrderRiskRecommendationResult recommendation) {
      this.recommendation = recommendation;
      return this;
    }
  }
}
