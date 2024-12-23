package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PublicationsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PublicationsProjectionRoot() {
    super(null, null, java.util.Optional.of("PublicationConnection"));
  }

  public PublicationsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PublicationEdgeProjection<PublicationsProjectionRoot<PARENT, ROOT>, PublicationsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    PublicationEdgeProjection<PublicationsProjectionRoot<PARENT, ROOT>, PublicationsProjectionRoot<PARENT, ROOT>> projection = new PublicationEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PublicationProjection<PublicationsProjectionRoot<PARENT, ROOT>, PublicationsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    PublicationProjection<PublicationsProjectionRoot<PARENT, ROOT>, PublicationsProjectionRoot<PARENT, ROOT>> projection = new PublicationProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<PublicationsProjectionRoot<PARENT, ROOT>, PublicationsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<PublicationsProjectionRoot<PARENT, ROOT>, PublicationsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
