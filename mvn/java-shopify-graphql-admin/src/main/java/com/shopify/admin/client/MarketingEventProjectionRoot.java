package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingEventProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingEventProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingEvent"));
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<MarketingEventProjectionRoot<PARENT, ROOT>, MarketingEventProjectionRoot<PARENT, ROOT>> app(
      ) {
    AppProjection<MarketingEventProjectionRoot<PARENT, ROOT>, MarketingEventProjectionRoot<PARENT, ROOT>> projection = new AppProjection<>(this, this);    
    getFields().put("app", projection);
    return projection;
  }

  public MarketingChannelProjection<MarketingEventProjectionRoot<PARENT, ROOT>, MarketingEventProjectionRoot<PARENT, ROOT>> channel(
      ) {
    MarketingChannelProjection<MarketingEventProjectionRoot<PARENT, ROOT>, MarketingEventProjectionRoot<PARENT, ROOT>> projection = new MarketingChannelProjection<>(this, this);    
    getFields().put("channel", projection);
    return projection;
  }

  public MarketingChannelProjection<MarketingEventProjectionRoot<PARENT, ROOT>, MarketingEventProjectionRoot<PARENT, ROOT>> marketingChannelType(
      ) {
    MarketingChannelProjection<MarketingEventProjectionRoot<PARENT, ROOT>, MarketingEventProjectionRoot<PARENT, ROOT>> projection = new MarketingChannelProjection<>(this, this);    
    getFields().put("marketingChannelType", projection);
    return projection;
  }

  public MarketingTacticProjection<MarketingEventProjectionRoot<PARENT, ROOT>, MarketingEventProjectionRoot<PARENT, ROOT>> type(
      ) {
    MarketingTacticProjection<MarketingEventProjectionRoot<PARENT, ROOT>, MarketingEventProjectionRoot<PARENT, ROOT>> projection = new MarketingTacticProjection<>(this, this);    
    getFields().put("type", projection);
    return projection;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> channelHandle() {
    getFields().put("channelHandle", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> endedAt() {
    getFields().put("endedAt", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> manageUrl() {
    getFields().put("manageUrl", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> previewUrl() {
    getFields().put("previewUrl", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> remoteId() {
    getFields().put("remoteId", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> scheduledToEndAt() {
    getFields().put("scheduledToEndAt", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> sourceAndMedium() {
    getFields().put("sourceAndMedium", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> startedAt() {
    getFields().put("startedAt", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> targetTypeDisplayText() {
    getFields().put("targetTypeDisplayText", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> utmCampaign() {
    getFields().put("utmCampaign", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> utmMedium() {
    getFields().put("utmMedium", null);
    return this;
  }

  public MarketingEventProjectionRoot<PARENT, ROOT> utmSource() {
    getFields().put("utmSource", null);
    return this;
  }
}
