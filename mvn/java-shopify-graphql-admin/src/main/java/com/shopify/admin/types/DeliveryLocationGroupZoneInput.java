package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a delivery zone associated to a location group and profile.
 */
public class DeliveryLocationGroupZoneInput {
  /**
   * A globally-unique ID of the zone.
   */
  private String id;

  /**
   * The name of the zone.
   */
  private String name;

  /**
   * A list of countries to associate with the zone.
   */
  private List<DeliveryCountryInput> countries;

  /**
   * A list of method definitions to create.
   */
  private List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate;

  /**
   * A list of method definitions to update.
   */
  private List<DeliveryMethodDefinitionInput> methodDefinitionsToUpdate;

  public DeliveryLocationGroupZoneInput() {
  }

  /**
   * A globally-unique ID of the zone.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the zone.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * A list of countries to associate with the zone.
   */
  public List<DeliveryCountryInput> getCountries() {
    return countries;
  }

  public void setCountries(List<DeliveryCountryInput> countries) {
    this.countries = countries;
  }

  /**
   * A list of method definitions to create.
   */
  public List<DeliveryMethodDefinitionInput> getMethodDefinitionsToCreate() {
    return methodDefinitionsToCreate;
  }

  public void setMethodDefinitionsToCreate(
      List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate) {
    this.methodDefinitionsToCreate = methodDefinitionsToCreate;
  }

  /**
   * A list of method definitions to update.
   */
  public List<DeliveryMethodDefinitionInput> getMethodDefinitionsToUpdate() {
    return methodDefinitionsToUpdate;
  }

  public void setMethodDefinitionsToUpdate(
      List<DeliveryMethodDefinitionInput> methodDefinitionsToUpdate) {
    this.methodDefinitionsToUpdate = methodDefinitionsToUpdate;
  }

  @Override
  public String toString() {
    return "DeliveryLocationGroupZoneInput{id='" + id + "', name='" + name + "', countries='" + countries + "', methodDefinitionsToCreate='" + methodDefinitionsToCreate + "', methodDefinitionsToUpdate='" + methodDefinitionsToUpdate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryLocationGroupZoneInput that = (DeliveryLocationGroupZoneInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(countries, that.countries) &&
        Objects.equals(methodDefinitionsToCreate, that.methodDefinitionsToCreate) &&
        Objects.equals(methodDefinitionsToUpdate, that.methodDefinitionsToUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, countries, methodDefinitionsToCreate, methodDefinitionsToUpdate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * A globally-unique ID of the zone.
     */
    private String id;

    /**
     * The name of the zone.
     */
    private String name;

    /**
     * A list of countries to associate with the zone.
     */
    private List<DeliveryCountryInput> countries;

    /**
     * A list of method definitions to create.
     */
    private List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate;

    /**
     * A list of method definitions to update.
     */
    private List<DeliveryMethodDefinitionInput> methodDefinitionsToUpdate;

    public DeliveryLocationGroupZoneInput build() {
      DeliveryLocationGroupZoneInput result = new DeliveryLocationGroupZoneInput();
      result.id = this.id;
      result.name = this.name;
      result.countries = this.countries;
      result.methodDefinitionsToCreate = this.methodDefinitionsToCreate;
      result.methodDefinitionsToUpdate = this.methodDefinitionsToUpdate;
      return result;
    }

    /**
     * A globally-unique ID of the zone.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the zone.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * A list of countries to associate with the zone.
     */
    public Builder countries(List<DeliveryCountryInput> countries) {
      this.countries = countries;
      return this;
    }

    /**
     * A list of method definitions to create.
     */
    public Builder methodDefinitionsToCreate(
        List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate) {
      this.methodDefinitionsToCreate = methodDefinitionsToCreate;
      return this;
    }

    /**
     * A list of method definitions to update.
     */
    public Builder methodDefinitionsToUpdate(
        List<DeliveryMethodDefinitionInput> methodDefinitionsToUpdate) {
      this.methodDefinitionsToUpdate = methodDefinitionsToUpdate;
      return this;
    }
  }
}
