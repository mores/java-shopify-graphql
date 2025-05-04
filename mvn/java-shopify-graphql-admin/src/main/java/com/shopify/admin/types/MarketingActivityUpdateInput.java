package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields required to update a marketing activity.
 */
public class MarketingActivityUpdateInput {
  /**
   * The ID of the marketing activity.
   */
  private String id;

  /**
   * The ID of the recommendation that the marketing activity was created from, if one exists.
   */
  private String marketingRecommendationId;

  /**
   * The title of the marketing activity.
   */
  private String title;

  /**
   * The budget for the marketing activity.
   */
  private MarketingActivityBudgetInput budget;

  /**
   * The current state of the marketing activity. Learn more about
   * [marketing activities statuses](/api/marketing-activities/statuses).
   */
  private MarketingActivityStatus status;

  /**
   * The target state that the marketing activity is transitioning to. Learn more
   * about [marketing activities statuses](/api/marketing-activities/statuses).
   */
  private MarketingActivityStatus targetStatus;

  /**
   * The form data of the marketing activity. This is only used if the marketing activity is
   *               integrated with the external editor.
   */
  private String formData;

  /**
   * Specifies the
   * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
   * that are associated with a related marketing campaign. UTMInput is required for all Marketing
   * tactics except Storefront App. The utm field can only be set once and never modified.
   */
  private UTMInput utm;

  /**
   * Value for a query parameter that gets inserted into storefront URLs for
   * matching storefront traffic to this activity. This feature is currently
   * available on a limited basis to some partners only. UTMs should continue to be
   * used for most partners. Both the URL parameter value and UTM parameters can be set.
   */
  private String urlParameterValue;

  /**
   * A list of the item IDs that were marketed in this marketing activity. Valid types for these items are:
   * * `Product`
   * * `Shop`
   */
  private List<String> marketedResources;

  /**
   * The error messages that were generated when the app was trying to complete the activity.
   * Learn more about the
   * [JSON format expected for error messages](/api/marketing-activities/statuses#failed-status).
   */
  private String errors;

  public MarketingActivityUpdateInput() {
  }

  /**
   * The ID of the marketing activity.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The ID of the recommendation that the marketing activity was created from, if one exists.
   */
  public String getMarketingRecommendationId() {
    return marketingRecommendationId;
  }

  public void setMarketingRecommendationId(String marketingRecommendationId) {
    this.marketingRecommendationId = marketingRecommendationId;
  }

  /**
   * The title of the marketing activity.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The budget for the marketing activity.
   */
  public MarketingActivityBudgetInput getBudget() {
    return budget;
  }

  public void setBudget(MarketingActivityBudgetInput budget) {
    this.budget = budget;
  }

  /**
   * The current state of the marketing activity. Learn more about
   * [marketing activities statuses](/api/marketing-activities/statuses).
   */
  public MarketingActivityStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityStatus status) {
    this.status = status;
  }

  /**
   * The target state that the marketing activity is transitioning to. Learn more
   * about [marketing activities statuses](/api/marketing-activities/statuses).
   */
  public MarketingActivityStatus getTargetStatus() {
    return targetStatus;
  }

  public void setTargetStatus(MarketingActivityStatus targetStatus) {
    this.targetStatus = targetStatus;
  }

  /**
   * The form data of the marketing activity. This is only used if the marketing activity is
   *               integrated with the external editor.
   */
  public String getFormData() {
    return formData;
  }

  public void setFormData(String formData) {
    this.formData = formData;
  }

  /**
   * Specifies the
   * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
   * that are associated with a related marketing campaign. UTMInput is required for all Marketing
   * tactics except Storefront App. The utm field can only be set once and never modified.
   */
  public UTMInput getUtm() {
    return utm;
  }

  public void setUtm(UTMInput utm) {
    this.utm = utm;
  }

  /**
   * Value for a query parameter that gets inserted into storefront URLs for
   * matching storefront traffic to this activity. This feature is currently
   * available on a limited basis to some partners only. UTMs should continue to be
   * used for most partners. Both the URL parameter value and UTM parameters can be set.
   */
  public String getUrlParameterValue() {
    return urlParameterValue;
  }

  public void setUrlParameterValue(String urlParameterValue) {
    this.urlParameterValue = urlParameterValue;
  }

  /**
   * A list of the item IDs that were marketed in this marketing activity. Valid types for these items are:
   * * `Product`
   * * `Shop`
   */
  public List<String> getMarketedResources() {
    return marketedResources;
  }

  public void setMarketedResources(List<String> marketedResources) {
    this.marketedResources = marketedResources;
  }

  /**
   * The error messages that were generated when the app was trying to complete the activity.
   * Learn more about the
   * [JSON format expected for error messages](/api/marketing-activities/statuses#failed-status).
   */
  public String getErrors() {
    return errors;
  }

  public void setErrors(String errors) {
    this.errors = errors;
  }

  @Override
  public String toString() {
    return "MarketingActivityUpdateInput{id='" + id + "', marketingRecommendationId='" + marketingRecommendationId + "', title='" + title + "', budget='" + budget + "', status='" + status + "', targetStatus='" + targetStatus + "', formData='" + formData + "', utm='" + utm + "', urlParameterValue='" + urlParameterValue + "', marketedResources='" + marketedResources + "', errors='" + errors + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityUpdateInput that = (MarketingActivityUpdateInput) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(marketingRecommendationId, that.marketingRecommendationId) &&
        Objects.equals(title, that.title) &&
        Objects.equals(budget, that.budget) &&
        Objects.equals(status, that.status) &&
        Objects.equals(targetStatus, that.targetStatus) &&
        Objects.equals(formData, that.formData) &&
        Objects.equals(utm, that.utm) &&
        Objects.equals(urlParameterValue, that.urlParameterValue) &&
        Objects.equals(marketedResources, that.marketedResources) &&
        Objects.equals(errors, that.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, marketingRecommendationId, title, budget, status, targetStatus, formData, utm, urlParameterValue, marketedResources, errors);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ID of the marketing activity.
     */
    private String id;

    /**
     * The ID of the recommendation that the marketing activity was created from, if one exists.
     */
    private String marketingRecommendationId;

    /**
     * The title of the marketing activity.
     */
    private String title;

    /**
     * The budget for the marketing activity.
     */
    private MarketingActivityBudgetInput budget;

    /**
     * The current state of the marketing activity. Learn more about
     * [marketing activities statuses](/api/marketing-activities/statuses).
     */
    private MarketingActivityStatus status;

    /**
     * The target state that the marketing activity is transitioning to. Learn more
     * about [marketing activities statuses](/api/marketing-activities/statuses).
     */
    private MarketingActivityStatus targetStatus;

    /**
     * The form data of the marketing activity. This is only used if the marketing activity is
     *               integrated with the external editor.
     */
    private String formData;

    /**
     * Specifies the
     * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
     * that are associated with a related marketing campaign. UTMInput is required for all Marketing
     * tactics except Storefront App. The utm field can only be set once and never modified.
     */
    private UTMInput utm;

    /**
     * Value for a query parameter that gets inserted into storefront URLs for
     * matching storefront traffic to this activity. This feature is currently
     * available on a limited basis to some partners only. UTMs should continue to be
     * used for most partners. Both the URL parameter value and UTM parameters can be set.
     */
    private String urlParameterValue;

    /**
     * A list of the item IDs that were marketed in this marketing activity. Valid types for these items are:
     * * `Product`
     * * `Shop`
     */
    private List<String> marketedResources;

    /**
     * The error messages that were generated when the app was trying to complete the activity.
     * Learn more about the
     * [JSON format expected for error messages](/api/marketing-activities/statuses#failed-status).
     */
    private String errors;

    public MarketingActivityUpdateInput build() {
      MarketingActivityUpdateInput result = new MarketingActivityUpdateInput();
      result.id = this.id;
      result.marketingRecommendationId = this.marketingRecommendationId;
      result.title = this.title;
      result.budget = this.budget;
      result.status = this.status;
      result.targetStatus = this.targetStatus;
      result.formData = this.formData;
      result.utm = this.utm;
      result.urlParameterValue = this.urlParameterValue;
      result.marketedResources = this.marketedResources;
      result.errors = this.errors;
      return result;
    }

    /**
     * The ID of the marketing activity.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The ID of the recommendation that the marketing activity was created from, if one exists.
     */
    public Builder marketingRecommendationId(String marketingRecommendationId) {
      this.marketingRecommendationId = marketingRecommendationId;
      return this;
    }

    /**
     * The title of the marketing activity.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The budget for the marketing activity.
     */
    public Builder budget(MarketingActivityBudgetInput budget) {
      this.budget = budget;
      return this;
    }

    /**
     * The current state of the marketing activity. Learn more about
     * [marketing activities statuses](/api/marketing-activities/statuses).
     */
    public Builder status(MarketingActivityStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The target state that the marketing activity is transitioning to. Learn more
     * about [marketing activities statuses](/api/marketing-activities/statuses).
     */
    public Builder targetStatus(MarketingActivityStatus targetStatus) {
      this.targetStatus = targetStatus;
      return this;
    }

    /**
     * The form data of the marketing activity. This is only used if the marketing activity is
     *               integrated with the external editor.
     */
    public Builder formData(String formData) {
      this.formData = formData;
      return this;
    }

    /**
     * Specifies the
     * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
     * that are associated with a related marketing campaign. UTMInput is required for all Marketing
     * tactics except Storefront App. The utm field can only be set once and never modified.
     */
    public Builder utm(UTMInput utm) {
      this.utm = utm;
      return this;
    }

    /**
     * Value for a query parameter that gets inserted into storefront URLs for
     * matching storefront traffic to this activity. This feature is currently
     * available on a limited basis to some partners only. UTMs should continue to be
     * used for most partners. Both the URL parameter value and UTM parameters can be set.
     */
    public Builder urlParameterValue(String urlParameterValue) {
      this.urlParameterValue = urlParameterValue;
      return this;
    }

    /**
     * A list of the item IDs that were marketed in this marketing activity. Valid types for these items are:
     * * `Product`
     * * `Shop`
     */
    public Builder marketedResources(List<String> marketedResources) {
      this.marketedResources = marketedResources;
      return this;
    }

    /**
     * The error messages that were generated when the app was trying to complete the activity.
     * Learn more about the
     * [JSON format expected for error messages](/api/marketing-activities/statuses#failed-status).
     */
    public Builder errors(String errors) {
      this.errors = errors;
      return this;
    }
  }
}
