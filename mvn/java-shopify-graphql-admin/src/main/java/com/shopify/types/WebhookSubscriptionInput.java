package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class WebhookSubscriptionInput {
  
  private String callbackUrl;

  
  private WebhookSubscriptionFormat format;

  
  private List<String> includeFields;

  
  private String filter;

  
  private List<String> metafieldNamespaces;

  public WebhookSubscriptionInput() {
  }

  
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  public WebhookSubscriptionFormat getFormat() {
    return format;
  }

  public void setFormat(WebhookSubscriptionFormat format) {
    this.format = format;
  }

  
  public List<String> getIncludeFields() {
    return includeFields;
  }

  public void setIncludeFields(List<String> includeFields) {
    this.includeFields = includeFields;
  }

  
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  
  public List<String> getMetafieldNamespaces() {
    return metafieldNamespaces;
  }

  public void setMetafieldNamespaces(List<String> metafieldNamespaces) {
    this.metafieldNamespaces = metafieldNamespaces;
  }

  @Override
  public String toString() {
    return "WebhookSubscriptionInput{callbackUrl='" + callbackUrl + "', format='" + format + "', includeFields='" + includeFields + "', filter='" + filter + "', metafieldNamespaces='" + metafieldNamespaces + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookSubscriptionInput that = (WebhookSubscriptionInput) o;
    return Objects.equals(callbackUrl, that.callbackUrl) &&
        Objects.equals(format, that.format) &&
        Objects.equals(includeFields, that.includeFields) &&
        Objects.equals(filter, that.filter) &&
        Objects.equals(metafieldNamespaces, that.metafieldNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, format, includeFields, filter, metafieldNamespaces);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String callbackUrl;

    
    private WebhookSubscriptionFormat format;

    
    private List<String> includeFields;

    
    private String filter;

    
    private List<String> metafieldNamespaces;

    public WebhookSubscriptionInput build() {
      WebhookSubscriptionInput result = new WebhookSubscriptionInput();
      result.callbackUrl = this.callbackUrl;
      result.format = this.format;
      result.includeFields = this.includeFields;
      result.filter = this.filter;
      result.metafieldNamespaces = this.metafieldNamespaces;
      return result;
    }

    
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    
    public Builder format(WebhookSubscriptionFormat format) {
      this.format = format;
      return this;
    }

    
    public Builder includeFields(List<String> includeFields) {
      this.includeFields = includeFields;
      return this;
    }

    
    public Builder filter(String filter) {
      this.filter = filter;
      return this;
    }

    
    public Builder metafieldNamespaces(List<String> metafieldNamespaces) {
      this.metafieldNamespaces = metafieldNamespaces;
      return this;
    }
  }
}
