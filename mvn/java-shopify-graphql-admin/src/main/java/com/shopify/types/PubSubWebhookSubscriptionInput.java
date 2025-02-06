package com.shopify.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * The input fields for a PubSub webhook subscription.
 */
public class PubSubWebhookSubscriptionInput {
  /**
   * The Pub/Sub project ID.
   */
  private String pubSubProject;

  /**
   * The Pub/Sub topic ID.
   */
  private String pubSubTopic;

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

  public PubSubWebhookSubscriptionInput() {
  }

  /**
   * The Pub/Sub project ID.
   */
  public String getPubSubProject() {
    return pubSubProject;
  }

  public void setPubSubProject(String pubSubProject) {
    this.pubSubProject = pubSubProject;
  }

  /**
   * The Pub/Sub topic ID.
   */
  public String getPubSubTopic() {
    return pubSubTopic;
  }

  public void setPubSubTopic(String pubSubTopic) {
    this.pubSubTopic = pubSubTopic;
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

  @Override
  public String toString() {
    return "PubSubWebhookSubscriptionInput{pubSubProject='" + pubSubProject + "', pubSubTopic='" + pubSubTopic + "', format='" + format + "', includeFields='" + includeFields + "', filter='" + filter + "', metafieldNamespaces='" + metafieldNamespaces + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PubSubWebhookSubscriptionInput that = (PubSubWebhookSubscriptionInput) o;
    return Objects.equals(pubSubProject, that.pubSubProject) &&
        Objects.equals(pubSubTopic, that.pubSubTopic) &&
        Objects.equals(format, that.format) &&
        Objects.equals(includeFields, that.includeFields) &&
        Objects.equals(filter, that.filter) &&
        Objects.equals(metafieldNamespaces, that.metafieldNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pubSubProject, pubSubTopic, format, includeFields, filter, metafieldNamespaces);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Pub/Sub project ID.
     */
    private String pubSubProject;

    /**
     * The Pub/Sub topic ID.
     */
    private String pubSubTopic;

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

    public PubSubWebhookSubscriptionInput build() {
      PubSubWebhookSubscriptionInput result = new PubSubWebhookSubscriptionInput();
      result.pubSubProject = this.pubSubProject;
      result.pubSubTopic = this.pubSubTopic;
      result.format = this.format;
      result.includeFields = this.includeFields;
      result.filter = this.filter;
      result.metafieldNamespaces = this.metafieldNamespaces;
      return result;
    }

    /**
     * The Pub/Sub project ID.
     */
    public Builder pubSubProject(String pubSubProject) {
      this.pubSubProject = pubSubProject;
      return this;
    }

    /**
     * The Pub/Sub topic ID.
     */
    public Builder pubSubTopic(String pubSubTopic) {
      this.pubSubTopic = pubSubTopic;
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
  }
}
