package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Destroy a cart transform function from the Shop.
 */
public class CartTransformDeleteGraphQLQuery extends GraphQLQuery {
  public CartTransformDeleteGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CartTransformDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "cartTransformDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CartTransformDeleteGraphQLQuery build() {
      return new CartTransformDeleteGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * A globally-unique identifier for the cart transform.
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
