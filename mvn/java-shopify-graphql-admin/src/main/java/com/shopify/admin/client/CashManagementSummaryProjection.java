package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementSummaryProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementSummaryProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementSummary"));
  }

  public CashManagementSummaryProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashManagementSummaryProjection<PARENT, ROOT>, ROOT> cashBalanceAtEnd() {
     MoneyV2Projection<CashManagementSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cashBalanceAtEnd", projection);
     return projection;
  }

  public MoneyV2Projection<CashManagementSummaryProjection<PARENT, ROOT>, ROOT> cashBalanceAtStart(
      ) {
     MoneyV2Projection<CashManagementSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("cashBalanceAtStart", projection);
     return projection;
  }

  public MoneyV2Projection<CashManagementSummaryProjection<PARENT, ROOT>, ROOT> netCash() {
     MoneyV2Projection<CashManagementSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("netCash", projection);
     return projection;
  }

  public MoneyV2Projection<CashManagementSummaryProjection<PARENT, ROOT>, ROOT> totalDiscrepancies(
      ) {
     MoneyV2Projection<CashManagementSummaryProjection<PARENT, ROOT>, ROOT> projection = new MoneyV2Projection<>(this, getRoot());
     getFields().put("totalDiscrepancies", projection);
     return projection;
  }

  public CashManagementSummaryProjection<PARENT, ROOT> sessionsClosed() {
    getFields().put("sessionsClosed", null);
    return this;
  }

  public CashManagementSummaryProjection<PARENT, ROOT> sessionsOpened() {
    getFields().put("sessionsOpened", null);
    return this;
  }
}
