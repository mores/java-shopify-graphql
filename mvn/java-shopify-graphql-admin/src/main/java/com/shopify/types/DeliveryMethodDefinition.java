package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A method definition contains the delivery rate and the conditions that must be met for the method to be
 * applied.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DeliveryMethodDefinition implements com.shopify.types.Node {
  /**
   * Whether this method definition is active.
   */
  private boolean active;

  /**
   * The description of the method definition. Only available on shipping rates that are custom.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The method conditions that must pass for this method definition to be applied to an order.
   */
  private List<DeliveryCondition> methodConditions;

  /**
   * The name of the method definition.
   */
  private String name;

  /**
   * The provided rate for this method definition, from a rate definition or participant.
   */
  private DeliveryRateProvider rateProvider;

  public DeliveryMethodDefinition() {
  }

  /**
   * Whether this method definition is active.
   */
  public boolean getActive() {
    return active;
  }

  public void setActive(boolean active) {
    this.active = active;
  }

  /**
   * The description of the method definition. Only available on shipping rates that are custom.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The method conditions that must pass for this method definition to be applied to an order.
   */
  public List<DeliveryCondition> getMethodConditions() {
    return methodConditions;
  }

  public void setMethodConditions(List<DeliveryCondition> methodConditions) {
    this.methodConditions = methodConditions;
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
   * The provided rate for this method definition, from a rate definition or participant.
   */
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
    /**
     * Whether this method definition is active.
     */
    private boolean active;

    /**
     * The description of the method definition. Only available on shipping rates that are custom.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The method conditions that must pass for this method definition to be applied to an order.
     */
    private List<DeliveryCondition> methodConditions;

    /**
     * The name of the method definition.
     */
    private String name;

    /**
     * The provided rate for this method definition, from a rate definition or participant.
     */
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

    /**
     * Whether this method definition is active.
     */
    public Builder active(boolean active) {
      this.active = active;
      return this;
    }

    /**
     * The description of the method definition. Only available on shipping rates that are custom.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The method conditions that must pass for this method definition to be applied to an order.
     */
    public Builder methodConditions(List<DeliveryCondition> methodConditions) {
      this.methodConditions = methodConditions;
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
     * The provided rate for this method definition, from a rate definition or participant.
     */
    public Builder rateProvider(DeliveryRateProvider rateProvider) {
      this.rateProvider = rateProvider;
      return this;
    }
  }
}
