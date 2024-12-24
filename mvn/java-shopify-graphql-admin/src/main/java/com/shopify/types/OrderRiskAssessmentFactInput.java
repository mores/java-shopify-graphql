package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class OrderRiskAssessmentFactInput {
  
  private RiskFactSentiment sentiment;

  
  private String description;

  public OrderRiskAssessmentFactInput() {
  }

  
  public RiskFactSentiment getSentiment() {
    return sentiment;
  }

  public void setSentiment(RiskFactSentiment sentiment) {
    this.sentiment = sentiment;
  }

  
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
    
    private RiskFactSentiment sentiment;

    
    private String description;

    public OrderRiskAssessmentFactInput build() {
      OrderRiskAssessmentFactInput result = new OrderRiskAssessmentFactInput();
      result.sentiment = this.sentiment;
      result.description = this.description;
      return result;
    }

    
    public Builder sentiment(RiskFactSentiment sentiment) {
      this.sentiment = sentiment;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }
}
