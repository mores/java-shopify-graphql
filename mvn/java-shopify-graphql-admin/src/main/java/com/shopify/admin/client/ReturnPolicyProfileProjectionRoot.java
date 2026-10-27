package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnPolicyProfileProjectionRoot<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnPolicyProfileProjectionRoot() {
    super(null, null, java.util.Optional.of("ReturnPolicyProfile"));
  }

  public ReturnPolicyProfileProjectionRoot<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnPoliciesEditRulesProjection<ReturnPolicyProfileProjectionRoot<PARENT, ROOT>, ReturnPolicyProfileProjectionRoot<PARENT, ROOT>> editRules(
      ) {
    ReturnPoliciesEditRulesProjection<ReturnPolicyProfileProjectionRoot<PARENT, ROOT>, ReturnPolicyProfileProjectionRoot<PARENT, ROOT>> projection = new ReturnPoliciesEditRulesProjection<>(this, this);    
    getFields().put("editRules", projection);
    return projection;
  }

  public MarketProjection<ReturnPolicyProfileProjectionRoot<PARENT, ROOT>, ReturnPolicyProfileProjectionRoot<PARENT, ROOT>> markets(
      ) {
    MarketProjection<ReturnPolicyProfileProjectionRoot<PARENT, ROOT>, ReturnPolicyProfileProjectionRoot<PARENT, ROOT>> projection = new MarketProjection<>(this, this);    
    getFields().put("markets", projection);
    return projection;
  }

  public ReturnPoliciesReturnRulesProjection<ReturnPolicyProfileProjectionRoot<PARENT, ROOT>, ReturnPolicyProfileProjectionRoot<PARENT, ROOT>> returnRules(
      ) {
    ReturnPoliciesReturnRulesProjection<ReturnPolicyProfileProjectionRoot<PARENT, ROOT>, ReturnPolicyProfileProjectionRoot<PARENT, ROOT>> projection = new ReturnPoliciesReturnRulesProjection<>(this, this);    
    getFields().put("returnRules", projection);
    return projection;
  }

  public ReturnPolicyProfileProjectionRoot<PARENT, ROOT> _default() {
    getFields().put("default", null);
    return this;
  }

  public ReturnPolicyProfileProjectionRoot<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnPolicyProfileProjectionRoot<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ReturnPolicyProfileProjectionRoot<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
