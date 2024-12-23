package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionPublicationEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionPublicationEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionPublicationEdge"));
  }

  public CollectionPublicationEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionPublicationProjection<CollectionPublicationEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CollectionPublicationProjection<CollectionPublicationEdgeProjection<PARENT, ROOT>, ROOT> projection = new CollectionPublicationProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CollectionPublicationEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
