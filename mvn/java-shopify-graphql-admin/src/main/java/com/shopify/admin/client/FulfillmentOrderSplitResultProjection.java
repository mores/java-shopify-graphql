package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class FulfillmentOrderSplitResultProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public FulfillmentOrderSplitResultProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("FulfillmentOrderSplitResult"));
  }

  public FulfillmentOrderSplitResultProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public FulfillmentOrderProjection<FulfillmentOrderSplitResultProjection<PARENT, ROOT>, ROOT> fulfillmentOrder(
      ) {
     FulfillmentOrderProjection<FulfillmentOrderSplitResultProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());
     getFields().put("fulfillmentOrder", projection);
     return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderSplitResultProjection<PARENT, ROOT>, ROOT> remainingFulfillmentOrder(
      ) {
     FulfillmentOrderProjection<FulfillmentOrderSplitResultProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());
     getFields().put("remainingFulfillmentOrder", projection);
     return projection;
  }

  public FulfillmentOrderProjection<FulfillmentOrderSplitResultProjection<PARENT, ROOT>, ROOT> replacementFulfillmentOrder(
      ) {
     FulfillmentOrderProjection<FulfillmentOrderSplitResultProjection<PARENT, ROOT>, ROOT> projection = new FulfillmentOrderProjection<>(this, getRoot());
     getFields().put("replacementFulfillmentOrder", projection);
     return projection;
  }
}
