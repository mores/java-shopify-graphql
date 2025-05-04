package com.shopify.admin.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a method definition.
 */
public class DeliveryMethodDefinitionInput {
  /**
   * A globally-unique ID of the method definition. Use only when updating a method definiton.
   */
  private String id;

  /**
   * The name of the method definition.
   */
  private String name;

  /**
   * The description of the method definition.
   */
  private String description;

  /**
   * Whether to use this method definition during rate calculation.
   */
  private Boolean active;

  /**
   * A rate definition to apply to the method definition.
   */
  private DeliveryRateDefinitionInput rateDefinition;

  /**
   * A participant to apply to the method definition.
   */
  private DeliveryParticipantInput participant;

  /**
   * A list of weight conditions on the method definition.
   */
  private List<DeliveryWeightConditionInput> weightConditionsToCreate;

  /**
   * A list of price conditions on the method definition.
   */
  private List<DeliveryPriceConditionInput> priceConditionsToCreate;

  /**
   * A list of conditions to update on the method definition.
   */
  private List<DeliveryUpdateConditionInput> conditionsToUpdate;

  public DeliveryMethodDefinitionInput() {
  }

  /**
   * A globally-unique ID of the method definition. Use only when updating a method definiton.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the method definition.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The description of the method definition.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Whether to use this method definition during rate calculation.
   */
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  /**
   * A rate definition to apply to the method definition.
   */
  public DeliveryRateDefinitionInput getRateDefinition() {
    return rateDefinition;
  }

  public void setRateDefinition(DeliveryRateDefinitionInput rateDefinition) {
    this.rateDefinition = rateDefinition;
  }

  /**
   * A participant to apply to the method definition.
   */
  public DeliveryParticipantInput getParticipant() {
    return participant;
  }

  public void setParticipant(DeliveryParticipantInput participant) {
    this.participant = participant;
  }

  /**
   * A list of weight conditions on the method definition.
   */
  public List<DeliveryWeightConditionInput> getWeightConditionsToCreate() {
    return weightConditionsToCreate;
  }

  public void setWeightConditionsToCreate(
      List<DeliveryWeightConditionInput> weightConditionsToCreate) {
    this.weightConditionsToCreate = weightConditionsToCreate;
  }

  /**
   * A list of price conditions on the method definition.
   */
  public List<DeliveryPriceConditionInput> getPriceConditionsToCreate() {
    return priceConditionsToCreate;
  }

  public void setPriceConditionsToCreate(
      List<DeliveryPriceConditionInput> priceConditionsToCreate) {
    this.priceConditionsToCreate = priceConditionsToCreate;
  }

  /**
   * A list of conditions to update on the method definition.
   */
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
    /**
     * A globally-unique ID of the method definition. Use only when updating a method definiton.
     */
    private String id;

    /**
     * The name of the method definition.
     */
    private String name;

    /**
     * The description of the method definition.
     */
    private String description;

    /**
     * Whether to use this method definition during rate calculation.
     */
    private Boolean active;

    /**
     * A rate definition to apply to the method definition.
     */
    private DeliveryRateDefinitionInput rateDefinition;

    /**
     * A participant to apply to the method definition.
     */
    private DeliveryParticipantInput participant;

    /**
     * A list of weight conditions on the method definition.
     */
    private List<DeliveryWeightConditionInput> weightConditionsToCreate;

    /**
     * A list of price conditions on the method definition.
     */
    private List<DeliveryPriceConditionInput> priceConditionsToCreate;

    /**
     * A list of conditions to update on the method definition.
     */
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

    /**
     * A globally-unique ID of the method definition. Use only when updating a method definiton.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the method definition.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The description of the method definition.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Whether to use this method definition during rate calculation.
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * A rate definition to apply to the method definition.
     */
    public Builder rateDefinition(DeliveryRateDefinitionInput rateDefinition) {
      this.rateDefinition = rateDefinition;
      return this;
    }

    /**
     * A participant to apply to the method definition.
     */
    public Builder participant(DeliveryParticipantInput participant) {
      this.participant = participant;
      return this;
    }

    /**
     * A list of weight conditions on the method definition.
     */
    public Builder weightConditionsToCreate(
        List<DeliveryWeightConditionInput> weightConditionsToCreate) {
      this.weightConditionsToCreate = weightConditionsToCreate;
      return this;
    }

    /**
     * A list of price conditions on the method definition.
     */
    public Builder priceConditionsToCreate(
        List<DeliveryPriceConditionInput> priceConditionsToCreate) {
      this.priceConditionsToCreate = priceConditionsToCreate;
      return this;
    }

    /**
     * A list of conditions to update on the method definition.
     */
    public Builder conditionsToUpdate(List<DeliveryUpdateConditionInput> conditionsToUpdate) {
      this.conditionsToUpdate = conditionsToUpdate;
      return this;
    }
  }
}
