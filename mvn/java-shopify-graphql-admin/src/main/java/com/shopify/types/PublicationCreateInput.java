package com.shopify.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class PublicationCreateInput {
  
  private String catalogId;

  
  private PublicationCreateInputPublicationDefaultState defaultState = PublicationCreateInputPublicationDefaultState.EMPTY;

  
  private Boolean autoPublish = false;

  public PublicationCreateInput() {
  }

  
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  
  public PublicationCreateInputPublicationDefaultState getDefaultState() {
    return defaultState;
  }

  public void setDefaultState(PublicationCreateInputPublicationDefaultState defaultState) {
    this.defaultState = defaultState;
  }

  
  public Boolean getAutoPublish() {
    return autoPublish;
  }

  public void setAutoPublish(Boolean autoPublish) {
    this.autoPublish = autoPublish;
  }

  @Override
  public String toString() {
    return "PublicationCreateInput{catalogId='" + catalogId + "', defaultState='" + defaultState + "', autoPublish='" + autoPublish + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublicationCreateInput that = (PublicationCreateInput) o;
    return Objects.equals(catalogId, that.catalogId) &&
        Objects.equals(defaultState, that.defaultState) &&
        Objects.equals(autoPublish, that.autoPublish);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogId, defaultState, autoPublish);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String catalogId;

    
    private PublicationCreateInputPublicationDefaultState defaultState = PublicationCreateInputPublicationDefaultState.EMPTY;

    
    private Boolean autoPublish = false;

    public PublicationCreateInput build() {
      PublicationCreateInput result = new PublicationCreateInput();
      result.catalogId = this.catalogId;
      result.defaultState = this.defaultState;
      result.autoPublish = this.autoPublish;
      return result;
    }

    
    public Builder catalogId(String catalogId) {
      this.catalogId = catalogId;
      return this;
    }

    
    public Builder defaultState(PublicationCreateInputPublicationDefaultState defaultState) {
      this.defaultState = defaultState;
      return this;
    }

    
    public Builder autoPublish(Boolean autoPublish) {
      this.autoPublish = autoPublish;
      return this;
    }
  }
}
