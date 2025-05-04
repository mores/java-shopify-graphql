package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TransactionFeeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TransactionFeeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TransactionFee"));
  }

  public TransactionFeeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<TransactionFeeProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<TransactionFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public MoneyV2Projection<TransactionFeeProjection<PARENT, ROOT>, ROOT> flatFee() {
     MoneyV2Projection<TransactionFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("flatFee", projection);
     return projection;
  }

  public MoneyV2Projection<TransactionFeeProjection<PARENT, ROOT>, ROOT> taxAmount() {
     MoneyV2Projection<TransactionFeeProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("taxAmount", projection);
     return projection;
  }

  public TransactionFeeProjection<PARENT, ROOT> flatFeeName() {
    getFields().put("flatFeeName", null);
    return this;
  }

  public TransactionFeeProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TransactionFeeProjection<PARENT, ROOT> rate() {
    getFields().put("rate", null);
    return this;
  }

  public TransactionFeeProjection<PARENT, ROOT> rateName() {
    getFields().put("rateName", null);
    return this;
  }

  public TransactionFeeProjection<PARENT, ROOT> type() {
    getFields().put("type", null);
    return this;
  }
}
