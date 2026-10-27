package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields for a risk assessment fact.
 */
public class OrderRiskAssessmentFactInput {
  /**
   * Indicates whether the fact contributes negatively, neutrally, or positively to risk.
   */
  private RiskFactSentiment sentiment;

  /**
   * Descriptions longer than 256 characters are truncated.
   */
  private String description;

  public OrderRiskAssessmentFactInput() {
  }

  /**
   * Indicates whether the fact contributes negatively, neutrally, or positively to risk.
   */
  public RiskFactSentiment getSentiment() {
    return sentiment;
  }

  public void setSentiment(RiskFactSentiment sentiment) {
    this.sentiment = sentiment;
  }

  /**
   * Descriptions longer than 256 characters are truncated.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "OrderRiskAssessmentFactInput{sentiment='" + sentiment + "', description='" + description + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrderRiskAssessmentFactInput that = (OrderRiskAssessmentFactInput) o;
    return Objects.equals(sentiment, that.sentiment) &&
        Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentiment, description);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Indicates whether the fact contributes negatively, neutrally, or positively to risk.
     */
    private RiskFactSentiment sentiment;

    /**
     * Descriptions longer than 256 characters are truncated.
     */
    private String description;

    public OrderRiskAssessmentFactInput build() {
      OrderRiskAssessmentFactInput result = new OrderRiskAssessmentFactInput();
      result.sentiment = this.sentiment;
      result.description = this.description;
      return result;
    }

    /**
     * Indicates whether the fact contributes negatively, neutrally, or positively to risk.
     */
    public Builder sentiment(RiskFactSentiment sentiment) {
      this.sentiment = sentiment;
      return this;
    }

    /**
     * Descriptions longer than 256 characters are truncated.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }
}
