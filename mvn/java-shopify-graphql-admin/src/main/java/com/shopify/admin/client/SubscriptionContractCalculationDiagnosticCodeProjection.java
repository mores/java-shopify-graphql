package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractCalculationDiagnosticCodeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractCalculationDiagnosticCodeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationDiagnosticCode"));
  }

  public SubscriptionContractCalculationDiagnosticCodeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }
}
