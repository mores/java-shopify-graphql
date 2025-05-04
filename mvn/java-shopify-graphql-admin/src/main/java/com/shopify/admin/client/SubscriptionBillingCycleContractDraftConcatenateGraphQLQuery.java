package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionBillingCycleInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Concatenates a contract to a Subscription Draft.
 */
public class SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery(String draftId,
      List<SubscriptionBillingCycleInput> concatenatedBillingCycleContracts, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (concatenatedBillingCycleContracts != null || fieldsSet.contains("concatenatedBillingCycleContracts")) {
        getInput().put("concatenatedBillingCycleContracts", concatenatedBillingCycleContracts);
    }
  }

  public SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleContractDraftConcatenate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private List<SubscriptionBillingCycleInput> concatenatedBillingCycleContracts;

    private String queryName;

    public SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery build() {
      return new SubscriptionBillingCycleContractDraftConcatenateGraphQLQuery(draftId, concatenatedBillingCycleContracts, queryName, fieldsSet);
               
    }

    /**
     * The gid of the Subscription Contract draft to update.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * An array of Subscription Contracts with their selected billing cycles to concatenate to the subscription draft.
     */
    public Builder concatenatedBillingCycleContracts(
        List<SubscriptionBillingCycleInput> concatenatedBillingCycleContracts) {
      this.concatenatedBillingCycleContracts = concatenatedBillingCycleContracts;
      this.fieldsSet.add("concatenatedBillingCycleContracts");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
