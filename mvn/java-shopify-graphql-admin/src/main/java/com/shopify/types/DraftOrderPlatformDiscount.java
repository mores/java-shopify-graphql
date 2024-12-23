package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The platform discounts applied to the draft order.
 */
public class DraftOrderPlatformDiscount {
  /**
   * Price reduction allocations across the draft order's lines.
   */
  private List<DraftOrderPlatformDiscountAllocation> allocations;

  /**
   * Whether the discount is an automatic discount.
   */
  private boolean automaticDiscount;

  /**
   * Whether the discount is a buy x get y discount.
   */
  private boolean bxgyDiscount;

  /**
   * If a code-based discount, the code used to add the discount.
   */
  private String code;

  /**
   * The discount class.
   */
  private DiscountClass discountClass;

  /**
   * The discount node for the platform discount.
   */
  private DiscountNode discountNode;

  /**
   * The ID of the discount.
   */
  private String id;

  /**
   * Whether the discount is line, order or shipping level.
   */
  private String presentationLevel;

  /**
   * The short summary of the discount.
   */
  private String shortSummary;

  /**
   * The summary of the discount.
   */
  private String summary;

  /**
   * The name of the discount.
   */
  private String title;

  /**
   * The discount total amount in shop currency.
   */
  private MoneyV2 totalAmount;

  /**
   * The amount of money discounted, with values shown in both shop currency and presentment currency.
   */
  private MoneyBag totalAmountPriceSet;

  public DraftOrderPlatformDiscount() {
  }

  /**
   * Price reduction allocations across the draft order's lines.
   */
  public List<DraftOrderPlatformDiscountAllocation> getAllocations() {
    return allocations;
  }

  public void setAllocations(List<DraftOrderPlatformDiscountAllocation> allocations) {
    this.allocations = allocations;
  }

  /**
   * Whether the discount is an automatic discount.
   */
  public boolean getAutomaticDiscount() {
    return automaticDiscount;
  }

  public void setAutomaticDiscount(boolean automaticDiscount) {
    this.automaticDiscount = automaticDiscount;
  }

  /**
   * Whether the discount is a buy x get y discount.
   */
  public boolean getBxgyDiscount() {
    return bxgyDiscount;
  }

  public void setBxgyDiscount(boolean bxgyDiscount) {
    this.bxgyDiscount = bxgyDiscount;
  }

  /**
   * If a code-based discount, the code used to add the discount.
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * The discount class.
   */
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  /**
   * The discount node for the platform discount.
   */
  public DiscountNode getDiscountNode() {
    return discountNode;
  }

  public void setDiscountNode(DiscountNode discountNode) {
    this.discountNode = discountNode;
  }

  /**
   * The ID of the discount.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the discount is line, order or shipping level.
   */
  public String getPresentationLevel() {
    return presentationLevel;
  }

  public void setPresentationLevel(String presentationLevel) {
    this.presentationLevel = presentationLevel;
  }

  /**
   * The short summary of the discount.
   */
  public String getShortSummary() {
    return shortSummary;
  }

  public void setShortSummary(String shortSummary) {
    this.shortSummary = shortSummary;
  }

  /**
   * The summary of the discount.
   */
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  /**
   * The name of the discount.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * The discount total amount in shop currency.
   */
  public MoneyV2 getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(MoneyV2 totalAmount) {
    this.totalAmount = totalAmount;
  }

  /**
   * The amount of money discounted, with values shown in both shop currency and presentment currency.
   */
  public MoneyBag getTotalAmountPriceSet() {
    return totalAmountPriceSet;
  }

  public void setTotalAmountPriceSet(MoneyBag totalAmountPriceSet) {
    this.totalAmountPriceSet = totalAmountPriceSet;
  }

  @Override
  public String toString() {
    return "DraftOrderPlatformDiscount{allocations='" + allocations + "', automaticDiscount='" + automaticDiscount + "', bxgyDiscount='" + bxgyDiscount + "', code='" + code + "', discountClass='" + discountClass + "', discountNode='" + discountNode + "', id='" + id + "', presentationLevel='" + presentationLevel + "', shortSummary='" + shortSummary + "', summary='" + summary + "', title='" + title + "', totalAmount='" + totalAmount + "', totalAmountPriceSet='" + totalAmountPriceSet + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DraftOrderPlatformDiscount that = (DraftOrderPlatformDiscount) o;
    return Objects.equals(allocations, that.allocations) &&
        automaticDiscount == that.automaticDiscount &&
        bxgyDiscount == that.bxgyDiscount &&
        Objects.equals(code, that.code) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(discountNode, that.discountNode) &&
        Objects.equals(id, that.id) &&
        Objects.equals(presentationLevel, that.presentationLevel) &&
        Objects.equals(shortSummary, that.shortSummary) &&
        Objects.equals(summary, that.summary) &&
        Objects.equals(title, that.title) &&
        Objects.equals(totalAmount, that.totalAmount) &&
        Objects.equals(totalAmountPriceSet, that.totalAmountPriceSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocations, automaticDiscount, bxgyDiscount, code, discountClass, discountNode, id, presentationLevel, shortSummary, summary, title, totalAmount, totalAmountPriceSet);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Price reduction allocations across the draft order's lines.
     */
    private List<DraftOrderPlatformDiscountAllocation> allocations;

    /**
     * Whether the discount is an automatic discount.
     */
    private boolean automaticDiscount;

    /**
     * Whether the discount is a buy x get y discount.
     */
    private boolean bxgyDiscount;

    /**
     * If a code-based discount, the code used to add the discount.
     */
    private String code;

    /**
     * The discount class.
     */
    private DiscountClass discountClass;

    /**
     * The discount node for the platform discount.
     */
    private DiscountNode discountNode;

    /**
     * The ID of the discount.
     */
    private String id;

    /**
     * Whether the discount is line, order or shipping level.
     */
    private String presentationLevel;

    /**
     * The short summary of the discount.
     */
    private String shortSummary;

    /**
     * The summary of the discount.
     */
    private String summary;

    /**
     * The name of the discount.
     */
    private String title;

    /**
     * The discount total amount in shop currency.
     */
    private MoneyV2 totalAmount;

    /**
     * The amount of money discounted, with values shown in both shop currency and presentment currency.
     */
    private MoneyBag totalAmountPriceSet;

    public DraftOrderPlatformDiscount build() {
      DraftOrderPlatformDiscount result = new DraftOrderPlatformDiscount();
      result.allocations = this.allocations;
      result.automaticDiscount = this.automaticDiscount;
      result.bxgyDiscount = this.bxgyDiscount;
      result.code = this.code;
      result.discountClass = this.discountClass;
      result.discountNode = this.discountNode;
      result.id = this.id;
      result.presentationLevel = this.presentationLevel;
      result.shortSummary = this.shortSummary;
      result.summary = this.summary;
      result.title = this.title;
      result.totalAmount = this.totalAmount;
      result.totalAmountPriceSet = this.totalAmountPriceSet;
      return result;
    }

    /**
     * Price reduction allocations across the draft order's lines.
     */
    public Builder allocations(List<DraftOrderPlatformDiscountAllocation> allocations) {
      this.allocations = allocations;
      return this;
    }

    /**
     * Whether the discount is an automatic discount.
     */
    public Builder automaticDiscount(boolean automaticDiscount) {
      this.automaticDiscount = automaticDiscount;
      return this;
    }

    /**
     * Whether the discount is a buy x get y discount.
     */
    public Builder bxgyDiscount(boolean bxgyDiscount) {
      this.bxgyDiscount = bxgyDiscount;
      return this;
    }

    /**
     * If a code-based discount, the code used to add the discount.
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }

    /**
     * The discount class.
     */
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    /**
     * The discount node for the platform discount.
     */
    public Builder discountNode(DiscountNode discountNode) {
      this.discountNode = discountNode;
      return this;
    }

    /**
     * The ID of the discount.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the discount is line, order or shipping level.
     */
    public Builder presentationLevel(String presentationLevel) {
      this.presentationLevel = presentationLevel;
      return this;
    }

    /**
     * The short summary of the discount.
     */
    public Builder shortSummary(String shortSummary) {
      this.shortSummary = shortSummary;
      return this;
    }

    /**
     * The summary of the discount.
     */
    public Builder summary(String summary) {
      this.summary = summary;
      return this;
    }

    /**
     * The name of the discount.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * The discount total amount in shop currency.
     */
    public Builder totalAmount(MoneyV2 totalAmount) {
      this.totalAmount = totalAmount;
      return this;
    }

    /**
     * The amount of money discounted, with values shown in both shop currency and presentment currency.
     */
    public Builder totalAmountPriceSet(MoneyBag totalAmountPriceSet) {
      this.totalAmountPriceSet = totalAmountPriceSet;
      return this;
    }
  }
}
