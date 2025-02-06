package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An HTTPS endpoint to which webhook subscriptions send POST requests.
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
