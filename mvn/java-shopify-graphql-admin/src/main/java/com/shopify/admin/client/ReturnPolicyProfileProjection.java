package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.BaseSubProjectionNode;

public class ReturnPolicyProfileProjection<PARENT extends BaseSubProjectionNode<?, ?>, ROOT extends BaseSubProjectionNode<?, ?>> extends BaseSubProjectionNode<PARENT, ROOT> {
  public ReturnPolicyProfileProjection(PARENT parent, ROOT root) {
    super(parent, root, java.util.Optional.of("ReturnPolicyProfile"));
  }

  public ReturnPolicyProfileProjection<PARENT, ROOT> __typename() {
    getFields().put("__typename", null);
    return this;
  }

  public ReturnPoliciesEditRulesProjection<ReturnPolicyProfileProjection<PARENT, ROOT>, ROOT> editRules(
      ) {
     ReturnPoliciesEditRulesProjection<ReturnPolicyProfileProjection<PARENT, ROOT>, ROOT> projection = new ReturnPoliciesEditRulesProjection<>(this, getRoot());
     getFields().put("editRules", projection);
     return projection;
  }

  public MarketProjection<ReturnPolicyProfileProjection<PARENT, ROOT>, ROOT> markets() {
     MarketProjection<ReturnPolicyProfileProjection<PARENT, ROOT>, ROOT> projection = new MarketProjection<>(this, getRoot());
     getFields().put("markets", projection);
     return projection;
  }

  public ReturnPoliciesReturnRulesProjection<ReturnPolicyProfileProjection<PARENT, ROOT>, ROOT> returnRules(
      ) {
     ReturnPoliciesReturnRulesProjection<ReturnPolicyProfileProjection<PARENT, ROOT>, ROOT> projection = new ReturnPoliciesReturnRulesProjection<>(this, getRoot());
     getFields().put("returnRules", projection);
     return projection;
  }

  public ReturnPolicyProfileProjection<PARENT, ROOT> _default() {
    getFields().put("default", null);
    return this;
  }

  public ReturnPolicyProfileProjection<PARENT, ROOT> id() {
    getFields().put("id", null);
    return this;
  }

  public ReturnPolicyProfileProjection<PARENT, ROOT> name() {
    getFields().put("name", null);
    return this;
  }

  public ReturnPolicyProfileProjection<PARENT, ROOT> updatedAt() {
    getFields().put("updatedAt", null);
    return this;
  }
}
