package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class CheckoutBrandingGraphQLQuery extends GraphQLQuery {
  public CheckoutBrandingGraphQLQuery(String checkoutProfileId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (checkoutProfileId != null || fieldsSet.contains("checkoutProfileId")) {
        getInput().put("checkoutProfileId", checkoutProfileId);
    }
  }

  public CheckoutBrandingGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "checkoutBranding";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String checkoutProfileId;

    private String queryName;

    public CheckoutBrandingGraphQLQuery build() {
      return new CheckoutBrandingGraphQLQuery(checkoutProfileId, queryName, fieldsSet);
               
    }

    
    public Builder checkoutProfileId(String checkoutProfileId) {
      this.checkoutProfileId = checkoutProfileId;
      this.fieldsSet.add("checkoutProfileId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
