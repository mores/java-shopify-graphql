package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebhookSubscription implements com.shopify.types.LegacyInteroperability, com.shopify.types.Node {
  
  private ApiVersion apiVersion;

  
  private String callbackUrl;

  
  private OffsetDateTime createdAt;

  
  private WebhookSubscriptionEndpoint endpoint;

  
  private String filter;

  
  private WebhookSubscriptionFormat format;

  
  private String id;

  
  private List<String> includeFields;

  
  private String legacyResourceId;

  
  private List<String> metafieldNamespaces;

  
  private List<String> privateMetafieldNamespaces;

  
  private WebhookSubscriptionTopic topic;

  
  private OffsetDateTime updatedAt;

  public WebhookSubscription() {
  }

  
  public ApiVersion getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(ApiVersion apiVersion) {
    this.apiVersion = apiVersion;
  }

  
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  
  public WebhookSubscriptionEndpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(WebhookSubscriptionEndpoint endpoint) {
    this.endpoint = endpoint;
  }

  
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  
  public WebhookSubscriptionFormat getFormat() {
    return format;
  }

  public void setFormat(WebhookSubscriptionFormat format) {
    this.format = format;
  }

  
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  
  public List<String> getIncludeFields() {
    return includeFields;
  }

  public void setIncludeFields(List<String> includeFields) {
    this.includeFields = includeFields;
  }

  
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  
  public List<String> getMetafieldNamespaces() {
    return metafieldNamespaces;
  }

  public void setMetafieldNamespaces(List<String> metafieldNamespaces) {
    this.metafieldNamespaces = metafieldNamespaces;
  }

  
  public List<String> getPrivateMetafieldNamespaces() {
    return privateMetafieldNamespaces;
  }

  public void setPrivateMetafieldNamespaces(List<String> privateMetafieldNamespaces) {
    this.privateMetafieldNamespaces = privateMetafieldNamespaces;
  }

  
  public WebhookSubscriptionTopic getTopic() {
    return topic;
  }

  public void setTopic(WebhookSubscriptionTopic topic) {
    this.topic = topic;
  }

  
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "WebhookSubscription{apiVersion='" + apiVersion + "', callbackUrl='" + callbackUrl + "', createdAt='" + createdAt + "', endpoint='" + endpoint + "', filter='" + filter + "', format='" + format + "', id='" + id + "', includeFields='" + includeFields + "', legacyResourceId='" + legacyResourceId + "', metafieldNamespaces='" + metafieldNamespaces + "', privateMetafieldNamespaces='" + privateMetafieldNamespaces + "', topic='" + topic + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookSubscription that = (WebhookSubscription) o;
    return Objects.equals(apiVersion, that.apiVersion) &&
        Objects.equals(callbackUrl, that.callbackUrl) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(endpoint, that.endpoint) &&
        Objects.equals(filter, that.filter) &&
        Objects.equals(format, that.format) &&
        Objects.equals(id, that.id) &&
        Objects.equals(includeFields, that.includeFields) &&
        Objects.equals(legacyResourceId, that.legacyResourceId) &&
        Objects.equals(metafieldNamespaces, that.metafieldNamespaces) &&
        Objects.equals(privateMetafieldNamespaces, that.privateMetafieldNamespaces) &&
        Objects.equals(topic, that.topic) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, callbackUrl, createdAt, endpoint, filter, format, id, includeFields, legacyResourceId, metafieldNamespaces, privateMetafieldNamespaces, topic, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    
    private ApiVersion apiVersion;

    
    private String callbackUrl;

    
    private OffsetDateTime createdAt;

    
    private WebhookSubscriptionEndpoint endpoint;

    
    private String filter;

    
    private WebhookSubscriptionFormat format;

    
    private String id;

    
    private List<String> includeFields;

    
    private String legacyResourceId;

    
    private List<String> metafieldNamespaces;

    
    private List<String> privateMetafieldNamespaces;

    
    private WebhookSubscriptionTopic topic;

    
    private OffsetDateTime updatedAt;

    public WebhookSubscription build() {
      WebhookSubscription result = new WebhookSubscription();
      result.apiVersion = this.apiVersion;
      result.callbackUrl = this.callbackUrl;
      result.createdAt = this.createdAt;
      result.endpoint = this.endpoint;
      result.filter = this.filter;
      result.format = this.format;
      result.id = this.id;
      result.includeFields = this.includeFields;
      result.legacyResourceId = this.legacyResourceId;
      result.metafieldNamespaces = this.metafieldNamespaces;
      result.privateMetafieldNamespaces = this.privateMetafieldNamespaces;
      result.topic = this.topic;
      result.updatedAt = this.updatedAt;
      return result;
    }

    
    public Builder apiVersion(ApiVersion apiVersion) {
      this.apiVersion = apiVersion;
      return this;
    }

    
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    
    public Builder endpoint(WebhookSubscriptionEndpoint endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    
    public Builder filter(String filter) {
      this.filter = filter;
      return this;
    }

    
    public Builder format(WebhookSubscriptionFormat format) {
      this.format = format;
      return this;
    }

    
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    
    public Builder includeFields(List<String> includeFields) {
      this.includeFields = includeFields;
      return this;
    }

    
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    
    public Builder metafieldNamespaces(List<String> metafieldNamespaces) {
      this.metafieldNamespaces = metafieldNamespaces;
      return this;
    }

    
    public Builder privateMetafieldNamespaces(List<String> privateMetafieldNamespaces) {
      this.privateMetafieldNamespaces = privateMetafieldNamespaces;
      return this;
    }

    
    public Builder topic(WebhookSubscriptionTopic topic) {
      this.topic = topic;
      return this;
    }

    
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
