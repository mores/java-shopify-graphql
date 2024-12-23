package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionLineInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Adds a subscription line to a subscription draft.
 */
public class SubscriptionDraftLineAddGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftLineAddGraphQLQuery(String draftId, SubscriptionLineInput input,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionDraftLineAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftLineAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private SubscriptionLineInput input;

    private String queryName;

    public SubscriptionDraftLineAddGraphQLQuery build() {
      return new SubscriptionDraftLineAddGraphQLQuery(draftId, input, queryName, fieldsSet);
               
    }

    /**
     * The gid of the Subscription Contract draft to add a subscription line to.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The properties of the new Subscription Line.
     */
    public Builder input(SubscriptionLineInput input) {
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
