package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PrivateMetafieldInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates or updates a private metafield. Use private metafields when you don't
 * want the metafield data to be accessible by merchants or other apps.
 * Private metafields are accessible only by the application that created them and only from the GraphQL Admin API.
 *   
 * An application can create a maximum of 10 private metafields per shop resource.
 */
public class PrivateMetafieldUpsertGraphQLQuery extends GraphQLQuery {
  public PrivateMetafieldUpsertGraphQLQuery(PrivateMetafieldInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PrivateMetafieldUpsertGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "privateMetafieldUpsert";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PrivateMetafieldInput input;

    private String queryName;

    public PrivateMetafieldUpsertGraphQLQuery build() {
      return new PrivateMetafieldUpsertGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * Specifies the input fields for the private metafield.
     */
    public Builder input(PrivateMetafieldInput input) {
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
