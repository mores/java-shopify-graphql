package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SalesAgreementEdgeProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SalesAgreementEdgeProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SalesAgreementEdge"));
  }

  public SalesAgreementEdgeProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SalesAgreementProjection<SalesAgreementEdgeProjection<PARENT, ROOT>, ROOT> node() {
     SalesAgreementProjection<SalesAgreementEdgeProjection<PARENT, ROOT>, ROOT> projection = new SalesAgreementProjection<>(this, getRoot());
     getFields().put("node", projection);
     return projection;
  }

  public SalesAgreementEdgeProjection<PARENT, ROOT> cursor() {
    getFields().put("cursor", null);
    return this;
  }
}
