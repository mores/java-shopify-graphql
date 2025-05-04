package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionDraftInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a Subscription Draft.
 */
public class SubscriptionDraftUpdateGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftUpdateGraphQLQuery(String draftId, SubscriptionDraftInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionDraftUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private SubscriptionDraftInput input;

    private String queryName;

    public SubscriptionDraftUpdateGraphQLQuery build() {
      return new SubscriptionDraftUpdateGraphQLQuery(draftId, input, queryName, fieldsSet);
               
    }

    /**
     * The gid of the Subscription Draft to update.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The properties of the new Subscription Contract.
     */
    public Builder input(SubscriptionDraftInput input) {
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
