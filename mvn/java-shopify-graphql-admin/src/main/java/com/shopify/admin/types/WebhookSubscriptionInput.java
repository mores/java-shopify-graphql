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
   * URL where the webhook subscription should send the POST request when the event occurs.
   */
  private String callbackUrl;

  /**
   * The format in which the webhook subscription should send the data.
   */
  private WebhookSubscriptionFormat format;

  /**
   * The list of fields to be included in the webhook subscription.
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

  public WebhookSubscriptionInput() {
  }

  /**
   * URL where the webhook subscription should send the POST request when the event occurs.
   */
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
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
   * The list of fields to be included in the webhook subscription.
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

  @Override
  public String toString() {
    return "WebhookSubscriptionInput{callbackUrl='" + callbackUrl + "', format='" + format + "', includeFields='" + includeFields + "', filter='" + filter + "', metafieldNamespaces='" + metafieldNamespaces + "', metafields='" + metafields + "'}";
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
        Objects.equals(metafieldNamespaces, that.metafieldNamespaces) &&
        Objects.equals(metafields, that.metafields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl, format, includeFields, filter, metafieldNamespaces, metafields);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * URL where the webhook subscription should send the POST request when the event occurs.
     */
    private String callbackUrl;

    /**
     * The format in which the webhook subscription should send the data.
     */
    private WebhookSubscriptionFormat format;

    /**
     * The list of fields to be included in the webhook subscription.
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

    public WebhookSubscriptionInput build() {
      WebhookSubscriptionInput result = new WebhookSubscriptionInput();
      result.callbackUrl = this.callbackUrl;
      result.format = this.format;
      result.includeFields = this.includeFields;
      result.filter = this.filter;
      result.metafieldNamespaces = this.metafieldNamespaces;
      result.metafields = this.metafields;
      return result;
    }

    /**
     * URL where the webhook subscription should send the POST request when the event occurs.
     */
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
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
     * The list of fields to be included in the webhook subscription.
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
  }
}
