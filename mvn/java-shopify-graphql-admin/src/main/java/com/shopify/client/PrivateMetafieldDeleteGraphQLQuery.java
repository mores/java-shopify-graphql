package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PrivateMetafieldDeleteInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Deletes a private metafield.
 * Private metafields are automatically deleted when the app that created them is uninstalled.
 */
public class PrivateMetafieldDeleteGraphQLQuery extends GraphQLQuery {
  public PrivateMetafieldDeleteGraphQLQuery(PrivateMetafieldDeleteInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PrivateMetafieldDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "privateMetafieldDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PrivateMetafieldDeleteInput input;

    private String queryName;

    public PrivateMetafieldDeleteGraphQLQuery build() {
      return new PrivateMetafieldDeleteGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields for the private metafield to delete.
     */
    public Builder input(PrivateMetafieldDeleteInput input) {
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
