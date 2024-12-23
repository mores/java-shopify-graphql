package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ShopifyPaymentsPayoutFragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ShopifyPaymentsPayoutFragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ShopifyPaymentsPayout"));
  }

  public ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ShopifyPaymentsBankAccountProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> bankAccount(
      ) {
     ShopifyPaymentsBankAccountProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsBankAccountProjection<>(this, getRoot());
     getFields().put("bankAccount", projection);
     return projection;
  }

  public BusinessEntityProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> businessEntity(
      ) {
     BusinessEntityProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new BusinessEntityProjection<>(this, getRoot());
     getFields().put("businessEntity", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> gross() {
     MoneyV2Projection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("gross", projection);
     return projection;
  }

  public MoneyV2Projection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> net() {
     MoneyV2Projection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("net", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutStatusProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> status(
      ) {
     ShopifyPaymentsPayoutStatusProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutStatusProjection<>(this, getRoot());
     getFields().put("status", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutSummaryProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> summary(
      ) {
     ShopifyPaymentsPayoutSummaryProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutSummaryProjection<>(this, getRoot());
     getFields().put("summary", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutTransactionTypeProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> transactionType(
      ) {
     ShopifyPaymentsPayoutTransactionTypeProjection<ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT>, ROOT> projection = new ShopifyPaymentsPayoutTransactionTypeProjection<>(this, getRoot());
     getFields().put("transactionType", projection);
     return projection;
  }

  public ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT> issuedAt() {
    getFields().put("issuedAt", null);
    return this;
  }

  public ShopifyPaymentsPayoutFragmentProjection<PARENT, ROOT> legacyResourceId() {
    getFields().put("legacyResourceId", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ShopifyPaymentsPayout {");
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
