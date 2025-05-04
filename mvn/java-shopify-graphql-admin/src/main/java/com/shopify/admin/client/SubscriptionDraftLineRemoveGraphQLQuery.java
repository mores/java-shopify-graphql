package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Removes a subscription line from a subscription draft.
 */
public class SubscriptionDraftLineRemoveGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftLineRemoveGraphQLQuery(String draftId, String lineId, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (lineId != null || fieldsSet.contains("lineId")) {
        getInput().put("lineId", lineId);
    }
  }

  public SubscriptionDraftLineRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftLineRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private String lineId;

    private String queryName;

    public SubscriptionDraftLineRemoveGraphQLQuery build() {
      return new SubscriptionDraftLineRemoveGraphQLQuery(draftId, lineId, queryName, fieldsSet);
               
    }

    /**
     * The gid of the Subscription Contract draft to remove a subscription line from.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Line to remove.
     */
    public Builder lineId(String lineId) {
      this.lineId = lineId;
      this.fieldsSet.add("lineId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
