package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CollectionIdentifierInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Return a collection by an identifier.
 */
public class CollectionByIdentifierGraphQLQuery extends GraphQLQuery {
  public CollectionByIdentifierGraphQLQuery(CollectionIdentifierInput identifier, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public CollectionByIdentifierGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "collectionByIdentifier";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private CollectionIdentifierInput identifier;

    private String queryName;

    public CollectionByIdentifierGraphQLQuery build() {
      return new CollectionByIdentifierGraphQLQuery(identifier, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the collection.
     */
    public Builder identifier(CollectionIdentifierInput identifier) {
      this.identifier = identifier;
      this.fieldsSet.add("identifier");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
