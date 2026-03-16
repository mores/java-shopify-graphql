package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Webhook subscriptions let you receive instant notifications when important
 * events happen in a merchant's store, so you can automate workflows and keep your
 * systems in sync without constantly polling for updates.
 *
 * For example, a subscription might monitor `orders/create` events and send JSON
 * payloads to `https://yourapp.com/webhooks/orders` whenever customers place new
 * orders, enabling immediate order processing workflows.
 *
 * Use the `WebhookSubscription` object to:
 * - Monitor active webhook configurations
 * - Access subscription details like topics, endpoints, and filtering rules
 * - Retrieve creation and update timestamps for audit purposes
 * - Review API versions and format settings
 * - Examine metafield namespace configurations for extended data access
 *
 * Each subscription includes comprehensive configuration details such as the
 * specific Shopify events being monitored, the destination endpoint (HTTP,
 * EventBridge, or Pub/Sub), event filtering criteria, and payload customization
 * settings. The subscription tracks its creation and modification history.
 *
 * Subscriptions can include advanced features like Shopify search syntax for event filtering to control
 * which events trigger notifications, specific field inclusion rules to control which fields are included
 * in the webhook payload, and metafield namespace access to capture custom store data. The API version
 * is inherited from the app that created the webhook subscription.
 *
 * The endpoint configuration varies by type - HTTP subscriptions include callback
 * URLs, EventBridge subscriptions reference AWS ARNs, and Pub/Sub subscriptions
 * specify Google Cloud project and topic details. This flexibility allows apps to
 * integrate webhooks with their preferred infrastructure and event processing systems.
 *
 * Learn more about [webhook subscription management](https://shopify.dev/docs/apps/webhooks).
 */
public class WebhookSubscriptionMetafieldIdentifier {
  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  private String key;

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  private String namespace;

  public WebhookSubscriptionMetafieldIdentifier() {
  }

  /**
   * The unique identifier for the metafield definition within its namespace.
   */
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  /**
   * The container for a group of metafields that the metafield definition is associated with.
   */
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  @Override
  public String toString() {
    return "WebhookSubscriptionMetafieldIdentifier{key='" + key + "', namespace='" + namespace + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookSubscriptionMetafieldIdentifier that = (WebhookSubscriptionMetafieldIdentifier) o;
    return Objects.equals(key, that.key) &&
        Objects.equals(namespace, that.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, namespace);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    private String key;

    /**
     * The container for a group of metafields that the metafield definition is associated with.
     */
    private String namespace;

    public WebhookSubscriptionMetafieldIdentifier build() {
      WebhookSubscriptionMetafieldIdentifier result = new WebhookSubscriptionMetafieldIdentifier();
      result.key = this.key;
      result.namespace = this.namespace;
      return result;
    }

    /**
     * The unique identifier for the metafield definition within its namespace.
     */
    public Builder key(String key) {
      this.key = key;
      return this;
    }

    /**
     * The container for a group of metafields that the metafield definition is associated with.
     */
    public Builder namespace(String namespace) {
      this.namespace = namespace;
      return this;
    }
  }
}
