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
  
  private App app;

  
  private FunctionsAppBridge appBridge;

  /**
   * The [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets)
   * of the app extension that's providing the [discount type](https://help.shopify.com/manual/discounts/discount-types).
   */
  private String appKey;

  
  private String description;

  
  private DiscountClass discountClass;

  
  private String functionId;

  
  private DiscountApplicationTargetType targetType;

  
  private String title;

  public AppDiscountType() {
  }

  
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  
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

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public DiscountClass getDiscountClass() {
    return discountClass;
  }

  public void setDiscountClass(DiscountClass discountClass) {
    this.discountClass = discountClass;
  }

  
  public String getFunctionId() {
    return functionId;
  }

  public void setFunctionId(String functionId) {
    this.functionId = functionId;
  }

  
  public DiscountApplicationTargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(DiscountApplicationTargetType targetType) {
    this.targetType = targetType;
  }

  
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
    
    private App app;

    
    private FunctionsAppBridge appBridge;

    /**
     * The [client ID](https://shopify.dev/docs/apps/build/authentication-authorization/client-secrets)
     * of the app extension that's providing the [discount type](https://help.shopify.com/manual/discounts/discount-types).
     */
    private String appKey;

    
    private String description;

    
    private DiscountClass discountClass;

    
    private String functionId;

    
    private DiscountApplicationTargetType targetType;

    
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

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
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

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder discountClass(DiscountClass discountClass) {
      this.discountClass = discountClass;
      return this;
    }

    
    public Builder functionId(String functionId) {
      this.functionId = functionId;
      return this;
    }

    
    public Builder targetType(DiscountApplicationTargetType targetType) {
      this.targetType = targetType;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }
  }
}
