package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A risk assessment for an order.
 *
 * See the [example query "Retrieve order risk assessments"](https://shopify.dev/docs/api/admin-graphql/unstable/queries/order?example=retrieve-order-risk-assessments).
 */
public class OrderRiskAssessment {
  /**
   * Facts included with the risk assessment. Fact values are specific to the provider.
   * See the [examples for the mutation orderRiskAssessmentCreate](https://shopify.dev/api/admin-graphql/unstable/mutations/orderRiskAssessmentCreate#section-examples).
   */
  private List<RiskFact> facts;

  /**
   * The app that provided the assessment, `null` if the assessment was provided by Shopify.
   */
  private App provider;

  /**
   * The risk level assigned to the order.
   */
  private RiskAssessmentResult riskLevel;

  public OrderRiskAssessment() {
  }

  /**
   * Facts included with the risk assessment. Fact values are specific to the provider.
   * See the [examples for the mutation orderRiskAssessmentCreate](https://shopify.dev/api/admin-graphql/unstable/mutations/orderRiskAssessmentCreate#section-examples).
   */
  public List<RiskFact> getFacts() {
    return facts;
  }

  public void setFacts(List<RiskFact> facts) {
    this.facts = facts;
  }

  /**
   * The app that provided the assessment, `null` if the assessment was provided by Shopify.
   */
  public App getProvider() {
    return provider;
  }

  public void setProvider(App provider) {
    this.provider = provider;
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

  @Override
  public String toString() {
    return "OrderRiskAssessment{facts='" + facts + "', provider='" + provider + "', riskLevel='" + riskLevel + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderRiskAssessment that = (OrderRiskAssessment) o;
    return Objects.equals(facts, that.facts) &&
        Objects.equals(provider, that.provider) &&
        Objects.equals(riskLevel, that.riskLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facts, provider, riskLevel);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Facts included with the risk assessment. Fact values are specific to the provider.
     * See the [examples for the mutation orderRiskAssessmentCreate](https://shopify.dev/api/admin-graphql/unstable/mutations/orderRiskAssessmentCreate#section-examples).
     */
    private List<RiskFact> facts;

    /**
     * The app that provided the assessment, `null` if the assessment was provided by Shopify.
     */
    private App provider;

    /**
     * The risk level assigned to the order.
     */
    private RiskAssessmentResult riskLevel;

    public OrderRiskAssessment build() {
      OrderRiskAssessment result = new OrderRiskAssessment();
      result.facts = this.facts;
      result.provider = this.provider;
      result.riskLevel = this.riskLevel;
      return result;
    }

    /**
     * Facts included with the risk assessment. Fact values are specific to the provider.
     * See the [examples for the mutation orderRiskAssessmentCreate](https://shopify.dev/api/admin-graphql/unstable/mutations/orderRiskAssessmentCreate#section-examples).
     */
    public Builder facts(List<RiskFact> facts) {
      this.facts = facts;
      return this;
    }

    /**
     * The app that provided the assessment, `null` if the assessment was provided by Shopify.
     */
    public Builder provider(App provider) {
      this.provider = provider;
      return this;
    }

    /**
     * The risk level assigned to the order.
     */
    public Builder riskLevel(RiskAssessmentResult riskLevel) {
      this.riskLevel = riskLevel;
      return this;
    }
  }
}
