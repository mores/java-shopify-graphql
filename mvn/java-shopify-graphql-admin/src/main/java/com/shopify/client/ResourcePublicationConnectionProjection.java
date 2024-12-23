package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourcePublicationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourcePublicationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourcePublicationConnection"));
  }

  public ResourcePublicationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourcePublicationEdgeProjection<ResourcePublicationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ResourcePublicationEdgeProjection<ResourcePublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ResourcePublicationProjection<ResourcePublicationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ResourcePublicationProjection<ResourcePublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ResourcePublicationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ResourcePublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
