package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionBillingCyclesTargetSelection;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Delete the current and future schedule and contract edits of a list of subscription billing cycles.
 */
public class SubscriptionBillingCycleEditsDeleteGraphQLQuery extends GraphQLQuery {
  public SubscriptionBillingCycleEditsDeleteGraphQLQuery(String contractId,
      SubscriptionBillingCyclesTargetSelection targetSelection, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }if (targetSelection != null || fieldsSet.contains("targetSelection")) {
        getInput().put("targetSelection", targetSelection);
    }
  }

  public SubscriptionBillingCycleEditsDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionBillingCycleEditsDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String contractId;

    private SubscriptionBillingCyclesTargetSelection targetSelection;

    private String queryName;

    public SubscriptionBillingCycleEditsDeleteGraphQLQuery build() {
      return new SubscriptionBillingCycleEditsDeleteGraphQLQuery(contractId, targetSelection, queryName, fieldsSet);
               
    }

    /**
     * The globally-unique identifier of the subscription contract that the billing cycle belongs to.
     */
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      this.fieldsSet.add("contractId");
      return this;
    }

    /**
     * Select billing cycles to be deleted.
     */
    public Builder targetSelection(SubscriptionBillingCyclesTargetSelection targetSelection) {
      this.targetSelection = targetSelection;
      this.fieldsSet.add("targetSelection");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
