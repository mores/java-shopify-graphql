package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PublicationCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a publication.
 */
public class PublicationCreateGraphQLQuery extends GraphQLQuery {
  public PublicationCreateGraphQLQuery(PublicationCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public PublicationCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "publicationCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private PublicationCreateInput input;

    private String queryName;

    public PublicationCreateGraphQLQuery build() {
      return new PublicationCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The input fields to use when creating the publication.
     */
    public Builder input(PublicationCreateInput input) {
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
