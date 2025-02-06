package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The subscriptionContractUpdate mutation allows you to create a draft of an
 * existing subscription contract. This [draft](https://shopify.dev/api/admin-graphql/latest/objects/SubscriptionDraft)
 * can be reviewed and modified as needed. Once the draft is committed with [subscriptionDraftCommit](https://shopify.dev/api/admin-graphql/latest/mutations/subscriptionDraftCommit),
 * the changes are applied to the original subscription contract.
 */
public class SubscriptionContractUpdateGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractUpdateGraphQLQuery(String contractId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (contractId != null || fieldsSet.contains("contractId")) {
        getInput().put("contractId", contractId);
    }
  }

  public SubscriptionContractUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String contractId;

    private String queryName;

    public SubscriptionContractUpdateGraphQLQuery build() {
      return new SubscriptionContractUpdateGraphQLQuery(contractId, queryName, fieldsSet);
               
    }

    /**
     * The gid of the Subscription Contract to update.
     */
    public Builder contractId(String contractId) {
      this.contractId = contractId;
      this.fieldsSet.add("contractId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
