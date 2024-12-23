package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnableFulfillmentsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnableFulfillmentsProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnableFulfillmentConnection"));
  }

  public ReturnableFulfillmentsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnableFulfillmentEdgeProjection<ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ReturnableFulfillmentEdgeProjection<ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>> projection = new ReturnableFulfillmentEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ReturnableFulfillmentProjection<ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ReturnableFulfillmentProjection<ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>> projection = new ReturnableFulfillmentProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>, ReturnableFulfillmentsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
