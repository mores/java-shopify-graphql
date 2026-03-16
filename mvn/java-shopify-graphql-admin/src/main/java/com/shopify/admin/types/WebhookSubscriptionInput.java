package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a webhook subscription.
 */
public class WebhookSubscriptionInput {
  /**
   * The format in which the webhook subscription should send the data.
   */
  private WebhookSubscriptionFormat format;

  /**
   * The list of fields to be included in the webhook subscription. Only the fields
   * specified will be included in the webhook payload. If null, then all fields
   * will be included. Learn more about [modifying webhook payloads](https://shopify.dev/docs/apps/build/webhooks/customize/modify_payloads).
   */
  private List<String> includeFields;

  /**
   * A constraint specified using search syntax that ensures only webhooks that
   * match the specified filter are emitted. See our [guide on
   * filters](https://shopify.dev/docs/apps/build/webhooks/customize/filters) for more details.
   */
  private String filter;

  /**
   * The list of namespaces for any metafields that should be included in the webhook subscription.
   */
  private List<String> metafieldNamespaces;

  /**
   * A list of identifiers specifying metafields to include in the webhook payload.
   */
  private List<HasMetafieldsMetafieldIdentifierInput> metafields;

  /**
   * The URI where the webhook subscription should send events. Supports an HTTPS
   * URL, a Google Pub/Sub URI (pubsub://{project-id}:{topic-id}) or an Amazon
   * EventBridge event source ARN.
   */
  private String uri;

  public WebhookSubscriptionInput() {
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
   * The list of fields to be included in the webhook subscription. Only the fields
   * specified will be included in the webhook payload. If null, then all fields
   * will be included. Learn more about [modifying webhook payloads](https://shopify.dev/docs/apps/build/webhooks/customize/modify_payloads).
   */
  public List<String> getIncludeFields() {
    return includeFields;
  }

  public void setIncludeFields(List<String> includeFields) {
    this.includeFields = includeFields;
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
   * The list of namespaces for any metafields that should be included in the webhook subscription.
   */
  public List<String> getMetafieldNamespaces() {
    return metafieldNamespaces;
  }

  public void setMetafieldNamespaces(List<String> metafieldNamespaces) {
    this.metafieldNamespaces = metafieldNamespaces;
  }

  /**
   * A list of identifiers specifying metafields to include in the webhook payload.
   */
  public List<HasMetafieldsMetafieldIdentifierInput> getMetafields() {
    return metafields;
  }

  public void setMetafields(List<HasMetafieldsMetafieldIdentifierInput> metafields) {
    this.metafields = metafields;
  }

  /**
   * The URI where the webhook subscription should send events. Supports an HTTPS
   * URL, a Google Pub/Sub URI (pubsub://{project-id}:{topic-id}) or an Amazon
   * EventBridge event source ARN.
   */
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  @Override
  public String toString() {
    return "WebhookSubscriptionInput{format='" + format + "', includeFields='" + includeFields + "', filter='" + filter + "', metafieldNamespaces='" + metafieldNamespaces + "', metafields='" + metafields + "', uri='" + uri + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookSubscriptionInput that = (WebhookSubscriptionInput) o;
    return Objects.equals(format, that.format) &&
        Objects.equals(includeFields, that.includeFields) &&
        Objects.equals(filter, that.filter) &&
        Objects.equals(metafieldNamespaces, that.metafieldNamespaces) &&
        Objects.equals(metafields, that.metafields) &&
        Objects.equals(uri, that.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, includeFields, filter, metafieldNamespaces, metafields, uri);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The format in which the webhook subscription should send the data.
     */
    private WebhookSubscriptionFormat format;

    /**
     * The list of fields to be included in the webhook subscription. Only the fields
     * specified will be included in the webhook payload. If null, then all fields
     * will be included. Learn more about [modifying webhook payloads](https://shopify.dev/docs/apps/build/webhooks/customize/modify_payloads).
     */
    private List<String> includeFields;

    /**
     * A constraint specified using search syntax that ensures only webhooks that
     * match the specified filter are emitted. See our [guide on
     * filters](https://shopify.dev/docs/apps/build/webhooks/customize/filters) for more details.
     */
    private String filter;

    /**
     * The list of namespaces for any metafields that should be included in the webhook subscription.
     */
    private List<String> metafieldNamespaces;

    /**
     * A list of identifiers specifying metafields to include in the webhook payload.
     */
    private List<HasMetafieldsMetafieldIdentifierInput> metafields;

    /**
     * The URI where the webhook subscription should send events. Supports an HTTPS
     * URL, a Google Pub/Sub URI (pubsub://{project-id}:{topic-id}) or an Amazon
     * EventBridge event source ARN.
     */
    private String uri;

    public WebhookSubscriptionInput build() {
      WebhookSubscriptionInput result = new WebhookSubscriptionInput();
      result.format = this.format;
      result.includeFields = this.includeFields;
      result.filter = this.filter;
      result.metafieldNamespaces = this.metafieldNamespaces;
      result.metafields = this.metafields;
      result.uri = this.uri;
      return result;
    }

    /**
     * The format in which the webhook subscription should send the data.
     */
    public Builder format(WebhookSubscriptionFormat format) {
      this.format = format;
      return this;
    }

    /**
     * The list of fields to be included in the webhook subscription. Only the fields
     * specified will be included in the webhook payload. If null, then all fields
     * will be included. Learn more about [modifying webhook payloads](https://shopify.dev/docs/apps/build/webhooks/customize/modify_payloads).
     */
    public Builder includeFields(List<String> includeFields) {
      this.includeFields = includeFields;
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
     * The list of namespaces for any metafields that should be included in the webhook subscription.
     */
    public Builder metafieldNamespaces(List<String> metafieldNamespaces) {
      this.metafieldNamespaces = metafieldNamespaces;
      return this;
    }

    /**
     * A list of identifiers specifying metafields to include in the webhook payload.
     */
    public Builder metafields(List<HasMetafieldsMetafieldIdentifierInput> metafields) {
      this.metafields = metafields;
      return this;
    }

    /**
     * The URI where the webhook subscription should send events. Supports an HTTPS
     * URL, a Google Pub/Sub URI (pubsub://{project-id}:{topic-id}) or an Amazon
     * EventBridge event source ARN.
     */
    public Builder uri(String uri) {
      this.uri = uri;
      return this;
    }
  }
}
