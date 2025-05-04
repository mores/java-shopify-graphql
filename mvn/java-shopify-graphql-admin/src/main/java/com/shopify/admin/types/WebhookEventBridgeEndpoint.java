package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * An Amazon EventBridge partner event source to which webhook subscriptions publish events.
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
