package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class DeliveryProfileInput {
  
  private String name;

  
  private List<DeliveryProfileLocationGroupInput> profileLocationGroups;

  
  private List<DeliveryProfileLocationGroupInput> locationGroupsToCreate;

  
  private List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate;

  
  private List<String> locationGroupsToDelete;

  
  private List<String> variantsToAssociate;

  
  private List<String> variantsToDissociate;

  
  private List<String> zonesToDelete;

  
  private List<String> methodDefinitionsToDelete;

  
  private List<String> conditionsToDelete;

  
  private List<String> sellingPlanGroupsToAssociate;

  
  private List<String> sellingPlanGroupsToDissociate;

  public DeliveryProfileInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public List<DeliveryProfileLocationGroupInput> getProfileLocationGroups() {
    return profileLocationGroups;
  }

  public void setProfileLocationGroups(
      List<DeliveryProfileLocationGroupInput> profileLocationGroups) {
    this.profileLocationGroups = profileLocationGroups;
  }

  
  public List<DeliveryProfileLocationGroupInput> getLocationGroupsToCreate() {
    return locationGroupsToCreate;
  }

  public void setLocationGroupsToCreate(
      List<DeliveryProfileLocationGroupInput> locationGroupsToCreate) {
    this.locationGroupsToCreate = locationGroupsToCreate;
  }

  
  public List<DeliveryProfileLocationGroupInput> getLocationGroupsToUpdate() {
    return locationGroupsToUpdate;
  }

  public void setLocationGroupsToUpdate(
      List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate) {
    this.locationGroupsToUpdate = locationGroupsToUpdate;
  }

  
  public List<String> getLocationGroupsToDelete() {
    return locationGroupsToDelete;
  }

  public void setLocationGroupsToDelete(List<String> locationGroupsToDelete) {
    this.locationGroupsToDelete = locationGroupsToDelete;
  }

  
  public List<String> getVariantsToAssociate() {
    return variantsToAssociate;
  }

  public void setVariantsToAssociate(List<String> variantsToAssociate) {
    this.variantsToAssociate = variantsToAssociate;
  }

  
  public List<String> getVariantsToDissociate() {
    return variantsToDissociate;
  }

  public void setVariantsToDissociate(List<String> variantsToDissociate) {
    this.variantsToDissociate = variantsToDissociate;
  }

  
  public List<String> getZonesToDelete() {
    return zonesToDelete;
  }

  public void setZonesToDelete(List<String> zonesToDelete) {
    this.zonesToDelete = zonesToDelete;
  }

  
  public List<String> getMethodDefinitionsToDelete() {
    return methodDefinitionsToDelete;
  }

  public void setMethodDefinitionsToDelete(List<String> methodDefinitionsToDelete) {
    this.methodDefinitionsToDelete = methodDefinitionsToDelete;
  }

  
  public List<String> getConditionsToDelete() {
    return conditionsToDelete;
  }

  public void setConditionsToDelete(List<String> conditionsToDelete) {
    this.conditionsToDelete = conditionsToDelete;
  }

  
  public List<String> getSellingPlanGroupsToAssociate() {
    return sellingPlanGroupsToAssociate;
  }

  public void setSellingPlanGroupsToAssociate(List<String> sellingPlanGroupsToAssociate) {
    this.sellingPlanGroupsToAssociate = sellingPlanGroupsToAssociate;
  }

  
  public List<String> getSellingPlanGroupsToDissociate() {
    return sellingPlanGroupsToDissociate;
  }

  public void setSellingPlanGroupsToDissociate(List<String> sellingPlanGroupsToDissociate) {
    this.sellingPlanGroupsToDissociate = sellingPlanGroupsToDissociate;
  }

  @Override
  public String toString() {
    return "DeliveryProfileInput{name='" + name + "', profileLocationGroups='" + profileLocationGroups + "', locationGroupsToCreate='" + locationGroupsToCreate + "', locationGroupsToUpdate='" + locationGroupsToUpdate + "', locationGroupsToDelete='" + locationGroupsToDelete + "', variantsToAssociate='" + variantsToAssociate + "', variantsToDissociate='" + variantsToDissociate + "', zonesToDelete='" + zonesToDelete + "', methodDefinitionsToDelete='" + methodDefinitionsToDelete + "', conditionsToDelete='" + conditionsToDelete + "', sellingPlanGroupsToAssociate='" + sellingPlanGroupsToAssociate + "', sellingPlanGroupsToDissociate='" + sellingPlanGroupsToDissociate + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeliveryProfileInput that = (DeliveryProfileInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(profileLocationGroups, that.profileLocationGroups) &&
        Objects.equals(locationGroupsToCreate, that.locationGroupsToCreate) &&
        Objects.equals(locationGroupsToUpdate, that.locationGroupsToUpdate) &&
        Objects.equals(locationGroupsToDelete, that.locationGroupsToDelete) &&
        Objects.equals(variantsToAssociate, that.variantsToAssociate) &&
        Objects.equals(variantsToDissociate, that.variantsToDissociate) &&
        Objects.equals(zonesToDelete, that.zonesToDelete) &&
        Objects.equals(methodDefinitionsToDelete, that.methodDefinitionsToDelete) &&
        Objects.equals(conditionsToDelete, that.conditionsToDelete) &&
        Objects.equals(sellingPlanGroupsToAssociate, that.sellingPlanGroupsToAssociate) &&
        Objects.equals(sellingPlanGroupsToDissociate, that.sellingPlanGroupsToDissociate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, profileLocationGroups, locationGroupsToCreate, locationGroupsToUpdate, locationGroupsToDelete, variantsToAssociate, variantsToDissociate, zonesToDelete, methodDefinitionsToDelete, conditionsToDelete, sellingPlanGroupsToAssociate, sellingPlanGroupsToDissociate);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private List<DeliveryProfileLocationGroupInput> profileLocationGroups;

    
    private List<DeliveryProfileLocationGroupInput> locationGroupsToCreate;

    
    private List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate;

    
    private List<String> locationGroupsToDelete;

    
    private List<String> variantsToAssociate;

    
    private List<String> variantsToDissociate;

    
    private List<String> zonesToDelete;

    
    private List<String> methodDefinitionsToDelete;

    
    private List<String> conditionsToDelete;

    
    private List<String> sellingPlanGroupsToAssociate;

    
    private List<String> sellingPlanGroupsToDissociate;

    public DeliveryProfileInput build() {
      DeliveryProfileInput result = new DeliveryProfileInput();
      result.name = this.name;
      result.profileLocationGroups = this.profileLocationGroups;
      result.locationGroupsToCreate = this.locationGroupsToCreate;
      result.locationGroupsToUpdate = this.locationGroupsToUpdate;
      result.locationGroupsToDelete = this.locationGroupsToDelete;
      result.variantsToAssociate = this.variantsToAssociate;
      result.variantsToDissociate = this.variantsToDissociate;
      result.zonesToDelete = this.zonesToDelete;
      result.methodDefinitionsToDelete = this.methodDefinitionsToDelete;
      result.conditionsToDelete = this.conditionsToDelete;
      result.sellingPlanGroupsToAssociate = this.sellingPlanGroupsToAssociate;
      result.sellingPlanGroupsToDissociate = this.sellingPlanGroupsToDissociate;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder profileLocationGroups(
        List<DeliveryProfileLocationGroupInput> profileLocationGroups) {
      this.profileLocationGroups = profileLocationGroups;
      return this;
    }

    
    public Builder locationGroupsToCreate(
        List<DeliveryProfileLocationGroupInput> locationGroupsToCreate) {
      this.locationGroupsToCreate = locationGroupsToCreate;
      return this;
    }

    
    public Builder locationGroupsToUpdate(
        List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate) {
      this.locationGroupsToUpdate = locationGroupsToUpdate;
      return this;
    }

    
    public Builder locationGroupsToDelete(List<String> locationGroupsToDelete) {
      this.locationGroupsToDelete = locationGroupsToDelete;
      return this;
    }

    
    public Builder variantsToAssociate(List<String> variantsToAssociate) {
      this.variantsToAssociate = variantsToAssociate;
      return this;
    }

    
    public Builder variantsToDissociate(List<String> variantsToDissociate) {
      this.variantsToDissociate = variantsToDissociate;
      return this;
    }

    
    public Builder zonesToDelete(List<String> zonesToDelete) {
      this.zonesToDelete = zonesToDelete;
      return this;
    }

    
    public Builder methodDefinitionsToDelete(List<String> methodDefinitionsToDelete) {
      this.methodDefinitionsToDelete = methodDefinitionsToDelete;
      return this;
    }

    
    public Builder conditionsToDelete(List<String> conditionsToDelete) {
      this.conditionsToDelete = conditionsToDelete;
      return this;
    }

    
    public Builder sellingPlanGroupsToAssociate(List<String> sellingPlanGroupsToAssociate) {
      this.sellingPlanGroupsToAssociate = sellingPlanGroupsToAssociate;
      return this;
    }

    
    public Builder sellingPlanGroupsToDissociate(List<String> sellingPlanGroupsToDissociate) {
      this.sellingPlanGroupsToDissociate = sellingPlanGroupsToDissociate;
      return this;
    }
  }
}
