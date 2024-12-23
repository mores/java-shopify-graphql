package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnableFulfillmentLineItemConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnableFulfillmentLineItemConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnableFulfillmentLineItemConnection"));
  }

  public ReturnableFulfillmentLineItemConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnableFulfillmentLineItemEdgeProjection<ReturnableFulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     ReturnableFulfillmentLineItemEdgeProjection<ReturnableFulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentLineItemEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public ReturnableFulfillmentLineItemProjection<ReturnableFulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     ReturnableFulfillmentLineItemProjection<ReturnableFulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new ReturnableFulfillmentLineItemProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<ReturnableFulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<ReturnableFulfillmentLineItemConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
