package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingEngagementProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingEngagementProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MarketingEngagement"));
  }

  public MarketingEngagementProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<MarketingEngagementProjection<PARENT, ROOT>, ROOT> adSpend() {
     MoneyV2Projection<MarketingEngagementProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("adSpend", projection);
     return projection;
  }

  public MarketingActivityProjection<MarketingEngagementProjection<PARENT, ROOT>, ROOT> marketingActivity(
      ) {
     MarketingActivityProjection<MarketingEngagementProjection<PARENT, ROOT>, ROOT> projection = new MarketingActivityProjection<>(this, getRoot());
     getFields().put("marketingActivity", projection);
     return projection;
  }

  public MoneyV2Projection<MarketingEngagementProjection<PARENT, ROOT>, ROOT> sales() {
     MoneyV2Projection<MarketingEngagementProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("sales", projection);
     return projection;
  }

  public MarketingEngagementProjection<PARENT, ROOT> channelHandle() {
    getFields().put("channelHandle", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> clicksCount() {
    getFields().put("clicksCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> commentsCount() {
    getFields().put("commentsCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> complaintsCount() {
    getFields().put("complaintsCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> failsCount() {
    getFields().put("failsCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> favoritesCount() {
    getFields().put("favoritesCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> firstTimeCustomers() {
    getFields().put("firstTimeCustomers", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> impressionsCount() {
    getFields().put("impressionsCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> isCumulative() {
    getFields().put("isCumulative", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> occurredOn() {
    getFields().put("occurredOn", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> orders() {
    getFields().put("orders", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> returningCustomers() {
    getFields().put("returningCustomers", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> sendsCount() {
    getFields().put("sendsCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> sessionsCount() {
    getFields().put("sessionsCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> sharesCount() {
    getFields().put("sharesCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> uniqueClicksCount() {
    getFields().put("uniqueClicksCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> uniqueViewsCount() {
    getFields().put("uniqueViewsCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> unsubscribesCount() {
    getFields().put("unsubscribesCount", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> utcOffset() {
    getFields().put("utcOffset", null);
    return this;
  }

  public MarketingEngagementProjection<PARENT, ROOT> viewsCount() {
    getFields().put("viewsCount", null);
    return this;
  }
}
