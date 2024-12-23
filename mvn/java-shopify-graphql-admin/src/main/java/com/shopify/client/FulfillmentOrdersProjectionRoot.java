package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrdersProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrdersProjectionRoot() {
    super(null, null, java.util.Optional.of("FulfillmentOrderConnection"));
  }

  public FulfillmentOrdersProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderEdgeProjection<FulfillmentOrdersProjectionRoot<PARENT, ROOT>, FulfillmentOrdersProjectionRoot<PARENT, ROOT>> edges(
      ) {
    FulfillmentOrderEdgeProjection<FulfillmentOrdersProjectionRoot<PARENT, ROOT>, FulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrdersProjectionRoot<PARENT, ROOT>, FulfillmentOrdersProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    FulfillmentOrderProjection<FulfillmentOrdersProjectionRoot<PARENT, ROOT>, FulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new FulfillmentOrderProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<FulfillmentOrdersProjectionRoot<PARENT, ROOT>, FulfillmentOrdersProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<FulfillmentOrdersProjectionRoot<PARENT, ROOT>, FulfillmentOrdersProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
