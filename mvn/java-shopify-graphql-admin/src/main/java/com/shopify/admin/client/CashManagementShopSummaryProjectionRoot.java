package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementShopSummaryProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementShopSummaryProjectionRoot() {
    super(null, null, java.util.Optional.of("CashManagementSummary"));
  }

  public CashManagementShopSummaryProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public MoneyV2Projection<CashManagementShopSummaryProjectionRoot<PARENT, ROOT>, CashManagementShopSummaryProjectionRoot<PARENT, ROOT>> cashBalanceAtEnd(
      ) {
    MoneyV2Projection<CashManagementShopSummaryProjectionRoot<PARENT, ROOT>, CashManagementShopSummaryProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("cashBalanceAtEnd", projection);
    return projection;
  }

  public MoneyV2Projection<CashManagementShopSummaryProjectionRoot<PARENT, ROOT>, CashManagementShopSummaryProjectionRoot<PARENT, ROOT>> cashBalanceAtStart(
      ) {
    MoneyV2Projection<CashManagementShopSummaryProjectionRoot<PARENT, ROOT>, CashManagementShopSummaryProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("cashBalanceAtStart", projection);
    return projection;
  }

  public MoneyV2Projection<CashManagementShopSummaryProjectionRoot<PARENT, ROOT>, CashManagementShopSummaryProjectionRoot<PARENT, ROOT>> netCash(
      ) {
    MoneyV2Projection<CashManagementShopSummaryProjectionRoot<PARENT, ROOT>, CashManagementShopSummaryProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("netCash", projection);
    return projection;
  }

  public MoneyV2Projection<CashManagementShopSummaryProjectionRoot<PARENT, ROOT>, CashManagementShopSummaryProjectionRoot<PARENT, ROOT>> totalDiscrepancies(
      ) {
    MoneyV2Projection<CashManagementShopSummaryProjectionRoot<PARENT, ROOT>, CashManagementShopSummaryProjectionRoot<PARENT, ROOT>> projection = new MoneyV2Projection<>(this, this);    
    getFields().put("totalDiscrepancies", projection);
    return projection;
  }

  public CashManagementShopSummaryProjectionRoot<PARENT, ROOT> sessionsClosed() {
    getFields().put("sessionsClosed", null);
    return this;
  }

  public CashManagementShopSummaryProjectionRoot<PARENT, ROOT> sessionsOpened() {
    getFields().put("sessionsOpened", null);
    return this;
  }
}
