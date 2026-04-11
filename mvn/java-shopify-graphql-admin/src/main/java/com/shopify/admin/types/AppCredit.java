package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents monetary credits that merchants can apply toward future app
 * purchases, subscriptions, or usage-based billing within their Shopify store. App
 * credits provide a flexible way to offer refunds, promotional credits, or
 * compensation without processing external payments.
 *
 * For example, if a merchant experiences service downtime, an app might issue
 * credits equivalent to the affected billing period. These credits can apply to
 * future charges, reducing the merchant's next invoice or extending their
 * subscription period.
 *
 * Use the `AppCredit` object to:
 * - Issue refunds for service interruptions or billing disputes
 * - Provide promotional credits for new merchant onboarding
 * - Compensate merchants for app-related issues or downtime
 * - Create loyalty rewards or referral bonuses within your billing system
 * - Track credit balances and application history for accounting purposes
 *
 * For comprehensive billing strategies and credit management patterns, see the
 * [subscription billing
 * guide](https://shopify.dev/docs/apps/launch/billing/subscription-billing).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppCredit implements com.shopify.admin.types.Node {
  /**
   * The amount that can be used towards future app purchases in Shopify.
   */
  private MoneyV2 amount;

  /**
   * The date and time when the app credit was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The description of the app credit.
   */
  private String description;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * Whether the app credit is a test transaction.
   */
  private boolean test;

  public AppCredit() {
  }

  /**
   * The amount that can be used towards future app purchases in Shopify.
   */
  public MoneyV2 getAmount() {
    return amount;
  }

  public void setAmount(MoneyV2 amount) {
    this.amount = amount;
  }

  /**
   * The date and time when the app credit was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The description of the app credit.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * A globally-unique ID.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Whether the app credit is a test transaction.
   */
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  @Override
  public String toString() {
    return "AppCredit{amount='" + amount + "', createdAt='" + createdAt + "', description='" + description + "', id='" + id + "', test='" + test + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppCredit that = (AppCredit) o;
    return Objects.equals(amount, that.amount) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        test == that.test;
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, createdAt, description, id, test);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The amount that can be used towards future app purchases in Shopify.
     */
    private MoneyV2 amount;

    /**
     * The date and time when the app credit was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The description of the app credit.
     */
    private String description;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * Whether the app credit is a test transaction.
     */
    private boolean test;

    public AppCredit build() {
      AppCredit result = new AppCredit();
      result.amount = this.amount;
      result.createdAt = this.createdAt;
      result.description = this.description;
      result.id = this.id;
      result.test = this.test;
      return result;
    }

    /**
     * The amount that can be used towards future app purchases in Shopify.
     */
    public Builder amount(MoneyV2 amount) {
      this.amount = amount;
      return this;
    }

    /**
     * The date and time when the app credit was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The description of the app credit.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * A globally-unique ID.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Whether the app credit is a test transaction.
     */
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }
  }
}
