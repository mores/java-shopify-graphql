package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CollectionPublicationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CollectionPublicationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CollectionPublicationConnection"));
  }

  public CollectionPublicationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CollectionPublicationEdgeProjection<CollectionPublicationConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CollectionPublicationEdgeProjection<CollectionPublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionPublicationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CollectionPublicationProjection<CollectionPublicationConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CollectionPublicationProjection<CollectionPublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new CollectionPublicationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CollectionPublicationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CollectionPublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
