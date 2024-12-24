package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryLocationGroupZoneInput {
  
  private String id;

  
  private String name;

  
  private List<DeliveryCountryInput> countries;

  
  private List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate;

  
  private List<DeliveryMethodDefinitionInput> methodDefinitionsToUpdate;

  public DeliveryLocationGroupZoneInput() {
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

  
  public List<DeliveryCountryInput> getCountries() {
    return countries;
  }

  public void setCountries(List<DeliveryCountryInput> countries) {
    this.countries = countries;
  }

  
  public List<DeliveryMethodDefinitionInput> getMethodDefinitionsToCreate() {
    return methodDefinitionsToCreate;
  }

  public void setMethodDefinitionsToCreate(
      List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate) {
    this.methodDefinitionsToCreate = methodDefinitionsToCreate;
  }

  
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
    
    private String id;

    
    private String name;

    
    private List<DeliveryCountryInput> countries;

    
    private List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate;

    
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

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder countries(List<DeliveryCountryInput> countries) {
      this.countries = countries;
      return this;
    }

    
    public Builder methodDefinitionsToCreate(
        List<DeliveryMethodDefinitionInput> methodDefinitionsToCreate) {
      this.methodDefinitionsToCreate = methodDefinitionsToCreate;
      return this;
    }

    
    public Builder methodDefinitionsToUpdate(
        List<DeliveryMethodDefinitionInput> methodDefinitionsToUpdate) {
      this.methodDefinitionsToUpdate = methodDefinitionsToUpdate;
      return this;
    }
  }
}
