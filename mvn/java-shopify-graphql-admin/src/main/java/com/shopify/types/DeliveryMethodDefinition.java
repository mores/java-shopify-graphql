package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryMethodDefinition implements com.shopify.types.Node {
  
  private boolean active;

  
  private String description;

  
  private String id;

  
  private List<DeliveryCondition> methodConditions;

  
  private String name;

  
  private DeliveryRateProvider rateProvider;

  public DeliveryMethodDefinition() {
  }

  
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<DeliveryCondition> getMethodConditions() {
    return methodConditions;
  }

  public void setMethodConditions(List<DeliveryCondition> methodConditions) {
    this.methodConditions = methodConditions;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public DeliveryRateProvider getRateProvider() {
    return rateProvider;
  }

  public void setRateProvider(DeliveryRateProvider rateProvider) {
    this.rateProvider = rateProvider;
  }

  @Override
  public String toString() {
    return "DeliveryMethodDefinition{active='" + active + "', description='" + description + "', id='" + id + "', methodConditions='" + methodConditions + "', name='" + name + "', rateProvider='" + rateProvider + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryMethodDefinition that = (DeliveryMethodDefinition) o;
    return active == that.active &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(methodConditions, that.methodConditions) &&
        Objects.equals(name, that.name) &&
        Objects.equals(rateProvider, that.rateProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, description, id, methodConditions, name, rateProvider);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private boolean active;

    
    private String description;

    
    private String id;

    
    private List<DeliveryCondition> methodConditions;

    
    private String name;

    
    private DeliveryRateProvider rateProvider;

    public DeliveryMethodDefinition build() {
      DeliveryMethodDefinition result = new DeliveryMethodDefinition();
      result.active = this.active;
      result.description = this.description;
      result.id = this.id;
      result.methodConditions = this.methodConditions;
      result.name = this.name;
      result.rateProvider = this.rateProvider;
      return result;
    }

    
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder methodConditions(List<DeliveryCondition> methodConditions) {
      this.methodConditions = methodConditions;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder rateProvider(DeliveryRateProvider rateProvider) {
      this.rateProvider = rateProvider;
      return this;
    }
  }
}
