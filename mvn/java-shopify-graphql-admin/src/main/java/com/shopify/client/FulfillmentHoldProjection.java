package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentHoldProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentHoldProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentHold"));
  }

  public FulfillmentHoldProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentHoldReasonProjection<FulfillmentHoldProjection<PARENT, ROOT>, ROOT> reason() {
     FulfillmentHoldReasonProjection<FulfillmentHoldProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentHoldReasonProjection<>(this, getRoot());
     getFields().put("reason", projection);
     return projection;
  }

  public FulfillmentHoldProjection<PARENT, ROOT> displayReason() {
    getFields().put("displayReason", null);
    return this;
  }

  public FulfillmentHoldProjection<PARENT, ROOT> heldBy() {
    getFields().put("heldBy", null);
    return this;
  }

  public FulfillmentHoldProjection<PARENT, ROOT> heldByRequestingApp() {
    getFields().put("heldByRequestingApp", null);
    return this;
  }

  public FulfillmentHoldProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public FulfillmentHoldProjection<PARENT, ROOT> reasonNotes() {
    getFields().put("reasonNotes", null);
    return this;
  }
}
