package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupsProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupsProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroupConnection"));
  }

  public SellingPlanGroupsProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupEdgeProjection<SellingPlanGroupsProjectionRoot<PARENT, ROOT>, SellingPlanGroupsProjectionRoot<PARENT, ROOT>> edges(
      ) {
    SellingPlanGroupEdgeProjection<SellingPlanGroupsProjectionRoot<PARENT, ROOT>, SellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public SellingPlanGroupProjection<SellingPlanGroupsProjectionRoot<PARENT, ROOT>, SellingPlanGroupsProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    SellingPlanGroupProjection<SellingPlanGroupsProjectionRoot<PARENT, ROOT>, SellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<SellingPlanGroupsProjectionRoot<PARENT, ROOT>, SellingPlanGroupsProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<SellingPlanGroupsProjectionRoot<PARENT, ROOT>, SellingPlanGroupsProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
