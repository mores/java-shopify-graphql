package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Return type for `orderRiskAssessmentCreate` mutation.
 */
public class OrderRiskAssessmentCreatePayload {
  /**
   * The order risk assessment created.
   */
  private OrderRiskAssessment orderRiskAssessment;

  /**
   * The list of errors that occurred from executing the mutation.
   */
  private List<OrderRiskAssessmentCreateUserError> userErrors;

  public OrderRiskAssessmentCreatePayload() {
  }

  /**
   * The order risk assessment created.
   */
  public OrderRiskAssessment getOrderRiskAssessment() {
    return orderRiskAssessment;
  }

  public void setOrderRiskAssessment(OrderRiskAssessment orderRiskAssessment) {
    this.orderRiskAssessment = orderRiskAssessment;
  }

  /**
   * The list of errors that occurred from executing the mutation.
   */
  public List<OrderRiskAssessmentCreateUserError> getUserErrors() {
    return userErrors;
  }

  public void setUserErrors(List<OrderRiskAssessmentCreateUserError> userErrors) {
    this.userErrors = userErrors;
  }

  @Override
  public String toString() {
    return "OrderRiskAssessmentCreatePayload{orderRiskAssessment='" + orderRiskAssessment + "', userErrors='" + userErrors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderRiskAssessmentCreatePayload that = (OrderRiskAssessmentCreatePayload) o;
    return Objects.equals(orderRiskAssessment, that.orderRiskAssessment) &&
        Objects.equals(userErrors, that.userErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderRiskAssessment, userErrors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The order risk assessment created.
     */
    private OrderRiskAssessment orderRiskAssessment;

    /**
     * The list of errors that occurred from executing the mutation.
     */
    private List<OrderRiskAssessmentCreateUserError> userErrors;

    public OrderRiskAssessmentCreatePayload build() {
      OrderRiskAssessmentCreatePayload result = new OrderRiskAssessmentCreatePayload();
      result.orderRiskAssessment = this.orderRiskAssessment;
      result.userErrors = this.userErrors;
      return result;
    }

    /**
     * The order risk assessment created.
     */
    public Builder orderRiskAssessment(OrderRiskAssessment orderRiskAssessment) {
      this.orderRiskAssessment = orderRiskAssessment;
      return this;
    }

    /**
     * The list of errors that occurred from executing the mutation.
     */
    public Builder userErrors(List<OrderRiskAssessmentCreateUserError> userErrors) {
      this.userErrors = userErrors;
      return this;
    }
  }
}
