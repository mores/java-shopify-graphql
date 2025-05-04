package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourcePublicationV2ConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourcePublicationV2ConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourcePublicationV2Connection"));
  }

  public ResourcePublicationV2ConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourcePublicationV2EdgeProjection<ResourcePublicationV2ConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ResourcePublicationV2EdgeProjection<ResourcePublicationV2ConnectionProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2EdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ResourcePublicationV2Projection<ResourcePublicationV2ConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ResourcePublicationV2Projection<ResourcePublicationV2ConnectionProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationV2Projection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ResourcePublicationV2ConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ResourcePublicationV2ConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
