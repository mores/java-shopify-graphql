package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionRuleSet {
  
  private boolean appliedDisjunctively;

  
  private List<CollectionRule> rules;

  public CollectionRuleSet() {
  }

  
  public boolean getAppliedDisjunctively() {
    return appliedDisjunctively;
  }

  public void setAppliedDisjunctively(boolean appliedDisjunctively) {
    this.appliedDisjunctively = appliedDisjunctively;
  }

  
  public List<CollectionRule> getRules() {
    return rules;
  }

  public void setRules(List<CollectionRule> rules) {
    this.rules = rules;
  }

  @Override
  public String toString() {
    return "CollectionRuleSet{appliedDisjunctively='" + appliedDisjunctively + "', rules='" + rules + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleSet that = (CollectionRuleSet) o;
    return appliedDisjunctively == that.appliedDisjunctively &&
        Objects.equals(rules, that.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appliedDisjunctively, rules);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean appliedDisjunctively;

    
    private List<CollectionRule> rules;

    public CollectionRuleSet build() {
      CollectionRuleSet result = new CollectionRuleSet();
      result.appliedDisjunctively = this.appliedDisjunctively;
      result.rules = this.rules;
      return result;
    }

    
    public Builder appliedDisjunctively(boolean appliedDisjunctively) {
      this.appliedDisjunctively = appliedDisjunctively;
      return this;
    }

    
    public Builder rules(List<CollectionRule> rules) {
      this.rules = rules;
      return this;
    }
  }
}
