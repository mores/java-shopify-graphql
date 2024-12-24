package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class CollectionRuleConditions {
  
  private List<CollectionRuleRelation> allowedRelations;

  
  private CollectionRuleRelation defaultRelation;

  
  private CollectionRuleConditionsRuleObject ruleObject;

  
  private CollectionRuleColumn ruleType;

  public CollectionRuleConditions() {
  }

  
  public List<CollectionRuleRelation> getAllowedRelations() {
    return allowedRelations;
  }

  public void setAllowedRelations(List<CollectionRuleRelation> allowedRelations) {
    this.allowedRelations = allowedRelations;
  }

  
  public CollectionRuleRelation getDefaultRelation() {
    return defaultRelation;
  }

  public void setDefaultRelation(CollectionRuleRelation defaultRelation) {
    this.defaultRelation = defaultRelation;
  }

  
  public CollectionRuleConditionsRuleObject getRuleObject() {
    return ruleObject;
  }

  public void setRuleObject(CollectionRuleConditionsRuleObject ruleObject) {
    this.ruleObject = ruleObject;
  }

  
  public CollectionRuleColumn getRuleType() {
    return ruleType;
  }

  public void setRuleType(CollectionRuleColumn ruleType) {
    this.ruleType = ruleType;
  }

  @Override
  public String toString() {
    return "CollectionRuleConditions{allowedRelations='" + allowedRelations + "', defaultRelation='" + defaultRelation + "', ruleObject='" + ruleObject + "', ruleType='" + ruleType + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CollectionRuleConditions that = (CollectionRuleConditions) o;
    return Objects.equals(allowedRelations, that.allowedRelations) &&
        Objects.equals(defaultRelation, that.defaultRelation) &&
        Objects.equals(ruleObject, that.ruleObject) &&
        Objects.equals(ruleType, that.ruleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedRelations, defaultRelation, ruleObject, ruleType);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private List<CollectionRuleRelation> allowedRelations;

    
    private CollectionRuleRelation defaultRelation;

    
    private CollectionRuleConditionsRuleObject ruleObject;

    
    private CollectionRuleColumn ruleType;

    public CollectionRuleConditions build() {
      CollectionRuleConditions result = new CollectionRuleConditions();
      result.allowedRelations = this.allowedRelations;
      result.defaultRelation = this.defaultRelation;
      result.ruleObject = this.ruleObject;
      result.ruleType = this.ruleType;
      return result;
    }

    
    public Builder allowedRelations(List<CollectionRuleRelation> allowedRelations) {
      this.allowedRelations = allowedRelations;
      return this;
    }

    
    public Builder defaultRelation(CollectionRuleRelation defaultRelation) {
      this.defaultRelation = defaultRelation;
      return this;
    }

    
    public Builder ruleObject(CollectionRuleConditionsRuleObject ruleObject) {
      this.ruleObject = ruleObject;
      return this;
    }

    
    public Builder ruleType(CollectionRuleColumn ruleType) {
      this.ruleType = ruleType;
      return this;
    }
  }
}
