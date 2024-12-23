package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a CustomerPaymentMethod resource by its ID.
 */
public class CustomerPaymentMethodGraphQLQuery extends GraphQLQuery {
  public CustomerPaymentMethodGraphQLQuery(String id, Boolean showRevoked, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (showRevoked != null || fieldsSet.contains("showRevoked")) {
        getInput().put("showRevoked", showRevoked);
    }
  }

  public CustomerPaymentMethodGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerPaymentMethod";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private Boolean showRevoked;

    private String queryName;

    public CustomerPaymentMethodGraphQLQuery build() {
      return new CustomerPaymentMethodGraphQLQuery(id, showRevoked, queryName, fieldsSet);
               
    }

    /**
     * The ID of the CustomerPaymentMethod to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Whether to show the customer's revoked payment method.
     */
    public Builder showRevoked(Boolean showRevoked) {
      this.showRevoked = showRevoked;
      this.fieldsSet.add("showRevoked");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
