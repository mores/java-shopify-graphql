package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An HTTPS endpoint that receives webhook events as POST requests, letting your
 * app respond to Shopify events in real-time. This is the most common webhook
 * endpoint type, allowing apps to process Shopify events through standard HTTP callbacks.
 *
 * For example, when setting up order notifications, your app would provide an
 * HTTPS URL like `https://yourapp.com/webhooks/orders/create` to receive order
 * creation events as JSON payloads.
 *
 * HTTP endpoints offer straightforward webhook integration with immediate event
 * delivery, making them suitable for apps that need real-time notifications
 * without complex infrastructure requirements.
 *
 * Learn more about [HTTP webhook configuration](https://shopify.dev/docs/apps/build/webhooks/subscribe/https).
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebhookHttpEndpoint implements WebhookSubscriptionEndpoint {
  /**
   * The URL to which the webhooks events are sent.
   */
  private String callbackUrl;

  public WebhookHttpEndpoint() {
  }

  /**
   * The URL to which the webhooks events are sent.
   */
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  @Override
  public String toString() {
    return "WebhookHttpEndpoint{callbackUrl='" + callbackUrl + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookHttpEndpoint that = (WebhookHttpEndpoint) o;
    return Objects.equals(callbackUrl, that.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrl);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The URL to which the webhooks events are sent.
     */
    private String callbackUrl;

    public WebhookHttpEndpoint build() {
      WebhookHttpEndpoint result = new WebhookHttpEndpoint();
      result.callbackUrl = this.callbackUrl;
      return result;
    }

    /**
     * The URL to which the webhooks events are sent.
     */
    public Builder callbackUrl(String callbackUrl) {
      this.callbackUrl = callbackUrl;
      return this;
    }
  }
}
