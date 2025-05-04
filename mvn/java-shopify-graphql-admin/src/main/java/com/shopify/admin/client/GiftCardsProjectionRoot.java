package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class GiftCardsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public GiftCardsProjectionRoot() {
    super(null, null, java.util.Optional.of("GiftCardConnection"));
  }

  public GiftCardsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public GiftCardEdgeProjection<GiftCardsProjectionRoot<PARENT, ROOT>, GiftCardsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    GiftCardEdgeProjection<GiftCardsProjectionRoot<PARENT, ROOT>, GiftCardsProjectionRoot<PARENT, ROOT>> projection = new GiftCardEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public GiftCardProjection<GiftCardsProjectionRoot<PARENT, ROOT>, GiftCardsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    GiftCardProjection<GiftCardsProjectionRoot<PARENT, ROOT>, GiftCardsProjectionRoot<PARENT, ROOT>> projection = new GiftCardProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<GiftCardsProjectionRoot<PARENT, ROOT>, GiftCardsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<GiftCardsProjectionRoot<PARENT, ROOT>, GiftCardsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
