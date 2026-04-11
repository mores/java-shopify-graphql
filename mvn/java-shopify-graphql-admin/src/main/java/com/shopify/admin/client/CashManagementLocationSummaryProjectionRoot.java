package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementLocationSummaryProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementLocationSummaryProjectionRoot() {
    super(null, null, java.util.Optional.of("CashManagementSummary"));
  }

  public CashManagementLocationSummaryProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>, CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>> cashBalanceAtEnd(
      ) {
    MoneyV2Projection<CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>, CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("cashBalanceAtEnd", projection);
    return projection;
  }

  public MoneyV2Projection<CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>, CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>> cashBalanceAtStart(
      ) {
    MoneyV2Projection<CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>, CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("cashBalanceAtStart", projection);
    return projection;
  }

  public MoneyV2Projection<CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>, CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>> netCash(
      ) {
    MoneyV2Projection<CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>, CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("netCash", projection);
    return projection;
  }

  public MoneyV2Projection<CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>, CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>> totalDiscrepancies(
      ) {
    MoneyV2Projection<CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>, CashManagementLocationSummaryProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalDiscrepancies", projection);
    return projection;
  }

  public CashManagementLocationSummaryProjectionRoot<PARENT, ROOT> sessionsClosed() {
    getFields().put("sessionsClosed", null);
    return this;
  }

  public CashManagementLocationSummaryProjectionRoot<PARENT, ROOT> sessionsOpened() {
    getFields().put("sessionsOpened", null);
    return this;
  }
}
