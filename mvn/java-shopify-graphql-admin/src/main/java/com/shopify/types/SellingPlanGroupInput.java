package com.shopify.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class SellingPlanGroupInput {
  
  private String name;

  
  private String appId;

  
  private String merchantCode;

  
  private String description;

  
  private List<SellingPlanInput> sellingPlansToCreate;

  
  private List<SellingPlanInput> sellingPlansToUpdate;

  
  private List<String> sellingPlansToDelete;

  
  private List<String> options;

  
  private Integer position;

  public SellingPlanGroupInput() {
  }

  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  
  public String getMerchantCode() {
    return merchantCode;
  }

  public void setMerchantCode(String merchantCode) {
    this.merchantCode = merchantCode;
  }

  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  
  public List<SellingPlanInput> getSellingPlansToCreate() {
    return sellingPlansToCreate;
  }

  public void setSellingPlansToCreate(List<SellingPlanInput> sellingPlansToCreate) {
    this.sellingPlansToCreate = sellingPlansToCreate;
  }

  
  public List<SellingPlanInput> getSellingPlansToUpdate() {
    return sellingPlansToUpdate;
  }

  public void setSellingPlansToUpdate(List<SellingPlanInput> sellingPlansToUpdate) {
    this.sellingPlansToUpdate = sellingPlansToUpdate;
  }

  
  public List<String> getSellingPlansToDelete() {
    return sellingPlansToDelete;
  }

  public void setSellingPlansToDelete(List<String> sellingPlansToDelete) {
    this.sellingPlansToDelete = sellingPlansToDelete;
  }

  
  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "SellingPlanGroupInput{name='" + name + "', appId='" + appId + "', merchantCode='" + merchantCode + "', description='" + description + "', sellingPlansToCreate='" + sellingPlansToCreate + "', sellingPlansToUpdate='" + sellingPlansToUpdate + "', sellingPlansToDelete='" + sellingPlansToDelete + "', options='" + options + "', position='" + position + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SellingPlanGroupInput that = (SellingPlanGroupInput) o;
    return Objects.equals(name, that.name) &&
        Objects.equals(appId, that.appId) &&
        Objects.equals(merchantCode, that.merchantCode) &&
        Objects.equals(description, that.description) &&
        Objects.equals(sellingPlansToCreate, that.sellingPlansToCreate) &&
        Objects.equals(sellingPlansToUpdate, that.sellingPlansToUpdate) &&
        Objects.equals(sellingPlansToDelete, that.sellingPlansToDelete) &&
        Objects.equals(options, that.options) &&
        Objects.equals(position, that.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, appId, merchantCode, description, sellingPlansToCreate, sellingPlansToUpdate, sellingPlansToDelete, options, position);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String name;

    
    private String appId;

    
    private String merchantCode;

    
    private String description;

    
    private List<SellingPlanInput> sellingPlansToCreate;

    
    private List<SellingPlanInput> sellingPlansToUpdate;

    
    private List<String> sellingPlansToDelete;

    
    private List<String> options;

    
    private Integer position;

    public SellingPlanGroupInput build() {
      SellingPlanGroupInput result = new SellingPlanGroupInput();
      result.name = this.name;
      result.appId = this.appId;
      result.merchantCode = this.merchantCode;
      result.description = this.description;
      result.sellingPlansToCreate = this.sellingPlansToCreate;
      result.sellingPlansToUpdate = this.sellingPlansToUpdate;
      result.sellingPlansToDelete = this.sellingPlansToDelete;
      result.options = this.options;
      result.position = this.position;
      return result;
    }

    
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    
    public Builder appId(String appId) {
      this.appId = appId;
      return this;
    }

    
    public Builder merchantCode(String merchantCode) {
      this.merchantCode = merchantCode;
      return this;
    }

    
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    
    public Builder sellingPlansToCreate(List<SellingPlanInput> sellingPlansToCreate) {
      this.sellingPlansToCreate = sellingPlansToCreate;
      return this;
    }

    
    public Builder sellingPlansToUpdate(List<SellingPlanInput> sellingPlansToUpdate) {
      this.sellingPlansToUpdate = sellingPlansToUpdate;
      return this;
    }

    
    public Builder sellingPlansToDelete(List<String> sellingPlansToDelete) {
      this.sellingPlansToDelete = sellingPlansToDelete;
      return this;
    }

    
    public Builder options(List<String> options) {
      this.options = options;
      return this;
    }

    
    public Builder position(Integer position) {
      this.position = position;
      return this;
    }
  }
}
