package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class TenderTransactionsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public TenderTransactionsProjectionRoot() {
    super(null, null, java.util.Optional.of("TenderTransactionConnection"));
  }

  public TenderTransactionsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public TenderTransactionEdgeProjection<TenderTransactionsProjectionRoot<PARENT, ROOT>, TenderTransactionsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    TenderTransactionEdgeProjection<TenderTransactionsProjectionRoot<PARENT, ROOT>, TenderTransactionsProjectionRoot<PARENT, ROOT>> projection = new TenderTransactionEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public TenderTransactionProjection<TenderTransactionsProjectionRoot<PARENT, ROOT>, TenderTransactionsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    TenderTransactionProjection<TenderTransactionsProjectionRoot<PARENT, ROOT>, TenderTransactionsProjectionRoot<PARENT, ROOT>> projection = new TenderTransactionProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<TenderTransactionsProjectionRoot<PARENT, ROOT>, TenderTransactionsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<TenderTransactionsProjectionRoot<PARENT, ROOT>, TenderTransactionsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
