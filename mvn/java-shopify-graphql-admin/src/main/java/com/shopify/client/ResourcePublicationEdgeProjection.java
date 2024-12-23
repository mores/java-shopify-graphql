package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ResourcePublicationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ResourcePublicationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ResourcePublicationEdge"));
  }

  public ResourcePublicationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ResourcePublicationProjection<ResourcePublicationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     ResourcePublicationProjection<ResourcePublicationEdgeProjection<PARENT, ROOT>, ROOT> projection = new ResourcePublicationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public ResourcePublicationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
