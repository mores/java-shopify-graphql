package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShopifyFunction {
  
  private String apiType;

  
  private String apiVersion;

  
  private App app;

  
  private FunctionsAppBridge appBridge;

  
  private String appKey;

  
  private String description;

  
  private String id;

  
  private String inputQuery;

  
  private String title;

  
  private boolean useCreationUi;

  public ShopifyFunction() {
  }

  
  public String getApiType() {
    return apiType;
  }

  public void setApiType(String apiType) {
    this.apiType = apiType;
  }

  
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
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

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public String getInputQuery() {
    return inputQuery;
  }

  public void setInputQuery(String inputQuery) {
    this.inputQuery = inputQuery;
  }

  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  
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
    
    private String apiType;

    
    private String apiVersion;

    
    private App app;

    
    private FunctionsAppBridge appBridge;

    
    private String appKey;

    
    private String description;

    
    private String id;

    
    private String inputQuery;

    
    private String title;

    
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

    
    public Builder apiType(String apiType) {
      this.apiType = apiType;
      return this;
    }

    
    public Builder apiVersion(String apiVersion) {
      this.apiVersion = apiVersion;
      return this;
    }

    
    public Builder app(App app) {
      this.app = app;
      return this;
    }

    
    public Builder appBridge(FunctionsAppBridge appBridge) {
      this.appBridge = appBridge;
      return this;
    }

    
    public Builder appKey(String appKey) {
      this.appKey = appKey;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder inputQuery(String inputQuery) {
      this.inputQuery = inputQuery;
      return this;
    }

    
    public Builder title(String title) {
      this.title = title;
      return this;
    }

    
    public Builder useCreationUi(boolean useCreationUi) {
      this.useCreationUi = useCreationUi;
      return this;
    }
  }
}
