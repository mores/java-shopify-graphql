package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AppUsageRecordCreateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AppUsageRecordCreateProjectionRoot() {
    super(null, null, java.util.Optional.of("AppUsageRecordCreatePayload"));
  }

  public AppUsageRecordCreateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AppUsageRecordProjection<AppUsageRecordCreateProjectionRoot<PARENT, ROOT>, AppUsageRecordCreateProjectionRoot<PARENT, ROOT>> appUsageRecord(
      ) {
    AppUsageRecordProjection<AppUsageRecordCreateProjectionRoot<PARENT, ROOT>, AppUsageRecordCreateProjectionRoot<PARENT, ROOT>> projection = new AppUsageRecordProjection<>(this, this);    
    getFields().put("appUsageRecord", projection);
    return projection;
  }

  public UserErrorProjection<AppUsageRecordCreateProjectionRoot<PARENT, ROOT>, AppUsageRecordCreateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    UserErrorProjection<AppUsageRecordCreateProjectionRoot<PARENT, ROOT>, AppUsageRecordCreateProjectionRoot<PARENT, ROOT>> projection = new UserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }
}
