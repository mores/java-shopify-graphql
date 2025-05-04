package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A Shopify Function.
 */
public class ShopifyFunction {
  /**
   * The API type of the Shopify Function.
   */
  private String apiType;

  /**
   * The API version of the Shopify Function.
   */
  private String apiVersion;

  /**
   * The app that owns the Shopify Function.
   */
  private App app;

  /**
   * The App Bridge information for the Shopify Function.
   */
  private FunctionsAppBridge appBridge;

  /**
   * The client ID of the app that owns the Shopify Function.
   */
  private String appKey;

  /**
   * The description of the Shopify Function.
   */
  private String description;

  /**
   * The ID of the Shopify Function.
   */
  private String id;

  /**
   * The input query of the Shopify Function.
   */
  private String inputQuery;

  /**
   * The title of the Shopify Function.
   */
  private String title;

  /**
   * If the Shopify Function uses the creation UI in the Admin.
   */
  private boolean useCreationUi;

  public ShopifyFunction() {
  }

  /**
   * The API type of the Shopify Function.
   */
  public String getApiType() {
    return apiType;
  }

  public void setApiType(String apiType) {
    this.apiType = apiType;
  }

  /**
   * The API version of the Shopify Function.
   */
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * The app that owns the Shopify Function.
   */
  public App getApp() {
    return app;
  }

  public void setApp(App app) {
    this.app = app;
  }

  /**
   * The App Bridge information for the Shopify Function.
   */
  public FunctionsAppBridge getAppBridge() {
    return appBridge;
  }

  public void setAppBridge(FunctionsAppBridge appBridge) {
    this.appBridge = appBridge;
  }

  /**
   * The client ID of the app that owns the Shopify Function.
   */
  public String getAppKey() {
    return appKey;
  }

  public void setAppKey(String appKey) {
    this.appKey = appKey;
  }

  /**
   * The description of the Shopify Function.
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The ID of the Shopify Function.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The input query of the Shopify Function.
   */
  public String getInputQuery() {
    return inputQuery;
  }

  public void setInputQuery(String inputQuery) {
    this.inputQuery = inputQuery;
  }

  /**
   * The title of the Shopify Function.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * If the Shopify Function uses the creation UI in the Admin.
   */
  public boolean getUseCreationUi() {
    return useCreationUi;
  }

  public void setUseCreationUi(boolean useCreationUi) {
    this.useCreationUi = useCreationUi;
  }

  @Override
  public String toString() {
    return "ShopifyFunction{apiType='" + apiType + "', apiVersion='" + apiVersion + "', app='" + app + "', appBridge='" + appBridge + "', appKey='" + appKey + "', description='" + description + "', id='" + id + "', inputQuery='" + inputQuery + "', title='" + title + "', useCreationUi='" + useCreationUi + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ShopifyFunction that = (ShopifyFunction) o;
    return Objects.equals(apiType, that.apiType) &&
        Objects.equals(apiVersion, that.apiVersion) &&
        Objects.equals(app, that.app) &&
        Objects.equals(appBridge, that.appBridge) &&
        Objects.equals(appKey, that.appKey) &&
        Objects.equals(description, that.description) &&
        Objects.equals(id, that.id) &&
        Objects.equals(inputQuery, that.inputQuery) &&
        Objects.equals(title, that.title) &&
        useCreationUi == that.useCreationUi;
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiType, apiVersion, app, appBridge, appKey, description, id, inputQuery, title, useCreationUi);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The API type of the Shopify Function.
     */
    private String apiType;

    /**
     * The API version of the Shopify Function.
     */
    private String apiVersion;

    /**
     * The app that owns the Shopify Function.
     */
    private App app;

    /**
     * The App Bridge information for the Shopify Function.
     */
    private FunctionsAppBridge appBridge;

    /**
     * The client ID of the app that owns the Shopify Function.
     */
    private String appKey;

    /**
     * The description of the Shopify Function.
     */
    private String description;

    /**
     * The ID of the Shopify Function.
     */
    private String id;

    /**
     * The input query of the Shopify Function.
     */
    private String inputQuery;

    /**
     * The title of the Shopify Function.
     */
    private String title;

    /**
     * If the Shopify Function uses the creation UI in the Admin.
     */
    private boolean useCreationUi;

    public ShopifyFunction build() {
      ShopifyFunction result = new ShopifyFunction();
      result.apiType = this.apiType;
      result.apiVersion = this.apiVersion;
      result.app = this.app;
      result.appBridge = this.appBridge;
      result.appKey = this.appKey;
      result.description = this.description;
      result.id = this.id;
      result.inputQuery = this.inputQuery;
      result.title = this.title;
      result.useCreationUi = this.useCreationUi;
      return result;
    }

    /**
     * The API type of the Shopify Function.
     */
    public Builder apiType(String apiType) {
      this.apiType = apiType;
      return this;
    }

    /**
     * The API version of the Shopify Function.
     */
    public Builder apiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
      return this;
    }

    /**
     * The app that owns the Shopify Function.
     */
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    /**
     * The App Bridge information for the Shopify Function.
     */
    public Builder appBridge(FunctionsAppBridge appBridge) {
      this.appBridge = appBridge;
      return this;
    }

    /**
     * The client ID of the app that owns the Shopify Function.
     */
    public Builder appKey(String appKey) {
      this.appKey = appKey;
      return this;
    }

    /**
     * The description of the Shopify Function.
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * The ID of the Shopify Function.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The input query of the Shopify Function.
     */
    public Builder inputQuery(String inputQuery) {
      this.inputQuery = inputQuery;
      return this;
    }

    /**
     * The title of the Shopify Function.
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * If the Shopify Function uses the creation UI in the Admin.
     */
    public Builder useCreationUi(boolean useCreationUi) {
      this.useCreationUi = useCreationUi;
      return this;
    }
  }
}
