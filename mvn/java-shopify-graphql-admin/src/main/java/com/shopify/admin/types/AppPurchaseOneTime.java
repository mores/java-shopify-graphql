package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Services and features purchased once by a store.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class AppPurchaseOneTime implements com.shopify.admin.types.AppPurchase, com.shopify.admin.types.Node {
  /**
   * The date and time when the app purchase occurred.
   */
  private OffsetDateTime createdAt;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * The name of the app purchase.
   */
  private String name;

  /**
   * The amount to be charged to the store for the app purchase.
   */
  private MoneyV2 price;

  /**
   * The status of the app purchase.
   */
  private AppPurchaseStatus status;

  /**
   * Whether the app purchase is a test transaction.
   */
  private boolean test;

  public AppPurchaseOneTime() {
  }

  /**
   * The date and time when the app purchase occurred.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
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
   * The name of the app purchase.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The amount to be charged to the store for the app purchase.
   */
  public MoneyV2 getPrice() {
    return price;
  }

  public void setPrice(MoneyV2 price) {
    this.price = price;
  }

  /**
   * The status of the app purchase.
   */
  public AppPurchaseStatus getStatus() {
    return status;
  }

  public void setStatus(AppPurchaseStatus status) {
    this.status = status;
  }

  /**
   * Whether the app purchase is a test transaction.
   */
  public boolean getTest() {
    return test;
  }

  public void setTest(boolean test) {
    this.test = test;
  }

  @Override
  public String toString() {
    return "AppPurchaseOneTime{createdAt='" + createdAt + "', id='" + id + "', name='" + name + "', price='" + price + "', status='" + status + "', test='" + test + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppPurchaseOneTime that = (AppPurchaseOneTime) o;
    return Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(price, that.price) &&
        Objects.equals(status, that.status) &&
        test == that.test;
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, name, price, status, test);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time when the app purchase occurred.
     */
    private OffsetDateTime createdAt;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * The name of the app purchase.
     */
    private String name;

    /**
     * The amount to be charged to the store for the app purchase.
     */
    private MoneyV2 price;

    /**
     * The status of the app purchase.
     */
    private AppPurchaseStatus status;

    /**
     * Whether the app purchase is a test transaction.
     */
    private boolean test;

    public AppPurchaseOneTime build() {
      AppPurchaseOneTime result = new AppPurchaseOneTime();
      result.createdAt = this.createdAt;
      result.id = this.id;
      result.name = this.name;
      result.price = this.price;
      result.status = this.status;
      result.test = this.test;
      return result;
    }

    /**
     * The date and time when the app purchase occurred.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
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
     * The name of the app purchase.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The amount to be charged to the store for the app purchase.
     */
    public Builder price(MoneyV2 price) {
      this.price = price;
      return this;
    }

    /**
     * The status of the app purchase.
     */
    public Builder status(AppPurchaseStatus status) {
      this.status = status;
      return this;
    }

    /**
     * Whether the app purchase is a test transaction.
     */
    public Builder test(boolean test) {
      this.test = test;
      return this;
    }
  }
}
