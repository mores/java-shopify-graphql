package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Additional context provided with an order risk assessment. Facts may not affect the order's risk recommendation.
 */
public class RiskFact {
  /**
   * Descriptions longer than 256 characters are truncated.
   */
  private String description;

  /**
   * Indicates whether the fact contributes negatively, neutrally, or positively to risk.
   */
  private RiskFactSentiment sentiment;

  public RiskFact() {
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

  /**
   * Indicates whether the fact contributes negatively, neutrally, or positively to risk.
   */
  public RiskFactSentiment getSentiment() {
    return sentiment;
  }

  public void setSentiment(RiskFactSentiment sentiment) {
    this.sentiment = sentiment;
  }

  @Override
  public String toString() {
    return "RiskFact{description='" + description + "', sentiment='" + sentiment + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RiskFact that = (RiskFact) o;
    return Objects.equals(description, that.description) &&
        Objects.equals(sentiment, that.sentiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, sentiment);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Descriptions longer than 256 characters are truncated.
     */
    private String description;

    /**
     * Indicates whether the fact contributes negatively, neutrally, or positively to risk.
     */
    private RiskFactSentiment sentiment;

    public RiskFact build() {
      RiskFact result = new RiskFact();
      result.description = this.description;
      result.sentiment = this.sentiment;
      return result;
    }

    /**
     * Descriptions longer than 256 characters are truncated.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Indicates whether the fact contributes negatively, neutrally, or positively to risk.
     */
    public Builder sentiment(RiskFactSentiment sentiment) {
      this.sentiment = sentiment;
      return this;
    }
  }
}
