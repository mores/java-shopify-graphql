package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class MarketingEventFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public MarketingEventFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingEvent"));
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppProjection<MarketingEventFragmentProjection<PARENT, ROOT>, ROOT> app() {
     AppProjection<MarketingEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new AppProjection<>(this, getRoot());
     getFields().put("app", projection);
     return projection;
  }

  public MarketingChannelProjection<MarketingEventFragmentProjection<PARENT, ROOT>, ROOT> channel(
      ) {
     MarketingChannelProjection<MarketingEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingChannelProjection<>(this, getRoot());
     getFields().put("channel", projection);
     return projection;
  }

  public MarketingChannelProjection<MarketingEventFragmentProjection<PARENT, ROOT>, ROOT> marketingChannelType(
      ) {
     MarketingChannelProjection<MarketingEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingChannelProjection<>(this, getRoot());
     getFields().put("marketingChannelType", projection);
     return projection;
  }

  public MarketingTacticProjection<MarketingEventFragmentProjection<PARENT, ROOT>, ROOT> type() {
     MarketingTacticProjection<MarketingEventFragmentProjection<PARENT, ROOT>, ROOT> projection = new MarketingTacticProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> channelHandle() {
    getFields().put("channelHandle", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> endedAt() {
    getFields().put("endedAt", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> manageUrl() {
    getFields().put("manageUrl", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> previewUrl() {
    getFields().put("previewUrl", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> remoteId() {
    getFields().put("remoteId", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> scheduledToEndAt() {
    getFields().put("scheduledToEndAt", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> sourceAndMedium() {
    getFields().put("sourceAndMedium", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> startedAt() {
    getFields().put("startedAt", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> targetTypeDisplayText() {
    getFields().put("targetTypeDisplayText", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> utmCampaign() {
    getFields().put("utmCampaign", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> utmMedium() {
    getFields().put("utmMedium", null);
    return this;
  }

  public MarketingEventFragmentProjection<PARENT, ROOT> utmSource() {
    getFields().put("utmSource", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on MarketingEvent {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
