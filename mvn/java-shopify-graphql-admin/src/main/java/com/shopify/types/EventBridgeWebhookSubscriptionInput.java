package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class EventBridgeWebhookSubscriptionInput {
  
  private String arn;

  
  private WebhookSubscriptionFormat format;

  
  private List<String> includeFields;

  
  private String filter;

  
  private List<String> metafieldNamespaces;

  public EventBridgeWebhookSubscriptionInput() {
  }

  
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
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
    return "EventBridgeWebhookSubscriptionInput{arn='" + arn + "', format='" + format + "', includeFields='" + includeFields + "', filter='" + filter + "', metafieldNamespaces='" + metafieldNamespaces + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EventBridgeWebhookSubscriptionInput that = (EventBridgeWebhookSubscriptionInput) o;
    return Objects.equals(arn, that.arn) &&
        Objects.equals(format, that.format) &&
        Objects.equals(includeFields, that.includeFields) &&
        Objects.equals(filter, that.filter) &&
        Objects.equals(metafieldNamespaces, that.metafieldNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, format, includeFields, filter, metafieldNamespaces);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private String arn;

    
    private WebhookSubscriptionFormat format;

    
    private List<String> includeFields;

    
    private String filter;

    
    private List<String> metafieldNamespaces;

    public EventBridgeWebhookSubscriptionInput build() {
      EventBridgeWebhookSubscriptionInput result = new EventBridgeWebhookSubscriptionInput();
      result.arn = this.arn;
      result.format = this.format;
      result.includeFields = this.includeFields;
      result.filter = this.filter;
      result.metafieldNamespaces = this.metafieldNamespaces;
      return result;
    }

    
    public Builder arn(String arn) {
      this.arn = arn;
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
