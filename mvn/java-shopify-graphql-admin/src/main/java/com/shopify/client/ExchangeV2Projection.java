package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ExchangeV2Projection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ExchangeV2Projection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ExchangeV2"));
  }

  public ExchangeV2Projection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ExchangeV2AdditionsProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> additions() {
     ExchangeV2AdditionsProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> projection = new ExchangeV2AdditionsProjection<>(this, getRoot());
     getFields().put("additions", projection);
     return projection;
  }

  public LocationProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> location() {
     LocationProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> projection = new LocationProjection<>(this, getRoot());
     getFields().put("location", projection);
     return projection;
  }

  public RefundProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> refunds() {
     RefundProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> projection = new RefundProjection<>(this, getRoot());
     getFields().put("refunds", projection);
     return projection;
  }

  public ExchangeV2ReturnsProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> returns() {
     ExchangeV2ReturnsProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> projection = new ExchangeV2ReturnsProjection<>(this, getRoot());
     getFields().put("returns", projection);
     return projection;
  }

  public StaffMemberProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> staffMember() {
     StaffMemberProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> projection = new StaffMemberProjection<>(this, getRoot());
     getFields().put("staffMember", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> totalAmountProcessedSet() {
     MoneyBagProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalAmountProcessedSet", projection);
     return projection;
  }

  public MoneyBagProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> totalPriceSet() {
     MoneyBagProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> projection = new MoneyBagProjection<>(this, getRoot());
     getFields().put("totalPriceSet", projection);
     return projection;
  }

  public OrderTransactionProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> transactions() {
     OrderTransactionProjection<ExchangeV2Projection<PARENT, ROOT>, ROOT> projection = new OrderTransactionProjection<>(this, getRoot());
     getFields().put("transactions", projection);
     return projection;
  }

  public ExchangeV2Projection<PARENT, ROOT> completedAt() {
    getFields().put("completedAt", null);
    return this;
  }

  public ExchangeV2Projection<PARENT, ROOT> createdAt() {
    getFields().put("createdAt", null);
    return this;
  }

  public ExchangeV2Projection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ExchangeV2Projection<PARENT, ROOT> note() {
    getFields().put("note", null);
    return this;
  }
}
