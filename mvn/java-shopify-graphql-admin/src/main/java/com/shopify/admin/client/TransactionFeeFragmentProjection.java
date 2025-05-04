package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class TransactionFeeFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public TransactionFeeFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TransactionFee"));
  }

  public TransactionFeeFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<TransactionFeeFragmentProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<TransactionFeeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<TransactionFeeFragmentProjection<PARENT, ROOT>, ROOT> flatFee() {
     MoneyV2Projection<TransactionFeeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("flatFee", projection);
     return projection;
  }

  public MoneyV2Projection<TransactionFeeFragmentProjection<PARENT, ROOT>, ROOT> taxAmount() {
     MoneyV2Projection<TransactionFeeFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("taxAmount", projection);
     return projection;
  }

  public TransactionFeeFragmentProjection<PARENT, ROOT> flatFeeName() {
    getFields().put("flatFeeName", null);
    return this;
  }

  public TransactionFeeFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TransactionFeeFragmentProjection<PARENT, ROOT> rate() {
    getFields().put("rate", null);
    return this;
  }

  public TransactionFeeFragmentProjection<PARENT, ROOT> rateName() {
    getFields().put("rateName", null);
    return this;
  }

  public TransactionFeeFragmentProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on TransactionFee {");
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
