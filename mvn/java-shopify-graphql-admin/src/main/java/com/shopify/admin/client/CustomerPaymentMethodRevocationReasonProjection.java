package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CustomerPaymentMethodRevocationReasonProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CustomerPaymentMethodRevocationReasonProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CustomerPaymentMethodRevocationReason"));
  }

  public CustomerPaymentMethodRevocationReasonProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
