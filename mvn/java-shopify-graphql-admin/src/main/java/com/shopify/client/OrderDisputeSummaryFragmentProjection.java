package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class OrderDisputeSummaryFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public OrderDisputeSummaryFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("OrderDisputeSummary"));
  }

  public OrderDisputeSummaryFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public DisputeTypeProjection<OrderDisputeSummaryFragmentProjection<PARENT, ROOT>, ROOT> initiatedAs(
      ) {
     DisputeTypeProjection<OrderDisputeSummaryFragmentProjection<PARENT, ROOT>, ROOT> projection = new DisputeTypeProjection<>(this, getRoot());
     getFields().put("initiatedAs", projection);
     return projection;
  }

  public DisputeStatusProjection<OrderDisputeSummaryFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     DisputeStatusProjection<OrderDisputeSummaryFragmentProjection<PARENT, ROOT>, ROOT> projection = new DisputeStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public OrderDisputeSummaryFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on OrderDisputeSummary {");
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
