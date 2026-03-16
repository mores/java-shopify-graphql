package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Connects your app to Amazon EventBridge so you can receive Shopify webhook
 * events and process them through AWS's event-driven architecture. This gives you
 * enterprise-grade scalability and lets you tap into the full AWS ecosystem for
 * handling webhook traffic.
 *
 * For example, when a customer places an order, Shopify can publish the order
 * creation event directly to your EventBridge partner source, allowing your AWS
 * infrastructure to process the event through Lambda functions, SQS queues, or
 * other AWS services.
 *
 * EventBridge endpoints provide enterprise-grade event routing and processing
 * capabilities, making them ideal for apps that need to handle high-volume webhook
 * traffic or integrate deeply with AWS services.
 *
 * Learn more about [webhook endpoints](https://shopify.dev/docs/apps/build/webhooks/subscribe/get-started).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebhookEventBridgeEndpoint implements WebhookSubscriptionEndpoint {
  /**
   * The ARN of this EventBridge partner event source.
   */
  private String arn;

  public WebhookEventBridgeEndpoint() {
  }

  /**
   * The ARN of this EventBridge partner event source.
   */
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  @Override
  public String toString() {
    return "WebhookEventBridgeEndpoint{arn='" + arn + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookEventBridgeEndpoint that = (WebhookEventBridgeEndpoint) o;
    return Objects.equals(arn, that.arn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The ARN of this EventBridge partner event source.
     */
    private String arn;

    public WebhookEventBridgeEndpoint build() {
      WebhookEventBridgeEndpoint result = new WebhookEventBridgeEndpoint();
      result.arn = this.arn;
      return result;
    }

    /**
     * The ARN of this EventBridge partner event source.
     */
    public Builder arn(String arn) {
      this.arn = arn;
      return this;
    }
  }
}
