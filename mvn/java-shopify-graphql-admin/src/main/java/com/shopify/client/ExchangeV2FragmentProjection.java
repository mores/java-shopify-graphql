package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;
import java.lang.Override;
import java.lang.String;

public class ExchangeV2FragmentProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  {
    getFields().put("__typename", null);
  }

  public ExchangeV2FragmentProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeV2"));
  }

  public ExchangeV2FragmentProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ExchangeV2AdditionsProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> additions(
      ) {
     ExchangeV2AdditionsProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2AdditionsProjection<>(this, getRoot());
     getFields().put("additions", projection);
     return projection;
  }

  public LocationProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public RefundProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> refunds() {
     RefundProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());
     getFields().put("refunds", projection);
     return projection;
  }

  public ExchangeV2ReturnsProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> returns() {
     ExchangeV2ReturnsProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new ExchangeV2ReturnsProjection<>(this, getRoot());
     getFields().put("returns", projection);
     return projection;
  }

  public StaffMemberProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> totalAmountProcessedSet(
      ) {
     MoneyBagProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmountProcessedSet", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public OrderTransactionProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> transactions(
      ) {
     OrderTransactionProjection<ExchangeV2FragmentProjection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public ExchangeV2FragmentProjection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public ExchangeV2FragmentProjection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ExchangeV2FragmentProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ExchangeV2FragmentProjection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("... on ExchangeV2 {");
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
