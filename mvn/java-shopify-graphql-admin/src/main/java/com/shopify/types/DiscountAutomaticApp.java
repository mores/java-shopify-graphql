package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountAutomaticApp implements Discount, DiscountAutomatic {
  /**
   * The details about the app extension that's providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   * This information includes the app extension's name and
   * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
   * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
   * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
   * and other metadata about the discount type, including the discount type's name and description.
   */
  private AppDiscountType appDiscountType;

  
  private boolean appliesOnSubscription;

  
  private int asyncUsageCount;

  
  private DiscountCombinesWith combinesWith;

  
  private OffsetDateTime createdAt;

  
  private DiscountClass discountClass;

  
  private String discountId;

  
  private OffsetDateTime endsAt;

  
  private FunctionsErrorHistory errorHistory;

  
  private int recurringCycleLimit;

  
  private OffsetDateTime startsAt;

  
  private DiscountStatus status;

  
  private String title;

  
  private OffsetDateTime updatedAt;

  public DiscountAutomaticApp() {
  }

  /**
   * The details about the app extension that's providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   * This information includes the app extension's name and
   * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
   * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
   * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
   * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
   * and other metadata about the discount type, including the discount type's name and description.
   */
  public AppDiscountType getAppDiscountType() {
    return appDiscountType;
  }

  public void setAppDiscountType(AppDiscountType appDiscountType) {
    this.appDiscountType = appDiscountType;
  }

  
  public boolean getAppliesOnSubscription() {
    return appliesOnSubscription;
  }

  public void setAppliesOnSubscription(boolean appliesOnSubscription) {
    this.appliesOnSubscription = appliesOnSubscription;
  }

  
  public int getAsyncUsageCount() {
    return asyncUsageCount;
  }

  public void setAsyncUsageCount(int asyncUsageCount) {
    this.asyncUsageCount = asyncUsageCount;
  }

  
  public DiscountCombinesWith getCombinesWith() {
    return combinesWith;
  }

  public void setCombinesWith(DiscountCombinesWith combinesWith) {
    this.combinesWith = combinesWith;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  
  public String getDiscountId() {
    return discountId;
  }

  public void setDiscountId(String discountId) {
    this.discountId = discountId;
  }

  
  public OffsetDateTime getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(OffsetDateTime endsAt) {
    this.endsAt = endsAt;
  }

  
  public FunctionsErrorHistory getErrorHistory() {
    return errorHistory;
  }

  public void setErrorHistory(FunctionsErrorHistory errorHistory) {
    this.errorHistory = errorHistory;
  }

  
  public int getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(int recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }

  
  public DiscountStatus getStatus() {
    return status;
  }

  public void setStatus(DiscountStatus status) {
    this.status = status;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "DiscountAutomaticApp{appDiscountType='" + appDiscountType + "', appliesOnSubscription='" + appliesOnSubscription + "', asyncUsageCount='" + asyncUsageCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', discountClass='" + discountClass + "', discountId='" + discountId + "', endsAt='" + endsAt + "', errorHistory='" + errorHistory + "', recurringCycleLimit='" + recurringCycleLimit + "', startsAt='" + startsAt + "', status='" + status + "', title='" + title + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountAutomaticApp that = (DiscountAutomaticApp) o;
    return Objects.equals(appDiscountType, that.appDiscountType) &&
        appliesOnSubscription == that.appliesOnSubscription &&
        asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(discountId, that.discountId) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(errorHistory, that.errorHistory) &&
        recurringCycleLimit == that.recurringCycleLimit &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(title, that.title) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDiscountType, appliesOnSubscription, asyncUsageCount, combinesWith, createdAt, discountClass, discountId, endsAt, errorHistory, recurringCycleLimit, startsAt, status, title, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The details about the app extension that's providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     * This information includes the app extension's name and
     * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
     * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
     * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
     * and other metadata about the discount type, including the discount type's name and description.
     */
    private AppDiscountType appDiscountType;

    
    private boolean appliesOnSubscription;

    
    private int asyncUsageCount;

    
    private DiscountCombinesWith combinesWith;

    
    private OffsetDateTime createdAt;

    
    private DiscountClass discountClass;

    
    private String discountId;

    
    private OffsetDateTime endsAt;

    
    private FunctionsErrorHistory errorHistory;

    
    private int recurringCycleLimit;

    
    private OffsetDateTime startsAt;

    
    private DiscountStatus status;

    
    private String title;

    
    private OffsetDateTime updatedAt;

    public DiscountAutomaticApp build() {
      DiscountAutomaticApp result = new DiscountAutomaticApp();
      result.appDiscountType = this.appDiscountType;
      result.appliesOnSubscription = this.appliesOnSubscription;
      result.asyncUsageCount = this.asyncUsageCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.discountClass = this.discountClass;
      result.discountId = this.discountId;
      result.endsAt = this.endsAt;
      result.errorHistory = this.errorHistory;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.title = this.title;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The details about the app extension that's providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     * This information includes the app extension's name and
     * [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets),
     * [App Bridge configuration](https://shopify.dev/docs/api/app-bridge),
     * [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations),
     * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries),
     * and other metadata about the discount type, including the discount type's name and description.
     */
    public Builder appDiscountType(AppDiscountType appDiscountType) {
      this.appDiscountType = appDiscountType;
      return this;
    }

    
    public Builder appliesOnSubscription(boolean appliesOnSubscription) {
      this.appliesOnSubscription = appliesOnSubscription;
      return this;
    }

    
    public Builder asyncUsageCount(int asyncUsageCount) {
      this.asyncUsageCount = asyncUsageCount;
      return this;
    }

    
    public Builder combinesWith(DiscountCombinesWith combinesWith) {
      this.combinesWith = combinesWith;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      return this;
    }

    
    public Builder endsAt(OffsetDateTime endsAt) {
      this.endsAt = endsAt;
      return this;
    }

    
    public Builder errorHistory(FunctionsErrorHistory errorHistory) {
      this.errorHistory = errorHistory;
      return this;
    }

    
    public Builder recurringCycleLimit(int recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    
    public Builder startsAt(OffsetDateTime startsAt) {
      this.startsAt = startsAt;
      return this;
    }

    
    public Builder status(DiscountStatus status) {
      this.status = status;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
