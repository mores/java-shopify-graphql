package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TenderTransactionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TenderTransactionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TenderTransaction"));
  }

  public TenderTransactionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<TenderTransactionProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<TenderTransactionProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public OrderProjection<TenderTransactionProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<TenderTransactionProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public TenderTransactionDetailsProjection<TenderTransactionProjection<PARENT, ROOT>, ROOT> transactionDetails(
      ) {
     TenderTransactionDetailsProjection<TenderTransactionProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionDetailsProjection<>(this, getRoot());
     getFields().put("transactionDetails", projection);
     return projection;
  }

  public StaffMemberProjection<TenderTransactionProjection<PARENT, ROOT>, ROOT> user() {
     StaffMemberProjection<TenderTransactionProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("user", projection);
     return projection;
  }

  public TenderTransactionProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TenderTransactionProjection<PARENT, ROOT> paymentMethod() {
    getFields().put("paymentMethod", null);
    return this;
  }

  public TenderTransactionProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public TenderTransactionProjection<PARENT, ROOT> remoteReference() {
    getFields().put("remoteReference", null);
    return this;
  }

  public TenderTransactionProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }
}
