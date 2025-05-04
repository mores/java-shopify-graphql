package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionContractCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a Subscription Contract Draft.
 * You can submit all the desired information for the draft using [Subscription Draft Input object](https://shopify.dev/docs/api/admin-graphql/latest/input-objects/SubscriptionDraftInput).
 * You can also update the draft using the [Subscription Contract Update](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionContractUpdate) mutation.
 * The draft is not saved until you call the [Subscription Draft Commit](https://shopify.dev/docs/api/admin-graphql/latest/mutations/subscriptionDraftCommit) mutation.
 */
public class SubscriptionContractCreateGraphQLQuery extends GraphQLQuery {
  public SubscriptionContractCreateGraphQLQuery(SubscriptionContractCreateInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionContractCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionContractCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SubscriptionContractCreateInput input;

    private String queryName;

    public SubscriptionContractCreateGraphQLQuery build() {
      return new SubscriptionContractCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new Subscription Contract.
     */
    public Builder input(SubscriptionContractCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
