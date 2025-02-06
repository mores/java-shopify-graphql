package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Removes a subscription discount from a subscription draft.
 */
public class SubscriptionDraftDiscountRemoveGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftDiscountRemoveGraphQLQuery(String draftId, String discountId,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
    }
  }

  public SubscriptionDraftDiscountRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftDiscountRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private String discountId;

    private String queryName;

    public SubscriptionDraftDiscountRemoveGraphQLQuery build() {
      return new SubscriptionDraftDiscountRemoveGraphQLQuery(draftId, discountId, queryName, fieldsSet);
               
    }

    /**
     * The gid of the subscription contract draft to remove a subscription discount from.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the subscription draft discount to remove.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      this.fieldsSet.add("discountId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
