package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class TenderTransactionFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public TenderTransactionFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("TenderTransaction"));
  }

  public TenderTransactionFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<TenderTransactionFragmentProjection<PARENT, ROOT>, ROOT> amount() {
     MoneyV2Projection<TenderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("amount", projection);
     return projection;
  }

  public OrderProjection<TenderTransactionFragmentProjection<PARENT, ROOT>, ROOT> order() {
     OrderProjection<TenderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderProjection<>(this, getRoot());
     getFields().put("order", projection);
     return projection;
  }

  public TenderTransactionDetailsProjection<TenderTransactionFragmentProjection<PARENT, ROOT>, ROOT> transactionDetails(
      ) {
     TenderTransactionDetailsProjection<TenderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new TenderTransactionDetailsProjection<>(this, getRoot());
     getFields().put("transactionDetails", projection);
     return projection;
  }

  public StaffMemberProjection<TenderTransactionFragmentProjection<PARENT, ROOT>, ROOT> user() {
     StaffMemberProjection<TenderTransactionFragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("user", projection);
     return projection;
  }

  public TenderTransactionFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public TenderTransactionFragmentProjection<PARENT, ROOT> paymentMethod() {
    getFields().put("paymentMethod", null);
    return this;
  }

  public TenderTransactionFragmentProjection<PARENT, ROOT> processedAt() {
    getFields().put("processedAt", null);
    return this;
  }

  public TenderTransactionFragmentProjection<PARENT, ROOT> remoteReference() {
    getFields().put("remoteReference", null);
    return this;
  }

  public TenderTransactionFragmentProjection<PARENT, ROOT> test() {
    getFields().put("test", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on TenderTransaction {");
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
