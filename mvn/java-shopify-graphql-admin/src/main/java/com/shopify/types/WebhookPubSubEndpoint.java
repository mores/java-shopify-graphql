package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * A Google Cloud Pub/Sub topic to which webhook subscriptions publish events.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebhookPubSubEndpoint implements WebhookSubscriptionEndpoint {
  /**
   * The Google Cloud Pub/Sub project ID.
   */
  private String pubSubProject;

  /**
   * The Google Cloud Pub/Sub topic ID.
   */
  private String pubSubTopic;

  public WebhookPubSubEndpoint() {
  }

  /**
   * The Google Cloud Pub/Sub project ID.
   */
  public String getPubSubProject() {
    return pubSubProject;
  }

  public void setPubSubProject(String pubSubProject) {
    this.pubSubProject = pubSubProject;
  }

  /**
   * The Google Cloud Pub/Sub topic ID.
   */
  public String getPubSubTopic() {
    return pubSubTopic;
  }

  public void setPubSubTopic(String pubSubTopic) {
    this.pubSubTopic = pubSubTopic;
  }

  @Override
  public String toString() {
    return "WebhookPubSubEndpoint{pubSubProject='" + pubSubProject + "', pubSubTopic='" + pubSubTopic + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookPubSubEndpoint that = (WebhookPubSubEndpoint) o;
    return Objects.equals(pubSubProject, that.pubSubProject) &&
        Objects.equals(pubSubTopic, that.pubSubTopic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pubSubProject, pubSubTopic);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The Google Cloud Pub/Sub project ID.
     */
    private String pubSubProject;

    /**
     * The Google Cloud Pub/Sub topic ID.
     */
    private String pubSubTopic;

    public WebhookPubSubEndpoint build() {
      WebhookPubSubEndpoint result = new WebhookPubSubEndpoint();
      result.pubSubProject = this.pubSubProject;
      result.pubSubTopic = this.pubSubTopic;
      return result;
    }

    /**
     * The Google Cloud Pub/Sub project ID.
     */
    public Builder pubSubProject(String pubSubProject) {
      this.pubSubProject = pubSubProject;
      return this;
    }

    /**
     * The Google Cloud Pub/Sub topic ID.
     */
    public Builder pubSubTopic(String pubSubTopic) {
      this.pubSubTopic = pubSubTopic;
      return this;
    }
  }
}
