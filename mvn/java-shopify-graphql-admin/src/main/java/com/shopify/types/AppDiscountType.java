package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

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
public class AppDiscountType {
  /**
   * The name of the app extension that's providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  private App app;

  /**
   * The [App Bridge configuration](https://shopify.dev/docs/api/app-bridge)
   * for the [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  private FunctionsAppBridge appBridge;

  /**
   * The [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets)
   * of the app extension that's providing the [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  private String appKey;

  /**
   * A description of the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types)
   * provided by the app extension.
   */
  private String description;

  /**
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  private DiscountClass discountClass;

  /**
   * The
   * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
   * associated with the app extension providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  private String functionId;

  /**
   * The type of line item on an order that the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types) applies to.
   * Valid values: `SHIPPING_LINE` and `LINE_ITEM`.
   */
  private DiscountApplicationTargetType targetType;

  /**
   * The name of the [discount type](https://help.shopify.com/manual/discounts/discount-types)
   * that the app extension is providing.
   */
  private String title;

  public AppDiscountType() {
  }

  /**
   * The name of the app extension that's providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The [App Bridge configuration](https://shopify.dev/docs/api/app-bridge)
   * for the [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  public FunctionsAppBridge getAppBridge() {
    return appBridge;
  }

  public void setAppBridge(FunctionsAppBridge appBridge) {
    this.appBridge = appBridge;
  }

  /**
   * The [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets)
   * of the app extension that's providing the [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   * A description of the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types)
   * provided by the app extension.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
   * that's used to control how discounts can be combined.
   */
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  /**
   * The
   * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
   * associated with the app extension providing the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  /**
   * The type of line item on an order that the
   * [discount type](https://help.shopify.com/manual/discounts/discount-types) applies to.
   * Valid values: `SHIPPING_LINE` and `LINE_ITEM`.
   */
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  /**
   * The name of the [discount type](https://help.shopify.com/manual/discounts/discount-types)
   * that the app extension is providing.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "AppDiscountType{app='" + app + "', appBridge='" + appBridge + "', appKey='" + appKey + "', description='" + description + "', discountClass='" + discountClass + "', functionId='" + functionId + "', targetType='" + targetType + "', title='" + title + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppDiscountType that = (AppDiscountType) o;
    return Objects.equals(app, that.app) &&
        Objects.equals(appBridge, that.appBridge) &&
        Objects.equals(appKey, that.appKey) &&
        Objects.equals(description, that.description) &&
        Objects.equals(discountClass, that.discountClass) &&
        Objects.equals(functionId, that.functionId) &&
        Objects.equals(targetType, that.targetType) &&
        Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app, appBridge, appKey, description, discountClass, functionId, targetType, title);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The name of the app extension that's providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    private App app;

    /**
     * The [App Bridge configuration](https://shopify.dev/docs/api/app-bridge)
     * for the [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    private FunctionsAppBridge appBridge;

    /**
     * The [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets)
     * of the app extension that's providing the [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    private String appKey;

    /**
     * A description of the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types)
     * provided by the app extension.
     */
    private String description;

    /**
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    private DiscountClass discountClass;

    /**
     * The
     * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
     * associated with the app extension providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    private String functionId;

    /**
     * The type of line item on an order that the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types) applies to.
     * Valid values: `SHIPPING_LINE` and `LINE_ITEM`.
     */
    private DiscountApplicationTargetType targetType;

    /**
     * The name of the [discount type](https://help.shopify.com/manual/discounts/discount-types)
     * that the app extension is providing.
     */
    private String title;

    public AppDiscountType build() {
      AppDiscountType result = new AppDiscountType();
      result.app = this.app;
      result.appBridge = this.appBridge;
      result.appKey = this.appKey;
      result.description = this.description;
      result.discountClass = this.discountClass;
      result.functionId = this.functionId;
      result.targetType = this.targetType;
      result.title = this.title;
      return result;
    }

    /**
     * The name of the app extension that's providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The [App Bridge configuration](https://shopify.dev/docs/api/app-bridge)
     * for the [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder appBridge(FunctionsAppBridge appBridge) {
      this.appBridge = appBridge;
      return this;
    }

    /**
     * The [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets)
     * of the app extension that's providing the [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder appKey(String appKey) {
      this.appKey = appKey;
      return this;
    }

    /**
     * A description of the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types)
     * provided by the app extension.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The [discount class](https://help.shopify.com/manual/discounts/combining-discounts/discount-combinations)
     * that's used to control how discounts can be combined.
     */
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    /**
     * The
     * [function ID](https://shopify.dev/docs/apps/build/functions/input-output/metafields-for-input-queries)
     * associated with the app extension providing the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    /**
     * The type of line item on an order that the
     * [discount type](https://help.shopify.com/manual/discounts/discount-types) applies to.
     * Valid values: `SHIPPING_LINE` and `LINE_ITEM`.
     */
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    /**
     * The name of the [discount type](https://help.shopify.com/manual/discounts/discount-types)
     * that the app extension is providing.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
