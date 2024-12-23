package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MobilePlatformApplicationConnection"));
  }

  public MobilePlatformApplicationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MobilePlatformApplicationEdgeProjection<MobilePlatformApplicationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     MobilePlatformApplicationEdgeProjection<MobilePlatformApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new MobilePlatformApplicationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public MobilePlatformApplicationProjection<MobilePlatformApplicationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     MobilePlatformApplicationProjection<MobilePlatformApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new MobilePlatformApplicationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<MobilePlatformApplicationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<MobilePlatformApplicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
