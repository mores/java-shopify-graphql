package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationsProjectionRoot() {
    super(null, null, java.util.Optional.of("MobilePlatformApplicationConnection"));
  }

  public MobilePlatformApplicationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MobilePlatformApplicationEdgeProjection<MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    MobilePlatformApplicationEdgeProjection<MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>> projection = new MobilePlatformApplicationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public MobilePlatformApplicationProjection<MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    MobilePlatformApplicationProjection<MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>> projection = new MobilePlatformApplicationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>, MobilePlatformApplicationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
