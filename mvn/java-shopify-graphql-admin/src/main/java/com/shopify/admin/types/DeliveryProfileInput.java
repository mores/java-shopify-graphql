package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a delivery profile.
 */
public class DeliveryProfileInput {
  /**
   * The name of the delivery profile.
   */
  private String name;

  /**
   * The list of location groups associated with the delivery profile.
   */
  private List<DeliveryProfileLocationGroupInput> profileLocationGroups;

  /**
   * The list of location groups to be created in the delivery profile.
   *   
   * **Note:** due to the potential complexity of the nested data, it is
   * recommended to send no more than 5 location groups per each request.
   */
  private List<DeliveryProfileLocationGroupInput> locationGroupsToCreate;

  /**
   * The list of location groups to be updated in the delivery profile.
   *   
   * **Note:** due to the potential complexity of the nested data, it is
   * recommended to send no more than 5 location groups per each request.
   */
  private List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate;

  /**
   * The list of location groups to be deleted from the delivery profile.
   */
  private List<String> locationGroupsToDelete;

  /**
   * The list of product variant IDs to be associated with the delivery profile.
   */
  private List<String> variantsToAssociate;

  /**
   * The list of product variant IDs to be dissociated from the delivery profile.
   * The dissociated product variants are moved back to the default delivery profile.
   */
  private List<String> variantsToDissociate;

  /**
   * The list of zone IDs to delete.
   */
  private List<String> zonesToDelete;

  /**
   * The list of method definition IDs to delete.
   */
  private List<String> methodDefinitionsToDelete;

  /**
   * The list of condition IDs to delete.
   */
  private List<String> conditionsToDelete;

  /**
   * The list of selling plan groups to be associated with the delivery profile.
   */
  private List<String> sellingPlanGroupsToAssociate;

  /**
   * The list of selling plan groups to be dissociated with the delivery profile.
   */
  private List<String> sellingPlanGroupsToDissociate;

  public DeliveryProfileInput() {
  }

  /**
   * The name of the delivery profile.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The list of location groups associated with the delivery profile.
   */
  public List<DeliveryProfileLocationGroupInput> getProfileLocationGroups() {
    return profileLocationGroups;
  }

  public void setProfileLocationGroups(
      List<DeliveryProfileLocationGroupInput> profileLocationGroups) {
    this.profileLocationGroups = profileLocationGroups;
  }

  /**
   * The list of location groups to be created in the delivery profile.
   *   
   * **Note:** due to the potential complexity of the nested data, it is
   * recommended to send no more than 5 location groups per each request.
   */
  public List<DeliveryProfileLocationGroupInput> getLocationGroupsToCreate() {
    return locationGroupsToCreate;
  }

  public void setLocationGroupsToCreate(
      List<DeliveryProfileLocationGroupInput> locationGroupsToCreate) {
    this.locationGroupsToCreate = locationGroupsToCreate;
  }

  /**
   * The list of location groups to be updated in the delivery profile.
   *   
   * **Note:** due to the potential complexity of the nested data, it is
   * recommended to send no more than 5 location groups per each request.
   */
  public List<DeliveryProfileLocationGroupInput> getLocationGroupsToUpdate() {
    return locationGroupsToUpdate;
  }

  public void setLocationGroupsToUpdate(
      List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate) {
    this.locationGroupsToUpdate = locationGroupsToUpdate;
  }

  /**
   * The list of location groups to be deleted from the delivery profile.
   */
  public List<String> getLocationGroupsToDelete() {
    return locationGroupsToDelete;
  }

  public void setLocationGroupsToDelete(List<String> locationGroupsToDelete) {
    this.locationGroupsToDelete = locationGroupsToDelete;
  }

  /**
   * The list of product variant IDs to be associated with the delivery profile.
   */
  public List<String> getVariantsToAssociate() {
    return variantsToAssociate;
  }

  public void setVariantsToAssociate(List<String> variantsToAssociate) {
    this.variantsToAssociate = variantsToAssociate;
  }

  /**
   * The list of product variant IDs to be dissociated from the delivery profile.
   * The dissociated product variants are moved back to the default delivery profile.
   */
  public List<String> getVariantsToDissociate() {
    return variantsToDissociate;
  }

  public void setVariantsToDissociate(List<String> variantsToDissociate) {
    this.variantsToDissociate = variantsToDissociate;
  }

  /**
   * The list of zone IDs to delete.
   */
  public List<String> getZonesToDelete() {
    return zonesToDelete;
  }

  public void setZonesToDelete(List<String> zonesToDelete) {
    this.zonesToDelete = zonesToDelete;
  }

  /**
   * The list of method definition IDs to delete.
   */
  public List<String> getMethodDefinitionsToDelete() {
    return methodDefinitionsToDelete;
  }

  public void setMethodDefinitionsToDelete(List<String> methodDefinitionsToDelete) {
    this.methodDefinitionsToDelete = methodDefinitionsToDelete;
  }

  /**
   * The list of condition IDs to delete.
   */
  public List<String> getConditionsToDelete() {
    return conditionsToDelete;
  }

  public void setConditionsToDelete(List<String> conditionsToDelete) {
    this.conditionsToDelete = conditionsToDelete;
  }

  /**
   * The list of selling plan groups to be associated with the delivery profile.
   */
  public List<String> getSellingPlanGroupsToAssociate() {
    return sellingPlanGroupsToAssociate;
  }

  public void setSellingPlanGroupsToAssociate(List<String> sellingPlanGroupsToAssociate) {
    this.sellingPlanGroupsToAssociate = sellingPlanGroupsToAssociate;
  }

  /**
   * The list of selling plan groups to be dissociated with the delivery profile.
   */
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
    /**
     * The name of the delivery profile.
     */
    private String name;

    /**
     * The list of location groups associated with the delivery profile.
     */
    private List<DeliveryProfileLocationGroupInput> profileLocationGroups;

    /**
     * The list of location groups to be created in the delivery profile.
     *   
     * **Note:** due to the potential complexity of the nested data, it is
     * recommended to send no more than 5 location groups per each request.
     */
    private List<DeliveryProfileLocationGroupInput> locationGroupsToCreate;

    /**
     * The list of location groups to be updated in the delivery profile.
     *   
     * **Note:** due to the potential complexity of the nested data, it is
     * recommended to send no more than 5 location groups per each request.
     */
    private List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate;

    /**
     * The list of location groups to be deleted from the delivery profile.
     */
    private List<String> locationGroupsToDelete;

    /**
     * The list of product variant IDs to be associated with the delivery profile.
     */
    private List<String> variantsToAssociate;

    /**
     * The list of product variant IDs to be dissociated from the delivery profile.
     * The dissociated product variants are moved back to the default delivery profile.
     */
    private List<String> variantsToDissociate;

    /**
     * The list of zone IDs to delete.
     */
    private List<String> zonesToDelete;

    /**
     * The list of method definition IDs to delete.
     */
    private List<String> methodDefinitionsToDelete;

    /**
     * The list of condition IDs to delete.
     */
    private List<String> conditionsToDelete;

    /**
     * The list of selling plan groups to be associated with the delivery profile.
     */
    private List<String> sellingPlanGroupsToAssociate;

    /**
     * The list of selling plan groups to be dissociated with the delivery profile.
     */
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

    /**
     * The name of the delivery profile.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The list of location groups associated with the delivery profile.
     */
    public Builder profileLocationGroups(
        List<DeliveryProfileLocationGroupInput> profileLocationGroups) {
      this.profileLocationGroups = profileLocationGroups;
      return this;
    }

    /**
     * The list of location groups to be created in the delivery profile.
     *   
     * **Note:** due to the potential complexity of the nested data, it is
     * recommended to send no more than 5 location groups per each request.
     */
    public Builder locationGroupsToCreate(
        List<DeliveryProfileLocationGroupInput> locationGroupsToCreate) {
      this.locationGroupsToCreate = locationGroupsToCreate;
      return this;
    }

    /**
     * The list of location groups to be updated in the delivery profile.
     *   
     * **Note:** due to the potential complexity of the nested data, it is
     * recommended to send no more than 5 location groups per each request.
     */
    public Builder locationGroupsToUpdate(
        List<DeliveryProfileLocationGroupInput> locationGroupsToUpdate) {
      this.locationGroupsToUpdate = locationGroupsToUpdate;
      return this;
    }

    /**
     * The list of location groups to be deleted from the delivery profile.
     */
    public Builder locationGroupsToDelete(List<String> locationGroupsToDelete) {
      this.locationGroupsToDelete = locationGroupsToDelete;
      return this;
    }

    /**
     * The list of product variant IDs to be associated with the delivery profile.
     */
    public Builder variantsToAssociate(List<String> variantsToAssociate) {
      this.variantsToAssociate = variantsToAssociate;
      return this;
    }

    /**
     * The list of product variant IDs to be dissociated from the delivery profile.
     * The dissociated product variants are moved back to the default delivery profile.
     */
    public Builder variantsToDissociate(List<String> variantsToDissociate) {
      this.variantsToDissociate = variantsToDissociate;
      return this;
    }

    /**
     * The list of zone IDs to delete.
     */
    public Builder zonesToDelete(List<String> zonesToDelete) {
      this.zonesToDelete = zonesToDelete;
      return this;
    }

    /**
     * The list of method definition IDs to delete.
     */
    public Builder methodDefinitionsToDelete(List<String> methodDefinitionsToDelete) {
      this.methodDefinitionsToDelete = methodDefinitionsToDelete;
      return this;
    }

    /**
     * The list of condition IDs to delete.
     */
    public Builder conditionsToDelete(List<String> conditionsToDelete) {
      this.conditionsToDelete = conditionsToDelete;
      return this;
    }

    /**
     * The list of selling plan groups to be associated with the delivery profile.
     */
    public Builder sellingPlanGroupsToAssociate(List<String> sellingPlanGroupsToAssociate) {
      this.sellingPlanGroupsToAssociate = sellingPlanGroupsToAssociate;
      return this;
    }

    /**
     * The list of selling plan groups to be dissociated with the delivery profile.
     */
    public Builder sellingPlanGroupsToDissociate(List<String> sellingPlanGroupsToDissociate) {
      this.sellingPlanGroupsToDissociate = sellingPlanGroupsToDissociate;
      return this;
    }
  }
}
