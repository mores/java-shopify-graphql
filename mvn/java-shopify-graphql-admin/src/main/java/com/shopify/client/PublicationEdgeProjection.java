package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PublicationEdge"));
  }

  public PublicationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicationProjection<PublicationEdgeProjection<PARENT, ROOT>, ROOT> node() {
     PublicationProjection<PublicationEdgeProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public PublicationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
