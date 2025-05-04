package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.LocationIdentifierInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Return a location by an identifier.
 */
public class LocationByIdentifierGraphQLQuery extends GraphQLQuery {
  public LocationByIdentifierGraphQLQuery(LocationIdentifierInput identifier, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (identifier != null || fieldsSet.contains("identifier")) {
        getInput().put("identifier", identifier);
    }
  }

  public LocationByIdentifierGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "locationByIdentifier";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private LocationIdentifierInput identifier;

    private String queryName;

    public LocationByIdentifierGraphQLQuery build() {
      return new LocationByIdentifierGraphQLQuery(identifier, queryName, fieldsSet);
               
    }

    /**
     * The identifier of the location.
     */
    public Builder identifier(LocationIdentifierInput identifier) {
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
