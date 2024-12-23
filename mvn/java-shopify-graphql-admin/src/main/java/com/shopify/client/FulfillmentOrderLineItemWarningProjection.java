package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderLineItemWarningProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderLineItemWarningProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderLineItemWarning"));
  }

  public FulfillmentOrderLineItemWarningProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderLineItemWarningProjection<PARENT, ROOT> description() {
    getFields().put("description", null);
    return this;
  }

  public FulfillmentOrderLineItemWarningProjection<PARENT, ROOT> title() {
    getFields().put("title", null);
    return this;
  }
}
