package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class AbandonedCheckoutsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public AbandonedCheckoutsProjectionRoot() {
    super(null, null, java.util.Optional.of("AbandonedCheckoutConnection"));
  }

  public AbandonedCheckoutsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public AbandonedCheckoutEdgeProjection<AbandonedCheckoutsProjectionRoot<PARENT, ROOT>, AbandonedCheckoutsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    AbandonedCheckoutEdgeProjection<AbandonedCheckoutsProjectionRoot<PARENT, ROOT>, AbandonedCheckoutsProjectionRoot<PARENT, ROOT>> projection = new AbandonedCheckoutEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public AbandonedCheckoutProjection<AbandonedCheckoutsProjectionRoot<PARENT, ROOT>, AbandonedCheckoutsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    AbandonedCheckoutProjection<AbandonedCheckoutsProjectionRoot<PARENT, ROOT>, AbandonedCheckoutsProjectionRoot<PARENT, ROOT>> projection = new AbandonedCheckoutProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<AbandonedCheckoutsProjectionRoot<PARENT, ROOT>, AbandonedCheckoutsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<AbandonedCheckoutsProjectionRoot<PARENT, ROOT>, AbandonedCheckoutsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
