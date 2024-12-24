package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class AppSubscriptionCancelGraphQLQuery extends GraphQLQuery {
  public AppSubscriptionCancelGraphQLQuery(String id, Boolean prorate, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (prorate != null || fieldsSet.contains("prorate")) {
        getInput().put("prorate", prorate);
    }
  }

  public AppSubscriptionCancelGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "appSubscriptionCancel";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private Boolean prorate;

    private String queryName;

    public AppSubscriptionCancelGraphQLQuery build() {
      return new AppSubscriptionCancelGraphQLQuery(id, prorate, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder prorate(Boolean prorate) {
      this.prorate = prorate;
      this.fieldsSet.add("prorate");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
