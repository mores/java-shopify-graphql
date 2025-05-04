package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Opt out a customer from data sale.
 */
public class DataSaleOptOutGraphQLQuery extends GraphQLQuery {
  public DataSaleOptOutGraphQLQuery(String email, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public DataSaleOptOutGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "dataSaleOptOut";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String email;

    private String queryName;

    public DataSaleOptOutGraphQLQuery build() {
      return new DataSaleOptOutGraphQLQuery(email, queryName, fieldsSet);
               
    }

    /**
     * The email address of the customer to opt out of data sale.
     */
    public Builder email(String email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
