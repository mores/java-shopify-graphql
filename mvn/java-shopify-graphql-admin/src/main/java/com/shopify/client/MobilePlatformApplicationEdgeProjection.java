package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class MobilePlatformApplicationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public MobilePlatformApplicationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("MobilePlatformApplicationEdge"));
  }

  public MobilePlatformApplicationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MobilePlatformApplicationProjection<MobilePlatformApplicationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     MobilePlatformApplicationProjection<MobilePlatformApplicationEdgeProjection<PARENT, ROOT>, ROOT> projection = new MobilePlatformApplicationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public MobilePlatformApplicationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
