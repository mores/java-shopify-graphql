package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * The input fields required to create a marketing activity.
 */
public class MarketingActivityCreateInput {
  /**
   * The title of the marketing activity.
   */
  private String marketingActivityTitle;

  /**
   * The form data in JSON serialized as a string.
   */
  private String formData;

  /**
   * The ID of the marketing activity extension.
   */
  private String marketingActivityExtensionId;

  /**
   * Encoded context containing marketing campaign id.
   */
  private String context;

  /**
   * Specifies the
   * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
   * that are associated with a related marketing campaign. UTMInput is required for all Marketing
   * tactics except Storefront App.
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
   * The current state of the marketing activity.
   */
  private MarketingActivityStatus status;

  /**
   * The budget for this marketing activity.
   */
  private MarketingActivityBudgetInput budget;

  public MarketingActivityCreateInput() {
  }

  /**
   * The title of the marketing activity.
   */
  public String getMarketingActivityTitle() {
    return marketingActivityTitle;
  }

  public void setMarketingActivityTitle(String marketingActivityTitle) {
    this.marketingActivityTitle = marketingActivityTitle;
  }

  /**
   * The form data in JSON serialized as a string.
   */
  public String getFormData() {
    return formData;
  }

  public void setFormData(String formData) {
    this.formData = formData;
  }

  /**
   * The ID of the marketing activity extension.
   */
  public String getMarketingActivityExtensionId() {
    return marketingActivityExtensionId;
  }

  public void setMarketingActivityExtensionId(String marketingActivityExtensionId) {
    this.marketingActivityExtensionId = marketingActivityExtensionId;
  }

  /**
   * Encoded context containing marketing campaign id.
   */
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  /**
   * Specifies the
   * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
   * that are associated with a related marketing campaign. UTMInput is required for all Marketing
   * tactics except Storefront App.
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
   * The current state of the marketing activity.
   */
  public MarketingActivityStatus getStatus() {
    return status;
  }

  public void setStatus(MarketingActivityStatus status) {
    this.status = status;
  }

  /**
   * The budget for this marketing activity.
   */
  public MarketingActivityBudgetInput getBudget() {
    return budget;
  }

  public void setBudget(MarketingActivityBudgetInput budget) {
    this.budget = budget;
  }

  @Override
  public String toString() {
    return "MarketingActivityCreateInput{marketingActivityTitle='" + marketingActivityTitle + "', formData='" + formData + "', marketingActivityExtensionId='" + marketingActivityExtensionId + "', context='" + context + "', utm='" + utm + "', urlParameterValue='" + urlParameterValue + "', status='" + status + "', budget='" + budget + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MarketingActivityCreateInput that = (MarketingActivityCreateInput) o;
    return Objects.equals(marketingActivityTitle, that.marketingActivityTitle) &&
        Objects.equals(formData, that.formData) &&
        Objects.equals(marketingActivityExtensionId, that.marketingActivityExtensionId) &&
        Objects.equals(context, that.context) &&
        Objects.equals(utm, that.utm) &&
        Objects.equals(urlParameterValue, that.urlParameterValue) &&
        Objects.equals(status, that.status) &&
        Objects.equals(budget, that.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketingActivityTitle, formData, marketingActivityExtensionId, context, utm, urlParameterValue, status, budget);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The title of the marketing activity.
     */
    private String marketingActivityTitle;

    /**
     * The form data in JSON serialized as a string.
     */
    private String formData;

    /**
     * The ID of the marketing activity extension.
     */
    private String marketingActivityExtensionId;

    /**
     * Encoded context containing marketing campaign id.
     */
    private String context;

    /**
     * Specifies the
     * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
     * that are associated with a related marketing campaign. UTMInput is required for all Marketing
     * tactics except Storefront App.
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
     * The current state of the marketing activity.
     */
    private MarketingActivityStatus status;

    /**
     * The budget for this marketing activity.
     */
    private MarketingActivityBudgetInput budget;

    public MarketingActivityCreateInput build() {
      MarketingActivityCreateInput result = new MarketingActivityCreateInput();
      result.marketingActivityTitle = this.marketingActivityTitle;
      result.formData = this.formData;
      result.marketingActivityExtensionId = this.marketingActivityExtensionId;
      result.context = this.context;
      result.utm = this.utm;
      result.urlParameterValue = this.urlParameterValue;
      result.status = this.status;
      result.budget = this.budget;
      return result;
    }

    /**
     * The title of the marketing activity.
     */
    public Builder marketingActivityTitle(String marketingActivityTitle) {
      this.marketingActivityTitle = marketingActivityTitle;
      return this;
    }

    /**
     * The form data in JSON serialized as a string.
     */
    public Builder formData(String formData) {
      this.formData = formData;
      return this;
    }

    /**
     * The ID of the marketing activity extension.
     */
    public Builder marketingActivityExtensionId(String marketingActivityExtensionId) {
      this.marketingActivityExtensionId = marketingActivityExtensionId;
      return this;
    }

    /**
     * Encoded context containing marketing campaign id.
     */
    public Builder context(String context) {
      this.context = context;
      return this;
    }

    /**
     * Specifies the
     * [Urchin Traffic Module (UTM) parameters](https://en.wikipedia.org/wiki/UTM_parameters)
     * that are associated with a related marketing campaign. UTMInput is required for all Marketing
     * tactics except Storefront App.
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
     * The current state of the marketing activity.
     */
    public Builder status(MarketingActivityStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The budget for this marketing activity.
     */
    public Builder budget(MarketingActivityBudgetInput budget) {
      this.budget = budget;
      return this;
    }
  }
}
