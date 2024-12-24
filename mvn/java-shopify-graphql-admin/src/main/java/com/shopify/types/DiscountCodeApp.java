package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class DiscountCodeApp implements Discount, DiscountCode {
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

  
  private boolean appliesOncePerCustomer;

  
  private int asyncUsageCount;

  
  private DiscountRedeemCodeConnection codes;

  
  private Count codesCount;

  
  private DiscountCombinesWith combinesWith;

  
  private OffsetDateTime createdAt;

  
  private DiscountCustomerSelection customerSelection;

  
  private DiscountClass discountClass;

  
  private String discountId;

  
  private OffsetDateTime endsAt;

  
  private FunctionsErrorHistory errorHistory;

  
  private boolean hasTimelineComment;

  
  private Integer recurringCycleLimit;

  
  private List<DiscountShareableUrl> shareableUrls;

  
  private OffsetDateTime startsAt;

  
  private DiscountStatus status;

  
  private String title;

  
  private MoneyV2 totalSales;

  
  private OffsetDateTime updatedAt;

  
  private Integer usageLimit;

  public DiscountCodeApp() {
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

  
  public boolean getAppliesOncePerCustomer() {
    return appliesOncePerCustomer;
  }

  public void setAppliesOncePerCustomer(boolean appliesOncePerCustomer) {
    this.appliesOncePerCustomer = appliesOncePerCustomer;
  }

  
  public int getAsyncUsageCount() {
    return asyncUsageCount;
  }

  public void setAsyncUsageCount(int asyncUsageCount) {
    this.asyncUsageCount = asyncUsageCount;
  }

  
  public DiscountRedeemCodeConnection getCodes() {
    return codes;
  }

  public void setCodes(DiscountRedeemCodeConnection codes) {
    this.codes = codes;
  }

  
  public Count getCodesCount() {
    return codesCount;
  }

  public void setCodesCount(Count codesCount) {
    this.codesCount = codesCount;
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

  
  public DiscountCustomerSelection getCustomerSelection() {
    return customerSelection;
  }

  public void setCustomerSelection(DiscountCustomerSelection customerSelection) {
    this.customerSelection = customerSelection;
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

  
  public boolean getHasTimelineComment() {
    return hasTimelineComment;
  }

  public void setHasTimelineComment(boolean hasTimelineComment) {
    this.hasTimelineComment = hasTimelineComment;
  }

  
  public Integer getRecurringCycleLimit() {
    return recurringCycleLimit;
  }

  public void setRecurringCycleLimit(Integer recurringCycleLimit) {
    this.recurringCycleLimit = recurringCycleLimit;
  }

  
  public List<DiscountShareableUrl> getShareableUrls() {
    return shareableUrls;
  }

  public void setShareableUrls(List<DiscountShareableUrl> shareableUrls) {
    this.shareableUrls = shareableUrls;
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

  
  public MoneyV2 getTotalSales() {
    return totalSales;
  }

  public void setTotalSales(MoneyV2 totalSales) {
    this.totalSales = totalSales;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  
  public Integer getUsageLimit() {
    return usageLimit;
  }

  public void setUsageLimit(Integer usageLimit) {
    this.usageLimit = usageLimit;
  }

  @Override
  public String toString() {
    return "DiscountCodeApp{appDiscountType='" + appDiscountType + "', appliesOncePerCustomer='" + appliesOncePerCustomer + "', asyncUsageCount='" + asyncUsageCount + "', codes='" + codes + "', codesCount='" + codesCount + "', combinesWith='" + combinesWith + "', createdAt='" + createdAt + "', customerSelection='" + customerSelection + "', discountClass='" + discountClass + "', discountId='" + discountId + "', endsAt='" + endsAt + "', errorHistory='" + errorHistory + "', hasTimelineComment='" + hasTimelineComment + "', recurringCycleLimit='" + recurringCycleLimit + "', shareableUrls='" + shareableUrls + "', startsAt='" + startsAt + "', status='" + status + "', title='" + title + "', totalSales='" + totalSales + "', updatedAt='" + updatedAt + "', usageLimit='" + usageLimit + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DiscountCodeApp that = (DiscountCodeApp) o;
    return Objects.equals(appDiscountType, that.appDiscountType) &&
        appliesOncePerCustomer == that.appliesOncePerCustomer &&
        asyncUsageCount == that.asyncUsageCount &&
        Objects.equals(codes, that.codes) &&
        Objects.equals(codesCount, that.codesCount) &&
        Objects.equals(combinesWith, that.combinesWith) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(customerSelection, that.customerSelection) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(discountId, that.discountId) &&
        Objects.equals(endsAt, that.endsAt) &&
        Objects.equals(errorHistory, that.errorHistory) &&
        hasTimelineComment == that.hasTimelineComment &&
        Objects.equals(recurringCycleLimit, that.recurringCycleLimit) &&
        Objects.equals(shareableUrls, that.shareableUrls) &&
        Objects.equals(startsAt, that.startsAt) &&
        Objects.equals(status, that.status) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalSales, that.totalSales) &&
        Objects.equals(updatedAt, that.updatedAt) &&
        Objects.equals(usageLimit, that.usageLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDiscountType, appliesOncePerCustomer, asyncUsageCount, codes, codesCount, combinesWith, createdAt, customerSelection, discountClass, discountId, endsAt, errorHistory, hasTimelineComment, recurringCycleLimit, shareableUrls, startsAt, status, title, totalSales, updatedAt, usageLimit);
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

    
    private boolean appliesOncePerCustomer;

    
    private int asyncUsageCount;

    
    private DiscountRedeemCodeConnection codes;

    
    private Count codesCount;

    
    private DiscountCombinesWith combinesWith;

    
    private OffsetDateTime createdAt;

    
    private DiscountCustomerSelection customerSelection;

    
    private DiscountClass discountClass;

    
    private String discountId;

    
    private OffsetDateTime endsAt;

    
    private FunctionsErrorHistory errorHistory;

    
    private boolean hasTimelineComment;

    
    private Integer recurringCycleLimit;

    
    private List<DiscountShareableUrl> shareableUrls;

    
    private OffsetDateTime startsAt;

    
    private DiscountStatus status;

    
    private String title;

    
    private MoneyV2 totalSales;

    
    private OffsetDateTime updatedAt;

    
    private Integer usageLimit;

    public DiscountCodeApp build() {
      DiscountCodeApp result = new DiscountCodeApp();
      result.appDiscountType = this.appDiscountType;
      result.appliesOncePerCustomer = this.appliesOncePerCustomer;
      result.asyncUsageCount = this.asyncUsageCount;
      result.codes = this.codes;
      result.codesCount = this.codesCount;
      result.combinesWith = this.combinesWith;
      result.createdAt = this.createdAt;
      result.customerSelection = this.customerSelection;
      result.discountClass = this.discountClass;
      result.discountId = this.discountId;
      result.endsAt = this.endsAt;
      result.errorHistory = this.errorHistory;
      result.hasTimelineComment = this.hasTimelineComment;
      result.recurringCycleLimit = this.recurringCycleLimit;
      result.shareableUrls = this.shareableUrls;
      result.startsAt = this.startsAt;
      result.status = this.status;
      result.title = this.title;
      result.totalSales = this.totalSales;
      result.updatedAt = this.updatedAt;
      result.usageLimit = this.usageLimit;
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

    
    public Builder appliesOncePerCustomer(boolean appliesOncePerCustomer) {
      this.appliesOncePerCustomer = appliesOncePerCustomer;
      return this;
    }

    
    public Builder asyncUsageCount(int asyncUsageCount) {
      this.asyncUsageCount = asyncUsageCount;
      return this;
    }

    
    public Builder codes(DiscountRedeemCodeConnection codes) {
      this.codes = codes;
      return this;
    }

    
    public Builder codesCount(Count codesCount) {
      this.codesCount = codesCount;
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

    
    public Builder customerSelection(DiscountCustomerSelection customerSelection) {
      this.customerSelection = customerSelection;
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

    
    public Builder hasTimelineComment(boolean hasTimelineComment) {
      this.hasTimelineComment = hasTimelineComment;
      return this;
    }

    
    public Builder recurringCycleLimit(Integer recurringCycleLimit) {
      this.recurringCycleLimit = recurringCycleLimit;
      return this;
    }

    
    public Builder shareableUrls(List<DiscountShareableUrl> shareableUrls) {
      this.shareableUrls = shareableUrls;
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

    
    public Builder totalSales(MoneyV2 totalSales) {
      this.totalSales = totalSales;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    
    public Builder usageLimit(Integer usageLimit) {
      this.usageLimit = usageLimit;
      return this;
    }
  }
}
