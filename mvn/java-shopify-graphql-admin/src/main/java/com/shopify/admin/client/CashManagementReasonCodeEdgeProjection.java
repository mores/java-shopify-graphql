package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class CashManagementReasonCodeEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public CashManagementReasonCodeEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("CashManagementReasonCodeEdge"));
  }

  public CashManagementReasonCodeEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public CashManagementReasonCodeProjection<CashManagementReasonCodeEdgeProjection<PARENT, ROOT>, ROOT> node(
      ) {
     CashManagementReasonCodeProjection<CashManagementReasonCodeEdgeProjection<PARENT, ROOT>, ROOT> projection = new CashManagementReasonCodeProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public CashManagementReasonCodeEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
