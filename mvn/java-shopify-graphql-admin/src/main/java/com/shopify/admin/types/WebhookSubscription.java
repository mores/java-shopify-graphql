package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A webhook subscription is a persisted data object created by an app using the REST Admin API or GraphQL Admin API.
 * It describes the topic that the app wants to receive, and a destination where
 * Shopify should send webhooks of the specified topic.
 * When an event for a given topic occurs, the webhook subscription sends a relevant payload to the destination.
 * Learn more about the [webhooks system](https://shopify.dev/apps/webhooks).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebhookSubscription implements com.shopify.admin.types.LegacyInteroperability, com.shopify.admin.types.Node {
  /**
   * The Admin API version that Shopify uses to serialize webhook events. This
   * value is inherited from the app that created the webhook subscription.
   */
  private ApiVersion apiVersion;

  /**
   * The destination URI to which the webhook subscription will send a message when an event occurs.
   */
  private String callbackUrl;

  /**
   * The date and time when the webhook subscription was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The endpoint to which the webhook subscription will send events.
   */
  private WebhookSubscriptionEndpoint endpoint;

  /**
   * A constraint specified using search syntax that ensures only webhooks that
   * match the specified filter are emitted. See our [guide on
   * filters](https://shopify.dev/docs/apps/build/webhooks/customize/filters) for more details.
   */
  private String filter;

  /**
   * The format in which the webhook subscription should send the data.
   */
  private WebhookSubscriptionFormat format;

  /**
   * A globally-unique ID.
   */
  private String id;

  /**
   * An optional array of top-level resource fields that should be serialized and
   * sent in the webhook message. If null, then all fields will be sent.
   */
  private List<String> includeFields;

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  private String legacyResourceId;

  /**
   * The list of namespaces for any metafields that should be included in the webhook subscription.
   */
  private List<String> metafieldNamespaces;

  /**
   * The list of identifiers specifying metafields to include in the webhook subscription.
   */
  private List<WebhookSubscriptionMetafieldIdentifier> metafields;

  /**
   * The type of event that triggers the webhook. The topic determines when the
   * webhook subscription sends a webhook, as well as what class of data object
   * that webhook contains.
   */
  private WebhookSubscriptionTopic topic;

  /**
   * The date and time when the webhook subscription was updated.
   */
  private OffsetDateTime updatedAt;

  public WebhookSubscription() {
  }

  /**
   * The Admin API version that Shopify uses to serialize webhook events. This
   * value is inherited from the app that created the webhook subscription.
   */
  public ApiVersion getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(ApiVersion apiVersion) {
    this.apiVersion = apiVersion;
  }

  /**
   * The destination URI to which the webhook subscription will send a message when an event occurs.
   */
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  /**
   * The date and time when the webhook subscription was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The endpoint to which the webhook subscription will send events.
   */
  public WebhookSubscriptionEndpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(WebhookSubscriptionEndpoint endpoint) {
    this.endpoint = endpoint;
  }

  /**
   * A constraint specified using search syntax that ensures only webhooks that
   * match the specified filter are emitted. See our [guide on
   * filters](https://shopify.dev/docs/apps/build/webhooks/customize/filters) for more details.
   */
  public String getFilter() {
    return filter;
  }

  public void setFilter(String filter) {
    this.filter = filter;
  }

  /**
   * The format in which the webhook subscription should send the data.
   */
  public WebhookSubscriptionFormat getFormat() {
    return format;
  }

  public void setFormat(WebhookSubscriptionFormat format) {
    this.format = format;
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
   * An optional array of top-level resource fields that should be serialized and
   * sent in the webhook message. If null, then all fields will be sent.
   */
  public List<String> getIncludeFields() {
    return includeFields;
  }

  public void setIncludeFields(List<String> includeFields) {
    this.includeFields = includeFields;
  }

  /**
   * The ID of the corresponding resource in the REST Admin API.
   */
  public String getLegacyResourceId() {
    return legacyResourceId;
  }

  public void setLegacyResourceId(String legacyResourceId) {
    this.legacyResourceId = legacyResourceId;
  }

  /**
   * The list of namespaces for any metafields that should be included in the webhook subscription.
   */
  public List<String> getMetafieldNamespaces() {
    return metafieldNamespaces;
  }

  public void setMetafieldNamespaces(List<String> metafieldNamespaces) {
    this.metafieldNamespaces = metafieldNamespaces;
  }

  /**
   * The list of identifiers specifying metafields to include in the webhook subscription.
   */
  public List<WebhookSubscriptionMetafieldIdentifier> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<WebhookSubscriptionMetafieldIdentifier> metafields) {
    this.metafields = metafields;
  }

  /**
   * The type of event that triggers the webhook. The topic determines when the
   * webhook subscription sends a webhook, as well as what class of data object
   * that webhook contains.
   */
  public WebhookSubscriptionTopic getTopic() {
    return topic;
  }

  public void setTopic(WebhookSubscriptionTopic topic) {
    this.topic = topic;
  }

  /**
   * The date and time when the webhook subscription was updated.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "WebhookSubscription{apiVersion='" + apiVersion + "', callbackUrl='" + callbackUrl + "', createdAt='" + createdAt + "', endpoint='" + endpoint + "', filter='" + filter + "', format='" + format + "', id='" + id + "', includeFields='" + includeFields + "', legacyResourceId='" + legacyResourceId + "', metafieldNamespaces='" + metafieldNamespaces + "', metafields='" + metafields + "', topic='" + topic + "', updatedAt='" + updatedAt + "'}";
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
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(topic, that.topic) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, callbackUrl, createdAt, endpoint, filter, format, id, includeFields, legacyResourceId, metafieldNamespaces, metafields, topic, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Admin API version that Shopify uses to serialize webhook events. This
     * value is inherited from the app that created the webhook subscription.
     */
    private ApiVersion apiVersion;

    /**
     * The destination URI to which the webhook subscription will send a message when an event occurs.
     */
    private String callbackUrl;

    /**
     * The date and time when the webhook subscription was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The endpoint to which the webhook subscription will send events.
     */
    private WebhookSubscriptionEndpoint endpoint;

    /**
     * A constraint specified using search syntax that ensures only webhooks that
     * match the specified filter are emitted. See our [guide on
     * filters](https://shopify.dev/docs/apps/build/webhooks/customize/filters) for more details.
     */
    private String filter;

    /**
     * The format in which the webhook subscription should send the data.
     */
    private WebhookSubscriptionFormat format;

    /**
     * A globally-unique ID.
     */
    private String id;

    /**
     * An optional array of top-level resource fields that should be serialized and
     * sent in the webhook message. If null, then all fields will be sent.
     */
    private List<String> includeFields;

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    private String legacyResourceId;

    /**
     * The list of namespaces for any metafields that should be included in the webhook subscription.
     */
    private List<String> metafieldNamespaces;

    /**
     * The list of identifiers specifying metafields to include in the webhook subscription.
     */
    private List<WebhookSubscriptionMetafieldIdentifier> metafields;

    /**
     * The type of event that triggers the webhook. The topic determines when the
     * webhook subscription sends a webhook, as well as what class of data object
     * that webhook contains.
     */
    private WebhookSubscriptionTopic topic;

    /**
     * The date and time when the webhook subscription was updated.
     */
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
      result.metafields = this.metafields;
      result.topic = this.topic;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The Admin API version that Shopify uses to serialize webhook events. This
     * value is inherited from the app that created the webhook subscription.
     */
    public Builder apiVersion(ApiVersion apiVersion) {
      this.apiVersion = apiVersion;
      return this;
    }

    /**
     * The destination URI to which the webhook subscription will send a message when an event occurs.
     */
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }

    /**
     * The date and time when the webhook subscription was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The endpoint to which the webhook subscription will send events.
     */
    public Builder endpoint(WebhookSubscriptionEndpoint endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    /**
     * A constraint specified using search syntax that ensures only webhooks that
     * match the specified filter are emitted. See our [guide on
     * filters](https://shopify.dev/docs/apps/build/webhooks/customize/filters) for more details.
     */
    public Builder filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * The format in which the webhook subscription should send the data.
     */
    public Builder format(WebhookSubscriptionFormat format) {
      this.format = format;
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
     * An optional array of top-level resource fields that should be serialized and
     * sent in the webhook message. If null, then all fields will be sent.
     */
    public Builder includeFields(List<String> includeFields) {
      this.includeFields = includeFields;
      return this;
    }

    /**
     * The ID of the corresponding resource in the REST Admin API.
     */
    public Builder legacyResourceId(String legacyResourceId) {
      this.legacyResourceId = legacyResourceId;
      return this;
    }

    /**
     * The list of namespaces for any metafields that should be included in the webhook subscription.
     */
    public Builder metafieldNamespaces(List<String> metafieldNamespaces) {
      this.metafieldNamespaces = metafieldNamespaces;
      return this;
    }

    /**
     * The list of identifiers specifying metafields to include in the webhook subscription.
     */
    public Builder metafields(List<WebhookSubscriptionMetafieldIdentifier> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The type of event that triggers the webhook. The topic determines when the
     * webhook subscription sends a webhook, as well as what class of data object
     * that webhook contains.
     */
    public Builder topic(WebhookSubscriptionTopic topic) {
      this.topic = topic;
      return this;
    }

    /**
     * The date and time when the webhook subscription was updated.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
