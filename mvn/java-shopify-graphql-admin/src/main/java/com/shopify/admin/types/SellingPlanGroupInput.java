package com.shopify.admin.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to create or update a selling plan group.
 */
public class SellingPlanGroupInput {
  /**
   * Buyer facing label of the selling plan group.
   */
  private String name;

  /**
   * ID for app, exposed in Liquid and product JSON.
   */
  private String appId;

  /**
   * Merchant facing label of the selling plan group.
   */
  private String merchantCode;

  /**
   * Merchant facing description of the selling plan group.
   */
  private String description;

  /**
   * List of selling plans to create.
   */
  private List<SellingPlanInput> sellingPlansToCreate;

  /**
   * List of selling plans to update.
   */
  private List<SellingPlanInput> sellingPlansToUpdate;

  /**
   * List of selling plans ids to delete.
   */
  private List<String> sellingPlansToDelete;

  /**
   * The values of all options available on the selling plan group. Selling plans
   * are grouped together in Liquid when they're created by the same app, and have
   * the same `selling_plan_group.name` and `selling_plan_group.options` values.
   */
  private List<String> options;

  /**
   * Relative value for display purposes of the selling plan group. A lower position will be displayed before a higher one.
   */
  private Integer position;

  public SellingPlanGroupInput() {
  }

  /**
   * Buyer facing label of the selling plan group.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * ID for app, exposed in Liquid and product JSON.
   */
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * Merchant facing label of the selling plan group.
   */
  public String getMerchantCode() {
    return merchantCode;
  }

  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }

  /**
   * Merchant facing description of the selling plan group.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * List of selling plans to create.
   */
  public List<SellingPlanInput> getSellingPlansToCreate() {
    return sellingPlansToCreate;
  }

  public void setSellingPlansToCreate(List<SellingPlanInput> sellingPlansToCreate) {
    this.sellingPlansToCreate = sellingPlansToCreate;
  }

  /**
   * List of selling plans to update.
   */
  public List<SellingPlanInput> getSellingPlansToUpdate() {
    return sellingPlansToUpdate;
  }

  public void setSellingPlansToUpdate(List<SellingPlanInput> sellingPlansToUpdate) {
    this.sellingPlansToUpdate = sellingPlansToUpdate;
  }

  /**
   * List of selling plans ids to delete.
   */
  public List<String> getSellingPlansToDelete() {
    return sellingPlansToDelete;
  }

  public void setSellingPlansToDelete(List<String> sellingPlansToDelete) {
    this.sellingPlansToDelete = sellingPlansToDelete;
  }

  /**
   * The values of all options available on the selling plan group. Selling plans
   * are grouped together in Liquid when they're created by the same app, and have
   * the same `selling_plan_group.name` and `selling_plan_group.options` values.
   */
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  /**
   * Relative value for display purposes of the selling plan group. A lower position will be displayed before a higher one.
   */
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "SellingPlanGroupInput{name='" + name + "', appId='" + appId + "', merchantCode='" + merchantCode + "', description='" + description + "', sellingPlansToCreate='" + sellingPlansToCreate + "', sellingPlansToUpdate='" + sellingPlansToUpdate + "', sellingPlansToDelete='" + sellingPlansToDelete + "', options='" + options + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupInput that = (SellingPlanGroupInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(appId, that.appId) &&
        Objects.equals(merchantCode, that.merchantCode) &&
        Objects.equals(description, that.description) &&
        Objects.equals(sellingPlansToCreate, that.sellingPlansToCreate) &&
        Objects.equals(sellingPlansToUpdate, that.sellingPlansToUpdate) &&
        Objects.equals(sellingPlansToDelete, that.sellingPlansToDelete) &&
        Objects.equals(options, that.options) &&
        Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, appId, merchantCode, description, sellingPlansToCreate, sellingPlansToUpdate, sellingPlansToDelete, options, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Buyer facing label of the selling plan group.
     */
    private String name;

    /**
     * ID for app, exposed in Liquid and product JSON.
     */
    private String appId;

    /**
     * Merchant facing label of the selling plan group.
     */
    private String merchantCode;

    /**
     * Merchant facing description of the selling plan group.
     */
    private String description;

    /**
     * List of selling plans to create.
     */
    private List<SellingPlanInput> sellingPlansToCreate;

    /**
     * List of selling plans to update.
     */
    private List<SellingPlanInput> sellingPlansToUpdate;

    /**
     * List of selling plans ids to delete.
     */
    private List<String> sellingPlansToDelete;

    /**
     * The values of all options available on the selling plan group. Selling plans
     * are grouped together in Liquid when they're created by the same app, and have
     * the same `selling_plan_group.name` and `selling_plan_group.options` values.
     */
    private List<String> options;

    /**
     * Relative value for display purposes of the selling plan group. A lower position will be displayed before a higher one.
     */
    private Integer position;

    public SellingPlanGroupInput build() {
      SellingPlanGroupInput result = new SellingPlanGroupInput();
      result.name = this.name;
      result.appId = this.appId;
      result.merchantCode = this.merchantCode;
      result.description = this.description;
      result.sellingPlansToCreate = this.sellingPlansToCreate;
      result.sellingPlansToUpdate = this.sellingPlansToUpdate;
      result.sellingPlansToDelete = this.sellingPlansToDelete;
      result.options = this.options;
      result.position = this.position;
      return result;
    }

    /**
     * Buyer facing label of the selling plan group.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * ID for app, exposed in Liquid and product JSON.
     */
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    /**
     * Merchant facing label of the selling plan group.
     */
    public Builder merchantCode(String merchantCode) {
      this.merchantCode = merchantCode;
      return this;
    }

    /**
     * Merchant facing description of the selling plan group.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * List of selling plans to create.
     */
    public Builder sellingPlansToCreate(List<SellingPlanInput> sellingPlansToCreate) {
      this.sellingPlansToCreate = sellingPlansToCreate;
      return this;
    }

    /**
     * List of selling plans to update.
     */
    public Builder sellingPlansToUpdate(List<SellingPlanInput> sellingPlansToUpdate) {
      this.sellingPlansToUpdate = sellingPlansToUpdate;
      return this;
    }

    /**
     * List of selling plans ids to delete.
     */
    public Builder sellingPlansToDelete(List<String> sellingPlansToDelete) {
      this.sellingPlansToDelete = sellingPlansToDelete;
      return this;
    }

    /**
     * The values of all options available on the selling plan group. Selling plans
     * are grouped together in Liquid when they're created by the same app, and have
     * the same `selling_plan_group.name` and `selling_plan_group.options` values.
     */
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    /**
     * Relative value for display purposes of the selling plan group. A lower position will be displayed before a higher one.
     */
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }
  }
}
