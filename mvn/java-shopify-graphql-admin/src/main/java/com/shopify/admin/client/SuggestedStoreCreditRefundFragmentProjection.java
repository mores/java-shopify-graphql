package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class SuggestedStoreCreditRefundFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public SuggestedStoreCreditRefundFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SuggestedStoreCreditRefund"));
  }

  public SuggestedStoreCreditRefundFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyBagProjection<SuggestedStoreCreditRefundFragmentProjection<PARENT, ROOT>, ROOT> amount(
      ) {
     MoneyBagProjection<SuggestedStoreCreditRefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyBagProjection<SuggestedStoreCreditRefundFragmentProjection<PARENT, ROOT>, ROOT> maximumRefundable(
      ) {
     MoneyBagProjection<SuggestedStoreCreditRefundFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("maximumRefundable", projection);
     return projection;
  }

  public SuggestedStoreCreditRefundFragmentProjection<PARENT, ROOT> expiresAt() {
    getFields().put("expiresAt", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on SuggestedStoreCreditRefund {");
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
