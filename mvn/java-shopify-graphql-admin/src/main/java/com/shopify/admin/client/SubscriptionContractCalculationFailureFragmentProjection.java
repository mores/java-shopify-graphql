package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SubscriptionContractCalculationFailureFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SubscriptionContractCalculationFailureFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SubscriptionContractCalculationFailure"));
  }

  public SubscriptionContractCalculationFailureFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractCalculationDiagnosticProjection<SubscriptionContractCalculationFailureFragmentProjection<PARENT, ROOT>, ROOT> errors(
      ) {
     SubscriptionContractCalculationDiagnosticProjection<SubscriptionContractCalculationFailureFragmentProjection<PARENT, ROOT>, ROOT> projection = new SubscriptionContractCalculationDiagnosticProjection<>(this, getRoot());
     getFields().put("errors", projection);
     return projection;
  }

  public SubscriptionContractCalculationFailureFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SubscriptionContractCalculationFailure {");
    getFields().forEach((k, v) -> {
        builder.append(" ").append(k);
        if(v != null) {
            builder.append(" ").append(v.toString());
        }
    });
    builder.append("}");
     
    return builder.toString();
  }
}
