package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingEventProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingEventProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingEvent"));
  }

  public MarketingEventProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<MarketingEventProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<MarketingEventProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public MarketingChannelProjection<MarketingEventProjection<PARENT, ROOT>, ROOT> channel() {
     MarketingChannelProjection<MarketingEventProjection<PARENT, ROOT>, ROOT> projection = new MarketingChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public MarketingChannelProjection<MarketingEventProjection<PARENT, ROOT>, ROOT> marketingChannelType(
      ) {
     MarketingChannelProjection<MarketingEventProjection<PARENT, ROOT>, ROOT> projection = new MarketingChannelProjection<>(this, getRoot());
     getFields().put("marketingChannelType", projection);
     return projection;
  }

  public MarketingTacticProjection<MarketingEventProjection<PARENT, ROOT>, ROOT> type() {
     MarketingTacticProjection<MarketingEventProjection<PARENT, ROOT>, ROOT> projection = new MarketingTacticProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MarketingEventProjection<PARENT, ROOT> channelHandle() {
    getFields().put("channelHandle", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> endedAt() {
    getFields().put("endedAt", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> manageUrl() {
    getFields().put("manageUrl", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> previewUrl() {
    getFields().put("previewUrl", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> remoteId() {
    getFields().put("remoteId", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> scheduledToEndAt() {
    getFields().put("scheduledToEndAt", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> sourceAndMedium() {
    getFields().put("sourceAndMedium", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> startedAt() {
    getFields().put("startedAt", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> targetTypeDisplayText() {
    getFields().put("targetTypeDisplayText", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> utmCampaign() {
    getFields().put("utmCampaign", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> utmMedium() {
    getFields().put("utmMedium", null);
    return this;
  }

  public MarketingEventProjection<PARENT, ROOT> utmSource() {
    getFields().put("utmSource", null);
    return this;
  }
}
