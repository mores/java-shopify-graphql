package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryMethodDefinitionInput {
  
  private String id;

  
  private String name;

  
  private String description;

  
  private Boolean active;

  
  private DeliveryRateDefinitionInput rateDefinition;

  
  private DeliveryParticipantInput participant;

  
  private List<DeliveryWeightConditionInput> weightConditionsToCreate;

  
  private List<DeliveryPriceConditionInput> priceConditionsToCreate;

  
  private List<DeliveryUpdateConditionInput> conditionsToUpdate;

  public DeliveryMethodDefinitionInput() {
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  
  public DeliveryRateDefinitionInput getRateDefinition() {
    return rateDefinition;
  }

  public void setRateDefinition(DeliveryRateDefinitionInput rateDefinition) {
    this.rateDefinition = rateDefinition;
  }

  
  public DeliveryParticipantInput getParticipant() {
    return participant;
  }

  public void setParticipant(DeliveryParticipantInput participant) {
    this.participant = participant;
  }

  
  public List<DeliveryWeightConditionInput> getWeightConditionsToCreate() {
    return weightConditionsToCreate;
  }

  public void setWeightConditionsToCreate(
      List<DeliveryWeightConditionInput> weightConditionsToCreate) {
    this.weightConditionsToCreate = weightConditionsToCreate;
  }

  
  public List<DeliveryPriceConditionInput> getPriceConditionsToCreate() {
    return priceConditionsToCreate;
  }

  public void setPriceConditionsToCreate(
      List<DeliveryPriceConditionInput> priceConditionsToCreate) {
    this.priceConditionsToCreate = priceConditionsToCreate;
  }

  
  public List<DeliveryUpdateConditionInput> getConditionsToUpdate() {
    return conditionsToUpdate;
  }

  public void setConditionsToUpdate(List<DeliveryUpdateConditionInput> conditionsToUpdate) {
    this.conditionsToUpdate = conditionsToUpdate;
  }

  @Override
  public String toString() {
    return "DeliveryMethodDefinitionInput{id='" + id + "', name='" + name + "', description='" + description + "', active='" + active + "', rateDefinition='" + rateDefinition + "', participant='" + participant + "', weightConditionsToCreate='" + weightConditionsToCreate + "', priceConditionsToCreate='" + priceConditionsToCreate + "', conditionsToUpdate='" + conditionsToUpdate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryMethodDefinitionInput that = (DeliveryMethodDefinitionInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(description, that.description) &&
        Objects.equals(active, that.active) &&
        Objects.equals(rateDefinition, that.rateDefinition) &&
        Objects.equals(participant, that.participant) &&
        Objects.equals(weightConditionsToCreate, that.weightConditionsToCreate) &&
        Objects.equals(priceConditionsToCreate, that.priceConditionsToCreate) &&
        Objects.equals(conditionsToUpdate, that.conditionsToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, active, rateDefinition, participant, weightConditionsToCreate, priceConditionsToCreate, conditionsToUpdate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String id;

    
    private String name;

    
    private String description;

    
    private Boolean active;

    
    private DeliveryRateDefinitionInput rateDefinition;

    
    private DeliveryParticipantInput participant;

    
    private List<DeliveryWeightConditionInput> weightConditionsToCreate;

    
    private List<DeliveryPriceConditionInput> priceConditionsToCreate;

    
    private List<DeliveryUpdateConditionInput> conditionsToUpdate;

    public DeliveryMethodDefinitionInput build() {
      DeliveryMethodDefinitionInput result = new DeliveryMethodDefinitionInput();
      result.id = this.id;
      result.name = this.name;
      result.description = this.description;
      result.active = this.active;
      result.rateDefinition = this.rateDefinition;
      result.participant = this.participant;
      result.weightConditionsToCreate = this.weightConditionsToCreate;
      result.priceConditionsToCreate = this.priceConditionsToCreate;
      result.conditionsToUpdate = this.conditionsToUpdate;
      return result;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    
    public Builder rateDefinition(DeliveryRateDefinitionInput rateDefinition) {
      this.rateDefinition = rateDefinition;
      return this;
    }

    
    public Builder participant(DeliveryParticipantInput participant) {
      this.participant = participant;
      return this;
    }

    
    public Builder weightConditionsToCreate(
        List<DeliveryWeightConditionInput> weightConditionsToCreate) {
      this.weightConditionsToCreate = weightConditionsToCreate;
      return this;
    }

    
    public Builder priceConditionsToCreate(
        List<DeliveryPriceConditionInput> priceConditionsToCreate) {
      this.priceConditionsToCreate = priceConditionsToCreate;
      return this;
    }

    
    public Builder conditionsToUpdate(List<DeliveryUpdateConditionInput> conditionsToUpdate) {
      this.conditionsToUpdate = conditionsToUpdate;
      return this;
    }
  }
}
