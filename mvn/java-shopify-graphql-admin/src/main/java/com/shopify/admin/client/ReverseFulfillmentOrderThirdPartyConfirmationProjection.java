package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReverseFulfillmentOrderThirdPartyConfirmationProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReverseFulfillmentOrderThirdPartyConfirmationProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReverseFulfillmentOrderThirdPartyConfirmation"));
  }

  public ReverseFulfillmentOrderThirdPartyConfirmationProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReverseFulfillmentOrderThirdPartyConfirmationStatusProjection<ReverseFulfillmentOrderThirdPartyConfirmationProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ReverseFulfillmentOrderThirdPartyConfirmationStatusProjection<ReverseFulfillmentOrderThirdPartyConfirmationProjection<PARENT, ROOT>, ROOT> projection = new ReverseFulfillmentOrderThirdPartyConfirmationStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }
}
