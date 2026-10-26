package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnPolicyProfilesProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnPolicyProfilesProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnPolicyProfileConnection"));
  }

  public ReturnPolicyProfilesProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnPolicyProfileEdgeProjection<ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>, ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>> edges(
      ) {
    ReturnPolicyProfileEdgeProjection<ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>, ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>> projection = new ReturnPolicyProfileEdgeProjection<>(this, this);    
    getFields().put("edges", projection);
    return projection;
  }

  public ReturnPolicyProfileProjection<ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>, ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>> nodes(
      ) {
    ReturnPolicyProfileProjection<ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>, ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>> projection = new ReturnPolicyProfileProjection<>(this, this);    
    getFields().put("nodes", projection);
    return projection;
  }

  public PageInfoProjection<ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>, ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>> pageInfo(
      ) {
    PageInfoProjection<ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>, ReturnPolicyProfilesProjectionRoot<PARENT, ROOT>> projection = new PageInfoProjection<>(this, this);    
    getFields().put("pageInfo", projection);
    return projection;
  }
}
