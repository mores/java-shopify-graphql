package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Summary of risk characteristics for an order.
 *
 * See the [example query "Retrieves a list of all order risks for an order"](https://shopify.dev/docs/api/admin-graphql/unstable/queries/order?example=Retrieves+a+list+of+all+order+risks+for+an+order).
 */
public class OrderRiskSummary {
  /**
   * The list of risk assessments for the order.
   */
  private List<OrderRiskAssessment> assessments;

  /**
   * The recommendation for the order based on the results of the risk assessments.
   * This suggests the action the merchant should take with regards to its risk of fraud.
   */
  private OrderRiskRecommendationResult recommendation;

  public OrderRiskSummary() {
  }

  /**
   * The list of risk assessments for the order.
   */
  public List<OrderRiskAssessment> getAssessments() {
    return assessments;
  }

  public void setAssessments(List<OrderRiskAssessment> assessments) {
    this.assessments = assessments;
  }

  /**
   * The recommendation for the order based on the results of the risk assessments.
   * This suggests the action the merchant should take with regards to its risk of fraud.
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
     * The list of risk assessments for the order.
     */
    private List<OrderRiskAssessment> assessments;

    /**
     * The recommendation for the order based on the results of the risk assessments.
     * This suggests the action the merchant should take with regards to its risk of fraud.
     */
    private OrderRiskRecommendationResult recommendation;

    public OrderRiskSummary build() {
      OrderRiskSummary result = new OrderRiskSummary();
      result.assessments = this.assessments;
      result.recommendation = this.recommendation;
      return result;
    }

    /**
     * The list of risk assessments for the order.
     */
    public Builder assessments(List<OrderRiskAssessment> assessments) {
      this.assessments = assessments;
      return this;
    }

    /**
     * The recommendation for the order based on the results of the risk assessments.
     * This suggests the action the merchant should take with regards to its risk of fraud.
     */
    public Builder recommendation(OrderRiskRecommendationResult recommendation) {
      this.recommendation = recommendation;
      return this;
    }
  }
}
