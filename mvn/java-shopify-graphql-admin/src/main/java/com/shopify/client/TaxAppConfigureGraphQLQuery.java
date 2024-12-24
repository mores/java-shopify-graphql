package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class TaxAppConfigureGraphQLQuery extends GraphQLQuery {
  public TaxAppConfigureGraphQLQuery(boolean ready, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    getInput().put("ready", ready);                   
  }

  public TaxAppConfigureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "taxAppConfigure";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private boolean ready;

    private String queryName;

    public TaxAppConfigureGraphQLQuery build() {
      return new TaxAppConfigureGraphQLQuery(ready, queryName, fieldsSet);
               
    }

    
    public Builder ready(boolean ready) {
      this.ready = ready;
      this.fieldsSet.add("ready");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
