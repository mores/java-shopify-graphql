package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.LocationEditInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Edits an existing location.
 *   
 * [As of the 2023-10 API version](https://shopify.dev/changelog/apps-can-now-change-the-name-and-address-of-their-fulfillment-service-locations),
 * apps can change the name and address of their fulfillment service locations.
 */
public class LocationEditGraphQLQuery extends GraphQLQuery {
  public LocationEditGraphQLQuery(String id, LocationEditInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public LocationEditGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "locationEdit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private LocationEditInput input;

    private String queryName;

    public LocationEditGraphQLQuery build() {
      return new LocationEditGraphQLQuery(id, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of a location to edit.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The updated properties for the location.
     */
    public Builder input(LocationEditInput input) {
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
