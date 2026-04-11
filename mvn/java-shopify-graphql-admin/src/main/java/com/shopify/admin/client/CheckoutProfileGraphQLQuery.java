package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a [`CheckoutProfile`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CheckoutProfile). Checkout profiles define the branding settings and UI extensions for a store's
 * checkout experience. Stores can have one published profile that renders on
 * their live checkout and multiple draft profiles for testing customizations in
 * the checkout editor.
 */
public class CheckoutProfileGraphQLQuery extends GraphQLQuery {
  public CheckoutProfileGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CheckoutProfileGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "checkoutProfile";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CheckoutProfileGraphQLQuery build() {
      return new CheckoutProfileGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the checkout profile.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
