package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseFulfillmentOrderDispositionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderDispositionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderDisposition"));
  }

  public ReverseFulfillmentOrderDispositionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public LocationProjection<ReverseFulfillmentOrderDispositionProjection<PARENT, ROOT>, ROOT> location(
      ) {
     LocationProjection<ReverseFulfillmentOrderDispositionProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public ReverseFulfillmentOrderDispositionTypeProjection<ReverseFulfillmentOrderDispositionProjection<PARENT, ROOT>, ROOT> type(
      ) {
     ReverseFulfillmentOrderDispositionTypeProjection<ReverseFulfillmentOrderDispositionProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderDispositionTypeProjection<>(this, getRoot());
     getFields().put("type", projection);
     return projection;
  }

  public ReverseFulfillmentOrderDispositionProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ReverseFulfillmentOrderDispositionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReverseFulfillmentOrderDispositionProjection<PARENT, ROOT> quantity() {
    getFields().put("quantity", null);
    return this;
  }
}
