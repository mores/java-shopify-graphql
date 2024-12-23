package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class PriceListsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public PriceListsProjectionRoot() {
    super(null, null, java.util.Optional.of("PriceListConnection"));
  }

  public PriceListsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public PriceListEdgeProjection<PriceListsProjectionRoot<PARENT, ROOT>, PriceListsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    PriceListEdgeProjection<PriceListsProjectionRoot<PARENT, ROOT>, PriceListsProjectionRoot<PARENT, ROOT>> projection = new PriceListEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public PriceListProjection<PriceListsProjectionRoot<PARENT, ROOT>, PriceListsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    PriceListProjection<PriceListsProjectionRoot<PARENT, ROOT>, PriceListsProjectionRoot<PARENT, ROOT>> projection = new PriceListProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<PriceListsProjectionRoot<PARENT, ROOT>, PriceListsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<PriceListsProjectionRoot<PARENT, ROOT>, PriceListsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
