package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class RefundReturnOutcomeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public RefundReturnOutcomeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("RefundReturnOutcome"));
  }

  public RefundReturnOutcomeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<RefundReturnOutcomeFragmentProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyBagProjection<RefundReturnOutcomeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public SuggestedRefundMethodProjection<RefundReturnOutcomeFragmentProjection<PARENT, ROOT>, ROOT> suggestedRefundMethods(
      ) {
     SuggestedRefundMethodProjection<RefundReturnOutcomeFragmentProjection<PARENT, ROOT>, ROOT> projection = new SuggestedRefundMethodProjection<>(this, getRoot());
     getFields().put("suggestedRefundMethods", projection);
     return projection;
  }

  public SuggestedOrderTransactionProjection<RefundReturnOutcomeFragmentProjection<PARENT, ROOT>, ROOT> suggestedTransactions(
      ) {
     SuggestedOrderTransactionProjection<RefundReturnOutcomeFragmentProjection<PARENT, ROOT>, ROOT> projection = new SuggestedOrderTransactionProjection<>(this, getRoot());
     getFields().put("suggestedTransactions", projection);
     return projection;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on RefundReturnOutcome {");
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
