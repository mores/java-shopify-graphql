package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MarketingActivitiesDeleteAllExternalProjectionRoot() {
    super(null, null, java.util.Optional.of("MarketingActivitiesDeleteAllExternalPayload"));
  }

  public MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public JobProjection<MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT>, MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT>> job(
      ) {
    JobProjection<MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT>, MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT>> projection = new JobProjection<>(this, this);    
    getFields().put("job", projection);
    return projection;
  }

  public MarketingActivityUserErrorProjection<MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT>, MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    MarketingActivityUserErrorProjection<MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT>, MarketingActivitiesDeleteAllExternalProjectionRoot<PARENT, ROOT>> projection = new MarketingActivityUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
