package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class SubscriptionDraftDiscountCodeApplyGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftDiscountCodeApplyGraphQLQuery(String draftId, String redeemCode,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (redeemCode != null || fieldsSet.contains("redeemCode")) {
        getInput().put("redeemCode", redeemCode);
    }
  }

  public SubscriptionDraftDiscountCodeApplyGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftDiscountCodeApply";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private String redeemCode;

    private String queryName;

    public SubscriptionDraftDiscountCodeApplyGraphQLQuery build() {
      return new SubscriptionDraftDiscountCodeApplyGraphQLQuery(draftId, redeemCode, queryName, fieldsSet);
               
    }

    
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    
    public Builder redeemCode(String redeemCode) {
      this.redeemCode = redeemCode;
      this.fieldsSet.add("redeemCode");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
