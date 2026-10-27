package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Summary of risk characteristics for an order.
 *
 * See the [example query "Retrieve order risk assessments"](https://shopify.dev/docs/api/admin-graphql/unstable/queries/order?example=retrieve-order-risk-assessments).
 */
public class OrderRiskSummary {
  /**
   * The risk assessments for the order.
   */
  private List<OrderRiskAssessment> assessments;

  /**
   * The recommended action for the order based on its risk assessments.
   */
  private OrderRiskRecommendationResult recommendation;

  public OrderRiskSummary() {
  }

  /**
   * The risk assessments for the order.
   */
  public List<OrderRiskAssessment> getAssessments() {
    return assessments;
  }

  public void setAssessments(List<OrderRiskAssessment> assessments) {
    this.assessments = assessments;
  }

  /**
   * The recommended action for the order based on its risk assessments.
   */
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
    /**
     * The risk assessments for the order.
     */
    private List<OrderRiskAssessment> assessments;

    /**
     * The recommended action for the order based on its risk assessments.
     */
    private OrderRiskRecommendationResult recommendation;

    public OrderRiskSummary build() {
      OrderRiskSummary result = new OrderRiskSummary();
      result.assessments = this.assessments;
      result.recommendation = this.recommendation;
      return result;
    }

    /**
     * The risk assessments for the order.
     */
    public Builder assessments(List<OrderRiskAssessment> assessments) {
      this.assessments = assessments;
      return this;
    }

    /**
     * The recommended action for the order based on its risk assessments.
     */
    public Builder recommendation(OrderRiskRecommendationResult recommendation) {
      this.recommendation = recommendation;
      return this;
    }
  }
}
