package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionRuleSetInput {
  
  private boolean appliedDisjunctively;

  
  private List<CollectionRuleInput> rules;

  public CollectionRuleSetInput() {
  }

  
  public boolean getAppliedDisjunctively() {
    return appliedDisjunctively;
  }

  public void setAppliedDisjunctively(boolean appliedDisjunctively) {
    this.appliedDisjunctively = appliedDisjunctively;
  }

  
  public List<CollectionRuleInput> getRules() {
    return rules;
  }

  public void setRules(List<CollectionRuleInput> rules) {
    this.rules = rules;
  }

  @Override
  public String toString() {
    return "CollectionRuleSetInput{appliedDisjunctively='" + appliedDisjunctively + "', rules='" + rules + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleSetInput that = (CollectionRuleSetInput) o;
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

    
    private List<CollectionRuleInput> rules;

    public CollectionRuleSetInput build() {
      CollectionRuleSetInput result = new CollectionRuleSetInput();
      result.appliedDisjunctively = this.appliedDisjunctively;
      result.rules = this.rules;
      return result;
    }

    
    public Builder appliedDisjunctively(boolean appliedDisjunctively) {
      this.appliedDisjunctively = appliedDisjunctively;
      return this;
    }

    
    public Builder rules(List<CollectionRuleInput> rules) {
      this.rules = rules;
      return this;
    }
  }
}
