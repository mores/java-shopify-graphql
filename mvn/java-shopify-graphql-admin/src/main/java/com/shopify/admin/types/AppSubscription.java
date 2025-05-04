package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Provides users access to services and/or features for a duration of time.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppSubscription implements com.shopify.admin.types.Node {
  /**
   * The date and time when the app subscription was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The date and time when the current app subscription period ends. Returns `null` if the subscription isn't active.
   */
  private OffsetDateTime currentPeriodEnd;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The plans attached to the app subscription.
   */
  private List<AppSubscriptionLineItem> lineItems;

  /**
   * The name of the app subscription.
   */
  private String name;

  /**
   * The URL that the merchant is redirected to after approving the app subscription.
   */
  private String returnUrl;

  /**
   * The status of the app subscription.
   */
  private AppSubscriptionStatus status;

  /**
   * Specifies whether the app subscription is a test transaction.
   */
  private boolean test;

  /**
   * The number of free trial days, starting at the subscription's creation date, by which billing is delayed.
   */
  private int trialDays;

  public AppSubscription() {
  }

  /**
   * The date and time when the app subscription was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The date and time when the current app subscription period ends. Returns `null` if the subscription isn't active.
   */
  public OffsetDateTime getCurrentPeriodEnd() {
    return currentPeriodEnd;
  }

  public void setCurrentPeriodEnd(OffsetDateTime currentPeriodEnd) {
    this.currentPeriodEnd = currentPeriodEnd;
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
   * The plans attached to the app subscription.
   */
  public List<AppSubscriptionLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<AppSubscriptionLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  /**
   * The name of the app subscription.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The URL that the merchant is redirected to after approving the app subscription.
   */
  public String getReturnUrl() {
    return returnUrl;
  }

  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
  }

  /**
   * The status of the app subscription.
   */
  public AppSubscriptionStatus getStatus() {
    return status;
  }

  public void setStatus(AppSubscriptionStatus status) {
    this.status = status;
  }

  /**
   * Specifies whether the app subscription is a test transaction.
   */
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  /**
   * The number of free trial days, starting at the subscription's creation date, by which billing is delayed.
   */
  public int getTrialDays() {
    return trialDays;
  }

  public void setTrialDays(int trialDays) {
    this.trialDays = trialDays;
  }

  @Override
  public String toString() {
    return "AppSubscription{createdAt='" + createdAt + "', currentPeriodEnd='" + currentPeriodEnd + "', id='" + id + "', lineItems='" + lineItems + "', name='" + name + "', returnUrl='" + returnUrl + "', status='" + status + "', test='" + test + "', trialDays='" + trialDays + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppSubscription that = (AppSubscription) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(currentPeriodEnd, that.currentPeriodEnd) &&
        Objects.equals(id, that.id) &&
        Objects.equals(lineItems, that.lineItems) &&
        Objects.equals(name, that.name) &&
        Objects.equals(returnUrl, that.returnUrl) &&
        Objects.equals(status, that.status) &&
        test == that.test &&
        trialDays == that.trialDays;
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, currentPeriodEnd, id, lineItems, name, returnUrl, status, test, trialDays);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the app subscription was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The date and time when the current app subscription period ends. Returns `null` if the subscription isn't active.
     */
    private OffsetDateTime currentPeriodEnd;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The plans attached to the app subscription.
     */
    private List<AppSubscriptionLineItem> lineItems;

    /**
     * The name of the app subscription.
     */
    private String name;

    /**
     * The URL that the merchant is redirected to after approving the app subscription.
     */
    private String returnUrl;

    /**
     * The status of the app subscription.
     */
    private AppSubscriptionStatus status;

    /**
     * Specifies whether the app subscription is a test transaction.
     */
    private boolean test;

    /**
     * The number of free trial days, starting at the subscription's creation date, by which billing is delayed.
     */
    private int trialDays;

    public AppSubscription build() {
      AppSubscription result = new AppSubscription();
      result.createdAt = this.createdAt;
      result.currentPeriodEnd = this.currentPeriodEnd;
      result.id = this.id;
      result.lineItems = this.lineItems;
      result.name = this.name;
      result.returnUrl = this.returnUrl;
      result.status = this.status;
      result.test = this.test;
      result.trialDays = this.trialDays;
      return result;
    }

    /**
     * The date and time when the app subscription was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The date and time when the current app subscription period ends. Returns `null` if the subscription isn't active.
     */
    public Builder currentPeriodEnd(OffsetDateTime currentPeriodEnd) {
      this.currentPeriodEnd = currentPeriodEnd;
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
     * The plans attached to the app subscription.
     */
    public Builder lineItems(List<AppSubscriptionLineItem> lineItems) {
      this.lineItems = lineItems;
      return this;
    }

    /**
     * The name of the app subscription.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The URL that the merchant is redirected to after approving the app subscription.
     */
    public Builder returnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }

    /**
     * The status of the app subscription.
     */
    public Builder status(AppSubscriptionStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Specifies whether the app subscription is a test transaction.
     */
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }

    /**
     * The number of free trial days, starting at the subscription's creation date, by which billing is delayed.
     */
    public Builder trialDays(int trialDays) {
      this.trialDays = trialDays;
      return this;
    }
  }
}
