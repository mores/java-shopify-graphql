package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields to create a fact on an order risk assessment.
 */
public class OrderRiskAssessmentFactInput {
  /**
   * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
   */
  private RiskFactSentiment sentiment;

  /**
   * A description of the fact. Large values are truncated to 256 characters.
   */
  private String description;

  public OrderRiskAssessmentFactInput() {
  }

  /**
   * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
   */
  public RiskFactSentiment getSentiment() {
    return sentiment;
  }

  public void setSentiment(RiskFactSentiment sentiment) {
    this.sentiment = sentiment;
  }

  /**
   * A description of the fact. Large values are truncated to 256 characters.
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
     * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
     */
    private RiskFactSentiment sentiment;

    /**
     * A description of the fact. Large values are truncated to 256 characters.
     */
    private String description;

    public OrderRiskAssessmentFactInput build() {
      OrderRiskAssessmentFactInput result = new OrderRiskAssessmentFactInput();
      result.sentiment = this.sentiment;
      result.description = this.description;
      return result;
    }

    /**
     * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
     */
    public Builder sentiment(RiskFactSentiment sentiment) {
      this.sentiment = sentiment;
      return this;
    }

    /**
     * A description of the fact. Large values are truncated to 256 characters.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }
}
