package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementReasonCodeConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementReasonCodeConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementReasonCodeConnection"));
  }

  public CashManagementReasonCodeConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementReasonCodeEdgeProjection<CashManagementReasonCodeConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     CashManagementReasonCodeEdgeProjection<CashManagementReasonCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashManagementReasonCodeEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public CashManagementReasonCodeProjection<CashManagementReasonCodeConnectionProjection<PARENT, ROOT>, ROOT> nodes(
      ) {
     CashManagementReasonCodeProjection<CashManagementReasonCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new CashManagementReasonCodeProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<CashManagementReasonCodeConnectionProjection<PARENT, ROOT>, ROOT> pageInfo(
      ) {
     PageInfoProjection<CashManagementReasonCodeConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
