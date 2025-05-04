package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Commits the updates of a Subscription Billing Cycle Contract draft.
 */
public class SubscriptionBillingCycleContractDraftCommitGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleContractDraftCommitGraphQLQuery(String draftId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }
  }

  public SubscriptionBillingCycleContractDraftCommitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleContractDraftCommit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private String queryName;

    public SubscriptionBillingCycleContractDraftCommitGraphQLQuery build() {
      return new SubscriptionBillingCycleContractDraftCommitGraphQLQuery(draftId, queryName, fieldsSet);
               
    }

    /**
     * The gid of the Subscription Contract draft to commit.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
