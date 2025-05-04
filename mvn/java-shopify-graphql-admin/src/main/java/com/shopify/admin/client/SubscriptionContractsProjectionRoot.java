package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SubscriptionContractsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SubscriptionContractsProjectionRoot() {
    super(null, null, java.util.Optional.of("SubscriptionContractConnection"));
  }

  public SubscriptionContractsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SubscriptionContractEdgeProjection<SubscriptionContractsProjectionRoot<PARENT, ROOT>, SubscriptionContractsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SubscriptionContractEdgeProjection<SubscriptionContractsProjectionRoot<PARENT, ROOT>, SubscriptionContractsProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SubscriptionContractProjection<SubscriptionContractsProjectionRoot<PARENT, ROOT>, SubscriptionContractsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SubscriptionContractProjection<SubscriptionContractsProjectionRoot<PARENT, ROOT>, SubscriptionContractsProjectionRoot<PARENT, ROOT>> projection = new SubscriptionContractProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SubscriptionContractsProjectionRoot<PARENT, ROOT>, SubscriptionContractsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SubscriptionContractsProjectionRoot<PARENT, ROOT>, SubscriptionContractsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
