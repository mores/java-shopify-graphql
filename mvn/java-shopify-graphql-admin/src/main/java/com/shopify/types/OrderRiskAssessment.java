package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class OrderRiskAssessment {
  
  private List<RiskFact> facts;

  
  private App provider;

  
  private RiskAssessmentResult riskLevel;

  public OrderRiskAssessment() {
  }

  
  public List<RiskFact> getFacts() {
    return facts;
  }

  public void setFacts(List<RiskFact> facts) {
    this.facts = facts;
  }

  
  public App getProvider() {
    return provider;
  }

  public void setProvider(App provider) {
    this.provider = provider;
  }

  
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
    
    private List<RiskFact> facts;

    
    private App provider;

    
    private RiskAssessmentResult riskLevel;

    public OrderRiskAssessment build() {
      OrderRiskAssessment result = new OrderRiskAssessment();
      result.facts = this.facts;
      result.provider = this.provider;
      result.riskLevel = this.riskLevel;
      return result;
    }

    
    public Builder facts(List<RiskFact> facts) {
      this.facts = facts;
      return this;
    }

    
    public Builder provider(App provider) {
      this.provider = provider;
      return this;
    }

    
    public Builder riskLevel(RiskAssessmentResult riskLevel) {
      this.riskLevel = riskLevel;
      return this;
    }
  }
}
