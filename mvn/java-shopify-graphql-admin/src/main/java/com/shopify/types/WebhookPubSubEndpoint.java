package com.shopify.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class WebhookPubSubEndpoint implements WebhookSubscriptionEndpoint {
  
  private String pubSubProject;

  
  private String pubSubTopic;

  public WebhookPubSubEndpoint() {
  }

  
  public String getPubSubProject() {
    return pubSubProject;
  }

  public void setPubSubProject(String pubSubProject) {
    this.pubSubProject = pubSubProject;
  }

  
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
    
    private String pubSubProject;

    
    private String pubSubTopic;

    public WebhookPubSubEndpoint build() {
      WebhookPubSubEndpoint result = new WebhookPubSubEndpoint();
      result.pubSubProject = this.pubSubProject;
      result.pubSubTopic = this.pubSubTopic;
      return result;
    }

    
    public Builder pubSubProject(String pubSubProject) {
      this.pubSubProject = pubSubProject;
      return this;
    }

    
    public Builder pubSubTopic(String pubSubTopic) {
      this.pubSubTopic = pubSubTopic;
      return this;
    }
  }
}
