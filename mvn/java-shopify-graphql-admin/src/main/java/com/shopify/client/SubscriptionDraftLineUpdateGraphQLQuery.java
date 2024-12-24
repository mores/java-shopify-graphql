package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.SubscriptionLineUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class SubscriptionDraftLineUpdateGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftLineUpdateGraphQLQuery(String draftId, String lineId,
      SubscriptionLineUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (lineId != null || fieldsSet.contains("lineId")) {
        getInput().put("lineId", lineId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionDraftLineUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftLineUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private String lineId;

    private SubscriptionLineUpdateInput input;

    private String queryName;

    public SubscriptionDraftLineUpdateGraphQLQuery build() {
      return new SubscriptionDraftLineUpdateGraphQLQuery(draftId, lineId, input, queryName, fieldsSet);
               
    }

    
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    
    public Builder lineId(String lineId) {
      this.lineId = lineId;
      this.fieldsSet.add("lineId");
      return this;
    }

    
    public Builder input(SubscriptionLineUpdateInput input) {
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
