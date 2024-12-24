package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class RiskFact {
  
  private String description;

  
  private RiskFactSentiment sentiment;

  public RiskFact() {
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
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
    
    private String description;

    
    private RiskFactSentiment sentiment;

    public RiskFact build() {
      RiskFact result = new RiskFact();
      result.description = this.description;
      result.sentiment = this.sentiment;
      return result;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder sentiment(RiskFactSentiment sentiment) {
      this.sentiment = sentiment;
      return this;
    }
  }
}
