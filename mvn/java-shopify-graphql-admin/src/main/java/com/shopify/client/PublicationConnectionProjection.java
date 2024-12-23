package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("PublicationConnection"));
  }

  public PublicationConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicationEdgeProjection<PublicationConnectionProjection<PARENT, ROOT>, ROOT> edges() {
     PublicationEdgeProjection<PublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PublicationEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public PublicationProjection<PublicationConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     PublicationProjection<PublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PublicationProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<PublicationConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<PublicationConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
