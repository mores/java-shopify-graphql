package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SalesAgreementConnectionProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SalesAgreementConnectionProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("SalesAgreementConnection"));
  }

  public SalesAgreementConnectionProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SalesAgreementEdgeProjection<SalesAgreementConnectionProjection<PARENT, ROOT>, ROOT> edges(
      ) {
     SalesAgreementEdgeProjection<SalesAgreementConnectionProjection<PARENT, ROOT>, ROOT> projection = new SalesAgreementEdgeProjection<>(this, getRoot());
     getFields().put("edges", projection);
     return projection;
  }

  public SalesAgreementProjection<SalesAgreementConnectionProjection<PARENT, ROOT>, ROOT> nodes() {
     SalesAgreementProjection<SalesAgreementConnectionProjection<PARENT, ROOT>, ROOT> projection = new SalesAgreementProjection<>(this, getRoot());
     getFields().put("nodes", projection);
     return projection;
  }

  public PageInfoProjection<SalesAgreementConnectionProjection<PARENT, ROOT>, ROOT> pageInfo() {
     PageInfoProjection<SalesAgreementConnectionProjection<PARENT, ROOT>, ROOT> projection = new PageInfoProjection<>(this, getRoot());
     getFields().put("pageInfo", projection);
     return projection;
  }
}
