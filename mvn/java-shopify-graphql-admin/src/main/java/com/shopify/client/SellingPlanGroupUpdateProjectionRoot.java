package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class SellingPlanGroupUpdateProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public SellingPlanGroupUpdateProjectionRoot() {
    super(null, null, java.util.Optional.of("SellingPlanGroupUpdatePayload"));
  }

  public SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public SellingPlanGroupProjection<SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT>, SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT>> sellingPlanGroup(
      ) {
    SellingPlanGroupProjection<SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT>, SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupProjection<>(this, this);    
    getFields().put("sellingPlanGroup", projection);
    return projection;
  }

  public SellingPlanGroupUserErrorProjection<SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT>, SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT>> userErrors(
      ) {
    SellingPlanGroupUserErrorProjection<SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT>, SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT>> projection = new SellingPlanGroupUserErrorProjection<>(this, this);    
    getFields().put("userErrors", projection);
    return projection;
  }

  public SellingPlanGroupUpdateProjectionRoot<PARENT, ROOT> deletedSellingPlanIds() {
    getFields().put("deletedSellingPlanIds", null);
    return this;
  }
}
