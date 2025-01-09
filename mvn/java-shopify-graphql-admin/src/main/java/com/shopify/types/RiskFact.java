package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A risk fact belongs to a single risk assessment and serves to provide additional
 * context for an assessment. Risk facts are not necessarily tied to the result of
 * the recommendation.
 */
public class RiskFact {
  /**
   * A description of the fact.
   */
  private String description;

  /**
   * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
   */
  private RiskFactSentiment sentiment;

  public RiskFact() {
  }

  /**
   * A description of the fact.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
     * A description of the fact.
     */
    private String description;

    /**
     * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
     */
    private RiskFactSentiment sentiment;

    public RiskFact build() {
      RiskFact result = new RiskFact();
      result.description = this.description;
      result.sentiment = this.sentiment;
      return result;
    }

    /**
     * A description of the fact.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Indicates whether the fact is a negative, neutral or positive contributor with regards to risk.
     */
    public Builder sentiment(RiskFactSentiment sentiment) {
      this.sentiment = sentiment;
      return this;
    }
  }
}
